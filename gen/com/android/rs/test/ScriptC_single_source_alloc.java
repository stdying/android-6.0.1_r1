/*___Generated_by_IDEA___*/

/*
 * Copyright (C) 2011-2014 The Android Open Source Project
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
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/single_source_alloc.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.single_source_allocBitCode;

/**
 * @hide
 */
public class ScriptC_single_source_alloc extends ScriptC {
    private static final String __rs_resource_name = "single_source_alloc";
    // Constructor
    public  ScriptC_single_source_alloc(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              single_source_allocBitCode.getBitCode32(),
              single_source_allocBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __F16 = Element.F16(rs);
        __F16_2 = Element.F16_2(rs);
        __F16_3 = Element.F16_3(rs);
        __F16_4 = Element.F16_4(rs);
        __F32 = Element.F32(rs);
        __F32_2 = Element.F32_2(rs);
        __F32_3 = Element.F32_3(rs);
        __F32_4 = Element.F32_4(rs);
        __F64 = Element.F64(rs);
        __F64_2 = Element.F64_2(rs);
        __F64_3 = Element.F64_3(rs);
        __F64_4 = Element.F64_4(rs);
        __I8 = Element.I8(rs);
        __I8_2 = Element.I8_2(rs);
        __I8_3 = Element.I8_3(rs);
        __I8_4 = Element.I8_4(rs);
        __I16 = Element.I16(rs);
        __I16_2 = Element.I16_2(rs);
        __I16_3 = Element.I16_3(rs);
        __I16_4 = Element.I16_4(rs);
        __I32_2 = Element.I32_2(rs);
        __I32_3 = Element.I32_3(rs);
        __I32_4 = Element.I32_4(rs);
        __I64 = Element.I64(rs);
        __I64_2 = Element.I64_2(rs);
        __I64_3 = Element.I64_3(rs);
        __I64_4 = Element.I64_4(rs);
        __U8 = Element.U8(rs);
        __U8_2 = Element.U8_2(rs);
        __U8_3 = Element.U8_3(rs);
        __U8_4 = Element.U8_4(rs);
        __U16 = Element.U16(rs);
        __U16_2 = Element.U16_2(rs);
        __U16_3 = Element.U16_3(rs);
        __U16_4 = Element.U16_4(rs);
        __U32 = Element.U32(rs);
        __U32_2 = Element.U32_2(rs);
        __U32_3 = Element.U32_3(rs);
        __U32_4 = Element.U32_4(rs);
        __U64 = Element.U64(rs);
        __U64_2 = Element.U64_2(rs);
        __U64_3 = Element.U64_3(rs);
        __U64_4 = Element.U64_4(rs);
    }

    private Element __F16;
    private Element __F16_2;
    private Element __F16_3;
    private Element __F16_4;
    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    private Element __F64;
    private Element __F64_2;
    private Element __F64_3;
    private Element __F64_4;
    private Element __I16;
    private Element __I16_2;
    private Element __I16_3;
    private Element __I16_4;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_3;
    private Element __I32_4;
    private Element __I64;
    private Element __I64_2;
    private Element __I64_3;
    private Element __I64_4;
    private Element __I8;
    private Element __I8_2;
    private Element __I8_3;
    private Element __I8_4;
    private Element __U16;
    private Element __U16_2;
    private Element __U16_3;
    private Element __U16_4;
    private Element __U32;
    private Element __U32_2;
    private Element __U32_3;
    private Element __U32_4;
    private Element __U64;
    private Element __U64_2;
    private Element __U64_3;
    private Element __U64_4;
    private Element __U8;
    private Element __U8_2;
    private Element __U8_3;
    private Element __U8_4;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_gDimX = 0;
    private int mExportVar_gDimX;
    public synchronized void set_gDimX(int v) {
        setVar(mExportVarIdx_gDimX, v);
        mExportVar_gDimX = v;
    }

    public int get_gDimX() {
        return mExportVar_gDimX;
    }

