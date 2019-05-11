// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SamQuery.proto

package space.exploration.communications.protocol.service;

public final class SamQueryOuterClass {
  private SamQueryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SamQueryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:space.exploration.communications.protocol.service.SamQuery)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 sol = 1;</code>
     */
    int getSol();

    /**
     * <code>bool getNearest = 2;</code>
     */
    boolean getGetNearest();
  }
  /**
   * Protobuf type {@code space.exploration.communications.protocol.service.SamQuery}
   */
  public  static final class SamQuery extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:space.exploration.communications.protocol.service.SamQuery)
      SamQueryOrBuilder {
    // Use SamQuery.newBuilder() to construct.
    private SamQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SamQuery() {
      sol_ = 0;
      getNearest_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SamQuery(
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
            case 8: {

              sol_ = input.readInt32();
              break;
            }
            case 16: {

              getNearest_ = input.readBool();
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
      return space.exploration.communications.protocol.service.SamQueryOuterClass.internal_static_space_exploration_communications_protocol_service_SamQuery_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return space.exploration.communications.protocol.service.SamQueryOuterClass.internal_static_space_exploration_communications_protocol_service_SamQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery.class, space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery.Builder.class);
    }

    public static final int SOL_FIELD_NUMBER = 1;
    private int sol_;
    /**
     * <code>int32 sol = 1;</code>
     */
    public int getSol() {
      return sol_;
    }

    public static final int GETNEAREST_FIELD_NUMBER = 2;
    private boolean getNearest_;
    /**
     * <code>bool getNearest = 2;</code>
     */
    public boolean getGetNearest() {
      return getNearest_;
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
      if (sol_ != 0) {
        output.writeInt32(1, sol_);
      }
      if (getNearest_ != false) {
        output.writeBool(2, getNearest_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sol_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, sol_);
      }
      if (getNearest_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, getNearest_);
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
      if (!(obj instanceof space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery)) {
        return super.equals(obj);
      }
      space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery other = (space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery) obj;

      boolean result = true;
      result = result && (getSol()
          == other.getSol());
      result = result && (getGetNearest()
          == other.getGetNearest());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SOL_FIELD_NUMBER;
      hash = (53 * hash) + getSol();
      hash = (37 * hash) + GETNEAREST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGetNearest());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parseFrom(
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
    public static Builder newBuilder(space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery prototype) {
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
     * Protobuf type {@code space.exploration.communications.protocol.service.SamQuery}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:space.exploration.communications.protocol.service.SamQuery)
        space.exploration.communications.protocol.service.SamQueryOuterClass.SamQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return space.exploration.communications.protocol.service.SamQueryOuterClass.internal_static_space_exploration_communications_protocol_service_SamQuery_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return space.exploration.communications.protocol.service.SamQueryOuterClass.internal_static_space_exploration_communications_protocol_service_SamQuery_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery.class, space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery.Builder.class);
      }

      // Construct using space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery.newBuilder()
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
        sol_ = 0;

        getNearest_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return space.exploration.communications.protocol.service.SamQueryOuterClass.internal_static_space_exploration_communications_protocol_service_SamQuery_descriptor;
      }

      public space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery getDefaultInstanceForType() {
        return space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery.getDefaultInstance();
      }

      public space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery build() {
        space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery buildPartial() {
        space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery result = new space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery(this);
        result.sol_ = sol_;
        result.getNearest_ = getNearest_;
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
        if (other instanceof space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery) {
          return mergeFrom((space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery other) {
        if (other == space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery.getDefaultInstance()) return this;
        if (other.getSol() != 0) {
          setSol(other.getSol());
        }
        if (other.getGetNearest() != false) {
          setGetNearest(other.getGetNearest());
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
        space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sol_ ;
      /**
       * <code>int32 sol = 1;</code>
       */
      public int getSol() {
        return sol_;
      }
      /**
       * <code>int32 sol = 1;</code>
       */
      public Builder setSol(int value) {
        
        sol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sol = 1;</code>
       */
      public Builder clearSol() {
        
        sol_ = 0;
        onChanged();
        return this;
      }

      private boolean getNearest_ ;
      /**
       * <code>bool getNearest = 2;</code>
       */
      public boolean getGetNearest() {
        return getNearest_;
      }
      /**
       * <code>bool getNearest = 2;</code>
       */
      public Builder setGetNearest(boolean value) {
        
        getNearest_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool getNearest = 2;</code>
       */
      public Builder clearGetNearest() {
        
        getNearest_ = false;
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


      // @@protoc_insertion_point(builder_scope:space.exploration.communications.protocol.service.SamQuery)
    }

    // @@protoc_insertion_point(class_scope:space.exploration.communications.protocol.service.SamQuery)
    private static final space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery();
    }

    public static space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SamQuery>
        PARSER = new com.google.protobuf.AbstractParser<SamQuery>() {
      public SamQuery parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SamQuery(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SamQuery> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SamQuery> getParserForType() {
      return PARSER;
    }

    public space.exploration.communications.protocol.service.SamQueryOuterClass.SamQuery getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_space_exploration_communications_protocol_service_SamQuery_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_space_exploration_communications_protocol_service_SamQuery_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016SamQuery.proto\0221space.exploration.comm" +
      "unications.protocol.service\"+\n\010SamQuery\022" +
      "\013\n\003sol\030\001 \001(\005\022\022\n\ngetNearest\030\002 \001(\010b\006proto3"
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
    internal_static_space_exploration_communications_protocol_service_SamQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_space_exploration_communications_protocol_service_SamQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_space_exploration_communications_protocol_service_SamQuery_descriptor,
        new java.lang.String[] { "Sol", "GetNearest", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}