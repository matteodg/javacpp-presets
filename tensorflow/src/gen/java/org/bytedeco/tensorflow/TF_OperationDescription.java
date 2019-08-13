// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_OperationDescription extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_OperationDescription(Pointer p) { super(p); }

  public TF_OperationDescription(TF_Graph g, @Cast("const char*") BytePointer op_type,
                            @Cast("const char*") BytePointer node_name) { super((Pointer)null); allocate(g, op_type, node_name); }
  private native void allocate(TF_Graph g, @Cast("const char*") BytePointer op_type,
                            @Cast("const char*") BytePointer node_name);
  public TF_OperationDescription(TF_Graph g, String op_type,
                            String node_name) { super((Pointer)null); allocate(g, op_type, node_name); }
  private native void allocate(TF_Graph g, String op_type,
                            String node_name);

  public native @ByRef NodeBuilder node_builder(); public native TF_OperationDescription node_builder(NodeBuilder setter);
  public native TF_Graph graph(); public native TF_OperationDescription graph(TF_Graph setter);
  public native @ByRef StringSet colocation_constraints(); public native TF_OperationDescription colocation_constraints(StringSet setter);
}
