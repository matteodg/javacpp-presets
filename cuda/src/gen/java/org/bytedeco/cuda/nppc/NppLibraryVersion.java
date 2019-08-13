// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppLibraryVersion extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppLibraryVersion() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppLibraryVersion(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppLibraryVersion(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppLibraryVersion position(long position) {
        return (NppLibraryVersion)super.position(position);
    }

    /**  Major version number */
    public native int major(); public native NppLibraryVersion major(int setter);
    /**  Minor version number */
    public native int minor(); public native NppLibraryVersion minor(int setter);
    /**  Build number. This reflects the nightly build this release was made from. */
    public native int build(); public native NppLibraryVersion build(int setter);
}
