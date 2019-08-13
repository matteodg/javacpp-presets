// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IDeconvolutionLayer
 * 
 *  \brief A deconvolution layer in a network definition.
 * 
 *  The output size is defined using the formula set by INetworkDefinition::setDeconvolutionOutputDimensionsFormula().
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IDeconvolutionLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IDeconvolutionLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the HW kernel size of the convolution.
     * 
     *  If executing this layer on DLA, both height and width of kernel size must be in the range [1,16].
     * 
     *  @see getKernelSize()
     *  */
    
    
    //!
    //!
    //!
    public native void setKernelSize(@ByVal DimsHW kernelSize);

    /**
     *  \brief Get the HW kernel size of the deconvolution.
     * 
     *  @see setKernelSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal DimsHW getKernelSize();

    /**
     *  \brief Set the number of output feature maps for the deconvolution.
     * 
     *  If executing this layer on DLA, the number of output maps must be in the range [1,8192].
     * 
     *  @see getNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    public native void setNbOutputMaps(int nbOutputMaps);

    /**
     *  \brief Get the number of output feature maps for the deconvolution.
     * 
     *  @see setNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getNbOutputMaps();

    /**
     *  \brief Get the stride of the deconvolution.
     * 
     *  If executing this layer on DLA, both height and width of stride must be in the range [1,8].
     * 
     *  @see setStride()
     *  */
    
    
    //!
    //!
    //!
    public native void setStride(@ByVal DimsHW stride);

    /**
     *  \brief Get the stride of the deconvolution.
     * 
     *  Default: (1,1)
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal DimsHW getStride();

    /**
     *  \brief Set the padding of the deconvolution.
     * 
     *  The output will be trimmed by this number of elements on each side in the height and width directions. In other words, it resembles the inverse of a convolution layer with this padding size.
     *  Padding is symmetric, and negative padding is not supported.
     * 
     *  Default: (0,0)
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,15].
     * 
     *  @see getPadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setPadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding of the deconvolution.
     * 
     *  @see setPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal DimsHW getPadding(); // padding defaults to 0

    /**
     *  \brief Set the number of groups for a deconvolution.
     * 
     *  The input tensor channels are divided into \p nbGroups groups, and a deconvolution is executed for each group, using a filter per group. The results of the group
     *  convolutions are concatenated to form the output.
     * 
     *  \note When using groups in int8 mode, the size of the groups (i.e. the channel count divided by the group count) must be a multiple of 4 for both input and output.
     * 
     *  Default: 1
     * 
     *  @see getNbGroups()
     *  */
    
    
    //!
    //!
    //!
    public native void setNbGroups(int nbGroups);

    /**
     *  \brief Get the number of groups for a deconvolution.
     * 
     *  @see setNbGroups()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getNbGroups();

    /**
     *  \brief Set the kernel weights for the deconvolution.
     * 
     *  The weights are specified as a contiguous array in \p CKRS order, where \p C the number of
     *  input channels, \p K the number of output feature maps, and \p R and \p S are the height and width of the filter.
     * 
     *  @see getWeights()
     *  */
    
    
    //!
    //!
    //!
    public native void setKernelWeights(@ByVal Weights weights);

    /**
     *  \brief Get the kernel weights for the deconvolution.
     * 
     *  @see setNbGroups()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Weights getKernelWeights();

    /**
     *  \brief Set the bias weights for the deconvolution.
     * 
     *  Bias is optional. To omit bias, set the count value of the weights structure to zero.
     * 
     *  The bias is applied per-feature-map, so the number of weights (if non-zero) must be equal to the number of output feature maps.
     * 
     *  @see getBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    public native void setBiasWeights(@ByVal Weights weights);

    /**
     *  \brief Get the bias weights for the deconvolution.
     * 
     *  @see getBiasWeights()
     *  */
    public native @ByVal Weights getBiasWeights();
    /**
     *  \brief Set the pre-padding.
     * 
     *  The start of input will be zero-padded by this number of elements in the height and width directions.
     * 
     *  Default: 0
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,15].
     * 
     *  @see getPadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setPrePadding(@ByVal Dims padding);

    /**
     *  \brief Get the pre-padding.
     * 
     *  @see setPrePadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getPrePadding();

    /**
     *  \brief Set the post-padding.
     * 
     *  The end of the input will be zero-padded by this number of elements in the height and width directions.
     * 
     *  Default: (0,0)
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,15].
     * 
     *  @see getPadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setPostPadding(@ByVal Dims padding);

    /**
     *  \brief Get the padding.
     * 
     *  @see setPadding()
     *  */
    public native @ByVal Dims getPostPadding();
}
