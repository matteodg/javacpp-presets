// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A descriptor of a shuffle operation. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_shuffle_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_shuffle_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_shuffle_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_shuffle_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_shuffle_desc_t position(long position) {
        return (mkldnn_shuffle_desc_t)super.position(position);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     * descriptor. Must be #mkldnn_convolution. */
    public native @Cast("mkldnn_primitive_kind_t") int primitive_kind(); public native mkldnn_shuffle_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #mkldnn_forward_training,
     * #mkldnn_forward_inference, and #mkldnn_backward_data. */
    public native @Cast("mkldnn_prop_kind_t") int prop_kind(); public native mkldnn_shuffle_desc_t prop_kind(int setter);
    /** Source and destination memory descriptor,
     *  and source and destination gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t data_desc(); public native mkldnn_shuffle_desc_t data_desc(mkldnn_memory_desc_t setter);
    /** axis for shuffling. */
    public native int axis(); public native mkldnn_shuffle_desc_t axis(int setter);
    /** number of groups in group convolution */
    public native int group_size(); public native mkldnn_shuffle_desc_t group_size(int setter);
}
