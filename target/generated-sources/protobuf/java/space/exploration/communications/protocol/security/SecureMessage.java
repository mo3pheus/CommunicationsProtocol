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
     * <code>bytes content = 3;</code>
     */
    com.google.protobuf.ByteString getContent();
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
      content_ = com.google.protobuf.ByteString.EMPTY;
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
            case 26: {

              content_ = input.readBytes();
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
      return space.exploration.communications.protocol.security.SecureMessage.internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return space.exploration.communications.protocol.security.SecureMessage.internal_static_space_exploration_communications_protocol_security_SecureMessagePacket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.class, space.exploration.communications.protocol.security.SecureMessage.SecureMessagePacket.Builder.class);
    }

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

    public static final int CONTENT_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString content_;
    /**
     * <code>bytes content = 3;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
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
      if (!content_.isEmpty()) {
        output.writeBytes(3, content_);
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
      if (!content_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, content_);
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
      result = result && getContent()
          .equals(other.getContent());
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
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
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

        content_ = com.google.protobuf.ByteString.EMPTY;

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
        result.senderId_ = senderId_;
        result.signature_ = signature_;
        result.content_ = content_;
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
        if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
          setContent(other.getContent());
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

      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes content = 3;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <code>bytes content = 3;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes content = 3;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
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
      ".communications.protocol.security\"K\n\023Sec" +
      "ureMessagePacket\022\020\n\010senderId\030\001 \001(\t\022\021\n\tsi" +
      "gnature\030\002 \001(\014\022\017\n\007content\030\003 \001(\014b\006proto3"
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
        new java.lang.String[] { "SenderId", "Signature", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
