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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/kernel2d_oldstyle.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.kernel2d_oldstyleBitCode;

/**
 * @hide
 */
public class ScriptC_kernel2d_oldstyle extends ScriptC {
    private static final String __rs_resource_name = "kernel2d_oldstyle";
    // Constructor
    public  ScriptC_kernel2d_oldstyle(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              kernel2d_oldstyleBitCode.getBitCode32(),
              kernel2d_oldstyleBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __U32 = Element.U32(rs);
        __I32 = Element.I32(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private Element __U32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_U32;
    private final static int mExportVarIdx_A = 0;
    private Allocation mExportVar_A;
    public synchronized void set_A(Allocation v) {
        setVar(mExportVarIdx_A, v);
        mExportVar_A = v;
    }

    public Allocation get_A() {
        return mExportVar_A;
    }

    public Script.FieldID getFieldID_A() {
        return createFieldID(mExportVarIdx_A, null);
    }

    private final static int mExportVarIdx_B = 1;
    private Allocation mExportVar_B;
    public synchronized void set_B(Allocation v) {
        setVar(mExportVarIdx_B, v);
        mExportVar_B = v;
    }

    public Allocation get_B() {
        return mExportVar_B;
    }

    public Script.FieldID getFieldID_B() {
        return createFieldID(mExportVarIdx_B, null);
    }

    private final static int mExportVarIdx_gDimX = 2;
    private long mExportVar_gDimX;
    public synchronized void set_gDimX(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_gDimX, __rs_fp_U32);
        mExportVar_gDimX = v;
    }

    public long get_gDimX() {
        return mExportVar_gDimX;
    }

    public Script.FieldID getFieldID_gDimX() {
        return createFieldID(mExportVarIdx_gDimX, null);
    }

    private final static int mExportVarIdx_gDimY = 3;
    private long mExportVar_gDimY;
    public synchronized void set_gDimY(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_gDimY, __rs_fp_U32);
        mExportVar_gDimY = v;
    }

    public long get_gDimY() {
        return mExportVar_gDimY;
    }

    public Script.FieldID getFieldID_gDimY() {
        return createFieldID(mExportVarIdx_gDimY, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_xform = 1;
    public Script.KernelID getKernelID_xform() {
        return createKernelID(mExportForEachIdx_xform, 155, null, null);
    }

    public void forEach_xform(Allocation ain, Allocation aout) {
        forEach_xform(ain, aout, null);
    }

    public void forEach_xform(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_xform, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_init_vars = 2;
    public Script.KernelID getKernelID_init_vars() {
        return createKernelID(mExportForEachIdx_init_vars, 2, null, null);
    }

    public void forEach_init_vars(Allocation aout) {
        forEach_init_vars(aout, null);
    }

    public void forEach_init_vars(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_init_vars, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_verify_xform = 0;
    public Script.InvokeID getInvokeID_verify_xform() {
        return createInvokeID(mExportFuncIdx_verify_xform);
    }

    public void invoke_verify_xform() {
        invoke(mExportFuncIdx_verify_xform);
    }

    private final static int mExportFuncIdx_kernel_test = 1;
    public Script.InvokeID getInvokeID_kernel_test() {
        return createInvokeID(mExportFuncIdx_kernel_test);
    }

    public void invoke_kernel_test() {
        invoke(mExportFuncIdx_kernel_test);
    }

}

