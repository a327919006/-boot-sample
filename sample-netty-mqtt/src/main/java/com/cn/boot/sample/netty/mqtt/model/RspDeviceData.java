// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RspDeviceData.proto

package com.cn.boot.sample.netty.mqtt.model;

public final class RspDeviceData {
  private RspDeviceData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeviceDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeviceData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string tag = 1;</code>
     * @return The tag.
     */
    String getTag();
    /**
     * <code>string tag = 1;</code>
     * @return The bytes for tag.
     */
    com.google.protobuf.ByteString
        getTagBytes();

    /**
     * <code>string deviceNo = 2;</code>
     * @return The deviceNo.
     */
    String getDeviceNo();
    /**
     * <code>string deviceNo = 2;</code>
     * @return The bytes for deviceNo.
     */
    com.google.protobuf.ByteString
        getDeviceNoBytes();

    /**
     * <code>string data = 3;</code>
     * @return The data.
     */
    String getData();
    /**
     * <code>string data = 3;</code>
     * @return The bytes for data.
     */
    com.google.protobuf.ByteString
        getDataBytes();
  }
  /**
   * Protobuf type {@code DeviceData}
   */
  public static final class DeviceData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DeviceData)
      DeviceDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeviceData.newBuilder() to construct.
    private DeviceData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeviceData() {
      tag_ = "";
      deviceNo_ = "";
      data_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new DeviceData();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DeviceData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              String s = input.readStringRequireUtf8();

              tag_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              deviceNo_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              data_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RspDeviceData.internal_static_DeviceData_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RspDeviceData.internal_static_DeviceData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DeviceData.class, Builder.class);
    }

    public static final int TAG_FIELD_NUMBER = 1;
    private volatile Object tag_;
    /**
     * <code>string tag = 1;</code>
     * @return The tag.
     */
    @Override
    public String getTag() {
      Object ref = tag_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      }
    }
    /**
     * <code>string tag = 1;</code>
     * @return The bytes for tag.
     */
    @Override
    public com.google.protobuf.ByteString
        getTagBytes() {
      Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVICENO_FIELD_NUMBER = 2;
    private volatile Object deviceNo_;
    /**
     * <code>string deviceNo = 2;</code>
     * @return The deviceNo.
     */
    @Override
    public String getDeviceNo() {
      Object ref = deviceNo_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        deviceNo_ = s;
        return s;
      }
    }
    /**
     * <code>string deviceNo = 2;</code>
     * @return The bytes for deviceNo.
     */
    @Override
    public com.google.protobuf.ByteString
        getDeviceNoBytes() {
      Object ref = deviceNo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        deviceNo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private volatile Object data_;
    /**
     * <code>string data = 3;</code>
     * @return The data.
     */
    @Override
    public String getData() {
      Object ref = data_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        data_ = s;
        return s;
      }
    }
    /**
     * <code>string data = 3;</code>
     * @return The bytes for data.
     */
    @Override
    public com.google.protobuf.ByteString
        getDataBytes() {
      Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTagBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tag_);
      }
      if (!getDeviceNoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceNo_);
      }
      if (!getDataBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, data_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTagBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tag_);
      }
      if (!getDeviceNoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceNo_);
      }
      if (!getDataBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, data_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof DeviceData)) {
        return super.equals(obj);
      }
      DeviceData other = (DeviceData) obj;

      if (!getTag()
          .equals(other.getTag())) return false;
      if (!getDeviceNo()
          .equals(other.getDeviceNo())) return false;
      if (!getData()
          .equals(other.getData())) return false;
        return unknownFields.equals(other.unknownFields);
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
      hash = (37 * hash) + DEVICENO_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceNo().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DeviceData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DeviceData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DeviceData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DeviceData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DeviceData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DeviceData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DeviceData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DeviceData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DeviceData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DeviceData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DeviceData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DeviceData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(DeviceData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code DeviceData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeviceData)
        DeviceDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RspDeviceData.internal_static_DeviceData_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RspDeviceData.internal_static_DeviceData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DeviceData.class, Builder.class);
      }

      // Construct using com.cn.boot.sample.netty.mqtt.model.RspDeviceData.DeviceData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        tag_ = "";

        deviceNo_ = "";

        data_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RspDeviceData.internal_static_DeviceData_descriptor;
      }

      @Override
      public DeviceData getDefaultInstanceForType() {
        return DeviceData.getDefaultInstance();
      }

      @Override
      public DeviceData build() {
        DeviceData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public DeviceData buildPartial() {
        DeviceData result = new DeviceData(this);
        result.tag_ = tag_;
        result.deviceNo_ = deviceNo_;
        result.data_ = data_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DeviceData) {
          return mergeFrom((DeviceData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DeviceData other) {
        if (other == DeviceData.getDefaultInstance()) return this;
        if (!other.getTag().isEmpty()) {
          tag_ = other.tag_;
          onChanged();
        }
        if (!other.getDeviceNo().isEmpty()) {
          deviceNo_ = other.deviceNo_;
          onChanged();
        }
        if (!other.getData().isEmpty()) {
          data_ = other.data_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        DeviceData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DeviceData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object tag_ = "";
      /**
       * <code>string tag = 1;</code>
       * @return The tag.
       */
      public String getTag() {
        Object ref = tag_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          tag_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string tag = 1;</code>
       * @return The bytes for tag.
       */
      public com.google.protobuf.ByteString
          getTagBytes() {
        Object ref = tag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          tag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tag = 1;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {
        
        tag_ = getDefaultInstance().getTag();
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 1;</code>
       * @param value The bytes for tag to set.
       * @return This builder for chaining.
       */
      public Builder setTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tag_ = value;
        onChanged();
        return this;
      }

      private Object deviceNo_ = "";
      /**
       * <code>string deviceNo = 2;</code>
       * @return The deviceNo.
       */
      public String getDeviceNo() {
        Object ref = deviceNo_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          deviceNo_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string deviceNo = 2;</code>
       * @return The bytes for deviceNo.
       */
      public com.google.protobuf.ByteString
          getDeviceNoBytes() {
        Object ref = deviceNo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          deviceNo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string deviceNo = 2;</code>
       * @param value The deviceNo to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceNo(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        deviceNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string deviceNo = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeviceNo() {
        
        deviceNo_ = getDefaultInstance().getDeviceNo();
        onChanged();
        return this;
      }
      /**
       * <code>string deviceNo = 2;</code>
       * @param value The bytes for deviceNo to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceNoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        deviceNo_ = value;
        onChanged();
        return this;
      }

      private Object data_ = "";
      /**
       * <code>string data = 3;</code>
       * @return The data.
       */
      public String getData() {
        Object ref = data_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string data = 3;</code>
       * @return The bytes for data.
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string data = 3;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string data = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>string data = 3;</code>
       * @param value The bytes for data to set.
       * @return This builder for chaining.
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        data_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DeviceData)
    }

    // @@protoc_insertion_point(class_scope:DeviceData)
    private static final DeviceData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DeviceData();
    }

    public static DeviceData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeviceData>
        PARSER = new com.google.protobuf.AbstractParser<DeviceData>() {
      @Override
      public DeviceData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeviceData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DeviceData> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<DeviceData> getParserForType() {
      return PARSER;
    }

    @Override
    public DeviceData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeviceData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeviceData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023RspDeviceData.proto\"9\n\nDeviceData\022\013\n\003t" +
      "ag\030\001 \001(\t\022\020\n\010deviceNo\030\002 \001(\t\022\014\n\004data\030\003 \001(\t" +
      "B4\n#com.cn.boot.sample.netty.mqtt.modelB" +
      "\rRspDeviceDatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DeviceData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeviceData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeviceData_descriptor,
        new String[] { "Tag", "DeviceNo", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
