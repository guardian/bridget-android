/**
 * Autogenerated by Thrift Compiler (0.21.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.theguardian.bridget.thrift;

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.21.0)")
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Metrics {

  public interface Iface {

    public void sendMetrics(java.util.List<Metric> metrics) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void sendMetrics(java.util.List<Metric> metrics, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException;

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
    public void sendMetrics(java.util.List<Metric> metrics) throws org.apache.thrift.TException
    {
      send_sendMetrics(metrics);
      recv_sendMetrics();
    }

    public void send_sendMetrics(java.util.List<Metric> metrics) throws org.apache.thrift.TException
    {
      sendMetrics_args args = new sendMetrics_args();
      args.setMetrics(metrics);
      sendBase("sendMetrics", args);
    }

    public void recv_sendMetrics() throws org.apache.thrift.TException
    {
      sendMetrics_result result = new sendMetrics_result();
      receiveBase(result, "sendMetrics");
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
    public void sendMetrics(java.util.List<Metric> metrics, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      sendMetrics_call method_call = new sendMetrics_call(metrics, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class sendMetrics_call extends org.apache.thrift.async.TAsyncMethodCall<Void> {
      private java.util.List<Metric> metrics;
      public sendMetrics_call(java.util.List<Metric> metrics, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.metrics = metrics;
      }

      @Override
      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("sendMetrics", org.apache.thrift.protocol.TMessageType.CALL, 0));
        sendMetrics_args args = new sendMetrics_args();
        args.setMetrics(metrics);
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
        (new Client(prot)).recv_sendMetrics();
        return null;
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase, ? extends org.apache.thrift.TBase>> processMap) {
      processMap.put("sendMetrics", new sendMetrics());
      return processMap;
    }

    public static class sendMetrics<I extends Iface> extends org.apache.thrift.ProcessFunction<I, sendMetrics_args, sendMetrics_result> {
      public sendMetrics() {
        super("sendMetrics");
      }

      @Override
      public sendMetrics_args getEmptyArgsInstance() {
        return new sendMetrics_args();
      }

      @Override
      public boolean isOneway() {
        return false;
      }

      @Override
      protected boolean rethrowUnhandledExceptions() {
        return false;
      }

      @Override
      public sendMetrics_result getEmptyResultInstance() {
        return new sendMetrics_result();
      }

      @Override
      public sendMetrics_result getResult(I iface, sendMetrics_args args) throws org.apache.thrift.TException {
        sendMetrics_result result = getEmptyResultInstance();
        iface.sendMetrics(args.metrics);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?, ? extends org.apache.thrift.TBase>>()));
    }

    protected AsyncProcessor(I iface, java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?, ? extends org.apache.thrift.TBase>> processMap) {
      processMap.put("sendMetrics", new sendMetrics());
      return processMap;
    }

    public static class sendMetrics<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, sendMetrics_args, Void, sendMetrics_result> {
      public sendMetrics() {
        super("sendMetrics");
      }

      @Override
      public sendMetrics_result getEmptyResultInstance() {
        return new sendMetrics_result();
      }

      @Override
      public sendMetrics_args getEmptyArgsInstance() {
        return new sendMetrics_args();
      }

      @Override
      public org.apache.thrift.async.AsyncMethodCallback<Void> getResultHandler(final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new org.apache.thrift.async.AsyncMethodCallback<Void>() { 
          @Override
          public void onComplete(Void o) {
            sendMetrics_result result = new sendMetrics_result();
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
            sendMetrics_result result = new sendMetrics_result();
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
      public boolean isOneway() {
        return false;
      }

      @Override
      public void start(I iface, sendMetrics_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
        iface.sendMetrics(args.metrics,resultHandler);
      }
    }

  }

  @SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
  public static class sendMetrics_args implements org.apache.thrift.TBase<sendMetrics_args, sendMetrics_args._Fields>, java.io.Serializable, Cloneable, Comparable<sendMetrics_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("sendMetrics_args");

    private static final org.apache.thrift.protocol.TField METRICS_FIELD_DESC = new org.apache.thrift.protocol.TField("metrics", org.apache.thrift.protocol.TType.LIST, (short)1);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new sendMetrics_argsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new sendMetrics_argsTupleSchemeFactory();

    public @org.apache.thrift.annotation.Nullable java.util.List<Metric> metrics; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      METRICS((short)1, "metrics");

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
          case 1: // METRICS
            return METRICS;
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
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.METRICS, new org.apache.thrift.meta_data.FieldMetaData("metrics", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
              new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Metric.class))));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(sendMetrics_args.class, metaDataMap);
    }

    public sendMetrics_args() {
    }

    public sendMetrics_args(
      java.util.List<Metric> metrics)
    {
      this();
      this.metrics = metrics;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public sendMetrics_args(sendMetrics_args other) {
      if (other.isSetMetrics()) {
        java.util.List<Metric> __this__metrics = new java.util.ArrayList<Metric>(other.metrics.size());
        for (Metric other_element : other.metrics) {
          __this__metrics.add(new Metric(other_element));
        }
        this.metrics = __this__metrics;
      }
    }

    @Override
    public sendMetrics_args deepCopy() {
      return new sendMetrics_args(this);
    }

    @Override
    public void clear() {
      this.metrics = null;
    }

    public int getMetricsSize() {
      return (this.metrics == null) ? 0 : this.metrics.size();
    }

    @org.apache.thrift.annotation.Nullable
    public java.util.Iterator<Metric> getMetricsIterator() {
      return (this.metrics == null) ? null : this.metrics.iterator();
    }

    public void addToMetrics(Metric elem) {
      if (this.metrics == null) {
        this.metrics = new java.util.ArrayList<Metric>();
      }
      this.metrics.add(elem);
    }

    @org.apache.thrift.annotation.Nullable
    public java.util.List<Metric> getMetrics() {
      return this.metrics;
    }

    public sendMetrics_args setMetrics(@org.apache.thrift.annotation.Nullable java.util.List<Metric> metrics) {
      this.metrics = metrics;
      return this;
    }

    public void unsetMetrics() {
      this.metrics = null;
    }

    /** Returns true if field metrics is set (has been assigned a value) and false otherwise */
    public boolean isSetMetrics() {
      return this.metrics != null;
    }

    public void setMetricsIsSet(boolean value) {
      if (!value) {
        this.metrics = null;
      }
    }

    @Override
    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
      switch (field) {
      case METRICS:
        if (value == null) {
          unsetMetrics();
        } else {
          setMetrics((java.util.List<Metric>)value);
        }
        break;

      }
    }

    @org.apache.thrift.annotation.Nullable
    @Override
    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case METRICS:
        return getMetrics();

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
      case METRICS:
        return isSetMetrics();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that instanceof sendMetrics_args)
        return this.equals((sendMetrics_args)that);
      return false;
    }

    public boolean equals(sendMetrics_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_metrics = true && this.isSetMetrics();
      boolean that_present_metrics = true && that.isSetMetrics();
      if (this_present_metrics || that_present_metrics) {
        if (!(this_present_metrics && that_present_metrics))
          return false;
        if (!this.metrics.equals(that.metrics))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetMetrics()) ? 131071 : 524287);
      if (isSetMetrics())
        hashCode = hashCode * 8191 + metrics.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(sendMetrics_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.compare(isSetMetrics(), other.isSetMetrics());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetMetrics()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metrics, other.metrics);
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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("sendMetrics_args(");
      boolean first = true;

      sb.append("metrics:");
      if (this.metrics == null) {
        sb.append("null");
      } else {
        sb.append(this.metrics);
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

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class sendMetrics_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public sendMetrics_argsStandardScheme getScheme() {
        return new sendMetrics_argsStandardScheme();
      }
    }

    private static class sendMetrics_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<sendMetrics_args> {

      @Override
      public void read(org.apache.thrift.protocol.TProtocol iprot, sendMetrics_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // METRICS
              if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                {
                  org.apache.thrift.protocol.TList _list76 = iprot.readListBegin();
                  struct.metrics = new java.util.ArrayList<Metric>(_list76.size);
                  @org.apache.thrift.annotation.Nullable Metric _elem77;
                  for (int _i78 = 0; _i78 < _list76.size; ++_i78)
                  {
                    _elem77 = new Metric();
                    _elem77.read(iprot);
                    struct.metrics.add(_elem77);
                  }
                  iprot.readListEnd();
                }
                struct.setMetricsIsSet(true);
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
      public void write(org.apache.thrift.protocol.TProtocol oprot, sendMetrics_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.metrics != null) {
          oprot.writeFieldBegin(METRICS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.metrics.size()));
            for (Metric _iter79 : struct.metrics)
            {
              _iter79.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class sendMetrics_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public sendMetrics_argsTupleScheme getScheme() {
        return new sendMetrics_argsTupleScheme();
      }
    }

    private static class sendMetrics_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<sendMetrics_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, sendMetrics_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetMetrics()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetMetrics()) {
          {
            oprot.writeI32(struct.metrics.size());
            for (Metric _iter80 : struct.metrics)
            {
              _iter80.write(oprot);
            }
          }
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, sendMetrics_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            org.apache.thrift.protocol.TList _list81 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
            struct.metrics = new java.util.ArrayList<Metric>(_list81.size);
            @org.apache.thrift.annotation.Nullable Metric _elem82;
            for (int _i83 = 0; _i83 < _list81.size; ++_i83)
            {
              _elem82 = new Metric();
              _elem82.read(iprot);
              struct.metrics.add(_elem82);
            }
          }
          struct.setMetricsIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  @SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
  public static class sendMetrics_result implements org.apache.thrift.TBase<sendMetrics_result, sendMetrics_result._Fields>, java.io.Serializable, Cloneable, Comparable<sendMetrics_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("sendMetrics_result");


    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new sendMetrics_resultStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new sendMetrics_resultTupleSchemeFactory();


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
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(sendMetrics_result.class, metaDataMap);
    }

    public sendMetrics_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public sendMetrics_result(sendMetrics_result other) {
    }

    @Override
    public sendMetrics_result deepCopy() {
      return new sendMetrics_result(this);
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
      if (that instanceof sendMetrics_result)
        return this.equals((sendMetrics_result)that);
      return false;
    }

    public boolean equals(sendMetrics_result that) {
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
    public int compareTo(sendMetrics_result other) {
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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("sendMetrics_result(");
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

    private static class sendMetrics_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public sendMetrics_resultStandardScheme getScheme() {
        return new sendMetrics_resultStandardScheme();
      }
    }

    private static class sendMetrics_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<sendMetrics_result> {

      @Override
      public void read(org.apache.thrift.protocol.TProtocol iprot, sendMetrics_result struct) throws org.apache.thrift.TException {
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
      public void write(org.apache.thrift.protocol.TProtocol oprot, sendMetrics_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class sendMetrics_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      @Override
      public sendMetrics_resultTupleScheme getScheme() {
        return new sendMetrics_resultTupleScheme();
      }
    }

    private static class sendMetrics_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<sendMetrics_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, sendMetrics_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, sendMetrics_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

}