    public Script.FieldID getFieldID_gDimX() {
        return createFieldID(mExportVarIdx_gDimX, null);
    }

    private final static int mExportVarIdx_gDimY = 1;
    private int mExportVar_gDimY;
    public synchronized void set_gDimY(int v) {
        setVar(mExportVarIdx_gDimY, v);
        mExportVar_gDimY = v;
    }

    public int get_gDimY() {
        return mExportVar_gDimY;
    }

    public Script.FieldID getFieldID_gDimY() {
        return createFieldID(mExportVarIdx_gDimY, null);
    }

    private final static int mExportVarIdx_gDimZ = 2;
    private int mExportVar_gDimZ;
    public synchronized void set_gDimZ(int v) {
        setVar(mExportVarIdx_gDimZ, v);
        mExportVar_gDimZ = v;
    }

    public int get_gDimZ() {
        return mExportVar_gDimZ;
    }

    public Script.FieldID getFieldID_gDimZ() {
        return createFieldID(mExportVarIdx_gDimZ, null);
    }

    private final static int mExportVarIdx_gStart = 3;
    private int mExportVar_gStart;
    public synchronized void set_gStart(int v) {
        setVar(mExportVarIdx_gStart, v);
        mExportVar_gStart = v;
    }

    public int get_gStart() {
        return mExportVar_gStart;
    }

