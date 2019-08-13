// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Deserialize and concatenate {@code SparseTensors} from a serialized minibatch.
 * 
 *  The input {@code serialized_sparse} must be a string matrix of shape {@code [N x 3]} where
 *  {@code N} is the minibatch size and the rows correspond to packed outputs of
 *  {@code SerializeSparse}.  The ranks of the original {@code SparseTensor} objects
 *  must all match.  When the final {@code SparseTensor} is created, it has rank one
 *  higher than the ranks of the incoming {@code SparseTensor} objects
 *  (they have been concatenated along a new row dimension).
 * 
 *  The output {@code SparseTensor} object's shape values for all dimensions but the
 *  first are the max across the input {@code SparseTensor} objects' shape values
 *  for the corresponding dimensions.  Its first shape value is {@code N}, the minibatch
 *  size.
 * 
 *  The input {@code SparseTensor} objects' indices are assumed ordered in
 *  standard lexicographic order.  If this is not the case, after this
 *  step run {@code SparseReorder} to restore index ordering.
 * 
 *  For example, if the serialized input is a {@code [2 x 3]} matrix representing two
 *  original {@code SparseTensor} objects:
 * 
 *      index = [ 0]
 *              [10]
 *              [20]
 *      values = [1, 2, 3]
 *      shape = [50]
 * 
 *  and
 * 
 *      index = [ 2]
 *              [10]
 *      values = [4, 5]
 *      shape = [30]
 * 
 *  then the final deserialized {@code SparseTensor} will be:
 * 
 *      index = [0  0]
 *              [0 10]
 *              [0 20]
 *              [1  2]
 *              [1 10]
 *      values = [1, 2, 3, 4, 5]
 *      shape = [2 50]
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * serialized_sparse: 2-D, The {@code N} serialized {@code SparseTensor} objects.
 *  Must have 3 columns.
 *  * dtype: The {@code dtype} of the serialized {@code SparseTensor} objects.
 * 
 *  Returns:
 *  * {@code Output} sparse_indices
 *  * {@code Output} sparse_values
 *  * {@code Output} sparse_shape */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeserializeManySparse extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeserializeManySparse(Pointer p) { super(p); }

  public DeserializeManySparse(@Const @ByRef Scope scope, @ByVal Input serialized_sparse, @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, serialized_sparse, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input serialized_sparse, @Cast("tensorflow::DataType") int dtype);

  public native @ByRef Operation operation(); public native DeserializeManySparse operation(Operation setter);
  public native @ByRef Output sparse_indices(); public native DeserializeManySparse sparse_indices(Output setter);
  public native @ByRef Output sparse_values(); public native DeserializeManySparse sparse_values(Output setter);
  public native @ByRef Output sparse_shape(); public native DeserializeManySparse sparse_shape(Output setter);
}
