// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeregisterGraphRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeregisterGraphRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeregisterGraphRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DeregisterGraphRequest position(long position) {
        return (DeregisterGraphRequest)super.position(position);
    }

  public DeregisterGraphRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DeregisterGraphRequest(@Const @ByRef DeregisterGraphRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef DeregisterGraphRequest from);

  public native @ByRef @Name("operator =") DeregisterGraphRequest put(@Const @ByRef DeregisterGraphRequest from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef DeregisterGraphRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const DeregisterGraphRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(DeregisterGraphRequest other);
  public native void Swap(DeregisterGraphRequest other);
  

  // implements Message ----------------------------------------------

  public native DeregisterGraphRequest New();

  public native DeregisterGraphRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef DeregisterGraphRequest from);
  public native void MergeFrom(@Const @ByRef DeregisterGraphRequest from);
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

  // string graph_handle = 1;
  public native void clear_graph_handle();
  @MemberGetter public static native int kGraphHandleFieldNumber();
  public static final int kGraphHandleFieldNumber = kGraphHandleFieldNumber();
  public native @StdString BytePointer graph_handle();
  public native void set_graph_handle(@StdString BytePointer value);
  public native void set_graph_handle(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_graph_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_graph_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_graph_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_graph_handle();
  public native void set_allocated_graph_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer graph_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_graph_handle();
  public native void unsafe_arena_set_allocated_graph_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer graph_handle);

  // string session_handle = 2;
  public native void clear_session_handle();
  @MemberGetter public static native int kSessionHandleFieldNumber();
  public static final int kSessionHandleFieldNumber = kSessionHandleFieldNumber();
  public native @StdString BytePointer session_handle();
  public native void set_session_handle(@StdString BytePointer value);
  public native void set_session_handle(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_session_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_session_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_session_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_session_handle();
  public native void set_allocated_session_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_session_handle();
  public native void unsafe_arena_set_allocated_session_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);

  // bool create_worker_session_called = 3;
  public native void clear_create_worker_session_called();
  @MemberGetter public static native int kCreateWorkerSessionCalledFieldNumber();
  public static final int kCreateWorkerSessionCalledFieldNumber = kCreateWorkerSessionCalledFieldNumber();
  public native @Cast("bool") boolean create_worker_session_called();
  public native void set_create_worker_session_called(@Cast("bool") boolean value);
}
