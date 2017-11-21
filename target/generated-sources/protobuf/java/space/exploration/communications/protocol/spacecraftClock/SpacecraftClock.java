// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpacecraftClock.proto

package space.exploration.communications.protocol.spacecraftClock;

public final class SpacecraftClock {
  private SpacecraftClock() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SclkPacketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:space.exploration.communications.protocol.spacecraftClock.SclkPacket)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string utcTime = 1;</code>
     */
    java.lang.String getUtcTime();
    /**
     * <code>string utcTime = 1;</code>
     */
    com.google.protobuf.ByteString
        getUtcTimeBytes();

    /**
     * <code>string sclkValue = 2;</code>
     */
    java.lang.String getSclkValue();
    /**
     * <code>string sclkValue = 2;</code>
     */
    com.google.protobuf.ByteString
        getSclkValueBytes();

    /**
     * <code>int32 missionDuration = 3;</code>
     */
    int getMissionDuration();

    /**
     * <code>int32 timeScaleFactor = 4;</code>
     */
    int getTimeScaleFactor();

    /**
     * <code>string startTime = 5;</code>
     */
    java.lang.String getStartTime();
    /**
     * <code>string startTime = 5;</code>
     */
    com.google.protobuf.ByteString
        getStartTimeBytes();

    /**
     * <code>int64 timeElapsedMs = 6;</code>
     */
    long getTimeElapsedMs();
  }
  /**
   * Protobuf type {@code space.exploration.communications.protocol.spacecraftClock.SclkPacket}
   */
  public  static final class SclkPacket extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:space.exploration.communications.protocol.spacecraftClock.SclkPacket)
      SclkPacketOrBuilder {
    // Use SclkPacket.newBuilder() to construct.
    private SclkPacket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SclkPacket() {
      utcTime_ = "";
      sclkValue_ = "";
      missionDuration_ = 0;
      timeScaleFactor_ = 0;
      startTime_ = "";
      timeElapsedMs_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SclkPacket(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              utcTime_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              sclkValue_ = s;
              break;
            }
            case 24: {

              missionDuration_ = input.readInt32();
              break;
            }
            case 32: {

              timeScaleFactor_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              startTime_ = s;
              break;
            }
            case 48: {

              timeElapsedMs_ = input.readInt64();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket.class, space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket.Builder.class);
    }

    public static final int UTCTIME_FIELD_NUMBER = 1;
    private volatile java.lang.Object utcTime_;
    /**
     * <code>string utcTime = 1;</code>
     */
    public java.lang.String getUtcTime() {
      java.lang.Object ref = utcTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        utcTime_ = s;
        return s;
      }
    }
    /**
     * <code>string utcTime = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUtcTimeBytes() {
      java.lang.Object ref = utcTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        utcTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCLKVALUE_FIELD_NUMBER = 2;
    private volatile java.lang.Object sclkValue_;
    /**
     * <code>string sclkValue = 2;</code>
     */
    public java.lang.String getSclkValue() {
      java.lang.Object ref = sclkValue_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sclkValue_ = s;
        return s;
      }
    }
    /**
     * <code>string sclkValue = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSclkValueBytes() {
      java.lang.Object ref = sclkValue_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sclkValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MISSIONDURATION_FIELD_NUMBER = 3;
    private int missionDuration_;
    /**
     * <code>int32 missionDuration = 3;</code>
     */
    public int getMissionDuration() {
      return missionDuration_;
    }

    public static final int TIMESCALEFACTOR_FIELD_NUMBER = 4;
    private int timeScaleFactor_;
    /**
     * <code>int32 timeScaleFactor = 4;</code>
     */
    public int getTimeScaleFactor() {
      return timeScaleFactor_;
    }

    public static final int STARTTIME_FIELD_NUMBER = 5;
    private volatile java.lang.Object startTime_;
    /**
     * <code>string startTime = 5;</code>
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      }
    }
    /**
     * <code>string startTime = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMEELAPSEDMS_FIELD_NUMBER = 6;
    private long timeElapsedMs_;
    /**
     * <code>int64 timeElapsedMs = 6;</code>
     */
    public long getTimeElapsedMs() {
      return timeElapsedMs_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getUtcTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, utcTime_);
      }
      if (!getSclkValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sclkValue_);
      }
      if (missionDuration_ != 0) {
        output.writeInt32(3, missionDuration_);
      }
      if (timeScaleFactor_ != 0) {
        output.writeInt32(4, timeScaleFactor_);
      }
      if (!getStartTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, startTime_);
      }
      if (timeElapsedMs_ != 0L) {
        output.writeInt64(6, timeElapsedMs_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUtcTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, utcTime_);
      }
      if (!getSclkValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sclkValue_);
      }
      if (missionDuration_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, missionDuration_);
      }
      if (timeScaleFactor_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, timeScaleFactor_);
      }
      if (!getStartTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, startTime_);
      }
      if (timeElapsedMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, timeElapsedMs_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket)) {
        return super.equals(obj);
      }
      space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket other = (space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket) obj;

      boolean result = true;
      result = result && getUtcTime()
          .equals(other.getUtcTime());
      result = result && getSclkValue()
          .equals(other.getSclkValue());
      result = result && (getMissionDuration()
          == other.getMissionDuration());
      result = result && (getTimeScaleFactor()
          == other.getTimeScaleFactor());
      result = result && getStartTime()
          .equals(other.getStartTime());
      result = result && (getTimeElapsedMs()
          == other.getTimeElapsedMs());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UTCTIME_FIELD_NUMBER;
      hash = (53 * hash) + getUtcTime().hashCode();
      hash = (37 * hash) + SCLKVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getSclkValue().hashCode();
      hash = (37 * hash) + MISSIONDURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMissionDuration();
      hash = (37 * hash) + TIMESCALEFACTOR_FIELD_NUMBER;
      hash = (53 * hash) + getTimeScaleFactor();
      hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
      hash = (37 * hash) + TIMEELAPSEDMS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeElapsedMs());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code space.exploration.communications.protocol.spacecraftClock.SclkPacket}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:space.exploration.communications.protocol.spacecraftClock.SclkPacket)
        space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket.class, space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket.Builder.class);
      }

      // Construct using space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket.newBuilder()
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
      public Builder clear() {
        super.clear();
        utcTime_ = "";

        sclkValue_ = "";

        missionDuration_ = 0;

        timeScaleFactor_ = 0;

        startTime_ = "";

        timeElapsedMs_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_descriptor;
      }

      public space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket getDefaultInstanceForType() {
        return space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket.getDefaultInstance();
      }

      public space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket build() {
        space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket buildPartial() {
        space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket result = new space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket(this);
        result.utcTime_ = utcTime_;
        result.sclkValue_ = sclkValue_;
        result.missionDuration_ = missionDuration_;
        result.timeScaleFactor_ = timeScaleFactor_;
        result.startTime_ = startTime_;
        result.timeElapsedMs_ = timeElapsedMs_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket) {
          return mergeFrom((space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket other) {
        if (other == space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket.getDefaultInstance()) return this;
        if (!other.getUtcTime().isEmpty()) {
          utcTime_ = other.utcTime_;
          onChanged();
        }
        if (!other.getSclkValue().isEmpty()) {
          sclkValue_ = other.sclkValue_;
          onChanged();
        }
        if (other.getMissionDuration() != 0) {
          setMissionDuration(other.getMissionDuration());
        }
        if (other.getTimeScaleFactor() != 0) {
          setTimeScaleFactor(other.getTimeScaleFactor());
        }
        if (!other.getStartTime().isEmpty()) {
          startTime_ = other.startTime_;
          onChanged();
        }
        if (other.getTimeElapsedMs() != 0L) {
          setTimeElapsedMs(other.getTimeElapsedMs());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object utcTime_ = "";
      /**
       * <code>string utcTime = 1;</code>
       */
      public java.lang.String getUtcTime() {
        java.lang.Object ref = utcTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          utcTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string utcTime = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUtcTimeBytes() {
        java.lang.Object ref = utcTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          utcTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string utcTime = 1;</code>
       */
      public Builder setUtcTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        utcTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string utcTime = 1;</code>
       */
      public Builder clearUtcTime() {
        
        utcTime_ = getDefaultInstance().getUtcTime();
        onChanged();
        return this;
      }
      /**
       * <code>string utcTime = 1;</code>
       */
      public Builder setUtcTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        utcTime_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object sclkValue_ = "";
      /**
       * <code>string sclkValue = 2;</code>
       */
      public java.lang.String getSclkValue() {
        java.lang.Object ref = sclkValue_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sclkValue_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sclkValue = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSclkValueBytes() {
        java.lang.Object ref = sclkValue_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sclkValue_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sclkValue = 2;</code>
       */
      public Builder setSclkValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sclkValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string sclkValue = 2;</code>
       */
      public Builder clearSclkValue() {
        
        sclkValue_ = getDefaultInstance().getSclkValue();
        onChanged();
        return this;
      }
      /**
       * <code>string sclkValue = 2;</code>
       */
      public Builder setSclkValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sclkValue_ = value;
        onChanged();
        return this;
      }

      private int missionDuration_ ;
      /**
       * <code>int32 missionDuration = 3;</code>
       */
      public int getMissionDuration() {
        return missionDuration_;
      }
      /**
       * <code>int32 missionDuration = 3;</code>
       */
      public Builder setMissionDuration(int value) {
        
        missionDuration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 missionDuration = 3;</code>
       */
      public Builder clearMissionDuration() {
        
        missionDuration_ = 0;
        onChanged();
        return this;
      }

      private int timeScaleFactor_ ;
      /**
       * <code>int32 timeScaleFactor = 4;</code>
       */
      public int getTimeScaleFactor() {
        return timeScaleFactor_;
      }
      /**
       * <code>int32 timeScaleFactor = 4;</code>
       */
      public Builder setTimeScaleFactor(int value) {
        
        timeScaleFactor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 timeScaleFactor = 4;</code>
       */
      public Builder clearTimeScaleFactor() {
        
        timeScaleFactor_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object startTime_ = "";
      /**
       * <code>string startTime = 5;</code>
       */
      public java.lang.String getStartTime() {
        java.lang.Object ref = startTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          startTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string startTime = 5;</code>
       */
      public com.google.protobuf.ByteString
          getStartTimeBytes() {
        java.lang.Object ref = startTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          startTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string startTime = 5;</code>
       */
      public Builder setStartTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string startTime = 5;</code>
       */
      public Builder clearStartTime() {
        
        startTime_ = getDefaultInstance().getStartTime();
        onChanged();
        return this;
      }
      /**
       * <code>string startTime = 5;</code>
       */
      public Builder setStartTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        startTime_ = value;
        onChanged();
        return this;
      }

      private long timeElapsedMs_ ;
      /**
       * <code>int64 timeElapsedMs = 6;</code>
       */
      public long getTimeElapsedMs() {
        return timeElapsedMs_;
      }
      /**
       * <code>int64 timeElapsedMs = 6;</code>
       */
      public Builder setTimeElapsedMs(long value) {
        
        timeElapsedMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timeElapsedMs = 6;</code>
       */
      public Builder clearTimeElapsedMs() {
        
        timeElapsedMs_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:space.exploration.communications.protocol.spacecraftClock.SclkPacket)
    }

    // @@protoc_insertion_point(class_scope:space.exploration.communications.protocol.spacecraftClock.SclkPacket)
    private static final space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket();
    }

    public static space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SclkPacket>
        PARSER = new com.google.protobuf.AbstractParser<SclkPacket>() {
      public SclkPacket parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SclkPacket(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SclkPacket> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SclkPacket> getParserForType() {
      return PARSER;
    }

    public space.exploration.communications.protocol.spacecraftClock.SpacecraftClock.SclkPacket getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SpacecraftClock.proto\0229space.explorati" +
      "on.communications.protocol.spacecraftClo" +
      "ck\"\214\001\n\nSclkPacket\022\017\n\007utcTime\030\001 \001(\t\022\021\n\tsc" +
      "lkValue\030\002 \001(\t\022\027\n\017missionDuration\030\003 \001(\005\022\027" +
      "\n\017timeScaleFactor\030\004 \001(\005\022\021\n\tstartTime\030\005 \001" +
      "(\t\022\025\n\rtimeElapsedMs\030\006 \001(\003b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_space_exploration_communications_protocol_spacecraftClock_SclkPacket_descriptor,
        new java.lang.String[] { "UtcTime", "SclkValue", "MissionDuration", "TimeScaleFactor", "StartTime", "TimeElapsedMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}