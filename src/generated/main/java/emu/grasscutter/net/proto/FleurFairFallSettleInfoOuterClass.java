// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairFallSettleInfo.proto

package emu.grasscutter.net.proto;

public final class FleurFairFallSettleInfoOuterClass {
  private FleurFairFallSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairFallSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairFallSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FallSettleInfo settle_info = 3;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.FallSettleInfo settle_info = 3;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo getSettleInfo();
    /**
     * <code>.FallSettleInfo settle_info = 3;</code>
     */
    emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfoOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * Obf: OPMEGAHDDCE
   * </pre>
   *
   * Protobuf type {@code FleurFairFallSettleInfo}
   */
  public static final class FleurFairFallSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairFallSettleInfo)
      FleurFairFallSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairFallSettleInfo.newBuilder() to construct.
    private FleurFairFallSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairFallSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairFallSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairFallSettleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 26: {
              emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.Builder subBuilder = null;
              if (settleInfo_ != null) {
                subBuilder = settleInfo_.toBuilder();
              }
              settleInfo_ = input.readMessage(emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(settleInfo_);
                settleInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              isNewRecord_ = input.readBool();
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
      return emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.internal_static_FleurFairFallSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.internal_static_FleurFairFallSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.class, emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.Builder.class);
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo settleInfo_;
    /**
     * <code>.FallSettleInfo settle_info = 3;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.FallSettleInfo settle_info = 3;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.FallSettleInfo settle_info = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfoOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 10;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (settleInfo_ != null) {
        output.writeMessage(3, getSettleInfo());
      }
      if (isNewRecord_ != false) {
        output.writeBool(10, isNewRecord_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getSettleInfo());
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isNewRecord_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo other = (emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo) obj;

      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: OPMEGAHDDCE
     * </pre>
     *
     * Protobuf type {@code FleurFairFallSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairFallSettleInfo)
        emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.internal_static_FleurFairFallSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.internal_static_FleurFairFallSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.class, emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.internal_static_FleurFairFallSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo build() {
        emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo buildPartial() {
        emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo result = new emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo(this);
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
        }
        result.isNewRecord_ = isNewRecord_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo other) {
        if (other == emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.getDefaultInstance()) return this;
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo, emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.Builder, emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       * @return The settleInfo.
       */
      public emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
          } else {
            settleInfo_ = value;
          }
          onChanged();
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
          onChanged();
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       */
      public emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       */
      public emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.FallSettleInfo settle_info = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo, emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.Builder, emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo, emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfo.Builder, emu.grasscutter.net.proto.FallSettleInfoOuterClass.FallSettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 10;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FleurFairFallSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:FleurFairFallSettleInfo)
    private static final emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo();
    }

    public static emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairFallSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairFallSettleInfo>() {
      @java.lang.Override
      public FleurFairFallSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairFallSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairFallSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairFallSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairFallSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairFallSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035FleurFairFallSettleInfo.proto\032\024FallSet" +
      "tleInfo.proto\"V\n\027FleurFairFallSettleInfo" +
      "\022$\n\013settle_info\030\003 \001(\0132\017.FallSettleInfo\022\025" +
      "\n\ris_new_record\030\n \001(\010B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FallSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_FleurFairFallSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairFallSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairFallSettleInfo_descriptor,
        new java.lang.String[] { "SettleInfo", "IsNewRecord", });
    emu.grasscutter.net.proto.FallSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
