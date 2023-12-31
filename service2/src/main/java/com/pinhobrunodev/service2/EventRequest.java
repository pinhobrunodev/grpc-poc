// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.pinhobrunodev.service2;

/**
 * Protobuf type {@code EventRequest}
 */
public final class EventRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EventRequest)
    EventRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventRequest.newBuilder() to construct.
  private EventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pinhobrunodev.service2.CreateEventOnTrackerServiceProto.internal_static_EventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pinhobrunodev.service2.CreateEventOnTrackerServiceProto.internal_static_EventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pinhobrunodev.service2.EventRequest.class, com.pinhobrunodev.service2.EventRequest.Builder.class);
  }

  public static final int EVENT_FIELD_NUMBER = 1;
  private com.pinhobrunodev.service2.Event event_;
  /**
   * <code>.Event event = 1;</code>
   * @return Whether the event field is set.
   */
  @java.lang.Override
  public boolean hasEvent() {
    return event_ != null;
  }
  /**
   * <code>.Event event = 1;</code>
   * @return The event.
   */
  @java.lang.Override
  public com.pinhobrunodev.service2.Event getEvent() {
    return event_ == null ? com.pinhobrunodev.service2.Event.getDefaultInstance() : event_;
  }
  /**
   * <code>.Event event = 1;</code>
   */
  @java.lang.Override
  public com.pinhobrunodev.service2.EventOrBuilder getEventOrBuilder() {
    return getEvent();
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
    if (event_ != null) {
      output.writeMessage(1, getEvent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (event_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEvent());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.pinhobrunodev.service2.EventRequest)) {
      return super.equals(obj);
    }
    com.pinhobrunodev.service2.EventRequest other = (com.pinhobrunodev.service2.EventRequest) obj;

    if (hasEvent() != other.hasEvent()) return false;
    if (hasEvent()) {
      if (!getEvent()
          .equals(other.getEvent())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEvent()) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pinhobrunodev.service2.EventRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pinhobrunodev.service2.EventRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pinhobrunodev.service2.EventRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pinhobrunodev.service2.EventRequest parseFrom(
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
  public static Builder newBuilder(com.pinhobrunodev.service2.EventRequest prototype) {
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
   * Protobuf type {@code EventRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EventRequest)
      com.pinhobrunodev.service2.EventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pinhobrunodev.service2.CreateEventOnTrackerServiceProto.internal_static_EventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pinhobrunodev.service2.CreateEventOnTrackerServiceProto.internal_static_EventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pinhobrunodev.service2.EventRequest.class, com.pinhobrunodev.service2.EventRequest.Builder.class);
    }

    // Construct using com.pinhobrunodev.service2.EventRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (eventBuilder_ == null) {
        event_ = null;
      } else {
        event_ = null;
        eventBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pinhobrunodev.service2.CreateEventOnTrackerServiceProto.internal_static_EventRequest_descriptor;
    }

    @java.lang.Override
    public com.pinhobrunodev.service2.EventRequest getDefaultInstanceForType() {
      return com.pinhobrunodev.service2.EventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.pinhobrunodev.service2.EventRequest build() {
      com.pinhobrunodev.service2.EventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pinhobrunodev.service2.EventRequest buildPartial() {
      com.pinhobrunodev.service2.EventRequest result = new com.pinhobrunodev.service2.EventRequest(this);
      if (eventBuilder_ == null) {
        result.event_ = event_;
      } else {
        result.event_ = eventBuilder_.build();
      }
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
      if (other instanceof com.pinhobrunodev.service2.EventRequest) {
        return mergeFrom((com.pinhobrunodev.service2.EventRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pinhobrunodev.service2.EventRequest other) {
      if (other == com.pinhobrunodev.service2.EventRequest.getDefaultInstance()) return this;
      if (other.hasEvent()) {
        mergeEvent(other.getEvent());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getEventFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.pinhobrunodev.service2.Event event_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pinhobrunodev.service2.Event, com.pinhobrunodev.service2.Event.Builder, com.pinhobrunodev.service2.EventOrBuilder> eventBuilder_;
    /**
     * <code>.Event event = 1;</code>
     * @return Whether the event field is set.
     */
    public boolean hasEvent() {
      return eventBuilder_ != null || event_ != null;
    }
    /**
     * <code>.Event event = 1;</code>
     * @return The event.
     */
    public com.pinhobrunodev.service2.Event getEvent() {
      if (eventBuilder_ == null) {
        return event_ == null ? com.pinhobrunodev.service2.Event.getDefaultInstance() : event_;
      } else {
        return eventBuilder_.getMessage();
      }
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder setEvent(com.pinhobrunodev.service2.Event value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        eventBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder setEvent(
        com.pinhobrunodev.service2.Event.Builder builderForValue) {
      if (eventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder mergeEvent(com.pinhobrunodev.service2.Event value) {
      if (eventBuilder_ == null) {
        if (event_ != null) {
          event_ =
            com.pinhobrunodev.service2.Event.newBuilder(event_).mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        eventBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder clearEvent() {
      if (eventBuilder_ == null) {
        event_ = null;
        onChanged();
      } else {
        event_ = null;
        eventBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public com.pinhobrunodev.service2.Event.Builder getEventBuilder() {
      
      onChanged();
      return getEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public com.pinhobrunodev.service2.EventOrBuilder getEventOrBuilder() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        return event_ == null ?
            com.pinhobrunodev.service2.Event.getDefaultInstance() : event_;
      }
    }
    /**
     * <code>.Event event = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pinhobrunodev.service2.Event, com.pinhobrunodev.service2.Event.Builder, com.pinhobrunodev.service2.EventOrBuilder> 
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.pinhobrunodev.service2.Event, com.pinhobrunodev.service2.Event.Builder, com.pinhobrunodev.service2.EventOrBuilder>(
                getEvent(),
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      return eventBuilder_;
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


    // @@protoc_insertion_point(builder_scope:EventRequest)
  }

  // @@protoc_insertion_point(class_scope:EventRequest)
  private static final com.pinhobrunodev.service2.EventRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pinhobrunodev.service2.EventRequest();
  }

  public static com.pinhobrunodev.service2.EventRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventRequest>
      PARSER = new com.google.protobuf.AbstractParser<EventRequest>() {
    @java.lang.Override
    public EventRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pinhobrunodev.service2.EventRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

