/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.21.0)")
public class Epic implements org.apache.thrift.TBase<Epic, Epic._Fields>, java.io.Serializable, Cloneable, Comparable<Epic> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Epic");

  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("body", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FIRST_BUTTON_FIELD_DESC = new org.apache.thrift.protocol.TField("firstButton", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SECOND_BUTTON_FIELD_DESC = new org.apache.thrift.protocol.TField("secondButton", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EpicStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EpicTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String title; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String body; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String firstButton; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String secondButton; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "title"),
    BODY((short)2, "body"),
    FIRST_BUTTON((short)3, "firstButton"),
    SECOND_BUTTON((short)4, "secondButton");

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
        case 1: // TITLE
          return TITLE;
        case 2: // BODY
          return BODY;
        case 3: // FIRST_BUTTON
          return FIRST_BUTTON;
        case 4: // SECOND_BUTTON
          return SECOND_BUTTON;
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
  private static final _Fields optionals[] = {_Fields.SECOND_BUTTON};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BODY, new org.apache.thrift.meta_data.FieldMetaData("body", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FIRST_BUTTON, new org.apache.thrift.meta_data.FieldMetaData("firstButton", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECOND_BUTTON, new org.apache.thrift.meta_data.FieldMetaData("secondButton", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Epic.class, metaDataMap);
  }

  public Epic() {
  }

  public Epic(
    java.lang.String title,
    java.lang.String body,
    java.lang.String firstButton)
  {
    this();
    this.title = title;
    this.body = body;
    this.firstButton = firstButton;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Epic(Epic other) {
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetBody()) {
      this.body = other.body;
    }
    if (other.isSetFirstButton()) {
      this.firstButton = other.firstButton;
    }
    if (other.isSetSecondButton()) {
      this.secondButton = other.secondButton;
    }
  }

  @Override
  public Epic deepCopy() {
    return new Epic(this);
  }

  @Override
  public void clear() {
    this.title = null;
    this.body = null;
    this.firstButton = null;
    this.secondButton = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTitle() {
    return this.title;
  }

  public Epic setTitle(@org.apache.thrift.annotation.Nullable java.lang.String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBody() {
    return this.body;
  }

  public Epic setBody(@org.apache.thrift.annotation.Nullable java.lang.String body) {
    this.body = body;
    return this;
  }

  public void unsetBody() {
    this.body = null;
  }

  /** Returns true if field body is set (has been assigned a value) and false otherwise */
  public boolean isSetBody() {
    return this.body != null;
  }

  public void setBodyIsSet(boolean value) {
    if (!value) {
      this.body = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFirstButton() {
    return this.firstButton;
  }

  public Epic setFirstButton(@org.apache.thrift.annotation.Nullable java.lang.String firstButton) {
    this.firstButton = firstButton;
    return this;
  }

  public void unsetFirstButton() {
    this.firstButton = null;
  }

  /** Returns true if field firstButton is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstButton() {
    return this.firstButton != null;
  }

  public void setFirstButtonIsSet(boolean value) {
    if (!value) {
      this.firstButton = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSecondButton() {
    return this.secondButton;
  }

  public Epic setSecondButton(@org.apache.thrift.annotation.Nullable java.lang.String secondButton) {
    this.secondButton = secondButton;
    return this;
  }

  public void unsetSecondButton() {
    this.secondButton = null;
  }

  /** Returns true if field secondButton is set (has been assigned a value) and false otherwise */
  public boolean isSetSecondButton() {
    return this.secondButton != null;
  }

  public void setSecondButtonIsSet(boolean value) {
    if (!value) {
      this.secondButton = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((java.lang.String)value);
      }
      break;

    case BODY:
      if (value == null) {
        unsetBody();
      } else {
        setBody((java.lang.String)value);
      }
      break;

    case FIRST_BUTTON:
      if (value == null) {
        unsetFirstButton();
      } else {
        setFirstButton((java.lang.String)value);
      }
      break;

    case SECOND_BUTTON:
      if (value == null) {
        unsetSecondButton();
      } else {
        setSecondButton((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TITLE:
      return getTitle();

    case BODY:
      return getBody();

    case FIRST_BUTTON:
      return getFirstButton();

    case SECOND_BUTTON:
      return getSecondButton();

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
    case TITLE:
      return isSetTitle();
    case BODY:
      return isSetBody();
    case FIRST_BUTTON:
      return isSetFirstButton();
    case SECOND_BUTTON:
      return isSetSecondButton();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Epic)
      return this.equals((Epic)that);
    return false;
  }

  public boolean equals(Epic that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_body = true && this.isSetBody();
    boolean that_present_body = true && that.isSetBody();
    if (this_present_body || that_present_body) {
      if (!(this_present_body && that_present_body))
        return false;
      if (!this.body.equals(that.body))
        return false;
    }

    boolean this_present_firstButton = true && this.isSetFirstButton();
    boolean that_present_firstButton = true && that.isSetFirstButton();
    if (this_present_firstButton || that_present_firstButton) {
      if (!(this_present_firstButton && that_present_firstButton))
        return false;
      if (!this.firstButton.equals(that.firstButton))
        return false;
    }

    boolean this_present_secondButton = true && this.isSetSecondButton();
    boolean that_present_secondButton = true && that.isSetSecondButton();
    if (this_present_secondButton || that_present_secondButton) {
      if (!(this_present_secondButton && that_present_secondButton))
        return false;
      if (!this.secondButton.equals(that.secondButton))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTitle()) ? 131071 : 524287);
    if (isSetTitle())
      hashCode = hashCode * 8191 + title.hashCode();

    hashCode = hashCode * 8191 + ((isSetBody()) ? 131071 : 524287);
    if (isSetBody())
      hashCode = hashCode * 8191 + body.hashCode();

    hashCode = hashCode * 8191 + ((isSetFirstButton()) ? 131071 : 524287);
    if (isSetFirstButton())
      hashCode = hashCode * 8191 + firstButton.hashCode();

    hashCode = hashCode * 8191 + ((isSetSecondButton()) ? 131071 : 524287);
    if (isSetSecondButton())
      hashCode = hashCode * 8191 + secondButton.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Epic other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTitle(), other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBody(), other.isSetBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.body, other.body);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFirstButton(), other.isSetFirstButton());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstButton()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstButton, other.firstButton);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSecondButton(), other.isSetSecondButton());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecondButton()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secondButton, other.secondButton);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Epic(");
    boolean first = true;

    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("body:");
    if (this.body == null) {
      sb.append("null");
    } else {
      sb.append(this.body);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("firstButton:");
    if (this.firstButton == null) {
      sb.append("null");
    } else {
      sb.append(this.firstButton);
    }
    first = false;
    if (isSetSecondButton()) {
      if (!first) sb.append(", ");
      sb.append("secondButton:");
      if (this.secondButton == null) {
        sb.append("null");
      } else {
        sb.append(this.secondButton);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (title == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'title' was not present! Struct: " + toString());
    }
    if (body == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'body' was not present! Struct: " + toString());
    }
    if (firstButton == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'firstButton' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class EpicStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public EpicStandardScheme getScheme() {
      return new EpicStandardScheme();
    }
  }

  private static class EpicStandardScheme extends org.apache.thrift.scheme.StandardScheme<Epic> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, Epic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BODY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.body = iprot.readString();
              struct.setBodyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FIRST_BUTTON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firstButton = iprot.readString();
              struct.setFirstButtonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SECOND_BUTTON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.secondButton = iprot.readString();
              struct.setSecondButtonIsSet(true);
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

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, Epic struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.body != null) {
        oprot.writeFieldBegin(BODY_FIELD_DESC);
        oprot.writeString(struct.body);
        oprot.writeFieldEnd();
      }
      if (struct.firstButton != null) {
        oprot.writeFieldBegin(FIRST_BUTTON_FIELD_DESC);
        oprot.writeString(struct.firstButton);
        oprot.writeFieldEnd();
      }
      if (struct.secondButton != null) {
        if (struct.isSetSecondButton()) {
          oprot.writeFieldBegin(SECOND_BUTTON_FIELD_DESC);
          oprot.writeString(struct.secondButton);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EpicTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public EpicTupleScheme getScheme() {
      return new EpicTupleScheme();
    }
  }

  private static class EpicTupleScheme extends org.apache.thrift.scheme.TupleScheme<Epic> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Epic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.title);
      oprot.writeString(struct.body);
      oprot.writeString(struct.firstButton);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSecondButton()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSecondButton()) {
        oprot.writeString(struct.secondButton);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Epic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.title = iprot.readString();
      struct.setTitleIsSet(true);
      struct.body = iprot.readString();
      struct.setBodyIsSet(true);
      struct.firstButton = iprot.readString();
      struct.setFirstButtonIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.secondButton = iprot.readString();
        struct.setSecondButtonIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

