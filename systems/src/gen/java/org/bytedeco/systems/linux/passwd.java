// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;

// # endif
// #endif

/* The passwd structure.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class passwd extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public passwd() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public passwd(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public passwd(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public passwd position(long position) {
        return (passwd)super.position(position);
    }

  public native @Cast("char*") BytePointer pw_name(); public native passwd pw_name(BytePointer setter);		/* Username.  */
  public native @Cast("char*") BytePointer pw_passwd(); public native passwd pw_passwd(BytePointer setter);		/* Password.  */
  public native @Cast("__uid_t") int pw_uid(); public native passwd pw_uid(int setter);		/* User ID.  */
  public native @Cast("__gid_t") int pw_gid(); public native passwd pw_gid(int setter);		/* Group ID.  */
  public native @Cast("char*") BytePointer pw_gecos(); public native passwd pw_gecos(BytePointer setter);		/* Real name.  */
  public native @Cast("char*") BytePointer pw_dir(); public native passwd pw_dir(BytePointer setter);			/* Home directory.  */
  public native @Cast("char*") BytePointer pw_shell(); public native passwd pw_shell(BytePointer setter);		/* Shell program.  */
}
