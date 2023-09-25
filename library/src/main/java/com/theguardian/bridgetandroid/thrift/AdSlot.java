/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridgetandroid.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)")
public class AdSlot implements org.apache.thrift.TBase<AdSlot, AdSlot._Fields>, java.io.Serializable, Cloneable, Comparable<AdSlot> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdSlot");

  private static final org.apache.thrift.protocol.TField RECT_FIELD_DESC = new org.apache.thrift.protocol.TField("rect", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TARGETING_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("targetingParams", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField IS_SQUARE_FIELD_DESC = new org.apache.thrift.protocol.TField("isSquare", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AdSlotStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AdSlotTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable Rect rect; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> targetingParams; // optional
  public boolean isSquare; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RECT((short)1, "rect"),
    TARGETING_PARAMS((short)2, "targetingParams"),
    IS_SQUARE((short)3, "isSquare");

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
        case 1: // RECT
          return RECT;
        case 2: // TARGETING_PARAMS
          return TARGETING_PARAMS;
        case 3: // IS_SQUARE
          return IS_SQUARE;
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

  // isset id assignments
  private static final int __ISSQUARE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TARGETING_PARAMS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECT, new org.apache.thrift.meta_data.FieldMetaData("rect", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Rect.class)));
    tmpMap.put(_Fields.TARGETING_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("targetingParams", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.IS_SQUARE, new org.apache.thrift.meta_data.FieldMetaData("isSquare", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdSlot.class, metaDataMap);
  }

  public AdSlot() {
  }

  public AdSlot(
    Rect rect,
    boolean isSquare)
  {
    this();
    this.rect = rect;
    this.isSquare = isSquare;
    setIsSquareIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdSlot(AdSlot other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRect()) {
      this.rect = new Rect(other.rect);
    }
    if (other.isSetTargetingParams()) {
      java.util.Map<java.lang.String,java.lang.String> __this__targetingParams = new java.util.HashMap<java.lang.String,java.lang.String>(other.targetingParams);
      this.targetingParams = __this__targetingParams;
    }
    this.isSquare = other.isSquare;
  }

  @Override
  public AdSlot deepCopy() {
    return new AdSlot(this);
  }

  @Override
  public void clear() {
    this.rect = null;
    this.targetingParams = null;
    setIsSquareIsSet(false);
    this.isSquare = false;
  }

  @org.apache.thrift.annotation.Nullable
  public Rect getRect() {
    return this.rect;
  }

  public AdSlot setRect(@org.apache.thrift.annotation.Nullable Rect rect) {
    this.rect = rect;
    return this;
  }

  public void unsetRect() {
    this.rect = null;
  }

  /** Returns true if field rect is set (has been assigned a value) and false otherwise */
  public boolean isSetRect() {
    return this.rect != null;
  }

  public void setRectIsSet(boolean value) {
    if (!value) {
      this.rect = null;
    }
  }

  public int getTargetingParamsSize() {
    return (this.targetingParams == null) ? 0 : this.targetingParams.size();
  }

  public void putToTargetingParams(java.lang.String key, java.lang.String val) {
    if (this.targetingParams == null) {
      this.targetingParams = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.targetingParams.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getTargetingParams() {
    return this.targetingParams;
  }

  public AdSlot setTargetingParams(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> targetingParams) {
    this.targetingParams = targetingParams;
    return this;
  }

  public void unsetTargetingParams() {
    this.targetingParams = null;
  }

  /** Returns true if field targetingParams is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetingParams() {
    return this.targetingParams != null;
  }

  public void setTargetingParamsIsSet(boolean value) {
    if (!value) {
      this.targetingParams = null;
    }
  }

  public boolean isIsSquare() {
    return this.isSquare;
  }

  public AdSlot setIsSquare(boolean isSquare) {
    this.isSquare = isSquare;
    setIsSquareIsSet(true);
    return this;
  }

  public void unsetIsSquare() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISSQUARE_ISSET_ID);
  }

  /** Returns true if field isSquare is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSquare() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISSQUARE_ISSET_ID);
  }

  public void setIsSquareIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISSQUARE_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RECT:
      if (value == null) {
        unsetRect();
      } else {
        setRect((Rect)value);
      }
      break;

    case TARGETING_PARAMS:
      if (value == null) {
        unsetTargetingParams();
      } else {
        setTargetingParams((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case IS_SQUARE:
      if (value == null) {
        unsetIsSquare();
      } else {
        setIsSquare((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RECT:
      return getRect();

    case TARGETING_PARAMS:
      return getTargetingParams();

    case IS_SQUARE:
      return isIsSquare();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RECT:
      return isSetRect();
    case TARGETING_PARAMS:
      return isSetTargetingParams();
    case IS_SQUARE:
      return isSetIsSquare();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AdSlot)
      return this.equals((AdSlot)that);
    return false;
  }

  public boolean equals(AdSlot that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_rect = true && this.isSetRect();
    boolean that_present_rect = true && that.isSetRect();
    if (this_present_rect || that_present_rect) {
      if (!(this_present_rect && that_present_rect))
        return false;
      if (!this.rect.equals(that.rect))
        return false;
    }

    boolean this_present_targetingParams = true && this.isSetTargetingParams();
    boolean that_present_targetingParams = true && that.isSetTargetingParams();
    if (this_present_targetingParams || that_present_targetingParams) {
      if (!(this_present_targetingParams && that_present_targetingParams))
        return false;
      if (!this.targetingParams.equals(that.targetingParams))
        return false;
    }

    boolean this_present_isSquare = true;
    boolean that_present_isSquare = true;
    if (this_present_isSquare || that_present_isSquare) {
      if (!(this_present_isSquare && that_present_isSquare))
        return false;
      if (this.isSquare != that.isSquare)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRect()) ? 131071 : 524287);
    if (isSetRect())
      hashCode = hashCode * 8191 + rect.hashCode();

    hashCode = hashCode * 8191 + ((isSetTargetingParams()) ? 131071 : 524287);
    if (isSetTargetingParams())
      hashCode = hashCode * 8191 + targetingParams.hashCode();

    hashCode = hashCode * 8191 + ((isSquare) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(AdSlot other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRect(), other.isSetRect());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRect()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rect, other.rect);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTargetingParams(), other.isSetTargetingParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetingParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetingParams, other.targetingParams);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsSquare(), other.isSetIsSquare());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSquare()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSquare, other.isSquare);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AdSlot(");
    boolean first = true;

    sb.append("rect:");
    if (this.rect == null) {
      sb.append("null");
    } else {
      sb.append(this.rect);
    }
    first = false;
    if (isSetTargetingParams()) {
      if (!first) sb.append(", ");
      sb.append("targetingParams:");
      if (this.targetingParams == null) {
        sb.append("null");
      } else {
        sb.append(this.targetingParams);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("isSquare:");
    sb.append(this.isSquare);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (rect == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rect' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'isSquare' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (rect != null) {
      rect.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AdSlotStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AdSlotStandardScheme getScheme() {
      return new AdSlotStandardScheme();
    }
  }

  private static class AdSlotStandardScheme extends org.apache.thrift.scheme.StandardScheme<AdSlot> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, AdSlot struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.rect = new Rect();
              struct.rect.read(iprot);
              struct.setRectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGETING_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.targetingParams = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key1;
                @org.apache.thrift.annotation.Nullable java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.targetingParams.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setTargetingParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_SQUARE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSquare = iprot.readBool();
              struct.setIsSquareIsSet(true);
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
      if (!struct.isSetIsSquare()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'isSquare' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, AdSlot struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rect != null) {
        oprot.writeFieldBegin(RECT_FIELD_DESC);
        struct.rect.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.targetingParams != null) {
        if (struct.isSetTargetingParams()) {
          oprot.writeFieldBegin(TARGETING_PARAMS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.targetingParams.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter4 : struct.targetingParams.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(IS_SQUARE_FIELD_DESC);
      oprot.writeBool(struct.isSquare);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdSlotTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AdSlotTupleScheme getScheme() {
      return new AdSlotTupleScheme();
    }
  }

  private static class AdSlotTupleScheme extends org.apache.thrift.scheme.TupleScheme<AdSlot> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AdSlot struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.rect.write(oprot);
      oprot.writeBool(struct.isSquare);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTargetingParams()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTargetingParams()) {
        {
          oprot.writeI32(struct.targetingParams.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter5 : struct.targetingParams.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AdSlot struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.rect = new Rect();
      struct.rect.read(iprot);
      struct.setRectIsSet(true);
      struct.isSquare = iprot.readBool();
      struct.setIsSquareIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.targetingParams = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map6.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key7;
          @org.apache.thrift.annotation.Nullable java.lang.String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.targetingParams.put(_key7, _val8);
          }
        }
        struct.setTargetingParamsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

