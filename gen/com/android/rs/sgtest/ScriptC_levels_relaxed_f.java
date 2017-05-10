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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/ScriptGroupTest/src/com/android/rs/sgtest/levels_relaxed_f.rs
 */

package com.android.rs.sgtest;

import android.renderscript.*;
import com.android.rs.sgtest.levels_relaxed_fBitCode;

/**
 * @hide
 */
public class ScriptC_levels_relaxed_f extends ScriptC {
    private static final String __rs_resource_name = "levels_relaxed_f";
    // Constructor
    public  ScriptC_levels_relaxed_f(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              levels_relaxed_fBitCode.getBitCode32(),
              levels_relaxed_fBitCode.getBitCode64());
        __F32 = Element.F32(rs);
        __F32_4 = Element.F32_4(rs);
    }

    private Element __F32;
    private Element __F32_4;
    private FieldPacker __rs_fp_F32;
    private final static int mExportVarIdx_inBlack = 0;
    private float mExportVar_inBlack;
    public synchronized void set_inBlack(float v) {
        setVar(mExportVarIdx_inBlack, v);
        mExportVar_inBlack = v;
    }

    public float get_inBlack() {
        return mExportVar_inBlack;
    }

    public Script.FieldID getFieldID_inBlack() {
        return createFieldID(mExportVarIdx_inBlack, null);
    }

    private final static int mExportVarIdx_outBlack = 1;
    private float mExportVar_outBlack;
    public synchronized void set_outBlack(float v) {
        setVar(mExportVarIdx_outBlack, v);
        mExportVar_outBlack = v;
    }

    public float get_outBlack() {
        return mExportVar_outBlack;
    }

    public Script.FieldID getFieldID_outBlack() {
        return createFieldID(mExportVarIdx_outBlack, null);
    }

    private final static int mExportVarIdx_inWMinInB = 2;
    private float mExportVar_inWMinInB;
    public synchronized void set_inWMinInB(float v) {
        setVar(mExportVarIdx_inWMinInB, v);
        mExportVar_inWMinInB = v;
    }

    public float get_inWMinInB() {
        return mExportVar_inWMinInB;
    }

    public Script.FieldID getFieldID_inWMinInB() {
        return createFieldID(mExportVarIdx_inWMinInB, null);
    }

    private final static int mExportVarIdx_outWMinOutB = 3;
    private float mExportVar_outWMinOutB;
    public synchronized void set_outWMinOutB(float v) {
        setVar(mExportVarIdx_outWMinOutB, v);
        mExportVar_outWMinOutB = v;
    }

    public float get_outWMinOutB() {
        return mExportVar_outWMinOutB;
    }

    public Script.FieldID getFieldID_outWMinOutB() {
        return createFieldID(mExportVarIdx_outWMinOutB, null);
    }

    private final static int mExportVarIdx_overInWMinInB = 4;
    private float mExportVar_overInWMinInB;
    public synchronized void set_overInWMinInB(float v) {
        setVar(mExportVarIdx_overInWMinInB, v);
        mExportVar_overInWMinInB = v;
    }

    public float get_overInWMinInB() {
        return mExportVar_overInWMinInB;
    }

    public Script.FieldID getFieldID_overInWMinInB() {
        return createFieldID(mExportVarIdx_overInWMinInB, null);
    }

    private final static int mExportVarIdx_colorMat = 5;
    private Matrix3f mExportVar_colorMat;
    public synchronized void set_colorMat(Matrix3f v) {
        mExportVar_colorMat = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v);
        setVar(mExportVarIdx_colorMat, fp);
    }

    public Matrix3f get_colorMat() {
        return mExportVar_colorMat;
    }

    public Script.FieldID getFieldID_colorMat() {
        return createFieldID(mExportVarIdx_colorMat, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_levels_v4 = 1;
    public Script.KernelID getKernelID_levels_v4() {
        return createKernelID(mExportForEachIdx_levels_v4, 35, null, null);
    }

    public void forEach_levels_v4(Allocation ain, Allocation aout) {
        forEach_levels_v4(ain, aout, null);
    }

    public void forEach_levels_v4(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_levels_v4, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_initialize = 0;
    public Script.InvokeID getInvokeID_initialize() {
        return createInvokeID(mExportFuncIdx_initialize);
    }

    public void invoke_initialize(float inBlack_, float outBlack_, float inWMinInB_, float outWMinOutB_, float overInWMinInB_, Matrix3f colorMat_) {
        FieldPacker initialize_fp = new FieldPacker(56);
        initialize_fp.addF32(inBlack_);
        initialize_fp.addF32(outBlack_);
        initialize_fp.addF32(inWMinInB_);
        initialize_fp.addF32(outWMinOutB_);
        initialize_fp.addF32(overInWMinInB_);
        initialize_fp.addMatrix(colorMat_);
        invoke(mExportFuncIdx_initialize, initialize_fp);
    }

}

