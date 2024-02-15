/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)")
public class VideoSlot implements org.apache.thrift.TBase<VideoSlot, VideoSlot._Fields>, java.io.Serializable, Cloneable, Comparable<VideoSlot> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VideoSlot");

  private static final org.apache.thrift.protocol.TField RECT_FIELD_DESC = new org.apache.thrift.protocol.TField("rect", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VIDEO_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("videoId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField POSTER_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("posterUrl", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("duration", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new VideoSlotStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new VideoSlotTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable Rect rect; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String videoId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String posterUrl; // required
  public int duration; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RECT((short)1, "rect"),
    VIDEO_ID((short)2, "videoId"),
    POSTER_URL((short)3, "posterUrl"),
    DURATION((short)4, "duration");

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
        case 2: // VIDEO_ID
          return VIDEO_ID;
        case 3: // POSTER_URL
          return POSTER_URL;
        case 4: // DURATION
          return DURATION;
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

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DURATION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DURATION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECT, new org.apache.thrift.meta_data.FieldMetaData("rect", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Rect.class)));
    tmpMap.put(_Fields.VIDEO_ID, new org.apache.thrift.meta_data.FieldMetaData("videoId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POSTER_URL, new org.apache.thrift.meta_data.FieldMetaData("posterUrl", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DURATION, new org.apache.thrift.meta_data.FieldMetaData("duration", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VideoSlot.class, metaDataMap);
  }

  public VideoSlot() {
  }

  public VideoSlot(
    Rect rect,
    java.lang.String videoId,
    java.lang.String posterUrl)
  {
    this();
    this.rect = rect;
    this.videoId = videoId;
    this.posterUrl = posterUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VideoSlot(VideoSlot other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRect()) {
      this.rect = new Rect(other.rect);
    }
    if (other.isSetVideoId()) {
      this.videoId = other.videoId;
    }
    if (other.isSetPosterUrl()) {
      this.posterUrl = other.posterUrl;
    }
    this.duration = other.duration;
  }

  public VideoSlot deepCopy() {
    return new VideoSlot(this);
  }

  @Override
  public void clear() {
    this.rect = null;
    this.videoId = null;
    this.posterUrl = null;
    setDurationIsSet(false);
    this.duration = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public Rect getRect() {
    return this.rect;
  }

  public VideoSlot setRect(@org.apache.thrift.annotation.Nullable Rect rect) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVideoId() {
    return this.videoId;
  }

  public VideoSlot setVideoId(@org.apache.thrift.annotation.Nullable java.lang.String videoId) {
    this.videoId = videoId;
    return this;
  }

  public void unsetVideoId() {
    this.videoId = null;
  }

  /** Returns true if field videoId is set (has been assigned a value) and false otherwise */
  public boolean isSetVideoId() {
    return this.videoId != null;
  }

  public void setVideoIdIsSet(boolean value) {
    if (!value) {
      this.videoId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPosterUrl() {
    return this.posterUrl;
  }

  public VideoSlot setPosterUrl(@org.apache.thrift.annotation.Nullable java.lang.String posterUrl) {
    this.posterUrl = posterUrl;
    return this;
  }

  public void unsetPosterUrl() {
    this.posterUrl = null;
  }

  /** Returns true if field posterUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetPosterUrl() {
    return this.posterUrl != null;
  }

  public void setPosterUrlIsSet(boolean value) {
    if (!value) {
      this.posterUrl = null;
    }
  }

  public int getDuration() {
    return this.duration;
  }

  public VideoSlot setDuration(int duration) {
    this.duration = duration;
    setDurationIsSet(true);
    return this;
  }

  public void unsetDuration() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DURATION_ISSET_ID);
  }

  /** Returns true if field duration is set (has been assigned a value) and false otherwise */
  public boolean isSetDuration() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DURATION_ISSET_ID);
  }

  public void setDurationIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DURATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RECT:
      if (value == null) {
        unsetRect();
      } else {
        setRect((Rect)value);
      }
      break;

    case VIDEO_ID:
      if (value == null) {
        unsetVideoId();
      } else {
        setVideoId((java.lang.String)value);
      }
      break;

    case POSTER_URL:
      if (value == null) {
        unsetPosterUrl();
      } else {
        setPosterUrl((java.lang.String)value);
      }
      break;

    case DURATION:
      if (value == null) {
        unsetDuration();
      } else {
        setDuration((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RECT:
      return getRect();

    case VIDEO_ID:
      return getVideoId();

    case POSTER_URL:
      return getPosterUrl();

    case DURATION:
      return getDuration();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RECT:
      return isSetRect();
    case VIDEO_ID:
      return isSetVideoId();
    case POSTER_URL:
      return isSetPosterUrl();
    case DURATION:
      return isSetDuration();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof VideoSlot)
      return this.equals((VideoSlot)that);
    return false;
  }

  public boolean equals(VideoSlot that) {
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

    boolean this_present_videoId = true && this.isSetVideoId();
    boolean that_present_videoId = true && that.isSetVideoId();
    if (this_present_videoId || that_present_videoId) {
      if (!(this_present_videoId && that_present_videoId))
        return false;
      if (!this.videoId.equals(that.videoId))
        return false;
    }

    boolean this_present_posterUrl = true && this.isSetPosterUrl();
    boolean that_present_posterUrl = true && that.isSetPosterUrl();
    if (this_present_posterUrl || that_present_posterUrl) {
      if (!(this_present_posterUrl && that_present_posterUrl))
        return false;
      if (!this.posterUrl.equals(that.posterUrl))
        return false;
    }

    boolean this_present_duration = true && this.isSetDuration();
    boolean that_present_duration = true && that.isSetDuration();
    if (this_present_duration || that_present_duration) {
      if (!(this_present_duration && that_present_duration))
        return false;
      if (this.duration != that.duration)
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

    hashCode = hashCode * 8191 + ((isSetVideoId()) ? 131071 : 524287);
    if (isSetVideoId())
      hashCode = hashCode * 8191 + videoId.hashCode();

    hashCode = hashCode * 8191 + ((isSetPosterUrl()) ? 131071 : 524287);
    if (isSetPosterUrl())
      hashCode = hashCode * 8191 + posterUrl.hashCode();

    hashCode = hashCode * 8191 + ((isSetDuration()) ? 131071 : 524287);
    if (isSetDuration())
      hashCode = hashCode * 8191 + duration;

    return hashCode;
  }

  @Override
  public int compareTo(VideoSlot other) {
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
    lastComparison = java.lang.Boolean.compare(isSetVideoId(), other.isSetVideoId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVideoId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.videoId, other.videoId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPosterUrl(), other.isSetPosterUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosterUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.posterUrl, other.posterUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDuration(), other.isSetDuration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDuration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.duration, other.duration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoSlot(");
    boolean first = true;

    sb.append("rect:");
    if (this.rect == null) {
      sb.append("null");
    } else {
      sb.append(this.rect);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("videoId:");
    if (this.videoId == null) {
      sb.append("null");
    } else {
      sb.append(this.videoId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("posterUrl:");
    if (this.posterUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.posterUrl);
    }
    first = false;
    if (isSetDuration()) {
      if (!first) sb.append(", ");
      sb.append("duration:");
      sb.append(this.duration);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (rect == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rect' was not present! Struct: " + toString());
    }
    if (videoId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'videoId' was not present! Struct: " + toString());
    }
    if (posterUrl == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'posterUrl' was not present! Struct: " + toString());
    }
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

  private static class VideoSlotStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public VideoSlotStandardScheme getScheme() {
      return new VideoSlotStandardScheme();
    }
  }

  private static class VideoSlotStandardScheme extends org.apache.thrift.scheme.StandardScheme<VideoSlot> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VideoSlot struct) throws org.apache.thrift.TException {
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
          case 2: // VIDEO_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.videoId = iprot.readString();
              struct.setVideoIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSTER_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.posterUrl = iprot.readString();
              struct.setPosterUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.duration = iprot.readI32();
              struct.setDurationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, VideoSlot struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rect != null) {
        oprot.writeFieldBegin(RECT_FIELD_DESC);
        struct.rect.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.videoId != null) {
        oprot.writeFieldBegin(VIDEO_ID_FIELD_DESC);
        oprot.writeString(struct.videoId);
        oprot.writeFieldEnd();
      }
      if (struct.posterUrl != null) {
        oprot.writeFieldBegin(POSTER_URL_FIELD_DESC);
        oprot.writeString(struct.posterUrl);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDuration()) {
        oprot.writeFieldBegin(DURATION_FIELD_DESC);
        oprot.writeI32(struct.duration);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VideoSlotTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public VideoSlotTupleScheme getScheme() {
      return new VideoSlotTupleScheme();
    }
  }

  private static class VideoSlotTupleScheme extends org.apache.thrift.scheme.TupleScheme<VideoSlot> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VideoSlot struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.rect.write(oprot);
      oprot.writeString(struct.videoId);
      oprot.writeString(struct.posterUrl);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDuration()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDuration()) {
        oprot.writeI32(struct.duration);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VideoSlot struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.rect = new Rect();
      struct.rect.read(iprot);
      struct.setRectIsSet(true);
      struct.videoId = iprot.readString();
      struct.setVideoIdIsSet(true);
      struct.posterUrl = iprot.readString();
      struct.setPosterUrlIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.duration = iprot.readI32();
        struct.setDurationIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

