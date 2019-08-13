// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA function attributes
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaFuncAttributes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaFuncAttributes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaFuncAttributes(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaFuncAttributes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaFuncAttributes position(long position) {
        return (cudaFuncAttributes)super.position(position);
    }

   /**
    * The size in bytes of statically-allocated shared memory per block
    * required by this function. This does not include dynamically-allocated
    * shared memory requested by the user at runtime.
    */
   public native @Cast("size_t") long sharedSizeBytes(); public native cudaFuncAttributes sharedSizeBytes(long setter);

   /**
    * The size in bytes of user-allocated constant memory required by this
    * function.
    */
   public native @Cast("size_t") long constSizeBytes(); public native cudaFuncAttributes constSizeBytes(long setter);

   /**
    * The size in bytes of local memory used by each thread of this function.
    */
   public native @Cast("size_t") long localSizeBytes(); public native cudaFuncAttributes localSizeBytes(long setter);

   /**
    * The maximum number of threads per block, beyond which a launch of the
    * function would fail. This number depends on both the function and the
    * device on which the function is currently loaded.
    */
   public native int maxThreadsPerBlock(); public native cudaFuncAttributes maxThreadsPerBlock(int setter);

   /**
    * The number of registers used by each thread of this function.
    */
   public native int numRegs(); public native cudaFuncAttributes numRegs(int setter);

   /**
    * The PTX virtual architecture version for which the function was
    * compiled. This value is the major PTX version * 10 + the minor PTX
    * version, so a PTX version 1.3 function would return the value 13.
    */
   public native int ptxVersion(); public native cudaFuncAttributes ptxVersion(int setter);

   /**
    * The binary architecture version for which the function was compiled.
    * This value is the major binary version * 10 + the minor binary version,
    * so a binary version 1.3 function would return the value 13.
    */
   public native int binaryVersion(); public native cudaFuncAttributes binaryVersion(int setter);

   /**
    * The attribute to indicate whether the function has been compiled with 
    * user specified option "-Xptxas --dlcm=ca" set.
    */
   public native int cacheModeCA(); public native cudaFuncAttributes cacheModeCA(int setter);

   /**
    * The maximum size in bytes of dynamic shared memory per block for 
    * this function. Any launch must have a dynamic shared memory size
    * smaller than this value.
    */
   public native int maxDynamicSharedSizeBytes(); public native cudaFuncAttributes maxDynamicSharedSizeBytes(int setter);

   /**
    * On devices where the L1 cache and shared memory use the same hardware resources, 
    * this sets the shared memory carveout preference, in percent of the maximum shared memory. 
    * Refer to ::cudaDevAttrMaxSharedMemoryPerMultiprocessor.
    * This is only a hint, and the driver can choose a different ratio if required to execute the function.
    * See ::cudaFuncSetAttribute
    */
   public native int preferredShmemCarveout(); public native cudaFuncAttributes preferredShmemCarveout(int setter);
}
