/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package rpc;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Job implements org.apache.thrift.TBase<Job, Job._Fields>, java.io.Serializable, Cloneable, Comparable<Job> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Job");

  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobID", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SUB_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("subIDs", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobTupleSchemeFactory());
  }

  public int jobID; // required
  public List<Integer> subIDs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_ID((short)1, "jobID"),
    SUB_IDS((short)2, "subIDs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_ID
          return JOB_ID;
        case 2: // SUB_IDS
          return SUB_IDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __JOBID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("jobID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SUB_IDS, new org.apache.thrift.meta_data.FieldMetaData("subIDs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Job.class, metaDataMap);
  }

  public Job() {
    this.jobID = 0;

  }

  public Job(
    int jobID,
    List<Integer> subIDs)
  {
    this();
    this.jobID = jobID;
    setJobIDIsSet(true);
    this.subIDs = subIDs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Job(Job other) {
    __isset_bitfield = other.__isset_bitfield;
    this.jobID = other.jobID;
    if (other.isSetSubIDs()) {
      List<Integer> __this__subIDs = new ArrayList<Integer>(other.subIDs);
      this.subIDs = __this__subIDs;
    }
  }

  public Job deepCopy() {
    return new Job(this);
  }

  @Override
  public void clear() {
    this.jobID = 0;

    this.subIDs = null;
  }

  public int getJobID() {
    return this.jobID;
  }

  public Job setJobID(int jobID) {
    this.jobID = jobID;
    setJobIDIsSet(true);
    return this;
  }

  public void unsetJobID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  /** Returns true if field jobID is set (has been assigned a value) and false otherwise */
  public boolean isSetJobID() {
    return EncodingUtils.testBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  public void setJobIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JOBID_ISSET_ID, value);
  }

  public int getSubIDsSize() {
    return (this.subIDs == null) ? 0 : this.subIDs.size();
  }

  public java.util.Iterator<Integer> getSubIDsIterator() {
    return (this.subIDs == null) ? null : this.subIDs.iterator();
  }

  public void addToSubIDs(int elem) {
    if (this.subIDs == null) {
      this.subIDs = new ArrayList<Integer>();
    }
    this.subIDs.add(elem);
  }

  public List<Integer> getSubIDs() {
    return this.subIDs;
  }

  public Job setSubIDs(List<Integer> subIDs) {
    this.subIDs = subIDs;
    return this;
  }

  public void unsetSubIDs() {
    this.subIDs = null;
  }

  /** Returns true if field subIDs is set (has been assigned a value) and false otherwise */
  public boolean isSetSubIDs() {
    return this.subIDs != null;
  }

  public void setSubIDsIsSet(boolean value) {
    if (!value) {
      this.subIDs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_ID:
      if (value == null) {
        unsetJobID();
      } else {
        setJobID((Integer)value);
      }
      break;

    case SUB_IDS:
      if (value == null) {
        unsetSubIDs();
      } else {
        setSubIDs((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_ID:
      return Integer.valueOf(getJobID());

    case SUB_IDS:
      return getSubIDs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_ID:
      return isSetJobID();
    case SUB_IDS:
      return isSetSubIDs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Job)
      return this.equals((Job)that);
    return false;
  }

  public boolean equals(Job that) {
    if (that == null)
      return false;

    boolean this_present_jobID = true;
    boolean that_present_jobID = true;
    if (this_present_jobID || that_present_jobID) {
      if (!(this_present_jobID && that_present_jobID))
        return false;
      if (this.jobID != that.jobID)
        return false;
    }

    boolean this_present_subIDs = true && this.isSetSubIDs();
    boolean that_present_subIDs = true && that.isSetSubIDs();
    if (this_present_subIDs || that_present_subIDs) {
      if (!(this_present_subIDs && that_present_subIDs))
        return false;
      if (!this.subIDs.equals(that.subIDs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Job other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobID()).compareTo(other.isSetJobID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobID, other.jobID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubIDs()).compareTo(other.isSetSubIDs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubIDs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subIDs, other.subIDs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Job(");
    boolean first = true;

    sb.append("jobID:");
    sb.append(this.jobID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("subIDs:");
    if (this.subIDs == null) {
      sb.append("null");
    } else {
      sb.append(this.subIDs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobStandardSchemeFactory implements SchemeFactory {
    public JobStandardScheme getScheme() {
      return new JobStandardScheme();
    }
  }

  private static class JobStandardScheme extends StandardScheme<Job> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Job struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobID = iprot.readI32();
              struct.setJobIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUB_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.subIDs = new ArrayList<Integer>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  int _elem2;
                  _elem2 = iprot.readI32();
                  struct.subIDs.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setSubIDsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Job struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      oprot.writeI32(struct.jobID);
      oprot.writeFieldEnd();
      if (struct.subIDs != null) {
        oprot.writeFieldBegin(SUB_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.subIDs.size()));
          for (int _iter3 : struct.subIDs)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobTupleSchemeFactory implements SchemeFactory {
    public JobTupleScheme getScheme() {
      return new JobTupleScheme();
    }
  }

  private static class JobTupleScheme extends TupleScheme<Job> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Job struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetJobID()) {
        optionals.set(0);
      }
      if (struct.isSetSubIDs()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetJobID()) {
        oprot.writeI32(struct.jobID);
      }
      if (struct.isSetSubIDs()) {
        {
          oprot.writeI32(struct.subIDs.size());
          for (int _iter4 : struct.subIDs)
          {
            oprot.writeI32(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Job struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.jobID = iprot.readI32();
        struct.setJobIDIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.subIDs = new ArrayList<Integer>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            int _elem7;
            _elem7 = iprot.readI32();
            struct.subIDs.add(_elem7);
          }
        }
        struct.setSubIDsIsSet(true);
      }
    }
  }

}
