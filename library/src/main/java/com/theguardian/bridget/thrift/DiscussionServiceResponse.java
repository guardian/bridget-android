/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.21.0)")
public class DiscussionServiceResponse extends org.apache.thrift.TUnion<DiscussionServiceResponse, DiscussionServiceResponse._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DiscussionServiceResponse");
  private static final org.apache.thrift.protocol.TField RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("response", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the JSON parsing will be done in DCR
     */
    RESPONSE((short)1, "response"),
    /**
     * 
     * @see DiscussionNativeError
     */
    ERROR((short)2, "error");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESPONSE
          return RESPONSE;
        case 2: // ERROR
          return ERROR;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("response", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DiscussionNativeError.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DiscussionServiceResponse.class, metaDataMap);
  }

  public DiscussionServiceResponse() {
    super();
  }

  public DiscussionServiceResponse(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public DiscussionServiceResponse(DiscussionServiceResponse other) {
    super(other);
  }
  @Override
  public DiscussionServiceResponse deepCopy() {
    return new DiscussionServiceResponse(this);
  }

  public static DiscussionServiceResponse response(java.lang.String value) {
    DiscussionServiceResponse x = new DiscussionServiceResponse();
    x.setResponse(value);
    return x;
  }

  public static DiscussionServiceResponse error(DiscussionNativeError value) {
    DiscussionServiceResponse x = new DiscussionServiceResponse();
    x.setError(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case RESPONSE:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'response', but got " + value.getClass().getSimpleName());
      case ERROR:
        if (value instanceof DiscussionNativeError) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type DiscussionNativeError for field 'error', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case RESPONSE:
          if (field.type == RESPONSE_FIELD_DESC.type) {
            java.lang.String response;
            response = iprot.readString();
            return response;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case ERROR:
          if (field.type == ERROR_FIELD_DESC.type) {
            DiscussionNativeError error;
            error = com.theguardian.bridget.thrift.DiscussionNativeError.findByValue(iprot.readI32());
            return error;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case RESPONSE:
        java.lang.String response = (java.lang.String)value_;
        oprot.writeString(response);
        return;
      case ERROR:
        DiscussionNativeError error = (DiscussionNativeError)value_;
        oprot.writeI32(error.getValue());
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case RESPONSE:
          java.lang.String response;
          response = iprot.readString();
          return response;
        case ERROR:
          DiscussionNativeError error;
          error = com.theguardian.bridget.thrift.DiscussionNativeError.findByValue(iprot.readI32());
          return error;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case RESPONSE:
        java.lang.String response = (java.lang.String)value_;
        oprot.writeString(response);
        return;
      case ERROR:
        DiscussionNativeError error = (DiscussionNativeError)value_;
        oprot.writeI32(error.getValue());
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case RESPONSE:
        return RESPONSE_FIELD_DESC;
      case ERROR:
        return ERROR_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  /**
   * the JSON parsing will be done in DCR
   */
  public java.lang.String getResponse() {
    if (getSetField() == _Fields.RESPONSE) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'response' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * the JSON parsing will be done in DCR
   */
  public void setResponse(java.lang.String value) {
    setField_ = _Fields.RESPONSE;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.RESPONSE");
  }

  /**
   * 
   * @see DiscussionNativeError
   */
  public DiscussionNativeError getError() {
    if (getSetField() == _Fields.ERROR) {
      return (DiscussionNativeError)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'error' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * 
   * @see DiscussionNativeError
   */
  public void setError(DiscussionNativeError value) {
    setField_ = _Fields.ERROR;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.ERROR");
  }

  public boolean isSetResponse() {
    return setField_ == _Fields.RESPONSE;
  }


  public boolean isSetError() {
    return setField_ == _Fields.ERROR;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof DiscussionServiceResponse) {
      return equals((DiscussionServiceResponse)other);
    } else {
      return false;
    }
  }

  public boolean equals(DiscussionServiceResponse other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(DiscussionServiceResponse other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
