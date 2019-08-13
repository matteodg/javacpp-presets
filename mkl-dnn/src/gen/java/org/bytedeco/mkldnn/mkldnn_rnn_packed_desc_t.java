// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** Description of tensor of packed weights for rnn. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_rnn_packed_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_rnn_packed_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_rnn_packed_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_rnn_packed_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_rnn_packed_desc_t position(long position) {
        return (mkldnn_rnn_packed_desc_t)super.position(position);
    }

    public native @Cast("mkldnn_rnn_packed_memory_format_t") int format(); public native mkldnn_rnn_packed_desc_t format(int setter);
    public native int n_parts(); public native mkldnn_rnn_packed_desc_t n_parts(int setter);
    public native int n(); public native mkldnn_rnn_packed_desc_t n(int setter);
    public native int parts(int i); public native mkldnn_rnn_packed_desc_t parts(int i, int setter);
    @MemberGetter public native IntPointer parts();
    public native @Cast("size_t") long part_pack_size(int i); public native mkldnn_rnn_packed_desc_t part_pack_size(int i, long setter);
    @MemberGetter public native @Cast("size_t*") SizeTPointer part_pack_size();
    public native @Cast("size_t") long offset_compensation(); public native mkldnn_rnn_packed_desc_t offset_compensation(long setter);
    public native @Cast("size_t") long size(); public native mkldnn_rnn_packed_desc_t size(long setter);
}
