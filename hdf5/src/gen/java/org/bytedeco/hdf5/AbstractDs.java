// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class AbstractDs
    \brief AbstractDs is an abstract base class, inherited by Attribute
     and DataSet.
    <p>
    It provides a collection of services that are common to both Attribute
    and DataSet.
*/
@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class AbstractDs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AbstractDs(Pointer p) { super(p); }

        // Gets a copy the datatype of that this abstract dataset uses.
        // Note that this datatype is a generic one and can only be accessed
        // via generic member functions, i.e., member functions belong
        // to DataType.  To get specific datatype, i.e. EnumType, FloatType,
        // etc..., use the specific functions, that follow, instead.
        public native @ByVal DataType getDataType();

        // Gets a copy of the specific datatype of this abstract dataset.
        public native @ByVal ArrayType getArrayType();
        public native @ByVal CompType getCompType();
        public native @ByVal EnumType getEnumType();
        public native @ByVal IntType getIntType();
        public native @ByVal FloatType getFloatType();
        public native @ByVal StrType getStrType();
        public native @ByVal VarLenType getVarLenType();

        /**\brief Gets the size in memory of this abstract dataset. */
        public native @Cast("size_t") long getInMemDataSize();

        /**\brief Gets the dataspace of this abstract dataset - pure virtual. */
        public native @ByVal DataSpace getSpace();

        // Gets the class of the datatype that is used by this abstract
        // dataset.
        public native @Cast("H5T_class_t") int getTypeClass();

        /**\brief Returns the amount of storage size required - pure virtual. */
        public native @Cast("hsize_t") long getStorageSize();

        // Returns this class name - pure virtual.
        public native @StdString BytePointer fromClass();

        // Destructor

}
