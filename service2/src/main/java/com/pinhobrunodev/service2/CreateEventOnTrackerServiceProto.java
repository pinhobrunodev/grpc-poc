// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.pinhobrunodev.service2;

public final class CreateEventOnTrackerServiceProto {
  private CreateEventOnTrackerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\"\205\001\n\005Event\022\017\n\007eventId\030\001 \001(\t" +
      "\022\021\n\teventName\030\002 \001(\t\022\024\n\014eventImgLink\030\003 \001(" +
      "\t\022\024\n\014eventAddress\030\004 \001(\t\022\013\n\003lat\030\005 \001(\t\022\013\n\003" +
      "lng\030\006 \001(\t\022\022\n\ncategories\030\007 \003(\t\"%\n\014EventRe" +
      "quest\022\025\n\005event\030\001 \001(\0132\006.Event\"\037\n\rEventRes" +
      "ponse\022\016\n\006result\030\001 \001(\t2<\n\014EventService\022,\n" +
      "\013CreateEvent\022\r.EventRequest\032\016.EventRespo" +
      "nseB@\n\032com.pinhobrunodev.service2B Creat" +
      "eEventOnTrackerServiceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Event_descriptor,
        new java.lang.String[] { "EventId", "EventName", "EventImgLink", "EventAddress", "Lat", "Lng", "Categories", });
    internal_static_EventRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventRequest_descriptor,
        new java.lang.String[] { "Event", });
    internal_static_EventResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_EventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
