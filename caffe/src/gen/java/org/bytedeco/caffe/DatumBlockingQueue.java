// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


@Name("caffe::BlockingQueue<caffe::Datum*>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DatumBlockingQueue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DatumBlockingQueue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DatumBlockingQueue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DatumBlockingQueue position(long position) {
        return (DatumBlockingQueue)super.position(position);
    }

  public DatumBlockingQueue() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native void push(@ByPtrRef Datum t);

  public native @Cast("bool") boolean try_pop(@Cast("caffe::Datum**") PointerPointer t);
  public native @Cast("bool") boolean try_pop(@ByPtrPtr Datum t);

  // This logs a message if the threads needs to be blocked
  // useful for detecting e.g. when data feeding is too slow
  public native Datum pop(@StdString BytePointer log_on_wait/*=""*/);
  public native Datum pop();
  public native Datum pop(@StdString String log_on_wait/*=""*/);

  public native @Cast("bool") boolean try_peek(@Cast("caffe::Datum**") PointerPointer t);
  public native @Cast("bool") boolean try_peek(@ByPtrPtr Datum t);

  // Return element without removing it
  public native Datum peek();

  public native @Cast("size_t") long size();
}
