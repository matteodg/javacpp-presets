// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.helloworld.global;

import org.bytedeco.helloworld.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class helloworld extends org.bytedeco.helloworld.presets.helloworld {
    static { Loader.load(); }

// Parsed from helloworld.h

/*
 * Copyright 2019 Matteo Di Giovinazzo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * File:   helloworld.h
 * Author: Matteo Di Giovinazzo
 *
 * Created on May 9, 2019, 12:10 PM
 */

// #ifndef helloworld_h__
// #define helloworld_h__


// #ifdef __cplusplus
// #endif

    public static native @Cast("bool") boolean getBool();
    public static native void printBool(@Cast("bool") boolean value);

    public static native @Cast("char") byte getByte();
    public static native void printByte(@Cast("char") byte value);

    public static native @Cast("wchar_t") char getChar();
    public static native void printChar(@Cast("wchar_t") char value);
    public static native void printChar(@Cast("wchar_t") int value);

    public static native short getShort();
    public static native void printShort(short value);

    public static native int getInt();
    public static native void printInt(int value);

    public static native long getLong();
    public static native void printLong(long value);

    public static native @Cast("char*") BytePointer getUtf8String();
    public static native void printUtf8String(@Cast("char*") BytePointer value);
    public static native void printUtf8String(@Cast("char*") ByteBuffer value);
    public static native void printUtf8String(@Cast("char*") byte[] value);
// Targeting ../PersonTypePtr.java




    // by value
    public static native @ByVal PersonTypePtr getPerson();
    public static native void printPerson(@ByVal PersonTypePtr p);

    // by pointer
    public static native PersonTypePtr getPersonPtr();
    public static native void printPersonPtr(PersonTypePtr pp);

    // by value with a defined type
    public static native @ByVal PersonTypePtr getPersonType();
    public static native void printPersonType(@ByVal PersonTypePtr pt);

    // by pointer with a defined type
    public static native PersonTypePtr getPersonTypePtr();
    public static native void printPersonTypePtr(PersonTypePtr ptp);

// #ifdef __cplusplus
// #endif

// #endif // helloworld_h__


}
