// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A class for handling async execution (see TFE_ContextSetAsync).
// Note that this class is thread-safe.
// TODO(agarwal): TFE_OpAddInput may currently block if it tries to access the
// device of the input handle. Fix that.
// TODO(agarwal): On error, mark all affected handles as corrupted.
// TODO(agarwal): Implement support for control dependencies.
// TODO(agarwal): Support out-of-order execution and dispatching multiple
// EagerNode in parallel.
// TODO(agarwal): Implement optimizations over EagerNode traces.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EagerExecutor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EagerExecutor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EagerExecutor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EagerExecutor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EagerExecutor position(long position) {
        return (EagerExecutor)super.position(position);
    }


  // This is called whenever async mode is enabled. Note that it may be called
  // multiple times as different calling threads may switch async mode on or off
  // independently.
  public native void EnableAsync();

  // Helper function to create monotonically increasing ids unique to this
  // object.
  public native @Cast("tensorflow::uint64") long NextId();

  // Schedules `node` for execution.
  // Note that Add must be called in monotonically increasing order of node->id.
  public native void Add(EagerNode node);

  // Causes the caller to block till node with id `node_id` has finished
  // execution.
  public native @ByVal Status WaitFor(@Cast("tensorflow::uint64") long node_id);

  // Blocks till all currently pending ops are done.
  public native @ByVal Status WaitForAllPendingNodes();

  // Clears all currently set errors which re-enables async execution.
  public native void ClearError();

  // Returns Status based on any errors that occurred during async execution.
  public native @ByVal Status status();
}
