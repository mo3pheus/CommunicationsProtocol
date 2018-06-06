// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecureMessage.proto

package space.exploration.communications.protocol.security;

public final class SecureMessage {
  private SecureMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SecureMessagePacketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:space.exploration.communications.protocol.security.SecureMessagePacket)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string senderId = 1;</code>
     */
    java.lang.String getSenderId();
    /**
     * <code>string senderId = 1;</code>
     */
    com.google.protobuf.ByteString
        getSenderIdBytes();

    /**
     * <code>bytes signature = 2;</code>
     */
    com.google.protobuf.ByteString getSignature();

    /**
     * <code>int64 contentLength = 3;</code>
     */
    long getContentLength();

    /**
     * <code>bytes checkSum = 4;</code>
     */
    com.google.protobuf.ByteString getCheckSum();

    /**
     * <code>int64 processingTime = 5;</code>
     */
    long getProcessingTime();

    /**
     * <code>repeated bytes content = 6;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getContentList();
    /**
     * <code>repeated bytes content = 6;</code>
     */
    int getContentCount();
    /**
     * <code>repeated bytes content = 6;</code>
     */
    com.google.protobuf.ByteString getContent(int index);
  }
  /**
   * Protobuf type {@code space.exploration.communications.protocol.security.SecureMessagePacket}
   */
  public  static final class SecureMessagePacket extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:space.exploration.communications.protocol.security.SecureMessagePacket)
      SecureMessagePacketOrBuilder {
    // Use SecureMessagePacket.newBuilder() to construct.
    private SecureMessagePacket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SecureMessagePacket() {
      senderId_ = "";
      signature_ = com.google.protobuf.ByteString.EMPTY;
      contentLength_ = 0L;
      checkSum_ = com.google.protobuf.ByteString.EMPTY;
      processingTime_ = 0L;
      content_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SecureMessagePacket(
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

              senderId_ = s;
              break;
            }
            case 18: {

              signature_ = input.readBytes();
              break;
            }
            case 24: {

              contentLength_ = input.readInt64();
              break;
            }
            case 34: {

              checkSum_ = input.readBytes();
              break;
            }
            case 40: {

              processingTime_ = input.readInt64();
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                content_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000020;
              }
              content_.add(input.readBytes());
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
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          content_ = java.util.Collections.unmodifiableList(content_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return space.exploration.communications.protocol.security.SecureMessage.internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return space.exploration.communications.protocol.security.SecureMessage.internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.class, space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.Builder.class);
    }

    private int bitField0_;
    public static final int SENDERID_FIELD_NUMBER = 1;
    private volatile java.lang.Object senderId_;
    /**
     * <code>string senderId = 1;</code>
     */
    public java.lang.String getSenderId() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      }
    }
    /**
     * <code>string senderId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SIGNATURE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString signature_;
    /**
     * <code>bytes signature = 2;</code>
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }

    public static final int CONTENTLENGTH_FIELD_NUMBER = 3;
    private long contentLength_;
    /**
     * <code>int64 contentLength = 3;</code>
     */
    public long getContentLength() {
      return contentLength_;
    }

    public static final int CHECKSUM_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString checkSum_;
    /**
     * <code>bytes checkSum = 4;</code>
     */
    public com.google.protobuf.ByteString getCheckSum() {
      return checkSum_;
    }

    public static final int PROCESSINGTIME_FIELD_NUMBER = 5;
    private long processingTime_;
    /**
     * <code>int64 processingTime = 5;</code>
     */
    public long getProcessingTime() {
      return processingTime_;
    }

    public static final int CONTENT_FIELD_NUMBER = 6;
    private java.util.List<com.google.protobuf.ByteString> content_;
    /**
     * <code>repeated bytes content = 6;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getContentList() {
      return content_;
    }
    /**
     * <code>repeated bytes content = 6;</code>
     */
    public int getContentCount() {
      return content_.size();
    }
    /**
     * <code>repeated bytes content = 6;</code>
     */
    public com.google.protobuf.ByteString getContent(int index) {
      return content_.get(index);
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
      if (!getSenderIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, senderId_);
      }
      if (!signature_.isEmpty()) {
        output.writeBytes(2, signature_);
      }
      if (contentLength_ != 0L) {
        output.writeInt64(3, contentLength_);
      }
      if (!checkSum_.isEmpty()) {
        output.writeBytes(4, checkSum_);
      }
      if (processingTime_ != 0L) {
        output.writeInt64(5, processingTime_);
      }
      for (int i = 0; i < content_.size(); i++) {
        output.writeBytes(6, content_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSenderIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, senderId_);
      }
      if (!signature_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, signature_);
      }
      if (contentLength_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, contentLength_);
      }
      if (!checkSum_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, checkSum_);
      }
      if (processingTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, processingTime_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < content_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(content_.get(i));
        }
        size += dataSize;
        size += 1 * getContentList().size();
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
      if (!(obj instanceof space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket)) {
        return super.equals(obj);
      }
      space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket other = (space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket) obj;

      boolean result = true;
      result = result && getSenderId()
          .equals(other.getSenderId());
      result = result && getSignature()
          .equals(other.getSignature());
      result = result && (getContentLength()
          == other.getContentLength());
      result = result && getCheckSum()
          .equals(other.getCheckSum());
      result = result && (getProcessingTime()
          == other.getProcessingTime());
      result = result && getContentList()
          .equals(other.getContentList());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SENDERID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderId().hashCode();
      hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getSignature().hashCode();
      hash = (37 * hash) + CONTENTLENGTH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getContentLength());
      hash = (37 * hash) + CHECKSUM_FIELD_NUMBER;
      hash = (53 * hash) + getCheckSum().hashCode();
      hash = (37 * hash) + PROCESSINGTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getProcessingTime());
      if (getContentCount() > 0) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContentList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parseFrom(
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
    public static Builder newBuilder(space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket prototype) {
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
     * Protobuf type {@code space.exploration.communications.protocol.security.SecureMessagePacket}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:space.exploration.communications.protocol.security.SecureMessagePacket)
        space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return space.exploration.communications.protocol.security.SecureMessage.internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return space.exploration.communications.protocol.security.SecureMessage.internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.class, space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.Builder.class);
      }

      // Construct using space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.newBuilder()
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
        senderId_ = "";

        signature_ = com.google.protobuf.ByteString.EMPTY;

        contentLength_ = 0L;

        checkSum_ = com.google.protobuf.ByteString.EMPTY;

        processingTime_ = 0L;

        content_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return space.exploration.communications.protocol.security.SecureMessage.internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_descriptor;
      }

      public space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket getDefaultInstanceForType() {
        return space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.getDefaultInstance();
      }

      public space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket build() {
        space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket buildPartial() {
        space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket result = new space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.senderId_ = senderId_;
        result.signature_ = signature_;
        result.contentLength_ = contentLength_;
        result.checkSum_ = checkSum_;
        result.processingTime_ = processingTime_;
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          content_ = java.util.Collections.unmodifiableList(content_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket) {
          return mergeFrom((space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket other) {
        if (other == space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.getDefaultInstance()) return this;
        if (!other.getSenderId().isEmpty()) {
          senderId_ = other.senderId_;
          onChanged();
        }
        if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
          setSignature(other.getSignature());
        }
        if (other.getContentLength() != 0L) {
          setContentLength(other.getContentLength());
        }
        if (other.getCheckSum() != com.google.protobuf.ByteString.EMPTY) {
          setCheckSum(other.getCheckSum());
        }
        if (other.getProcessingTime() != 0L) {
          setProcessingTime(other.getProcessingTime());
        }
        if (!other.content_.isEmpty()) {
          if (content_.isEmpty()) {
            content_ = other.content_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureContentIsMutable();
            content_.addAll(other.content_);
          }
          onChanged();
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
        space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object senderId_ = "";
      /**
       * <code>string senderId = 1;</code>
       */
      public java.lang.String getSenderId() {
        java.lang.Object ref = senderId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          senderId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string senderId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSenderIdBytes() {
        java.lang.Object ref = senderId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senderId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string senderId = 1;</code>
       */
      public Builder setSenderId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string senderId = 1;</code>
       */
      public Builder clearSenderId() {
        
        senderId_ = getDefaultInstance().getSenderId();
        onChanged();
        return this;
      }
      /**
       * <code>string senderId = 1;</code>
       */
      public Builder setSenderIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderId_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes signature = 2;</code>
       */
      public com.google.protobuf.ByteString getSignature() {
        return signature_;
      }
      /**
       * <code>bytes signature = 2;</code>
       */
      public Builder setSignature(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        signature_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes signature = 2;</code>
       */
      public Builder clearSignature() {
        
        signature_ = getDefaultInstance().getSignature();
        onChanged();
        return this;
      }

      private long contentLength_ ;
      /**
       * <code>int64 contentLength = 3;</code>
       */
      public long getContentLength() {
        return contentLength_;
      }
      /**
       * <code>int64 contentLength = 3;</code>
       */
      public Builder setContentLength(long value) {
        
        contentLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 contentLength = 3;</code>
       */
      public Builder clearContentLength() {
        
        contentLength_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString checkSum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes checkSum = 4;</code>
       */
      public com.google.protobuf.ByteString getCheckSum() {
        return checkSum_;
      }
      /**
       * <code>bytes checkSum = 4;</code>
       */
      public Builder setCheckSum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        checkSum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes checkSum = 4;</code>
       */
      public Builder clearCheckSum() {
        
        checkSum_ = getDefaultInstance().getCheckSum();
        onChanged();
        return this;
      }

      private long processingTime_ ;
      /**
       * <code>int64 processingTime = 5;</code>
       */
      public long getProcessingTime() {
        return processingTime_;
      }
      /**
       * <code>int64 processingTime = 5;</code>
       */
      public Builder setProcessingTime(long value) {
        
        processingTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 processingTime = 5;</code>
       */
      public Builder clearProcessingTime() {
        
        processingTime_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> content_ = java.util.Collections.emptyList();
      private void ensureContentIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          content_ = new java.util.ArrayList<com.google.protobuf.ByteString>(content_);
          bitField0_ |= 0x00000020;
         }
      }
      /**
       * <code>repeated bytes content = 6;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getContentList() {
        return java.util.Collections.unmodifiableList(content_);
      }
      /**
       * <code>repeated bytes content = 6;</code>
       */
      public int getContentCount() {
        return content_.size();
      }
      /**
       * <code>repeated bytes content = 6;</code>
       */
      public com.google.protobuf.ByteString getContent(int index) {
        return content_.get(index);
      }
      /**
       * <code>repeated bytes content = 6;</code>
       */
      public Builder setContent(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes content = 6;</code>
       */
      public Builder addContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureContentIsMutable();
        content_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes content = 6;</code>
       */
      public Builder addAllContent(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureContentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, content_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes content = 6;</code>
       */
      public Builder clearContent() {
        content_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
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


      // @@protoc_insertion_point(builder_scope:space.exploration.communications.protocol.security.SecureMessagePacket)
    }

    // @@protoc_insertion_point(class_scope:space.exploration.communications.protocol.security.SecureMessagePacket)
    private static final space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket();
    }

    public static space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SecureMessagePacket>
        PARSER = new com.google.protobuf.AbstractParser<SecureMessagePacket>() {
      public SecureMessagePacket parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SecureMessagePacket(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SecureMessagePacket> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SecureMessagePacket> getParserForType() {
      return PARSER;
    }

    public space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SecureMessage.proto\0222space.exploration" +
      ".communications.protocol.security\"\214\001\n\023Se" +
      "cureMessagePacket\022\020\n\010senderId\030\001 \001(\t\022\021\n\ts" +
      "ignature\030\002 \001(\014\022\025\n\rcontentLength\030\003 \001(\003\022\020\n" +
      "\010checkSum\030\004 \001(\014\022\026\n\016processingTime\030\005 \001(\003\022" +
      "\017\n\007content\030\006 \003(\014b\006proto3"
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
    internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_descriptor,
        new java.lang.String[] { "SenderId", "Signature", "ContentLength", "CheckSum", "ProcessingTime", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
