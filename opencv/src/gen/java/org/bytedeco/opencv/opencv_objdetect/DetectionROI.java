// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_objdetect;

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
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_objdetect.*;


//////////////// HOG (Histogram-of-Oriented-Gradients) Descriptor and Object Detector //////////////

/** struct for detection region of interest (ROI) */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class DetectionROI extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DetectionROI() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectionROI(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionROI(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DetectionROI position(long position) {
        return (DetectionROI)super.position(position);
    }

   /** scale(size) of the bounding box */
   public native double scale(); public native DetectionROI scale(double setter);
   /** set of requested locations to be evaluated */
   public native @ByRef PointVector locations(); public native DetectionROI locations(PointVector setter);
   /** vector that will contain confidence values for each location */
   public native @StdVector DoublePointer confidences(); public native DetectionROI confidences(DoublePointer setter);
}
