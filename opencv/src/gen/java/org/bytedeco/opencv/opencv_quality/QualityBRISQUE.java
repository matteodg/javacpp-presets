// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_quality;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_quality.*;


/**
\brief BRISQUE (Blind/Referenceless Image Spatial Quality Evaluator) is a No Reference Image Quality Assessment (NR-IQA) algorithm.
<p>
BRISQUE computes a score based on extracting Natural Scene Statistics (https://en.wikipedia.org/wiki/Scene_statistics)
and calculating feature vectors. See Mittal et al. \cite Mittal2 for original paper and original implementation \cite Mittal2_software .
<p>
A trained model is provided in the /samples/ directory and is trained on the LIVE-R2 database \cite Sheikh as in the original implementation.
When evaluated against the TID2008 database \cite Ponomarenko , the SROCC is -0.8424 versus the SROCC of -0.8354 in the original implementation.
C++ code for the BRISQUE LIVE-R2 trainer and TID2008 evaluator are also provided in the /samples/ directory.
*/
@Namespace("cv::quality") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_quality.class)
public class QualityBRISQUE extends QualityBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualityBRISQUE(Pointer p) { super(p); }


    /** \brief Computes BRISQUE quality score for input image
    @param img Image for which to compute quality
    @return cv::Scalar with the score in the first element.  The score ranges from 0 (best quality) to 100 (worst quality)
    */
    public native @ByVal @Override Scalar compute( @ByVal Mat img );
    public native @ByVal @Override Scalar compute( @ByVal UMat img );
    public native @ByVal @Override Scalar compute( @ByVal GpuMat img );

    /**
    \brief Create an object which calculates quality
    @param model_file_path cv::String which contains a path to the BRISQUE model data, eg. /path/to/brisque_model_live.yml
    @param range_file_path cv::String which contains a path to the BRISQUE range data, eg. /path/to/brisque_range_live.yml
    */
    public static native @Ptr QualityBRISQUE create( @Str BytePointer model_file_path, @Str BytePointer range_file_path );
    public static native @Ptr QualityBRISQUE create( @Str String model_file_path, @Str String range_file_path );

    /**
    \brief Create an object which calculates quality
    @param model cv::Ptr<cv::ml::SVM> which contains a loaded BRISQUE model
    @param range cv::Mat which contains BRISQUE range data
    */
    public static native @Ptr QualityBRISQUE create( @Ptr SVM model, @Const @ByRef Mat range );

    /**
    \brief static method for computing quality
    @param img image for which to compute quality
    @param model_file_path cv::String which contains a path to the BRISQUE model data, eg. /path/to/brisque_model_live.yml
    @param range_file_path cv::String which contains a path to the BRISQUE range data, eg. /path/to/brisque_range_live.yml
    @return cv::Scalar with the score in the first element.  The score ranges from 0 (best quality) to 100 (worst quality)
    */
    public static native @ByVal Scalar compute( @ByVal Mat img, @Str BytePointer model_file_path, @Str BytePointer range_file_path );
    public static native @ByVal Scalar compute( @ByVal Mat img, @Str String model_file_path, @Str String range_file_path );
    public static native @ByVal Scalar compute( @ByVal UMat img, @Str String model_file_path, @Str String range_file_path );
    public static native @ByVal Scalar compute( @ByVal UMat img, @Str BytePointer model_file_path, @Str BytePointer range_file_path );
    public static native @ByVal Scalar compute( @ByVal GpuMat img, @Str BytePointer model_file_path, @Str BytePointer range_file_path );
    public static native @ByVal Scalar compute( @ByVal GpuMat img, @Str String model_file_path, @Str String range_file_path );

    /**
    \brief static method for computing image features used by the BRISQUE algorithm
    @param img image (BGR(A) or grayscale) for which to compute features
    @param features output row vector of features to cv::Mat or cv::UMat
    */
    public static native void computeFeatures(@ByVal Mat img, @ByVal Mat features);
    public static native void computeFeatures(@ByVal UMat img, @ByVal UMat features);
    public static native void computeFeatures(@ByVal GpuMat img, @ByVal GpuMat features);

}
