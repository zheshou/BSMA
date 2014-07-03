package edu.ecnu.imc.bsma.measurements.exporter;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import edu.ecnu.imc.bsma.dao.BasicJobInfo;
import edu.ecnu.imc.bsma.dao.Dao;
import edu.ecnu.imc.bsma.dao.JobFinalReport;
import edu.ecnu.imc.bsma.dao.JobInfo;
import edu.ecnu.imc.bsma.dao.QueryFinalReport;
import edu.ecnu.imc.bsma.dao.QueryRunningReport;
import edu.ecnu.imc.bsma.dao.RunningReport;

/**
 * responsible for persistence of statuses to the database
 * 
 * @author xiafan
 * 
 */
public class DBExporter implements Closeable {
	Dao dao;
	RunningReport report = new RunningReport();
	int idx = 0;
	JobInfo job;

	public DBExporter(JobInfo job, Properties props) {
		dao = new Dao(props);
		this.job = job;
	}

	public void newReport() {
		idx = 0;
	}

	public void endReport() throws SQLException {
		if (idx < report.qStatus.size() - 1) {
			report.qStatus.subList(idx + 1, report.qStatus.size()).clear();
		}
		dao.insertRunningResults(report);
		idx = 0;
	}

	/**
	 * 整体的运行时状态
	 * 
	 * @param time 逝去的时间
	 * @param totalOps
	 * @param throughput
	 */
	public void reportOverall(long time, int totalOps, float curThroughput) {
		report.time = time;
		report.totalOps = totalOps;
		report.curThroughput = curThroughput;
	}

	/**
	 * 每条查询的运行时状态
	 * 
	 * @param Name
	 * @param latency
	 */
	public void reportOneMeasure(int qID, double latency) {
		QueryRunningReport cur;
		if (idx == report.qStatus.size()) {
			cur = new QueryRunningReport();
			report.qStatus.add(cur);
		} else {
			cur = report.qStatus.get(idx);
		}
		cur.queryId = qID;
		cur.avgLatency = latency;
		idx++;
	}

	/**
	 * 生成子任务的最终报表
	 * 
	 * @param latencyHist
	 * @param latencyStats
	 * @throws SQLException
	 */
	public void reportSubJobResult(int qID, List<Integer> latencyHist,
			List<Float> latencyStats) throws SQLException {
		BasicJobInfo curJob = job.getCurJob();
		QueryFinalReport report = new QueryFinalReport();
		report.subjobid = curJob.getSubJobID();
		report.queryid = qID;
		report.latency50 = latencyHist.get(0);
		report.latency75 = latencyHist.get(1);
		report.latency95 = latencyHist.get(2);
		report.latency99 = latencyHist.get(3);
		report.MinLatency = latencyStats.get(0);
		report.AverageLatency = latencyStats.get(1);
		report.MaxLatency = latencyStats.get(2);
		dao.insertQueryFinalResult(report);
	}

	public void reportJobResult(long time, int totalOps) throws SQLException {
		JobFinalReport report = new JobFinalReport();
		report.jobid = job.getCurJob().getSubJobID();
		report.totaltime = time;
		report.ops = totalOps;
		dao.insertJobFinalResult(report);
	}

	@Override
	public void close() throws IOException {
		try {
			dao.close();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}
}