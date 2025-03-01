// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CAMHMGNGIOF.proto

package emu.grasscutter.net.proto;

public final class CAMHMGNGIOFOuterClass {
  private CAMHMGNGIOFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CAMHMGNGIOFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CAMHMGNGIOF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CADBDHBFBPJ op_type = 15;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.CADBDHBFBPJ op_type = 15;</code>
     * @return The opType.
     */
    emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ getOpType();

    /**
     * <code>uint32 room_id = 11;</code>
     * @return The roomId.
     */
    int getRoomId();

    /**
     * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
     * @return The enum numeric value on the wire for mFPELLPIJIP.
     */
    int getMFPELLPIJIPValue();
    /**
     * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
     * @return The mFPELLPIJIP.
     */
    emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF getMFPELLPIJIP();

    /**
     * <code>uint64 dungeon_guid = 1;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();
  }
  /**
   * <pre>
   * CmdId: 9216
   * </pre>
   *
   * Protobuf type {@code CAMHMGNGIOF}
   */
  public static final class CAMHMGNGIOF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CAMHMGNGIOF)
      CAMHMGNGIOFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CAMHMGNGIOF.newBuilder() to construct.
    private CAMHMGNGIOF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CAMHMGNGIOF() {
      opType_ = 0;
      mFPELLPIJIP_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CAMHMGNGIOF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CAMHMGNGIOF(
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
            case 8: {

              dungeonGuid_ = input.readUInt64();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              mFPELLPIJIP_ = rawValue;
              break;
            }
            case 88: {

              roomId_ = input.readUInt32();
              break;
            }
            case 120: {
              int rawValue = input.readEnum();

              opType_ = rawValue;
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
      return emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.internal_static_CAMHMGNGIOF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.internal_static_CAMHMGNGIOF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF.class, emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF.Builder.class);
    }

    public static final int OP_TYPE_FIELD_NUMBER = 15;
    private int opType_;
    /**
     * <code>.CADBDHBFBPJ op_type = 15;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.CADBDHBFBPJ op_type = 15;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ getOpType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ result = emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ.valueOf(opType_);
      return result == null ? emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ.UNRECOGNIZED : result;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 11;
    private int roomId_;
    /**
     * <code>uint32 room_id = 11;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public int getRoomId() {
      return roomId_;
    }

    public static final int MFPELLPIJIP_FIELD_NUMBER = 8;
    private int mFPELLPIJIP_;
    /**
     * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
     * @return The enum numeric value on the wire for mFPELLPIJIP.
     */
    @java.lang.Override public int getMFPELLPIJIPValue() {
      return mFPELLPIJIP_;
    }
    /**
     * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
     * @return The mFPELLPIJIP.
     */
    @java.lang.Override public emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF getMFPELLPIJIP() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF result = emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF.valueOf(mFPELLPIJIP_);
      return result == null ? emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF.UNRECOGNIZED : result;
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 1;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 1;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
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
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(1, dungeonGuid_);
      }
      if (mFPELLPIJIP_ != emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF.CADIFCLFOFF_None.getNumber()) {
        output.writeEnum(8, mFPELLPIJIP_);
      }
      if (roomId_ != 0) {
        output.writeUInt32(11, roomId_);
      }
      if (opType_ != emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ.CADBDHBFBPJ_None.getNumber()) {
        output.writeEnum(15, opType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, dungeonGuid_);
      }
      if (mFPELLPIJIP_ != emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF.CADIFCLFOFF_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, mFPELLPIJIP_);
      }
      if (roomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, roomId_);
      }
      if (opType_ != emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ.CADBDHBFBPJ_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, opType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF other = (emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF) obj;

      if (opType_ != other.opType_) return false;
      if (getRoomId()
          != other.getRoomId()) return false;
      if (mFPELLPIJIP_ != other.mFPELLPIJIP_) return false;
      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
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
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId();
      hash = (37 * hash) + MFPELLPIJIP_FIELD_NUMBER;
      hash = (53 * hash) + mFPELLPIJIP_;
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF prototype) {
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
     * CmdId: 9216
     * </pre>
     *
     * Protobuf type {@code CAMHMGNGIOF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CAMHMGNGIOF)
        emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.internal_static_CAMHMGNGIOF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.internal_static_CAMHMGNGIOF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF.class, emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF.newBuilder()
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
        opType_ = 0;

        roomId_ = 0;

        mFPELLPIJIP_ = 0;

        dungeonGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.internal_static_CAMHMGNGIOF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF build() {
        emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF buildPartial() {
        emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF result = new emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF(this);
        result.opType_ = opType_;
        result.roomId_ = roomId_;
        result.mFPELLPIJIP_ = mFPELLPIJIP_;
        result.dungeonGuid_ = dungeonGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF) {
          return mergeFrom((emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF other) {
        if (other == emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF.getDefaultInstance()) return this;
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.getRoomId() != 0) {
          setRoomId(other.getRoomId());
        }
        if (other.mFPELLPIJIP_ != 0) {
          setMFPELLPIJIPValue(other.getMFPELLPIJIPValue());
        }
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
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
        emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.CADBDHBFBPJ op_type = 15;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.CADBDHBFBPJ op_type = 15;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.CADBDHBFBPJ op_type = 15;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ getOpType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ result = emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ.valueOf(opType_);
        return result == null ? emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ.UNRECOGNIZED : result;
      }
      /**
       * <code>.CADBDHBFBPJ op_type = 15;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.CADBDHBFBPJ value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CADBDHBFBPJ op_type = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private int roomId_ ;
      /**
       * <code>uint32 room_id = 11;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public int getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint32 room_id = 11;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(int value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = 0;
        onChanged();
        return this;
      }

      private int mFPELLPIJIP_ = 0;
      /**
       * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
       * @return The enum numeric value on the wire for mFPELLPIJIP.
       */
      @java.lang.Override public int getMFPELLPIJIPValue() {
        return mFPELLPIJIP_;
      }
      /**
       * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
       * @param value The enum numeric value on the wire for mFPELLPIJIP to set.
       * @return This builder for chaining.
       */
      public Builder setMFPELLPIJIPValue(int value) {
        
        mFPELLPIJIP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
       * @return The mFPELLPIJIP.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF getMFPELLPIJIP() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF result = emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF.valueOf(mFPELLPIJIP_);
        return result == null ? emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF.UNRECOGNIZED : result;
      }
      /**
       * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
       * @param value The mFPELLPIJIP to set.
       * @return This builder for chaining.
       */
      public Builder setMFPELLPIJIP(emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.CADIFCLFOFF value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        mFPELLPIJIP_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CADIFCLFOFF MFPELLPIJIP = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMFPELLPIJIP() {
        
        mFPELLPIJIP_ = 0;
        onChanged();
        return this;
      }

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CAMHMGNGIOF)
    }

    // @@protoc_insertion_point(class_scope:CAMHMGNGIOF)
    private static final emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF();
    }

    public static emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CAMHMGNGIOF>
        PARSER = new com.google.protobuf.AbstractParser<CAMHMGNGIOF>() {
      @java.lang.Override
      public CAMHMGNGIOF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CAMHMGNGIOF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CAMHMGNGIOF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CAMHMGNGIOF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CAMHMGNGIOFOuterClass.CAMHMGNGIOF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CAMHMGNGIOF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CAMHMGNGIOF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CAMHMGNGIOF.proto\032\021CADBDHBFBPJ.proto\032\021" +
      "CADIFCLFOFF.proto\"v\n\013CAMHMGNGIOF\022\035\n\007op_t" +
      "ype\030\017 \001(\0162\014.CADBDHBFBPJ\022\017\n\007room_id\030\013 \001(\r" +
      "\022!\n\013MFPELLPIJIP\030\010 \001(\0162\014.CADIFCLFOFF\022\024\n\014d" +
      "ungeon_guid\030\001 \001(\004B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.getDescriptor(),
        });
    internal_static_CAMHMGNGIOF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CAMHMGNGIOF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CAMHMGNGIOF_descriptor,
        new java.lang.String[] { "OpType", "RoomId", "MFPELLPIJIP", "DungeonGuid", });
    emu.grasscutter.net.proto.CADBDHBFBPJOuterClass.getDescriptor();
    emu.grasscutter.net.proto.CADIFCLFOFFOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
