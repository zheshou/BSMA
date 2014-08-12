package edu.ecnu.imc.bsma.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Neo4jDBImpl extends DB {
	Connection conn = null;

	public Neo4jDBImpl() {

	}

	@Override
	public void init() throws DBException {
		try {
			Class.forName("org.neo4j.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(
					_p.getProperty("nserver", "jdbc:neo4j://localhost:7474/"),
					_p.getProperty("nuser", "monetdb"),
					_p.getProperty("npasswd", "monetdb"));
		} catch (Exception e) {
			throw new DBException(e);
		}
	}

	final static String QUERY1 = "match (a:User{id:1})-->(b)-->(a) "
			+ " match (b)-->(c)-->(b) " + " where NOT (a)-->(c) and c.id <> a.id "
			+ " return distinct(c) ";

	@Override
	public String BSMAQuery1(String userID, int returncount) {
		String query = String.format(QUERY1, userID, returncount);
		try {
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			StringBuffer buf = new StringBuffer();
			while (result.next()) {
				buf.append(result.getString(1));
				buf.append(",");
			}
			return buf.toString();
		} catch (SQLException e) {
			System.err.println(query);
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String BSMAQuery2(String userID, int returncount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery3(String userID, int returncount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery4(String userID1, String userID2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery5(String userID1, String userID2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery6(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery7(int returncount, long datetime, long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery8(int returncount, String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery9(String userID, String tag, int returncount,
			long datetime, long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery10(int returncount, long datetime, long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery11(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery12(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery13(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery14(int returncount, long datetime, long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery15(String tag, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery16(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery17(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery18(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery19(String userID, int returncount, long datetime,
			long timespan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery20(String eventID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery21(String eventID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery22(String mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery23(String eventID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BSMAQuery24(String eventID) {
		// TODO Auto-generated method stub
		return null;
	}

}