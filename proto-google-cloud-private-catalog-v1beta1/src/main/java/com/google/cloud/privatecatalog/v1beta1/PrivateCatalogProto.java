/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

public final class PrivateCatalogProto {
  private PrivateCatalogProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Catalog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_GitSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Version_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/privatecatalog/v1beta1/pr"
          + "ivate_catalog.proto\022#google.cloud.privat"
          + "ecatalog.v1beta1\032\034google/api/annotations"
          + ".proto\032\027google/api/client.proto\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032#google/longrunning/operatio"
          + "ns.proto\032\031google/protobuf/any.proto\032\033goo"
          + "gle/protobuf/empty.proto\032 google/protobu"
          + "f/field_mask.proto\032\034google/protobuf/stru"
          + "ct.proto\032\037google/protobuf/timestamp.prot"
          + "o\"d\n\025SearchCatalogsRequest\022\025\n\010resource\030\001"
          + " \001(\tB\003\340A\002\022\r\n\005query\030\002 \001(\t\022\021\n\tpage_size\030\003 "
          + "\001(\005\022\022\n\npage_token\030\004 \001(\t\"q\n\026SearchCatalog"
          + "sResponse\022>\n\010catalogs\030\001 \003(\0132,.google.clo"
          + "ud.privatecatalog.v1beta1.Catalog\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"d\n\025SearchProductsRequ"
          + "est\022\025\n\010resource\030\001 \001(\tB\003\340A\002\022\r\n\005query\030\002 \001("
          + "\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t"
          + "\"q\n\026SearchProductsResponse\022>\n\010products\030\001"
          + " \003(\0132,.google.cloud.privatecatalog.v1bet"
          + "a1.Product\022\027\n\017next_page_token\030\002 \001(\t\"i\n\025S"
          + "earchVersionsRequest\022\025\n\010resource\030\001 \001(\tB\003"
          + "\340A\002\022\022\n\005query\030\002 \001(\tB\003\340A\002\022\021\n\tpage_size\030\003 \001"
          + "(\005\022\022\n\npage_token\030\004 \001(\t\"q\n\026SearchVersions"
          + "Response\022>\n\010versions\030\001 \003(\0132,.google.clou"
          + "d.privatecatalog.v1beta1.Version\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"\202\002\n\007Catalog\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\003\022\030\n\013d"
          + "escription\030\003 \001(\tB\003\340A\003\0224\n\013create_time\030\004 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u"
          + "pdate_time\030\005 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003:C\352A@\n*cloudprivatecatalog.goog"
          + "leapis.com/Catalog\022\022catalogs/{catalog}\"\214"
          + "\003\n\007Product\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\027\n\nasset_t"
          + "ype\030\002 \001(\tB\003\340A\003\0229\n\020display_metadata\030\003 \001(\013"
          + "2\027.google.protobuf.StructB\006\340A\002\340A\003\022\025\n\010ico"
          + "n_uri\030\004 \001(\tB\003\340A\003\022R\n\020asset_references\030\n \003"
          + "(\01323.google.cloud.privatecatalog.v1beta1"
          + ".AssetReferenceB\003\340A\003\0224\n\013create_time\030\005 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\006 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003:C\352A@\n*cloudprivatecatalog.googl"
          + "eapis.com/Product\022\022products/{product}\"\336\005"
          + "\n\016AssetReference\022\017\n\002id\030\001 \001(\tB\003\340A\003\022\030\n\013des"
          + "cription\030\002 \001(\tB\003\340A\003\022@\n\006inputs\030\006 \001(\0132+.go"
          + "ogle.cloud.privatecatalog.v1beta1.Inputs"
          + "B\003\340A\003\022h\n\021validation_status\030\007 \001(\0162H.googl"
          + "e.cloud.privatecatalog.v1beta1.AssetRefe"
          + "rence.AssetValidationStateB\003\340A\003\022@\n\024valid"
          + "ation_operation\030\010 \001(\0132\035.google.longrunni"
          + "ng.OperationB\003\340A\003\022\024\n\005asset\030\n \001(\tB\003\340A\003H\000\022"
          + "\031\n\010gcs_path\030\013 \001(\tB\005\030\001\340A\003H\000\022I\n\ngit_source"
          + "\030\017 \001(\0132..google.cloud.privatecatalog.v1b"
          + "eta1.GitSourceB\003\340A\003H\000\022G\n\ngcs_source\030\020 \001("
          + "\0132..google.cloud.privatecatalog.v1beta1."
          + "GcsSourceB\003\340A\003\0224\n\013create_time\030\014 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\0224\n\013update_t"
          + "ime\030\r \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022\023\n\007version\030\016 \001(\tB\002\030\001\"c\n\024AssetValidati"
          + "onState\022&\n\"ASSET_VALIDATION_STATE_UNSPEC"
          + "IFIED\020\000\022\013\n\007PENDING\020\001\022\t\n\005VALID\020\002\022\013\n\007INVAL"
          + "ID\020\003B\010\n\006source\":\n\006Inputs\0220\n\nparameters\030\001"
          + " \001(\0132\027.google.protobuf.StructB\003\340A\003\"q\n\tGc"
          + "sSource\022\025\n\010gcs_path\030\001 \001(\tB\003\340A\003\022\027\n\ngenera"
          + "tion\030\002 \001(\003B\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\"`\n\tGitSour"
          + "ce\022\014\n\004repo\030\001 \001(\t\022\013\n\003dir\030\002 \001(\t\022\020\n\006commit\030"
          + "\003 \001(\tH\000\022\020\n\006branch\030\004 \001(\tH\000\022\r\n\003tag\030\005 \001(\tH\000"
          + "B\005\n\003ref\"\272\002\n\007Version\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\030"
          + "\n\013description\030\002 \001(\tB\003\340A\003\022+\n\005asset\030\003 \001(\0132"
          + "\027.google.protobuf.StructB\003\340A\003\0224\n\013create_"
          + "time\030\005 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003:i\352Af\n*cloudprivatecata"
          + "log.googleapis.com/Version\0228catalogs/{ca"
          + "talog}/products/{product}/versions/{vers"
          + "ion}2\362\007\n\016PrivateCatalog\022\253\002\n\016SearchCatalo"
          + "gs\022:.google.cloud.privatecatalog.v1beta1"
          + ".SearchCatalogsRequest\032;.google.cloud.pr"
          + "ivatecatalog.v1beta1.SearchCatalogsRespo"
          + "nse\"\237\001\202\323\344\223\002\230\001\022./v1beta1/{resource=projec"
          + "ts/*}/catalogs:searchZ5\0223/v1beta1/{resou"
          + "rce=organizations/*}/catalogs:searchZ/\022-"
          + "/v1beta1/{resource=folders/*}/catalogs:s"
          + "earch\022\253\002\n\016SearchProducts\022:.google.cloud."
          + "privatecatalog.v1beta1.SearchProductsReq"
          + "uest\032;.google.cloud.privatecatalog.v1bet"
          + "a1.SearchProductsResponse\"\237\001\202\323\344\223\002\230\001\022./v1"
          + "beta1/{resource=projects/*}/products:sea"
          + "rchZ5\0223/v1beta1/{resource=organizations/"
          + "*}/products:searchZ/\022-/v1beta1/{resource"
          + "=folders/*}/products:search\022\253\002\n\016SearchVe"
          + "rsions\022:.google.cloud.privatecatalog.v1b"
          + "eta1.SearchVersionsRequest\032;.google.clou"
          + "d.privatecatalog.v1beta1.SearchVersionsR"
          + "esponse\"\237\001\202\323\344\223\002\230\001\022./v1beta1/{resource=pr"
          + "ojects/*}/versions:searchZ5\0223/v1beta1/{r"
          + "esource=organizations/*}/versions:search"
          + "Z/\022-/v1beta1/{resource=folders/*}/versio"
          + "ns:search\032V\312A\"cloudprivatecatalog.google"
          + "apis.com\322A.https://www.googleapis.com/au"
          + "th/cloud-platformB\210\002\n\'com.google.cloud.p"
          + "rivatecatalog.v1beta1B\023PrivateCatalogPro"
          + "toP\001ZQgoogle.golang.org/genproto/googlea"
          + "pis/cloud/privatecatalog/v1beta1;private"
          + "catalog\252\002#Google.Cloud.PrivateCatalog.V1"
          + "Beta1\312\002#Google\\Cloud\\PrivateCatalog\\V1be"
          + "ta1\352\002&Google::Cloud::PrivateCatalog::V1b"
          + "eta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor,
            new java.lang.String[] {
              "Resource", "Query", "PageSize", "PageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor,
            new java.lang.String[] {
              "Catalogs", "NextPageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor,
            new java.lang.String[] {
              "Resource", "Query", "PageSize", "PageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor,
            new java.lang.String[] {
              "Products", "NextPageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor,
            new java.lang.String[] {
              "Resource", "Query", "PageSize", "PageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_privatecatalog_v1beta1_Catalog_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_privatecatalog_v1beta1_Product_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor,
            new java.lang.String[] {
              "Name",
              "AssetType",
              "DisplayMetadata",
              "IconUri",
              "AssetReferences",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor,
            new java.lang.String[] {
              "Id",
              "Description",
              "Inputs",
              "ValidationStatus",
              "ValidationOperation",
              "Asset",
              "GcsPath",
              "GitSource",
              "GcsSource",
              "CreateTime",
              "UpdateTime",
              "Version",
              "Source",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor,
            new java.lang.String[] {
              "Parameters",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor,
            new java.lang.String[] {
              "GcsPath", "Generation", "UpdateTime",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_privatecatalog_v1beta1_GitSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor,
            new java.lang.String[] {
              "Repo", "Dir", "Commit", "Branch", "Tag", "Ref",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_privatecatalog_v1beta1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor,
            new java.lang.String[] {
              "Name", "Description", "Asset", "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