    public Script.FieldID getFieldID_gStart() {
        return createFieldID(mExportVarIdx_gStart, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_verify_half = 1;
    public Script.KernelID getKernelID_verify_half() {
        return createKernelID(mExportForEachIdx_verify_half, 123, null, null);
    }

    public void forEach_verify_half(Allocation ain, Allocation aout) {
        forEach_verify_half(ain, aout, null);
    }

    public void forEach_verify_half(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_half, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_half2 = 2;
    public Script.KernelID getKernelID_verify_half2() {
        return createKernelID(mExportForEachIdx_verify_half2, 123, null, null);
    }

    public void forEach_verify_half2(Allocation ain, Allocation aout) {
        forEach_verify_half2(ain, aout, null);
    }

    public void forEach_verify_half2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_half2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_half3 = 3;
    public Script.KernelID getKernelID_verify_half3() {
        return createKernelID(mExportForEachIdx_verify_half3, 123, null, null);
    }

    public void forEach_verify_half3(Allocation ain, Allocation aout) {
        forEach_verify_half3(ain, aout, null);
    }

    public void forEach_verify_half3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16_3)) {
            throw new RSRuntimeException("Type mismatch with F16_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16_3)) {
            throw new RSRuntimeException("Type mismatch with F16_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_half3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_half4 = 4;
    public Script.KernelID getKernelID_verify_half4() {
        return createKernelID(mExportForEachIdx_verify_half4, 123, null, null);
    }

    public void forEach_verify_half4(Allocation ain, Allocation aout) {
        forEach_verify_half4(ain, aout, null);
    }

    public void forEach_verify_half4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_half4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_float = 5;
    public Script.KernelID getKernelID_verify_float() {
        return createKernelID(mExportForEachIdx_verify_float, 123, null, null);
    }

    public void forEach_verify_float(Allocation ain, Allocation aout) {
        forEach_verify_float(ain, aout, null);
    }

    public void forEach_verify_float(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_float, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_float2 = 6;
    public Script.KernelID getKernelID_verify_float2() {
        return createKernelID(mExportForEachIdx_verify_float2, 123, null, null);
    }

    public void forEach_verify_float2(Allocation ain, Allocation aout) {
        forEach_verify_float2(ain, aout, null);
    }

    public void forEach_verify_float2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_float2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_float3 = 7;
    public Script.KernelID getKernelID_verify_float3() {
        return createKernelID(mExportForEachIdx_verify_float3, 123, null, null);
    }

    public void forEach_verify_float3(Allocation ain, Allocation aout) {
        forEach_verify_float3(ain, aout, null);
    }

    public void forEach_verify_float3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_float3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_float4 = 8;
    public Script.KernelID getKernelID_verify_float4() {
        return createKernelID(mExportForEachIdx_verify_float4, 123, null, null);
    }

    public void forEach_verify_float4(Allocation ain, Allocation aout) {
        forEach_verify_float4(ain, aout, null);
    }

    public void forEach_verify_float4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_float4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_double = 9;
    public Script.KernelID getKernelID_verify_double() {
        return createKernelID(mExportForEachIdx_verify_double, 123, null, null);
    }

    public void forEach_verify_double(Allocation ain, Allocation aout) {
        forEach_verify_double(ain, aout, null);
    }

    public void forEach_verify_double(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_double, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_double2 = 10;
    public Script.KernelID getKernelID_verify_double2() {
        return createKernelID(mExportForEachIdx_verify_double2, 123, null, null);
    }

    public void forEach_verify_double2(Allocation ain, Allocation aout) {
        forEach_verify_double2(ain, aout, null);
    }

    public void forEach_verify_double2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_double2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_double3 = 11;
    public Script.KernelID getKernelID_verify_double3() {
        return createKernelID(mExportForEachIdx_verify_double3, 123, null, null);
    }

    public void forEach_verify_double3(Allocation ain, Allocation aout) {
        forEach_verify_double3(ain, aout, null);
    }

    public void forEach_verify_double3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F64_3)) {
            throw new RSRuntimeException("Type mismatch with F64_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F64_3)) {
            throw new RSRuntimeException("Type mismatch with F64_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_double3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_double4 = 12;
    public Script.KernelID getKernelID_verify_double4() {
        return createKernelID(mExportForEachIdx_verify_double4, 123, null, null);
    }

    public void forEach_verify_double4(Allocation ain, Allocation aout) {
        forEach_verify_double4(ain, aout, null);
    }

    public void forEach_verify_double4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_double4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_char = 13;
    public Script.KernelID getKernelID_verify_char() {
        return createKernelID(mExportForEachIdx_verify_char, 123, null, null);
    }

    public void forEach_verify_char(Allocation ain, Allocation aout) {
        forEach_verify_char(ain, aout, null);
    }

    public void forEach_verify_char(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_char, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_char2 = 14;
    public Script.KernelID getKernelID_verify_char2() {
        return createKernelID(mExportForEachIdx_verify_char2, 123, null, null);
    }

    public void forEach_verify_char2(Allocation ain, Allocation aout) {
        forEach_verify_char2(ain, aout, null);
    }

    public void forEach_verify_char2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_char2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_char3 = 15;
    public Script.KernelID getKernelID_verify_char3() {
        return createKernelID(mExportForEachIdx_verify_char3, 123, null, null);
    }

    public void forEach_verify_char3(Allocation ain, Allocation aout) {
        forEach_verify_char3(ain, aout, null);
    }

    public void forEach_verify_char3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I8_3)) {
            throw new RSRuntimeException("Type mismatch with I8_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I8_3)) {
            throw new RSRuntimeException("Type mismatch with I8_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_char3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_char4 = 16;
    public Script.KernelID getKernelID_verify_char4() {
        return createKernelID(mExportForEachIdx_verify_char4, 123, null, null);
    }

    public void forEach_verify_char4(Allocation ain, Allocation aout) {
        forEach_verify_char4(ain, aout, null);
    }

    public void forEach_verify_char4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_char4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_short = 17;
    public Script.KernelID getKernelID_verify_short() {
        return createKernelID(mExportForEachIdx_verify_short, 123, null, null);
    }

    public void forEach_verify_short(Allocation ain, Allocation aout) {
        forEach_verify_short(ain, aout, null);
    }

    public void forEach_verify_short(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_short, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_short2 = 18;
    public Script.KernelID getKernelID_verify_short2() {
        return createKernelID(mExportForEachIdx_verify_short2, 123, null, null);
    }

    public void forEach_verify_short2(Allocation ain, Allocation aout) {
        forEach_verify_short2(ain, aout, null);
    }

    public void forEach_verify_short2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_short2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_short3 = 19;
    public Script.KernelID getKernelID_verify_short3() {
        return createKernelID(mExportForEachIdx_verify_short3, 123, null, null);
    }

    public void forEach_verify_short3(Allocation ain, Allocation aout) {
        forEach_verify_short3(ain, aout, null);
    }

    public void forEach_verify_short3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I16_3)) {
            throw new RSRuntimeException("Type mismatch with I16_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I16_3)) {
            throw new RSRuntimeException("Type mismatch with I16_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_short3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_short4 = 20;
    public Script.KernelID getKernelID_verify_short4() {
        return createKernelID(mExportForEachIdx_verify_short4, 123, null, null);
    }

    public void forEach_verify_short4(Allocation ain, Allocation aout) {
        forEach_verify_short4(ain, aout, null);
    }

    public void forEach_verify_short4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_short4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_int = 21;
    public Script.KernelID getKernelID_verify_int() {
        return createKernelID(mExportForEachIdx_verify_int, 123, null, null);
    }

    public void forEach_verify_int(Allocation ain, Allocation aout) {
        forEach_verify_int(ain, aout, null);
    }

    public void forEach_verify_int(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_int, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_int2 = 22;
    public Script.KernelID getKernelID_verify_int2() {
        return createKernelID(mExportForEachIdx_verify_int2, 123, null, null);
    }

    public void forEach_verify_int2(Allocation ain, Allocation aout) {
        forEach_verify_int2(ain, aout, null);
    }

    public void forEach_verify_int2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_int2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_int3 = 23;
    public Script.KernelID getKernelID_verify_int3() {
        return createKernelID(mExportForEachIdx_verify_int3, 123, null, null);
    }

    public void forEach_verify_int3(Allocation ain, Allocation aout) {
        forEach_verify_int3(ain, aout, null);
    }

    public void forEach_verify_int3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32_3)) {
            throw new RSRuntimeException("Type mismatch with I32_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32_3)) {
            throw new RSRuntimeException("Type mismatch with I32_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_int3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_int4 = 24;
    public Script.KernelID getKernelID_verify_int4() {
        return createKernelID(mExportForEachIdx_verify_int4, 123, null, null);
    }

    public void forEach_verify_int4(Allocation ain, Allocation aout) {
        forEach_verify_int4(ain, aout, null);
    }

    public void forEach_verify_int4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_int4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_long = 25;
    public Script.KernelID getKernelID_verify_long() {
        return createKernelID(mExportForEachIdx_verify_long, 123, null, null);
    }

    public void forEach_verify_long(Allocation ain, Allocation aout) {
        forEach_verify_long(ain, aout, null);
    }

    public void forEach_verify_long(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_long, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_long2 = 26;
    public Script.KernelID getKernelID_verify_long2() {
        return createKernelID(mExportForEachIdx_verify_long2, 123, null, null);
    }

    public void forEach_verify_long2(Allocation ain, Allocation aout) {
        forEach_verify_long2(ain, aout, null);
    }

    public void forEach_verify_long2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_long2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_long3 = 27;
    public Script.KernelID getKernelID_verify_long3() {
        return createKernelID(mExportForEachIdx_verify_long3, 123, null, null);
    }

    public void forEach_verify_long3(Allocation ain, Allocation aout) {
        forEach_verify_long3(ain, aout, null);
    }

    public void forEach_verify_long3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I64_3)) {
            throw new RSRuntimeException("Type mismatch with I64_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I64_3)) {
            throw new RSRuntimeException("Type mismatch with I64_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_long3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_long4 = 28;
    public Script.KernelID getKernelID_verify_long4() {
        return createKernelID(mExportForEachIdx_verify_long4, 123, null, null);
    }

    public void forEach_verify_long4(Allocation ain, Allocation aout) {
        forEach_verify_long4(ain, aout, null);
    }

    public void forEach_verify_long4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_long4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uchar = 29;
    public Script.KernelID getKernelID_verify_uchar() {
        return createKernelID(mExportForEachIdx_verify_uchar, 123, null, null);
    }

    public void forEach_verify_uchar(Allocation ain, Allocation aout) {
        forEach_verify_uchar(ain, aout, null);
    }

    public void forEach_verify_uchar(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uchar, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uchar2 = 30;
    public Script.KernelID getKernelID_verify_uchar2() {
        return createKernelID(mExportForEachIdx_verify_uchar2, 123, null, null);
    }

    public void forEach_verify_uchar2(Allocation ain, Allocation aout) {
        forEach_verify_uchar2(ain, aout, null);
    }

    public void forEach_verify_uchar2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uchar2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uchar3 = 31;
    public Script.KernelID getKernelID_verify_uchar3() {
        return createKernelID(mExportForEachIdx_verify_uchar3, 123, null, null);
    }

    public void forEach_verify_uchar3(Allocation ain, Allocation aout) {
        forEach_verify_uchar3(ain, aout, null);
    }

    public void forEach_verify_uchar3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_3)) {
            throw new RSRuntimeException("Type mismatch with U8_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_3)) {
            throw new RSRuntimeException("Type mismatch with U8_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uchar3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uchar4 = 32;
    public Script.KernelID getKernelID_verify_uchar4() {
        return createKernelID(mExportForEachIdx_verify_uchar4, 123, null, null);
    }

    public void forEach_verify_uchar4(Allocation ain, Allocation aout) {
        forEach_verify_uchar4(ain, aout, null);
    }

    public void forEach_verify_uchar4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uchar4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ushort = 33;
    public Script.KernelID getKernelID_verify_ushort() {
        return createKernelID(mExportForEachIdx_verify_ushort, 123, null, null);
    }

    public void forEach_verify_ushort(Allocation ain, Allocation aout) {
        forEach_verify_ushort(ain, aout, null);
    }

    public void forEach_verify_ushort(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ushort, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ushort2 = 34;
    public Script.KernelID getKernelID_verify_ushort2() {
        return createKernelID(mExportForEachIdx_verify_ushort2, 123, null, null);
    }

    public void forEach_verify_ushort2(Allocation ain, Allocation aout) {
        forEach_verify_ushort2(ain, aout, null);
    }

    public void forEach_verify_ushort2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ushort2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ushort3 = 35;
    public Script.KernelID getKernelID_verify_ushort3() {
        return createKernelID(mExportForEachIdx_verify_ushort3, 123, null, null);
    }

    public void forEach_verify_ushort3(Allocation ain, Allocation aout) {
        forEach_verify_ushort3(ain, aout, null);
    }

    public void forEach_verify_ushort3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U16_3)) {
            throw new RSRuntimeException("Type mismatch with U16_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U16_3)) {
            throw new RSRuntimeException("Type mismatch with U16_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ushort3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ushort4 = 36;
    public Script.KernelID getKernelID_verify_ushort4() {
        return createKernelID(mExportForEachIdx_verify_ushort4, 123, null, null);
    }

    public void forEach_verify_ushort4(Allocation ain, Allocation aout) {
        forEach_verify_ushort4(ain, aout, null);
    }

    public void forEach_verify_ushort4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ushort4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uint = 37;
    public Script.KernelID getKernelID_verify_uint() {
        return createKernelID(mExportForEachIdx_verify_uint, 123, null, null);
    }

    public void forEach_verify_uint(Allocation ain, Allocation aout) {
        forEach_verify_uint(ain, aout, null);
    }

    public void forEach_verify_uint(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uint, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uint2 = 38;
    public Script.KernelID getKernelID_verify_uint2() {
        return createKernelID(mExportForEachIdx_verify_uint2, 123, null, null);
    }

    public void forEach_verify_uint2(Allocation ain, Allocation aout) {
        forEach_verify_uint2(ain, aout, null);
    }

    public void forEach_verify_uint2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uint2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uint3 = 39;
    public Script.KernelID getKernelID_verify_uint3() {
        return createKernelID(mExportForEachIdx_verify_uint3, 123, null, null);
    }

    public void forEach_verify_uint3(Allocation ain, Allocation aout) {
        forEach_verify_uint3(ain, aout, null);
    }

    public void forEach_verify_uint3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32_3)) {
            throw new RSRuntimeException("Type mismatch with U32_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32_3)) {
            throw new RSRuntimeException("Type mismatch with U32_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uint3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_uint4 = 40;
    public Script.KernelID getKernelID_verify_uint4() {
        return createKernelID(mExportForEachIdx_verify_uint4, 123, null, null);
    }

    public void forEach_verify_uint4(Allocation ain, Allocation aout) {
        forEach_verify_uint4(ain, aout, null);
    }

    public void forEach_verify_uint4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_uint4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ulong = 41;
    public Script.KernelID getKernelID_verify_ulong() {
        return createKernelID(mExportForEachIdx_verify_ulong, 123, null, null);
    }

    public void forEach_verify_ulong(Allocation ain, Allocation aout) {
        forEach_verify_ulong(ain, aout, null);
    }

    public void forEach_verify_ulong(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ulong, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ulong2 = 42;
    public Script.KernelID getKernelID_verify_ulong2() {
        return createKernelID(mExportForEachIdx_verify_ulong2, 123, null, null);
    }

    public void forEach_verify_ulong2(Allocation ain, Allocation aout) {
        forEach_verify_ulong2(ain, aout, null);
    }

    public void forEach_verify_ulong2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ulong2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ulong3 = 43;
    public Script.KernelID getKernelID_verify_ulong3() {
        return createKernelID(mExportForEachIdx_verify_ulong3, 123, null, null);
    }

    public void forEach_verify_ulong3(Allocation ain, Allocation aout) {
        forEach_verify_ulong3(ain, aout, null);
    }

    public void forEach_verify_ulong3(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U64_3)) {
            throw new RSRuntimeException("Type mismatch with U64_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U64_3)) {
            throw new RSRuntimeException("Type mismatch with U64_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ulong3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_ulong4 = 44;
    public Script.KernelID getKernelID_verify_ulong4() {
        return createKernelID(mExportForEachIdx_verify_ulong4, 123, null, null);
    }

    public void forEach_verify_ulong4(Allocation ain, Allocation aout) {
        forEach_verify_ulong4(ain, aout, null);
    }

    public void forEach_verify_ulong4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_verify_ulong4, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_CreateAndTestAlloc = 0;
    public Script.InvokeID getInvokeID_CreateAndTestAlloc() {
        return createInvokeID(mExportFuncIdx_CreateAndTestAlloc);
    }

    public void invoke_CreateAndTestAlloc(int dataType, int vecSize) {
        FieldPacker CreateAndTestAlloc_fp = new FieldPacker(8);
        CreateAndTestAlloc_fp.addI32(dataType);
        CreateAndTestAlloc_fp.addI32(vecSize);
        invoke(mExportFuncIdx_CreateAndTestAlloc, CreateAndTestAlloc_fp);
    }

    private final static int mExportFuncIdx_TestAllCases = 1;
    public Script.InvokeID getInvokeID_TestAllCases() {
        return createInvokeID(mExportFuncIdx_TestAllCases);
    }

    public void invoke_TestAllCases() {
        invoke(mExportFuncIdx_TestAllCases);
    }

    private final static int mExportFuncIdx_single_source_alloc_test = 2;
    public Script.InvokeID getInvokeID_single_source_alloc_test() {
        return createInvokeID(mExportFuncIdx_single_source_alloc_test);
    }

    public void invoke_single_source_alloc_test() {
        invoke(mExportFuncIdx_single_source_alloc_test);
    }

}

