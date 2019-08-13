// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResetRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResetRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ResetRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ResetRequest position(long position) {
        return (ResetRequest)super.position(position);
    }

  public ResetRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ResetRequest(@Const @ByRef ResetRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ResetRequest from);

  public native @ByRef @Name("operator =") ResetRequest put(@Const @ByRef ResetRequest from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef ResetRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ResetRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ResetRequest other);
  public native void Swap(ResetRequest other);
  

  // implements Message ----------------------------------------------

  public native ResetRequest New();

  public native ResetRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ResetRequest from);
  public native void MergeFrom(@Const @ByRef ResetRequest from);
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

  // repeated string container = 1;
  public native int container_size();
  public native void clear_container();
  @MemberGetter public static native int kContainerFieldNumber();
  public static final int kContainerFieldNumber = kContainerFieldNumber();
  public native @StdString BytePointer container(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_container(int index);
  public native void set_container(int index, @StdString BytePointer value);
  public native void set_container(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_container(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_container(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_container();
  public native void add_container(@StdString BytePointer value);
  public native void add_container(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_container(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_container(String value, @Cast("size_t") long size);

  // repeated string device_filters = 2;
  public native int device_filters_size();
  public native void clear_device_filters();
  @MemberGetter public static native int kDeviceFiltersFieldNumber();
  public static final int kDeviceFiltersFieldNumber = kDeviceFiltersFieldNumber();
  public native @StdString BytePointer device_filters(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device_filters(int index);
  public native void set_device_filters(int index, @StdString BytePointer value);
  public native void set_device_filters(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_device_filters(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device_filters(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_device_filters();
  public native void add_device_filters(@StdString BytePointer value);
  public native void add_device_filters(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_device_filters(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_device_filters(String value, @Cast("size_t") long size);
}
