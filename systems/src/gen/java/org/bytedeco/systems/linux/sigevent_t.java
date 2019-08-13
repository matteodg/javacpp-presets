// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;

// # else
// # endif

@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class sigevent_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigevent_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigevent_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigevent_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigevent_t position(long position) {
        return (sigevent_t)super.position(position);
    }

    public native @ByRef sigval sigev_value(); public native sigevent_t sigev_value(sigval setter);
    public native int sigev_signo(); public native sigevent_t sigev_signo(int setter);
    public native int sigev_notify(); public native sigevent_t sigev_notify(int setter);

	@Name("_sigev_un._pad") public native int _sigev_un__pad(int i); public native sigevent_t _sigev_un__pad(int i, int setter);
	@Name("_sigev_un._pad") @MemberGetter public native @Cast("int*") IntPointer _sigev_un__pad();

	/* When SIGEV_SIGNAL and SIGEV_THREAD_ID set, LWP ID of the
	   thread to receive the signal.  */
	@Name("_sigev_un._tid") public native @Cast("__pid_t") int _sigev_un__tid(); public native sigevent_t _sigev_un__tid(int setter);

	    public static class _function_sigval extends FunctionPointer {
	        static { Loader.load(); }
	        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	        public    _function_sigval(Pointer p) { super(p); }
	        protected _function_sigval() { allocate(); }
	        private native void allocate();
	        public native void call(@ByVal sigval arg0);
	    }
	    @Name("_sigev_un._sigev_thread._function") public native _function_sigval _sigev_un__sigev_thread__function(); public native sigevent_t _sigev_un__sigev_thread__function(_function_sigval setter);	/* Function to start.  */
	    @Name("_sigev_un._sigev_thread._attribute") public native Pointer _sigev_un__sigev_thread__attribute(); public native sigevent_t _sigev_un__sigev_thread__attribute(Pointer setter);			/* Really pthread_attr_t.  */
  }
