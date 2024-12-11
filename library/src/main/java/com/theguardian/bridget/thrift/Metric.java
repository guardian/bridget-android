/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.21.0)")
public class Metric extends org.apache.thrift.TUnion<Metric, Metric._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Metric");
  private static final org.apache.thrift.protocol.TField FIRST_PAINT_FIELD_DESC = new org.apache.thrift.protocol.TField("firstPaint", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FIRST_CONTENTFUL_PAINT_FIELD_DESC = new org.apache.thrift.protocol.TField("firstContentfulPaint", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField FONT_FIELD_DESC = new org.apache.thrift.protocol.TField("font", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIRST_PAINT((short)1, "firstPaint"),
    FIRST_CONTENTFUL_PAINT((short)2, "firstContentfulPaint"),
    FONT((short)3, "font");

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
        case 1: // FIRST_PAINT
          return FIRST_PAINT;
        case 2: // FIRST_CONTENTFUL_PAINT
          return FIRST_CONTENTFUL_PAINT;
        case 3: // FONT
          return FONT;
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
    tmpMap.put(_Fields.FIRST_PAINT, new org.apache.thrift.meta_data.FieldMetaData("firstPaint", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricPaint.class)));
    tmpMap.put(_Fields.FIRST_CONTENTFUL_PAINT, new org.apache.thrift.meta_data.FieldMetaData("firstContentfulPaint", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricPaint.class)));
    tmpMap.put(_Fields.FONT, new org.apache.thrift.meta_data.FieldMetaData("font", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricFont.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Metric.class, metaDataMap);
  }

  public Metric() {
    super();
  }

  public Metric(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public Metric(Metric other) {
    super(other);
  }
  @Override
  public Metric deepCopy() {
    return new Metric(this);
  }

  public static Metric firstPaint(MetricPaint value) {
    Metric x = new Metric();
    x.setFirstPaint(value);
    return x;
  }

  public static Metric firstContentfulPaint(MetricPaint value) {
    Metric x = new Metric();
    x.setFirstContentfulPaint(value);
    return x;
  }

  public static Metric font(MetricFont value) {
    Metric x = new Metric();
    x.setFont(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case FIRST_PAINT:
        if (value instanceof MetricPaint) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type MetricPaint for field 'firstPaint', but got " + value.getClass().getSimpleName());
      case FIRST_CONTENTFUL_PAINT:
        if (value instanceof MetricPaint) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type MetricPaint for field 'firstContentfulPaint', but got " + value.getClass().getSimpleName());
      case FONT:
        if (value instanceof MetricFont) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type MetricFont for field 'font', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case FIRST_PAINT:
          if (field.type == FIRST_PAINT_FIELD_DESC.type) {
            MetricPaint firstPaint;
            firstPaint = new MetricPaint();
            firstPaint.read(iprot);
            return firstPaint;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FIRST_CONTENTFUL_PAINT:
          if (field.type == FIRST_CONTENTFUL_PAINT_FIELD_DESC.type) {
            MetricPaint firstContentfulPaint;
            firstContentfulPaint = new MetricPaint();
            firstContentfulPaint.read(iprot);
            return firstContentfulPaint;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FONT:
          if (field.type == FONT_FIELD_DESC.type) {
            MetricFont font;
            font = new MetricFont();
            font.read(iprot);
            return font;
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
      case FIRST_PAINT:
        MetricPaint firstPaint = (MetricPaint)value_;
        firstPaint.write(oprot);
        return;
      case FIRST_CONTENTFUL_PAINT:
        MetricPaint firstContentfulPaint = (MetricPaint)value_;
        firstContentfulPaint.write(oprot);
        return;
      case FONT:
        MetricFont font = (MetricFont)value_;
        font.write(oprot);
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
        case FIRST_PAINT:
          MetricPaint firstPaint;
          firstPaint = new MetricPaint();
          firstPaint.read(iprot);
          return firstPaint;
        case FIRST_CONTENTFUL_PAINT:
          MetricPaint firstContentfulPaint;
          firstContentfulPaint = new MetricPaint();
          firstContentfulPaint.read(iprot);
          return firstContentfulPaint;
        case FONT:
          MetricFont font;
          font = new MetricFont();
          font.read(iprot);
          return font;
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
      case FIRST_PAINT:
        MetricPaint firstPaint = (MetricPaint)value_;
        firstPaint.write(oprot);
        return;
      case FIRST_CONTENTFUL_PAINT:
        MetricPaint firstContentfulPaint = (MetricPaint)value_;
        firstContentfulPaint.write(oprot);
        return;
      case FONT:
        MetricFont font = (MetricFont)value_;
        font.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case FIRST_PAINT:
        return FIRST_PAINT_FIELD_DESC;
      case FIRST_CONTENTFUL_PAINT:
        return FIRST_CONTENTFUL_PAINT_FIELD_DESC;
      case FONT:
        return FONT_FIELD_DESC;
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


  public MetricPaint getFirstPaint() {
    if (getSetField() == _Fields.FIRST_PAINT) {
      return (MetricPaint)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'firstPaint' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFirstPaint(MetricPaint value) {
    setField_ = _Fields.FIRST_PAINT;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.FIRST_PAINT");
  }

  public MetricPaint getFirstContentfulPaint() {
    if (getSetField() == _Fields.FIRST_CONTENTFUL_PAINT) {
      return (MetricPaint)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'firstContentfulPaint' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFirstContentfulPaint(MetricPaint value) {
    setField_ = _Fields.FIRST_CONTENTFUL_PAINT;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.FIRST_CONTENTFUL_PAINT");
  }

  public MetricFont getFont() {
    if (getSetField() == _Fields.FONT) {
      return (MetricFont)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'font' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFont(MetricFont value) {
    setField_ = _Fields.FONT;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.FONT");
  }

  public boolean isSetFirstPaint() {
    return setField_ == _Fields.FIRST_PAINT;
  }


  public boolean isSetFirstContentfulPaint() {
    return setField_ == _Fields.FIRST_CONTENTFUL_PAINT;
  }


  public boolean isSetFont() {
    return setField_ == _Fields.FONT;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof Metric) {
      return equals((Metric)other);
    } else {
      return false;
    }
  }

  public boolean equals(Metric other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Metric other) {
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
