// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JKOIFIGOCAC.proto

package emu.grasscutter.net.proto;

public final class JKOIFIGOCACOuterClass {
  private JKOIFIGOCACOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JKOIFIGOCACOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JKOIFIGOCAC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IIDKAEEDPPF = 4;</code>
     * @return The iIDKAEEDPPF.
     */
    int getIIDKAEEDPPF();

    /**
     * <code>uint32 schedule_id = 6;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * Protobuf type {@code JKOIFIGOCAC}
   */
  public static final class JKOIFIGOCAC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JKOIFIGOCAC)
      JKOIFIGOCACOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JKOIFIGOCAC.newBuilder() to construct.
    private JKOIFIGOCAC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JKOIFIGOCAC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JKOIFIGOCAC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JKOIFIGOCAC(
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
            case 32: {

              iIDKAEEDPPF_ = input.readUInt32();
              break;
            }
            case 48: {

              scheduleId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.internal_static_JKOIFIGOCAC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.internal_static_JKOIFIGOCAC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC.class, emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC.Builder.class);
    }

    public static final int IIDKAEEDPPF_FIELD_NUMBER = 4;
    private int iIDKAEEDPPF_;
    /**
     * <code>uint32 IIDKAEEDPPF = 4;</code>
     * @return The iIDKAEEDPPF.
     */
    @java.lang.Override
    public int getIIDKAEEDPPF() {
      return iIDKAEEDPPF_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 6;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 6;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (iIDKAEEDPPF_ != 0) {
        output.writeUInt32(4, iIDKAEEDPPF_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(6, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iIDKAEEDPPF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, iIDKAEEDPPF_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC other = (emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC) obj;

      if (getIIDKAEEDPPF()
          != other.getIIDKAEEDPPF()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      hash = (37 * hash) + IIDKAEEDPPF_FIELD_NUMBER;
      hash = (53 * hash) + getIIDKAEEDPPF();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC prototype) {
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
     * Protobuf type {@code JKOIFIGOCAC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JKOIFIGOCAC)
        emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCACOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.internal_static_JKOIFIGOCAC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.internal_static_JKOIFIGOCAC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC.class, emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC.newBuilder()
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
        iIDKAEEDPPF_ = 0;

        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.internal_static_JKOIFIGOCAC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC build() {
        emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC buildPartial() {
        emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC result = new emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC(this);
        result.iIDKAEEDPPF_ = iIDKAEEDPPF_;
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC) {
          return mergeFrom((emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC other) {
        if (other == emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC.getDefaultInstance()) return this;
        if (other.getIIDKAEEDPPF() != 0) {
          setIIDKAEEDPPF(other.getIIDKAEEDPPF());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iIDKAEEDPPF_ ;
      /**
       * <code>uint32 IIDKAEEDPPF = 4;</code>
       * @return The iIDKAEEDPPF.
       */
      @java.lang.Override
      public int getIIDKAEEDPPF() {
        return iIDKAEEDPPF_;
      }
      /**
       * <code>uint32 IIDKAEEDPPF = 4;</code>
       * @param value The iIDKAEEDPPF to set.
       * @return This builder for chaining.
       */
      public Builder setIIDKAEEDPPF(int value) {
        
        iIDKAEEDPPF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IIDKAEEDPPF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIIDKAEEDPPF() {
        
        iIDKAEEDPPF_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 6;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 6;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JKOIFIGOCAC)
    }

    // @@protoc_insertion_point(class_scope:JKOIFIGOCAC)
    private static final emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC();
    }

    public static emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JKOIFIGOCAC>
        PARSER = new com.google.protobuf.AbstractParser<JKOIFIGOCAC>() {
      @java.lang.Override
      public JKOIFIGOCAC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JKOIFIGOCAC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JKOIFIGOCAC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JKOIFIGOCAC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JKOIFIGOCACOuterClass.JKOIFIGOCAC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JKOIFIGOCAC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JKOIFIGOCAC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JKOIFIGOCAC.proto\"7\n\013JKOIFIGOCAC\022\023\n\013II" +
      "DKAEEDPPF\030\004 \001(\r\022\023\n\013schedule_id\030\006 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JKOIFIGOCAC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JKOIFIGOCAC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JKOIFIGOCAC_descriptor,
        new java.lang.String[] { "IIDKAEEDPPF", "ScheduleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
