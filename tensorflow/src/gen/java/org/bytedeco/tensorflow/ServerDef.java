// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ServerDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ServerDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ServerDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ServerDef position(long position) {
        return (ServerDef)super.position(position);
    }

  public ServerDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ServerDef(@Const @ByRef ServerDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ServerDef from);

  public native @ByRef @Name("operator =") ServerDef put(@Const @ByRef ServerDef from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef ServerDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ServerDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ServerDef other);
  public native void Swap(ServerDef other);
  

  // implements Message ----------------------------------------------

  public native ServerDef New();

  public native ServerDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ServerDef from);
  public native void MergeFrom(@Const @ByRef ServerDef from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string job_name = 2;
  public native void clear_job_name();
  @MemberGetter public static native int kJobNameFieldNumber();
  public static final int kJobNameFieldNumber = kJobNameFieldNumber();
  public native @StdString BytePointer job_name();
  public native void set_job_name(@StdString BytePointer value);
  public native void set_job_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_job_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_job_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_job_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_job_name();
  public native void set_allocated_job_name(@StdString @Cast({"char*", "std::string*"}) BytePointer job_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_job_name();
  public native void unsafe_arena_set_allocated_job_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer job_name);

  // string protocol = 5;
  public native void clear_protocol();
  @MemberGetter public static native int kProtocolFieldNumber();
  public static final int kProtocolFieldNumber = kProtocolFieldNumber();
  public native @StdString BytePointer protocol();
  public native void set_protocol(@StdString BytePointer value);
  public native void set_protocol(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_protocol(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_protocol(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_protocol();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_protocol();
  public native void set_allocated_protocol(@StdString @Cast({"char*", "std::string*"}) BytePointer protocol);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_protocol();
  public native void unsafe_arena_set_allocated_protocol(
        @StdString @Cast({"char*", "std::string*"}) BytePointer protocol);

  // .tensorflow.ClusterDef cluster = 1;
  public native @Cast("bool") boolean has_cluster();
  public native void clear_cluster();
  @MemberGetter public static native int kClusterFieldNumber();
  public static final int kClusterFieldNumber = kClusterFieldNumber();
  public native @Const @ByRef ClusterDef cluster();
  public native ClusterDef release_cluster();
  public native ClusterDef mutable_cluster();
  public native void set_allocated_cluster(ClusterDef cluster);
  public native void unsafe_arena_set_allocated_cluster(
        ClusterDef cluster);
  public native ClusterDef unsafe_arena_release_cluster();

  // .tensorflow.ConfigProto default_session_config = 4;
  public native @Cast("bool") boolean has_default_session_config();
  public native void clear_default_session_config();
  @MemberGetter public static native int kDefaultSessionConfigFieldNumber();
  public static final int kDefaultSessionConfigFieldNumber = kDefaultSessionConfigFieldNumber();
  public native @Const @ByRef ConfigProto default_session_config();
  public native ConfigProto release_default_session_config();
  public native ConfigProto mutable_default_session_config();
  public native void set_allocated_default_session_config(ConfigProto default_session_config);
  public native void unsafe_arena_set_allocated_default_session_config(
        ConfigProto default_session_config);
  public native ConfigProto unsafe_arena_release_default_session_config();

  // int32 task_index = 3;
  public native void clear_task_index();
  @MemberGetter public static native int kTaskIndexFieldNumber();
  public static final int kTaskIndexFieldNumber = kTaskIndexFieldNumber();
  public native @Cast("google::protobuf::int32") int task_index();
  public native void set_task_index(@Cast("google::protobuf::int32") int value);
}
