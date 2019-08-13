// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class GraphProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GraphProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GraphProto position(long position) {
        return (GraphProto)super.position(position);
    }

  public GraphProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public GraphProto(@Const @ByRef GraphProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef GraphProto from);

  public native @ByRef @Name("operator =") GraphProto put(@Const @ByRef GraphProto from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef GraphProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const GraphProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(GraphProto other);
  

  // implements Message ----------------------------------------------

  public native GraphProto New();

  public native GraphProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef GraphProto from);
  public native void MergeFrom(@Const @ByRef GraphProto from);
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

  // repeated .onnx.NodeProto node = 1;
  public native int node_size();
  public native void clear_node();
  @MemberGetter public static native int kNodeFieldNumber();
  public static final int kNodeFieldNumber = kNodeFieldNumber();
  public native NodeProto mutable_node(int index);
  public native @Const @ByRef NodeProto node(int index);
  public native NodeProto add_node();

  // repeated .onnx.TensorProto initializer = 5;
  public native int initializer_size();
  public native void clear_initializer();
  @MemberGetter public static native int kInitializerFieldNumber();
  public static final int kInitializerFieldNumber = kInitializerFieldNumber();
  public native TensorProto mutable_initializer(int index);
  public native @Const @ByRef TensorProto initializer(int index);
  public native TensorProto add_initializer();

  // repeated .onnx.ValueInfoProto input = 11;
  public native int input_size();
  public native void clear_input();
  @MemberGetter public static native int kInputFieldNumber();
  public static final int kInputFieldNumber = kInputFieldNumber();
  public native ValueInfoProto mutable_input(int index);
  public native @Const @ByRef ValueInfoProto input(int index);
  public native ValueInfoProto add_input();

  // repeated .onnx.ValueInfoProto output = 12;
  public native int output_size();
  public native void clear_output();
  @MemberGetter public static native int kOutputFieldNumber();
  public static final int kOutputFieldNumber = kOutputFieldNumber();
  public native ValueInfoProto mutable_output(int index);
  public native @Const @ByRef ValueInfoProto output(int index);
  public native ValueInfoProto add_output();

  // repeated .onnx.ValueInfoProto value_info = 13;
  public native int value_info_size();
  public native void clear_value_info();
  @MemberGetter public static native int kValueInfoFieldNumber();
  public static final int kValueInfoFieldNumber = kValueInfoFieldNumber();
  public native ValueInfoProto mutable_value_info(int index);
  public native @Const @ByRef ValueInfoProto value_info(int index);
  public native ValueInfoProto add_value_info();

  // repeated .onnx.TensorAnnotation quantization_annotation = 14;
  public native int quantization_annotation_size();
  public native void clear_quantization_annotation();
  @MemberGetter public static native int kQuantizationAnnotationFieldNumber();
  public static final int kQuantizationAnnotationFieldNumber = kQuantizationAnnotationFieldNumber();
  public native TensorAnnotation mutable_quantization_annotation(int index);
  public native @Const @ByRef TensorAnnotation quantization_annotation(int index);
  public native TensorAnnotation add_quantization_annotation();

  // optional string name = 2;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional string doc_string = 10;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  @MemberGetter public static native int kDocStringFieldNumber();
  public static final int kDocStringFieldNumber = kDocStringFieldNumber();
  public native @StdString BytePointer doc_string();
  public native void set_doc_string(@StdString BytePointer value);
  public native void set_doc_string(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_doc_string(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_doc_string(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);
}
