// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeatherQuery.proto

package space.exploration.communications.protocol.service;

public final class WeatherQueryOuterClass {
  private WeatherQueryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeatherQueryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:space.exploration.communications.protocol.service.WeatherQuery)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string terrestrialStartDate = 1;</code>
     */
    java.lang.String getTerrestrialStartDate();
    /**
     * <code>string terrestrialStartDate = 1;</code>
     */
    com.google.protobuf.ByteString
        getTerrestrialStartDateBytes();

    /**
     * <code>string terrestrialEndDate = 2;</code>
     */
    java.lang.String getTerrestrialEndDate();
    /**
     * <code>string terrestrialEndDate = 2;</code>
     */
    com.google.protobuf.ByteString
        getTerrestrialEndDateBytes();

    /**
     * <code>int32 solNumber = 3;</code>
     */
    int getSolNumber();
  }
  /**
   * Protobuf type {@code space.exploration.communications.protocol.service.WeatherQuery}
   */
  public  static final class WeatherQuery extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:space.exploration.communications.protocol.service.WeatherQuery)
      WeatherQueryOrBuilder {
    // Use WeatherQuery.newBuilder() to construct.
    private WeatherQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeatherQuery() {
      terrestrialStartDate_ = "";
      terrestrialEndDate_ = "";
      solNumber_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private WeatherQuery(
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

              terrestrialStartDate_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              terrestrialEndDate_ = s;
              break;
            }
            case 24: {

              solNumber_ = input.readInt32();
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
      return space.exploration.communications.protocol.service.WeatherQueryOuterClass.internal_static_space_exploration_communications_protocol_service_WeatherQuery_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return space.exploration.communications.protocol.service.WeatherQueryOuterClass.internal_static_space_exploration_communications_protocol_service_WeatherQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery.class, space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery.Builder.class);
    }

    public static final int TERRESTRIALSTARTDATE_FIELD_NUMBER = 1;
    private volatile java.lang.Object terrestrialStartDate_;
    /**
     * <code>string terrestrialStartDate = 1;</code>
     */
    public java.lang.String getTerrestrialStartDate() {
      java.lang.Object ref = terrestrialStartDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        terrestrialStartDate_ = s;
        return s;
      }
    }
    /**
     * <code>string terrestrialStartDate = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTerrestrialStartDateBytes() {
      java.lang.Object ref = terrestrialStartDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        terrestrialStartDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TERRESTRIALENDDATE_FIELD_NUMBER = 2;
    private volatile java.lang.Object terrestrialEndDate_;
    /**
     * <code>string terrestrialEndDate = 2;</code>
     */
    public java.lang.String getTerrestrialEndDate() {
      java.lang.Object ref = terrestrialEndDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        terrestrialEndDate_ = s;
        return s;
      }
    }
    /**
     * <code>string terrestrialEndDate = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTerrestrialEndDateBytes() {
      java.lang.Object ref = terrestrialEndDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        terrestrialEndDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SOLNUMBER_FIELD_NUMBER = 3;
    private int solNumber_;
    /**
     * <code>int32 solNumber = 3;</code>
     */
    public int getSolNumber() {
      return solNumber_;
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
      if (!getTerrestrialStartDateBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, terrestrialStartDate_);
      }
      if (!getTerrestrialEndDateBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, terrestrialEndDate_);
      }
      if (solNumber_ != 0) {
        output.writeInt32(3, solNumber_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTerrestrialStartDateBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, terrestrialStartDate_);
      }
      if (!getTerrestrialEndDateBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, terrestrialEndDate_);
      }
      if (solNumber_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, solNumber_);
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
      if (!(obj instanceof space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery)) {
        return super.equals(obj);
      }
      space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery other = (space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery) obj;

      boolean result = true;
      result = result && getTerrestrialStartDate()
          .equals(other.getTerrestrialStartDate());
      result = result && getTerrestrialEndDate()
          .equals(other.getTerrestrialEndDate());
      result = result && (getSolNumber()
          == other.getSolNumber());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TERRESTRIALSTARTDATE_FIELD_NUMBER;
      hash = (53 * hash) + getTerrestrialStartDate().hashCode();
      hash = (37 * hash) + TERRESTRIALENDDATE_FIELD_NUMBER;
      hash = (53 * hash) + getTerrestrialEndDate().hashCode();
      hash = (37 * hash) + SOLNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getSolNumber();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parseFrom(
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
    public static Builder newBuilder(space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery prototype) {
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
     * Protobuf type {@code space.exploration.communications.protocol.service.WeatherQuery}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:space.exploration.communications.protocol.service.WeatherQuery)
        space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return space.exploration.communications.protocol.service.WeatherQueryOuterClass.internal_static_space_exploration_communications_protocol_service_WeatherQuery_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return space.exploration.communications.protocol.service.WeatherQueryOuterClass.internal_static_space_exploration_communications_protocol_service_WeatherQuery_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery.class, space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery.Builder.class);
      }

      // Construct using space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery.newBuilder()
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
        terrestrialStartDate_ = "";

        terrestrialEndDate_ = "";

        solNumber_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return space.exploration.communications.protocol.service.WeatherQueryOuterClass.internal_static_space_exploration_communications_protocol_service_WeatherQuery_descriptor;
      }

      public space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery getDefaultInstanceForType() {
        return space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery.getDefaultInstance();
      }

      public space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery build() {
        space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery buildPartial() {
        space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery result = new space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery(this);
        result.terrestrialStartDate_ = terrestrialStartDate_;
        result.terrestrialEndDate_ = terrestrialEndDate_;
        result.solNumber_ = solNumber_;
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
        if (other instanceof space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery) {
          return mergeFrom((space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery other) {
        if (other == space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery.getDefaultInstance()) return this;
        if (!other.getTerrestrialStartDate().isEmpty()) {
          terrestrialStartDate_ = other.terrestrialStartDate_;
          onChanged();
        }
        if (!other.getTerrestrialEndDate().isEmpty()) {
          terrestrialEndDate_ = other.terrestrialEndDate_;
          onChanged();
        }
        if (other.getSolNumber() != 0) {
          setSolNumber(other.getSolNumber());
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
        space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object terrestrialStartDate_ = "";
      /**
       * <code>string terrestrialStartDate = 1;</code>
       */
      public java.lang.String getTerrestrialStartDate() {
        java.lang.Object ref = terrestrialStartDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          terrestrialStartDate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string terrestrialStartDate = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTerrestrialStartDateBytes() {
        java.lang.Object ref = terrestrialStartDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          terrestrialStartDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string terrestrialStartDate = 1;</code>
       */
      public Builder setTerrestrialStartDate(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        terrestrialStartDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string terrestrialStartDate = 1;</code>
       */
      public Builder clearTerrestrialStartDate() {
        
        terrestrialStartDate_ = getDefaultInstance().getTerrestrialStartDate();
        onChanged();
        return this;
      }
      /**
       * <code>string terrestrialStartDate = 1;</code>
       */
      public Builder setTerrestrialStartDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        terrestrialStartDate_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object terrestrialEndDate_ = "";
      /**
       * <code>string terrestrialEndDate = 2;</code>
       */
      public java.lang.String getTerrestrialEndDate() {
        java.lang.Object ref = terrestrialEndDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          terrestrialEndDate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string terrestrialEndDate = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTerrestrialEndDateBytes() {
        java.lang.Object ref = terrestrialEndDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          terrestrialEndDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string terrestrialEndDate = 2;</code>
       */
      public Builder setTerrestrialEndDate(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        terrestrialEndDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string terrestrialEndDate = 2;</code>
       */
      public Builder clearTerrestrialEndDate() {
        
        terrestrialEndDate_ = getDefaultInstance().getTerrestrialEndDate();
        onChanged();
        return this;
      }
      /**
       * <code>string terrestrialEndDate = 2;</code>
       */
      public Builder setTerrestrialEndDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        terrestrialEndDate_ = value;
        onChanged();
        return this;
      }

      private int solNumber_ ;
      /**
       * <code>int32 solNumber = 3;</code>
       */
      public int getSolNumber() {
        return solNumber_;
      }
      /**
       * <code>int32 solNumber = 3;</code>
       */
      public Builder setSolNumber(int value) {
        
        solNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 solNumber = 3;</code>
       */
      public Builder clearSolNumber() {
        
        solNumber_ = 0;
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


      // @@protoc_insertion_point(builder_scope:space.exploration.communications.protocol.service.WeatherQuery)
    }

    // @@protoc_insertion_point(class_scope:space.exploration.communications.protocol.service.WeatherQuery)
    private static final space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery();
    }

    public static space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WeatherQuery>
        PARSER = new com.google.protobuf.AbstractParser<WeatherQuery>() {
      public WeatherQuery parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new WeatherQuery(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WeatherQuery> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeatherQuery> getParserForType() {
      return PARSER;
    }

    public space.exploration.communications.protocol.service.WeatherQueryOuterClass.WeatherQuery getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_space_exploration_communications_protocol_service_WeatherQuery_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_space_exploration_communications_protocol_service_WeatherQuery_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022WeatherQuery.proto\0221space.exploration." +
      "communications.protocol.service\"[\n\014Weath" +
      "erQuery\022\034\n\024terrestrialStartDate\030\001 \001(\t\022\032\n" +
      "\022terrestrialEndDate\030\002 \001(\t\022\021\n\tsolNumber\030\003" +
      " \001(\005b\006proto3"
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
    internal_static_space_exploration_communications_protocol_service_WeatherQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_space_exploration_communications_protocol_service_WeatherQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_space_exploration_communications_protocol_service_WeatherQuery_descriptor,
        new java.lang.String[] { "TerrestrialStartDate", "TerrestrialEndDate", "SolNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
