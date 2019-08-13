// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class VerifierConfig extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VerifierConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VerifierConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public VerifierConfig position(long position) {
        return (VerifierConfig)super.position(position);
    }

  public VerifierConfig() { super((Pointer)null); allocate(); }
  private native void allocate();

  public VerifierConfig(@Const @ByRef VerifierConfig from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef VerifierConfig from);

  public native @ByRef @Name("operator =") VerifierConfig put(@Const @ByRef VerifierConfig from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef VerifierConfig default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const VerifierConfig internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(VerifierConfig other);
  public native void Swap(VerifierConfig other);
  

  // implements Message ----------------------------------------------

  public native VerifierConfig New();

  public native VerifierConfig New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef VerifierConfig from);
  public native void MergeFrom(@Const @ByRef VerifierConfig from);
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
  @MemberGetter public static native @Cast("const tensorflow::VerifierConfig::Toggle") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const tensorflow::VerifierConfig::Toggle") int ON();
  public static final int ON = ON();
  @MemberGetter public static native @Cast("const tensorflow::VerifierConfig::Toggle") int OFF();
  public static final int OFF = OFF();
  public static native @Cast("bool") boolean Toggle_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::VerifierConfig::Toggle") int Toggle_MIN();
  public static final int Toggle_MIN = Toggle_MIN();
  @MemberGetter public static native @Cast("const tensorflow::VerifierConfig::Toggle") int Toggle_MAX();
  public static final int Toggle_MAX = Toggle_MAX();
  @MemberGetter public static native int Toggle_ARRAYSIZE();
  public static final int Toggle_ARRAYSIZE = Toggle_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer Toggle_descriptor();
  public static native @StdString BytePointer Toggle_Name(@Cast("tensorflow::VerifierConfig::Toggle") int value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString BytePointer name,
        @Cast("tensorflow::VerifierConfig::Toggle*") IntPointer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString String name,
        @Cast("tensorflow::VerifierConfig::Toggle*") IntBuffer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString BytePointer name,
        @Cast("tensorflow::VerifierConfig::Toggle*") int... value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString String name,
        @Cast("tensorflow::VerifierConfig::Toggle*") IntPointer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString BytePointer name,
        @Cast("tensorflow::VerifierConfig::Toggle*") IntBuffer value);
  public static native @Cast("bool") boolean Toggle_Parse(@StdString String name,
        @Cast("tensorflow::VerifierConfig::Toggle*") int... value);

  // accessors -------------------------------------------------------

  // int64 verification_timeout_in_ms = 1;
  public native void clear_verification_timeout_in_ms();
  @MemberGetter public static native int kVerificationTimeoutInMsFieldNumber();
  public static final int kVerificationTimeoutInMsFieldNumber = kVerificationTimeoutInMsFieldNumber();
  public native @Cast("google::protobuf::int64") long verification_timeout_in_ms();
  public native void set_verification_timeout_in_ms(@Cast("google::protobuf::int64") long value);

  // .tensorflow.VerifierConfig.Toggle structure_verifier = 2;
  public native void clear_structure_verifier();
  @MemberGetter public static native int kStructureVerifierFieldNumber();
  public static final int kStructureVerifierFieldNumber = kStructureVerifierFieldNumber();
  public native @Cast("tensorflow::VerifierConfig_Toggle") int structure_verifier();
  public native void set_structure_verifier(@Cast("tensorflow::VerifierConfig_Toggle") int value);
}
