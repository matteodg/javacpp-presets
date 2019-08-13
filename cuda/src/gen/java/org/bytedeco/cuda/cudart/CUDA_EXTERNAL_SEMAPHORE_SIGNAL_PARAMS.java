// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * External semaphore signal parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS position(long position) {
        return (CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS)super.position(position);
    }

        /**
         * Parameters for fence objects
         */
            /**
             * Value of fence to be signaled
             */
            @Name("params.fence.value") public native @Cast("unsigned long long") long params_fence_value(); public native CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS params_fence_value(long setter);
        @Name("params.reserved") public native @Cast("unsigned int") int params_reserved(int i); public native CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS params_reserved(int i, int setter);
        @Name("params.reserved") @MemberGetter public native @Cast("unsigned int*") IntPointer params_reserved();
    /**
     * Flags reserved for the future. Must be zero.
     */
    public native @Cast("unsigned int") int flags(); public native CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS flags(int setter);
    public native @Cast("unsigned int") int reserved(int i); public native CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}
