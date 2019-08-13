// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxInitBackendFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxInitBackendFunction(Pointer p) { super(p); }
    protected onnxInitBackendFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxBackendID backendID,
    @Cast("const uint64_t*") IntPointer auxPropertiesList,
    @ByPtrPtr onnxBackend backend);
}
