// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A class for wrapping an Intel(R) MKL-DNN handle. It is used as the base
 *  class for primitive (#mkldnn_primitive_t), engine (#mkldnn_engine_t), and
 *  stream (#mkldnn_stream_t) handles. An object of the #mkldnn::handle class
 *  can be passed by value. This class enables wrapping:
 *   - Newly constructed handles.
 *     \n In this case, the constructed handle uses reference counting provided
 *     by \p std::shared_ptr with a proper deleter function specified through
 *     the \p handle_traits class.
 *   - Pre-existing handles returned by the Intel(R) MKL-DNN C API (for
 *     example, through #mkldnn_primitive_get_output()).
 *     \n In this case, an Intel(R) MKL-DNN C API handle is wrapped without a
 *     deleter because it is assumed that the handle wrapper for the original
 *     object deletes the handle (this model is similar to \p std::weak_ptr). */
@Name("mkldnn::handle<mkldnn_engine_t>") @NoOffset @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_engine_handle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_engine_handle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_engine_handle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public mkldnn_engine_handle position(long position) {
        return (mkldnn_engine_handle)super.position(position);
    }

    /** Constructs a C handle wrapper.
     *  @param t The C handle to wrap.
     *  @param weak A flag to specify whether to construct a weak wrapper. */
    public mkldnn_engine_handle(mkldnn_engine t/*=0*/, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
    private native void allocate(mkldnn_engine t/*=0*/, @Cast("bool") boolean weak/*=false*/);
    public mkldnn_engine_handle() { super((Pointer)null); allocate(); }
    private native void allocate();

    public mkldnn_engine_handle(@Const @ByRef mkldnn_engine_handle other) { super((Pointer)null); allocate(other); }
    private native void allocate(@Const @ByRef mkldnn_engine_handle other);
    public native @ByRef @Name("operator =") mkldnn_engine_handle put(@Const @ByRef mkldnn_engine_handle other);
    /** Resets the value of a C handle.
     *  @param t The new value of the C handle.
     *  @param weak A flag to specify whether the wrapper should be weak. */
    public native void reset(mkldnn_engine t, @Cast("bool") boolean weak/*=false*/);
    public native void reset(mkldnn_engine t);

    /** Returns the value of the underlying C handle. */
    public native mkldnn_engine get();

    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef mkldnn_engine_handle other);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef mkldnn_engine_handle other);
}
