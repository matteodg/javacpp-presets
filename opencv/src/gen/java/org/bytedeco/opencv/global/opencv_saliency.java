// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_saliency.*;

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

public class opencv_saliency extends org.bytedeco.opencv.presets.opencv_saliency {
    static { Loader.load(); }

// Parsed from <opencv2/saliency.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
 //
 //  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
 //
 //  By downloading, copying, installing or using the software you agree to this license.
 //  If you do not agree to this license, do not download, install,
 //  copy or use the software.
 //
 //
 //                           License Agreement
 //                For Open Source Computer Vision Library
 //
 // Copyright (C) 2014, OpenCV Foundation, all rights reserved.
 // Third party copyrights are property of their respective owners.
 //
 // Redistribution and use in source and binary forms, with or without modification,
 // are permitted provided that the following conditions are met:
 //
 //   * Redistribution's of source code must retain the above copyright notice,
 //     this list of conditions and the following disclaimer.
 //
 //   * Redistribution's in binary form must reproduce the above copyright notice,
 //     this list of conditions and the following disclaimer in the documentation
 //     and/or other materials provided with the distribution.
 //
 //   * The name of the copyright holders may not be used to endorse or promote products
 //     derived from this software without specific prior written permission.
 //
 // This software is provided by the copyright holders and contributors "as is" and
 // any express or implied warranties, including, but not limited to, the implied
 // warranties of merchantability and fitness for a particular purpose are disclaimed.
 // In no event shall the Intel Corporation or contributors be liable for any direct,
 // indirect, incidental, special, exemplary, or consequential damages
 // (including, but not limited to, procurement of substitute goods or services;
 // loss of use, data, or profits; or business interruption) however caused
 // and on any theory of liability, whether in contract, strict liability,
 // or tort (including negligence or otherwise) arising in any way out of
 // the use of this software, even if advised of the possibility of such damage.
 //
 //M*/

// #ifndef __OPENCV_SALIENCY_HPP__
// #define __OPENCV_SALIENCY_HPP__

// #include "opencv2/saliency/saliencyBaseClasses.hpp"
// #include "opencv2/saliency/saliencySpecializedClasses.hpp"

/** \defgroup saliency Saliency API
<p>
Many computer vision applications may benefit from understanding where humans focus given a scene.
Other than cognitively understanding the way human perceive images and scenes, finding salient
regions and objects in the images helps various tasks such as speeding up object detection, object
recognition, object tracking and content-aware image editing.
<p>
About the saliency, there is a rich literature but the development is very fragmented. The principal
purpose of this API is to give a unique interface, a unique framework for use and plug sever
saliency algorithms, also with very different nature and methodology, but they share the same
purpose, organizing algorithms into three main categories:
<p>
**Static Saliency**: algorithms belonging to this category, exploit different image features that
allow to detect salient objects in a non dynamic scenarios.
<p>
**Motion Saliency**: algorithms belonging to this category, are particularly focused to detect
salient objects over time (hence also over frame), then there is a temporal component sealing
cosider that allows to detect "moving" objects as salient, meaning therefore also the more general
sense of detection the changes in the scene.
<p>
**Objectness**: Objectness is usually represented as a value which reflects how likely an image
window covers an object of any category. Algorithms belonging to this category, avoid making
decisions early on, by proposing a small number of category-independent proposals, that are expected
to cover all objects in an image. Being able to perceive objects before identifying them is closely
related to bottom up visual attention (saliency).
<p>
![Saliency diagram](pics/saliency.png)
<p>
To see how API works, try tracker demo:
<https://github.com/fpuja/opencv_contrib/blob/saliencyModuleDevelop/modules/saliency/samples/computeSaliency.cpp>
<p>
\note This API has been designed with PlantUML. If you modify this API please change UML.
<p>
*/

// #endif //__OPENCV_SALIENCY_HPP__


// Parsed from <opencv2/saliency/saliencyBaseClasses.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
 //
 //  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
 //
 //  By downloading, copying, installing or using the software you agree to this license.
 //  If you do not agree to this license, do not download, install,
 //  copy or use the software.
 //
 //
 //                           License Agreement
 //                For Open Source Computer Vision Library
 //
 // Copyright (C) 2014, OpenCV Foundation, all rights reserved.
 // Third party copyrights are property of their respective owners.
 //
 // Redistribution and use in source and binary forms, with or without modification,
 // are permitted provided that the following conditions are met:
 //
 //   * Redistribution's of source code must retain the above copyright notice,
 //     this list of conditions and the following disclaimer.
 //
 //   * Redistribution's in binary form must reproduce the above copyright notice,
 //     this list of conditions and the following disclaimer in the documentation
 //     and/or other materials provided with the distribution.
 //
 //   * The name of the copyright holders may not be used to endorse or promote products
 //     derived from this software without specific prior written permission.
 //
 // This software is provided by the copyright holders and contributors "as is" and
 // any express or implied warranties, including, but not limited to, the implied
 // warranties of merchantability and fitness for a particular purpose are disclaimed.
 // In no event shall the Intel Corporation or contributors be liable for any direct,
 // indirect, incidental, special, exemplary, or consequential damages
 // (including, but not limited to, procurement of substitute goods or services;
 // loss of use, data, or profits; or business interruption) however caused
 // and on any theory of liability, whether in contract, strict liability,
 // or tort (including negligence or otherwise) arising in any way out of
 // the use of this software, even if advised of the possibility of such damage.
 //
 //M*/

// #ifndef __OPENCV_SALIENCY_BASE_CLASSES_HPP__
// #define __OPENCV_SALIENCY_BASE_CLASSES_HPP__

// #include "opencv2/core.hpp"
// #include <opencv2/core/persistence.hpp>
// #include "opencv2/imgproc.hpp"
// #include <iostream>
// #include <sstream>
// #include <complex>
// Targeting ../opencv_saliency/Saliency.java


// Targeting ../opencv_saliency/StaticSaliency.java


// Targeting ../opencv_saliency/MotionSaliency.java


// Targeting ../opencv_saliency/Objectness.java



/** \} */

