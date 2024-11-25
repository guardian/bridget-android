/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.19.0)")
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Interaction {

  public interface Iface {

    /**
     * Notify the native layer to disable the article swipe feature.
     * 
     * @param disableSwipe true if native needs to disable article swipe
     * 
     * @param disableSwipe
     */
    public void disableArticleSwipe(boolean disableSwipe) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void disableArticleSwipe(boolean disableSwipe, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      @Override
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      @Override
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    @Override
    public void disableArticleSwipe(boolean disableSwipe) throws org.apache.thrift.TException
    {
      send_disableArticleSwipe(disableSwipe);
      recv_disableArticleSwipe();
    }

    public void send_disableArticleSwipe(boolean disableSwipe) throws org.apache.thrift.TException
    {
      disableArticleSwipe_args args = new disableArticleSwipe_args();
      args.setDisableSwipe(disableSwipe);
      sendBase("disableArticleSwipe", args);
    }

    public void recv_disableArticleSwipe() throws org.apache.thrift.TException
    {
      disableArticleSwipe_result result = new disableArticleSwipe_result();
      receiveBase(result, "disableArticleSwipe");
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
    @Override
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    @Override
    public void disableArticleSwipe(boolean disableSwipe, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      disableArticleSwipe_call method_call = new disableArticleSwipe_call(disableSwipe, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class disableArticleSwipe_call extends org.apache.thrift.async.TAsyncMethodCall<Void> {
      private boolean disableSwipe;
      public disableArticleSwipe_call(boolean disableSwipe, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.disableSwipe = disableSwipe;
      }

      @Override
      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("disableArticleSwipe", org.apache.thrift.protocol.TMessageType.CALL, 0));
        disableArticleSwipe_args args = new disableArticleSwipe_args();
        args.setDisableSwipe(disableSwipe);
        args.write(prot);
        prot.writeMessageEnd();
      }

      @Override
      public Void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new java.lang.IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_disableArticleSwipe();
        return null;
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> java.util.Map<java.lang.String,  org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("disableArticleSwipe", new disableArticleSwipe());
      return processMap;
    }

    public static class disableArticleSwipe<I extends Iface> extends org.apache.thrift.ProcessFunction<I, disableArticleSwipe_args> {
      public disableArticleSwipe() {
        super("disableArticleSwipe");
      }

      @Override
      public disableArticleSwipe_args getEmptyArgsInstance() {
        return new disableArticleSwipe_args();
      }

      @Override
      protected boolean isOneway() {
        return false;
      }

      @Override
      protected boolean rethrowUnhandledExceptions() {
        return false;
      }

      @Override
      public disableArticleSwipe_result getResult(I iface, disableArticleSwipe_args args) throws org.apache.thrift.TException {
        disableArticleSwipe_result result = new disableArticleSwipe_result();
        iface.disableArticleSwipe(args.disableSwipe);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("disableArticleSwipe", new disableArticleSwipe());
      return processMap;
    }

    public static class disableArticleSwipe<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, disableArticleSwipe_args, Void> {
      public disableArticleSwipe() {
        super("disableArticleSwipe");
      }

      @Override
      public disableArticleSwipe_args getEmptyArgsInstance() {
        return new disableArticleSwipe_args();
      }

      @Override
      public org.apache.thrift.async.AsyncMethodCallback<Void> getResultHandler(final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new org.apache.thrift.async.AsyncMethodCallback<Void>() { 
          @Override
          public void onComplete(Void o) {
            disableArticleSwipe_result result = new disableArticleSwipe_result();
            try {
              fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
            } catch (org.apache.thrift.transport.TTransportException e) {
              _LOGGER.error("TTransportException writing to internal frame buffer", e);
              fb.close();
            } catch (java.lang.Exception e) {
              _LOGGER.error("Exception writing to internal frame buffer", e);
              onError(e);
            }
          }
          @Override
          public void onError(java.lang.Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TSerializable msg;
            disableArticleSwipe_result result = new disableArticleSwipe_result();
            if (e instanceof org.apache.thrift.transport.TTransportException) {
              _LOGGER.error("TTransportException inside handler", e);
              fb.close();
              return;
            } else if (e instanceof org.apache.thrift.TApplicationException) {
              _LOGGER.error("TApplicationException inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TApplicationException)e;
            } else {
              _LOGGER.error("Exception inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
            } catch (java.lang.Exception ex) {
              _LOGGER.error("Exception writing to internal frame buffer", ex);
              fb.close();
            }
          }
        };
      }

      @Override
      protected boolean isOneway() {
        return false;
      }

      @Override
      public void start(I iface, disableArticleSwipe_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
        iface.disableArticleSwipe(args.disableSwipe,resultHandler);
      }
    }

  }

  @SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
  public static class disableArticleSwipe_args implements org.apache.thrift.TBase<disableArticleSwipe_args, disableArticleSwipe_args._Fields>, java.io.Serializable, Cloneable, Comparable<disableArticleSwipe_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("disableArticleSwipe_args");

    private static final org.apache.thrift.protocol.TField DISABLE_SWIPE_FIELD_DESC = new org.apache.thrift.protocol.TField("disableSwipe", org.apache.thrift.protocol.TType.BOOL, (short)1);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new disableArticleSwipe_argsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new disableArticleSwipe_argsTupleSchemeFactory();

    public boolean disableSwipe; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      DISABLE_SWIPE((short)1, "disableSwipe");

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
          case 1: // DISABLE_SWIPE
            return DISABLE_SWIPE;
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
    private static final int __DISABLESWIPE_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.DISABLE_SWIPE, new org.apache.thrift.meta_data.FieldMetaData("disableSwipe", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(disableArticleSwipe_args.class, metaDataMap);
    }

    public disableArticleSwipe_args() {
    }

    public disableArticleSwipe_args(
      boolean disableSwipe)
    {
      this();
      this.disableSwipe = disableSwipe;
      setDisableSwipeIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public disableArticleSwipe_args(disableArticleSwipe_args other) {
      __isset_bitfield = other.__isset_bitfield;
      this.disableSwipe = other.disableSwipe;
    }

    @Override
    public disableArticleSwipe_args deepCopy() {
      return new disableArticleSwipe_args(this);
    }

    @Override
    public void clear() {
      setDisableSwipeIsSet(false);
      this.disableSwipe = false;
    }

    public boolean isDisableSwipe() {
      return this.disableSwipe;
    }

    public disableArticleSwipe_args setDisableSwipe(boolean disableSwipe) {
      this.disableSwipe = disableSwipe;
      setDisableSwipeIsSet(true);
      return this;
    }

    public void unsetDisableSwipe() {
      __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DISABLESWIPE_ISSET_ID);
    }

    /** Returns true if field disableSwipe is set (has been assigned a value) and false otherwise */
    public boolean isSetDisableSwipe() {
      return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DISABLESWIPE_ISSET_ID);
    }

    public void setDisableSwipeIsSet(boolean value) {
      __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DISABLESWIPE_ISSET_ID, value);
    }

    @Override
    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
      switch (field) {
      case DISABLE_SWIPE:
        if (value == null) {
          unsetDisableSwipe();
        } else {
          setDisableSwipe((java.lang.Boolean)value);
        }
        break;

      }
    }

    @org.apache.thrift.annotation.Nullable
    @Override
    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case DISABLE_SWIPE:
        return isDisableSwipe();

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
      case DISABLE_SWIPE:
        return isSetDisableSwipe();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that instanceof disableArticleSwipe_args)
        return this.equals((disableArticleSwipe_args)that);
      return false;
    }

    public boolean equals(disableArticleSwipe_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_disableSwipe = true;
      boolean that_present_disableSwipe = true;
      if (this_present_disableSwipe || that_present_disableSwipe) {
        if (!(this_present_disableSwipe && that_present_disableSwipe))
          return false;
        if (this.disableSwipe != that.disableSwipe)
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((disableSwipe) ? 131071 : 524287);

      return hashCode;
    }

    @Override
    public int compareTo(disableArticleSwipe_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.compare(isSetDisableSwipe(), other.isSetDisableSwipe());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetDisableSwipe()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.disableSwipe, other.disableSwipe);
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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("disableArticleSwipe_args(");
      boolean first = true;

      sb.append("disableSwipe:");
      sb.append(this.disableSwipe);
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

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
        __isset_bitfield = 0;
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class disableArticleSwipe_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public disableArticleSwipe_argsStandardScheme getScheme() {
        return new disableArticleSwipe_argsStandardScheme();
      }
    }

    private static class disableArticleSwipe_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<disableArticleSwipe_args> {

      @Override
      public void read(org.apache.thrift.protocol.TProtocol iprot, disableArticleSwipe_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // DISABLE_SWIPE
              if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                struct.disableSwipe = iprot.readBool();
                struct.setDisableSwipeIsSet(true);
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
      public void write(org.apache.thrift.protocol.TProtocol oprot, disableArticleSwipe_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldBegin(DISABLE_SWIPE_FIELD_DESC);
        oprot.writeBool(struct.disableSwipe);
        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class disableArticleSwipe_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public disableArticleSwipe_argsTupleScheme getScheme() {
        return new disableArticleSwipe_argsTupleScheme();
      }
    }

    private static class disableArticleSwipe_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<disableArticleSwipe_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, disableArticleSwipe_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetDisableSwipe()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetDisableSwipe()) {
          oprot.writeBool(struct.disableSwipe);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, disableArticleSwipe_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.disableSwipe = iprot.readBool();
          struct.setDisableSwipeIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  @SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
  public static class disableArticleSwipe_result implements org.apache.thrift.TBase<disableArticleSwipe_result, disableArticleSwipe_result._Fields>, java.io.Serializable, Cloneable, Comparable<disableArticleSwipe_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("disableArticleSwipe_result");


    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new disableArticleSwipe_resultStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new disableArticleSwipe_resultTupleSchemeFactory();


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

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
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(disableArticleSwipe_result.class, metaDataMap);
    }

    public disableArticleSwipe_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public disableArticleSwipe_result(disableArticleSwipe_result other) {
    }

    @Override
    public disableArticleSwipe_result deepCopy() {
      return new disableArticleSwipe_result(this);
    }

    @Override
    public void clear() {
    }

    @Override
    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
      switch (field) {
      }
    }

    @org.apache.thrift.annotation.Nullable
    @Override
    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
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
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that instanceof disableArticleSwipe_result)
        return this.equals((disableArticleSwipe_result)that);
      return false;
    }

    public boolean equals(disableArticleSwipe_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      return hashCode;
    }

    @Override
    public int compareTo(disableArticleSwipe_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
      }

    @Override
    public java.lang.String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder("disableArticleSwipe_result(");
      boolean first = true;

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

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class disableArticleSwipe_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public disableArticleSwipe_resultStandardScheme getScheme() {
        return new disableArticleSwipe_resultStandardScheme();
      }
    }

    private static class disableArticleSwipe_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<disableArticleSwipe_result> {

      @Override
      public void read(org.apache.thrift.protocol.TProtocol iprot, disableArticleSwipe_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
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
      public void write(org.apache.thrift.protocol.TProtocol oprot, disableArticleSwipe_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class disableArticleSwipe_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public disableArticleSwipe_resultTupleScheme getScheme() {
        return new disableArticleSwipe_resultTupleScheme();
      }
    }

    private static class disableArticleSwipe_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<disableArticleSwipe_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, disableArticleSwipe_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, disableArticleSwipe_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

}
