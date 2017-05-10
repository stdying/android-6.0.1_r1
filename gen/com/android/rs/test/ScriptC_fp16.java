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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/fp16.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.fp16BitCode;

/**
 * @hide
 */
public class ScriptC_fp16 extends ScriptC {
    private static final String __rs_resource_name = "fp16";
    // Constructor
    public  ScriptC_fp16(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              fp16BitCode.getBitCode32(),
              fp16BitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32 = Element.I32(rs);
        __F16 = Element.F16(rs);
        __F16_2 = Element.F16_2(rs);
        __F16_3 = Element.F16_3(rs);
        __F16_4 = Element.F16_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F16;
    private Element __F16_2;
    private Element __F16_3;
    private Element __F16_4;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_gAlloc = 0;
    private Allocation mExportVar_gAlloc;
    public synchronized void set_gAlloc(Allocation v) {
        setVar(mExportVarIdx_gAlloc, v);
        mExportVar_gAlloc = v;
    }

    public Allocation get_gAlloc() {
        return mExportVar_gAlloc;
    }

    public Script.FieldID getFieldID_gAlloc() {
        return createFieldID(mExportVarIdx_gAlloc, null);
    }

    private final static int mExportVarIdx_gDimX = 1;
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

    private final static int mExportVarIdx_gDimY = 2;
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

    private final static int mExportVarIdx_gDimZ = 3;
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

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_set_kernel_half = 1;
    public Script.KernelID getKernelID_set_kernel_half() {
        return createKernelID(mExportForEachIdx_set_kernel_half, 122, null, null);
    }

    public void forEach_set_kernel_half(Allocation aout) {
        forEach_set_kernel_half(aout, null);
    }

    public void forEach_set_kernel_half(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        forEach(mExportForEachIdx_set_kernel_half, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_set_kernel_half2 = 2;
    public Script.KernelID getKernelID_set_kernel_half2() {
        return createKernelID(mExportForEachIdx_set_kernel_half2, 122, null, null);
    }

    public void forEach_set_kernel_half2(Allocation aout) {
        forEach_set_kernel_half2(aout, null);
    }

    public void forEach_set_kernel_half2(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        forEach(mExportForEachIdx_set_kernel_half2, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_set_kernel_half3 = 3;
    public Script.KernelID getKernelID_set_kernel_half3() {
        return createKernelID(mExportForEachIdx_set_kernel_half3, 122, null, null);
    }

    public void forEach_set_kernel_half3(Allocation aout) {
        forEach_set_kernel_half3(aout, null);
    }

    public void forEach_set_kernel_half3(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16_3)) {
            throw new RSRuntimeException("Type mismatch with F16_3!");
        }
        forEach(mExportForEachIdx_set_kernel_half3, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_set_kernel_half4 = 4;
    public Script.KernelID getKernelID_set_kernel_half4() {
        return createKernelID(mExportForEachIdx_set_kernel_half4, 122, null, null);
    }

    public void forEach_set_kernel_half4(Allocation aout) {
        forEach_set_kernel_half4(aout, null);
    }

    public void forEach_set_kernel_half4(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        forEach(mExportForEachIdx_set_kernel_half4, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_verify_kernel_half = 5;
    public Script.KernelID getKernelID_verify_kernel_half() {
        return createKernelID(mExportForEachIdx_verify_kernel_half, 121, null, null);
    }

    public void forEach_verify_kernel_half(Allocation ain) {
        forEach_verify_kernel_half(ain, null);
    }

    public void forEach_verify_kernel_half(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        forEach(mExportForEachIdx_verify_kernel_half, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_verify_kernel_half2 = 6;
    public Script.KernelID getKernelID_verify_kernel_half2() {
        return createKernelID(mExportForEachIdx_verify_kernel_half2, 121, null, null);
    }

    public void forEach_verify_kernel_half2(Allocation ain) {
        forEach_verify_kernel_half2(ain, null);
    }

    public void forEach_verify_kernel_half2(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        forEach(mExportForEachIdx_verify_kernel_half2, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_verify_kernel_half3 = 7;
    public Script.KernelID getKernelID_verify_kernel_half3() {
        return createKernelID(mExportForEachIdx_verify_kernel_half3, 121, null, null);
    }

    public void forEach_verify_kernel_half3(Allocation ain) {
        forEach_verify_kernel_half3(ain, null);
    }

    public void forEach_verify_kernel_half3(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16_3)) {
            throw new RSRuntimeException("Type mismatch with F16_3!");
        }
        forEach(mExportForEachIdx_verify_kernel_half3, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_verify_kernel_half4 = 8;
    public Script.KernelID getKernelID_verify_kernel_half4() {
        return createKernelID(mExportForEachIdx_verify_kernel_half4, 121, null, null);
    }

    public void forEach_verify_kernel_half4(Allocation ain) {
        forEach_verify_kernel_half4(ain, null);
    }

    public void forEach_verify_kernel_half4(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        forEach(mExportForEachIdx_verify_kernel_half4, ain, null, null, sc);
    }

    private final static int mExportFuncIdx_set_half = 0;
    public Script.InvokeID getInvokeID_set_half() {
        return createInvokeID(mExportFuncIdx_set_half);
    }

    public void invoke_set_half() {
        invoke(mExportFuncIdx_set_half);
    }

    private final static int mExportFuncIdx_set_half2 = 1;
    public Script.InvokeID getInvokeID_set_half2() {
        return createInvokeID(mExportFuncIdx_set_half2);
    }

    public void invoke_set_half2() {
        invoke(mExportFuncIdx_set_half2);
    }

    private final static int mExportFuncIdx_set_half3 = 2;
    public Script.InvokeID getInvokeID_set_half3() {
        return createInvokeID(mExportFuncIdx_set_half3);
    }

    public void invoke_set_half3() {
        invoke(mExportFuncIdx_set_half3);
    }

    private final static int mExportFuncIdx_set_half4 = 3;
    public Script.InvokeID getInvokeID_set_half4() {
        return createInvokeID(mExportFuncIdx_set_half4);
    }

    public void invoke_set_half4() {
        invoke(mExportFuncIdx_set_half4);
    }

    private final static int mExportFuncIdx_verify_half = 4;
    public Script.InvokeID getInvokeID_verify_half() {
        return createInvokeID(mExportFuncIdx_verify_half);
    }

    public void invoke_verify_half() {
        invoke(mExportFuncIdx_verify_half);
    }

    private final static int mExportFuncIdx_verify_half2 = 5;
    public Script.InvokeID getInvokeID_verify_half2() {
        return createInvokeID(mExportFuncIdx_verify_half2);
    }

    public void invoke_verify_half2() {
        invoke(mExportFuncIdx_verify_half2);
    }

    private final static int mExportFuncIdx_verify_half3 = 6;
    public Script.InvokeID getInvokeID_verify_half3() {
        return createInvokeID(mExportFuncIdx_verify_half3);
    }

    public void invoke_verify_half3() {
        invoke(mExportFuncIdx_verify_half3);
    }

    private final static int mExportFuncIdx_verify_half4 = 7;
    public Script.InvokeID getInvokeID_verify_half4() {
        return createInvokeID(mExportFuncIdx_verify_half4);
    }

    public void invoke_verify_half4() {
        invoke(mExportFuncIdx_verify_half4);
    }

    private final static int mExportFuncIdx_fp16_test = 8;
    public Script.InvokeID getInvokeID_fp16_test() {
        return createInvokeID(mExportFuncIdx_fp16_test);
    }

    public void invoke_fp16_test() {
        invoke(mExportFuncIdx_fp16_test);
    }

}

