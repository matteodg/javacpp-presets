// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA 3D memory copying parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemcpy3DParms extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemcpy3DParms() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemcpy3DParms(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemcpy3DParms(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemcpy3DParms position(long position) {
        return (cudaMemcpy3DParms)super.position(position);
    }

    /** Source memory address */
    public native cudaArray srcArray(); public native cudaMemcpy3DParms srcArray(cudaArray setter);
    /** Source position offset */
    public native @ByRef cudaPos srcPos(); public native cudaMemcpy3DParms srcPos(cudaPos setter);
    /** Pitched source memory address */
    public native @ByRef cudaPitchedPtr srcPtr(); public native cudaMemcpy3DParms srcPtr(cudaPitchedPtr setter);
  
    /** Destination memory address */
    public native cudaArray dstArray(); public native cudaMemcpy3DParms dstArray(cudaArray setter);
    /** Destination position offset */
    public native @ByRef cudaPos dstPos(); public native cudaMemcpy3DParms dstPos(cudaPos setter);
    /** Pitched destination memory address */
    public native @ByRef cudaPitchedPtr dstPtr(); public native cudaMemcpy3DParms dstPtr(cudaPitchedPtr setter);
  
    /** Requested memory copy size */
    public native @ByRef cudaExtent extent(); public native cudaMemcpy3DParms extent(cudaExtent setter);
    /** Type of transfer */
    public native @Cast("cudaMemcpyKind") int kind(); public native cudaMemcpy3DParms kind(int setter);
}
