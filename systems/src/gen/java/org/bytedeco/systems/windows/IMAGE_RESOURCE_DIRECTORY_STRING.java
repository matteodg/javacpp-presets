// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// For resource directory entries that have actual string names, the Name
// field of the directory entry points to an object of the following type.
// All of these string objects are stored together after the last resource
// directory entry and before the first resource data object.  This minimizes
// the impact of these variable length objects on the alignment of the fixed
// size directory entry objects.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_RESOURCE_DIRECTORY_STRING extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_RESOURCE_DIRECTORY_STRING() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_RESOURCE_DIRECTORY_STRING(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_RESOURCE_DIRECTORY_STRING(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_RESOURCE_DIRECTORY_STRING position(long position) {
        return (IMAGE_RESOURCE_DIRECTORY_STRING)super.position(position);
    }

    public native @Cast("WORD") short Length(); public native IMAGE_RESOURCE_DIRECTORY_STRING Length(short setter);
    public native @Cast("CHAR") byte NameString(int i); public native IMAGE_RESOURCE_DIRECTORY_STRING NameString(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer NameString();
}
