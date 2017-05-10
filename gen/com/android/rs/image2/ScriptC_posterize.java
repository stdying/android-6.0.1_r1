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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/ImageProcessing2/src/com/android/rs/image/posterize.rs
 */

package com.android.rs.image2;

import android.renderscript.*;
import com.android.rs.image2.posterizeBitCode;

/**
 * @hide
 */
public class ScriptC_posterize extends ScriptC {
    private static final String __rs_resource_name = "posterize";
    // Constructor
    public  ScriptC_posterize(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              posterizeBitCode.getBitCode32(),
              posterizeBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_intensityLow = 0.f;
        __F32 = Element.F32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_inputImage = 0;
    private Allocation mExportVar_inputImage;
    public synchronized void set_inputImage(Allocation v) {
        setVar(mExportVarIdx_inputImage, v);
        mExportVar_inputImage = v;
    }

    public Allocation get_inputImage() {
        return mExportVar_inputImage;
    }

    public Script.FieldID getFieldID_inputImage() {
        return createFieldID(mExportVarIdx_inputImage, null);
    }

    private final static int mExportVarIdx_intensityLow = 1;
    private float mExportVar_intensityLow;
    public synchronized void set_intensityLow(float v) {
        setVar(mExportVarIdx_intensityLow, v);
        mExportVar_intensityLow = v;
    }

    public float get_intensityLow() {
        return mExportVar_intensityLow;
    }

    public Script.FieldID getFieldID_intensityLow() {
        return createFieldID(mExportVarIdx_intensityLow, null);
    }

    private final static int mExportVarIdx_intensityHigh = 2;
    private float mExportVar_intensityHigh;
    public synchronized void set_intensityHigh(float v) {
        setVar(mExportVarIdx_intensityHigh, v);
        mExportVar_intensityHigh = v;
    }

    public float get_intensityHigh() {
        return mExportVar_intensityHigh;
    }

    public Script.FieldID getFieldID_intensityHigh() {
        return createFieldID(mExportVarIdx_intensityHigh, null);
    }

    private final static int mExportVarIdx_color = 3;
    private Short4 mExportVar_color;
    public synchronized void set_color(Short4 v) {
        mExportVar_color = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_color, fp, __U8_4, __dimArr);
    }

    public Short4 get_color() {
        return mExportVar_color;
    }

    public Script.FieldID getFieldID_color() {
        return createFieldID(mExportVarIdx_color, null);
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 59, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        forEach_root(ain, aout, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_root, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_setParams = 0;
    public Script.InvokeID getInvokeID_setParams() {
        return createInvokeID(mExportFuncIdx_setParams);
    }

    public void invoke_setParams(float intensHigh, float intensLow, short r, short g, short b) {
        FieldPacker setParams_fp = new FieldPacker(12);
        setParams_fp.addF32(intensHigh);
        setParams_fp.addF32(intensLow);
        setParams_fp.addU8(r);
        setParams_fp.addU8(g);
        setParams_fp.addU8(b);
        setParams_fp.skip(1);
        invoke(mExportFuncIdx_setParams, setParams_fp);
    }

}