 /* namespace saliency */
 /* namespace cv */

// #endif


// Parsed from <opencv2/saliency/saliencySpecializedClasses.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
 //
 //  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
 //
 //  By downloading, copying, installing or using the software you agree to this license.
 //  If you do not agree to this license, do not download, install,
 //  copy or use the software.
 //
 //
 //                           License Agreement
 //                For Open Source Computer Vision Library
 //
 // Copyright (C) 2014, OpenCV Foundation, all rights reserved.
 // Third party copyrights are property of their respective owners.
 //
 // Redistribution and use in source and binary forms, with or without modification,
 // are permitted provided that the following conditions are met:
 //
 //   * Redistribution's of source code must retain the above copyright notice,
 //     this list of conditions and the following disclaimer.
 //
 //   * Redistribution's in binary form must reproduce the above copyright notice,
 //     this list of conditions and the following disclaimer in the documentation
 //     and/or other materials provided with the distribution.
 //
 //   * The name of the copyright holders may not be used to endorse or promote products
 //     derived from this software without specific prior written permission.
 //
 // This software is provided by the copyright holders and contributors "as is" and
 // any express or implied warranties, including, but not limited to, the implied
 // warranties of merchantability and fitness for a particular purpose are disclaimed.
 // In no event shall the Intel Corporation or contributors be liable for any direct,
 // indirect, incidental, special, exemplary, or consequential damages
 // (including, but not limited to, procurement of substitute goods or services;
 // loss of use, data, or profits; or business interruption) however caused
 // and on any theory of liability, whether in contract, strict liability,
 // or tort (including negligence or otherwise) arising in any way out of
 // the use of this software, even if advised of the possibility of such damage.
 //
 //M*/

// #ifndef __OPENCV_SALIENCY_SPECIALIZED_CLASSES_HPP__
// #define __OPENCV_SALIENCY_SPECIALIZED_CLASSES_HPP__

// #include <cstdio>
// #include <string>
// #include <iostream>
// #include <stdint.h>
// #include "saliencyBaseClasses.hpp"
// #include "opencv2/core.hpp"
// Targeting ../opencv_saliency/StaticSaliencySpectralResidual.java


// Targeting ../opencv_saliency/StaticSaliencyFineGrained.java


// Targeting ../opencv_saliency/MotionSaliencyBinWangApr2014.java


// Targeting ../opencv_saliency/ObjectnessBING.java



/** \} */


/* namespace saliency */
 /* namespace cv */

// #endif


}
