// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: javacd.proto

package com.facebook.buck.javacd.model;

@javax.annotation.Generated(value="protoc", comments="annotations:FilesystemParamsOrBuilder.java.pb.meta")
public interface FilesystemParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:javacd.api.v1.FilesystemParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.javacd.api.v1.AbsPath rootPath = 1;</code>
   */
  boolean hasRootPath();
  /**
   * <code>.javacd.api.v1.AbsPath rootPath = 1;</code>
   */
  com.facebook.buck.javacd.model.AbsPath getRootPath();
  /**
   * <code>.javacd.api.v1.AbsPath rootPath = 1;</code>
   */
  com.facebook.buck.javacd.model.AbsPathOrBuilder getRootPathOrBuilder();

  /**
   * <code>.javacd.api.v1.RelPath configuredBuckOut = 2;</code>
   */
  boolean hasConfiguredBuckOut();
  /**
   * <code>.javacd.api.v1.RelPath configuredBuckOut = 2;</code>
   */
  com.facebook.buck.javacd.model.RelPath getConfiguredBuckOut();
  /**
   * <code>.javacd.api.v1.RelPath configuredBuckOut = 2;</code>
   */
  com.facebook.buck.javacd.model.RelPathOrBuilder getConfiguredBuckOutOrBuilder();

  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  java.util.List<java.lang.String>
      getGlobIgnorePathsList();
  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  int getGlobIgnorePathsCount();
  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  java.lang.String getGlobIgnorePaths(int index);
  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  com.google.protobuf.ByteString
      getGlobIgnorePathsBytes(int index);
}