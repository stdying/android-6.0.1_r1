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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/HealingBrush/src/rs/example/android/com/healingbrush/find_region.rs
 */

package com.example.android.rs.sample;

import android.renderscript.*;
import com.example.android.rs.sample.find_regionBitCode;

/**
 * @hide
 */
public class ScriptC_find_region extends ScriptC {
    private static final String __rs_resource_name = "find_region";
    // Constructor
    public  ScriptC_find_region(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              find_regionBitCode.getBitCode32(),
              find_regionBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32 = Element.I32(rs);
        __U32_2 = Element.U32_2(rs);
        __F32_3 = Element.F32_3(rs);
        __F32_2 = Element.F32_2(rs);
        __F32 = Element.F32(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __I32;
    private Element __U32_2;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_image = 0;
    private Allocation mExportVar_image;
    public synchronized void set_image(Allocation v) {
        setVar(mExportVarIdx_image, v);
        mExportVar_image = v;
    }

    public Allocation get_image() {
        return mExportVar_image;
    }

    public Script.FieldID getFieldID_image() {
        return createFieldID(mExportVarIdx_image, null);
    }

    private final static int mExportVarIdx_border_values = 1;
    private Allocation mExportVar_border_values;
    public synchronized void set_border_values(Allocation v) {
        setVar(mExportVarIdx_border_values, v);
        mExportVar_border_values = v;
    }

    public Allocation get_border_values() {
        return mExportVar_border_values;
    }

    public Script.FieldID getFieldID_border_values() {
        return createFieldID(mExportVarIdx_border_values, null);
    }

    private final static int mExportVarIdx_border_coords = 2;
    private Allocation mExportVar_border_coords;
    public synchronized void set_border_coords(Allocation v) {
        setVar(mExportVarIdx_border_coords, v);
        mExportVar_border_coords = v;
    }

    public Allocation get_border_coords() {
        return mExportVar_border_coords;
    }

    public Script.FieldID getFieldID_border_coords() {
        return createFieldID(mExportVarIdx_border_coords, null);
    }

    private final static int mExportVarIdx_borderLength = 3;
    private int mExportVar_borderLength;
    public synchronized void set_borderLength(int v) {
        setVar(mExportVarIdx_borderLength, v);
        mExportVar_borderLength = v;
    }

    public int get_borderLength() {
        return mExportVar_borderLength;
    }

    public Script.FieldID getFieldID_borderLength() {
        return createFieldID(mExportVarIdx_borderLength, null);
    }

    private final static int mExportVarIdx_imagePosX = 4;
    private int mExportVar_imagePosX;
    public synchronized void set_imagePosX(int v) {
        setVar(mExportVarIdx_imagePosX, v);
        mExportVar_imagePosX = v;
    }

    public int get_imagePosX() {
        return mExportVar_imagePosX;
    }

    public Script.FieldID getFieldID_imagePosX() {
        return createFieldID(mExportVarIdx_imagePosX, null);
    }

    private final static int mExportVarIdx_imagePosY = 5;
    private int mExportVar_imagePosY;
    public synchronized void set_imagePosY(int v) {
        setVar(mExportVarIdx_imagePosY, v);
        mExportVar_imagePosY = v;
    }

    public int get_imagePosY() {
        return mExportVar_imagePosY;
    }

    public Script.FieldID getFieldID_imagePosY() {
        return createFieldID(mExportVarIdx_imagePosY, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_extractBorder = 1;
    public Script.KernelID getKernelID_extractBorder() {
        return createKernelID(mExportForEachIdx_extractBorder, 35, null, null);
    }

    public void forEach_extractBorder(Allocation ain, Allocation aout) {
        forEach_extractBorder(ain, aout, null);
    }

    public void forEach_extractBorder(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
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

        forEach(mExportForEachIdx_extractBorder, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_toInt = 2;
    public Script.KernelID getKernelID_toInt() {
        return createKernelID(mExportForEachIdx_toInt, 35, null, null);
    }

    public void forEach_toInt(Allocation ain, Allocation aout) {
        forEach_toInt(ain, aout, null);
    }

    public void forEach_toInt(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
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

        forEach(mExportForEachIdx_toInt, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_bordercorrelation = 3;
    public Script.KernelID getKernelID_bordercorrelation() {
        return createKernelID(mExportForEachIdx_bordercorrelation, 58, null, null);
    }

    public void forEach_bordercorrelation(Allocation aout) {
        forEach_bordercorrelation(aout, null);
    }

    public void forEach_bordercorrelation(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        forEach(mExportForEachIdx_bordercorrelation, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_calcBounds = 0;
    public Script.InvokeID getInvokeID_calcBounds() {
        return createInvokeID(mExportFuncIdx_calcBounds);
    }

    public void invoke_calcBounds(Allocation xy, Allocation rect) {
        FieldPacker calcBounds_fp = new FieldPacker(64);
        calcBounds_fp.addObj(xy);
        calcBounds_fp.addObj(rect);
        invoke(mExportFuncIdx_calcBounds, calcBounds_fp);
    }

    private final static int mExportFuncIdx_findMin = 1;
    public Script.InvokeID getInvokeID_findMin() {
        return createInvokeID(mExportFuncIdx_findMin);
    }

    public void invoke_findMin(Allocation fit, Allocation fit_max, int cx, int cy, int cwidth, int cheight) {
        FieldPacker findMin_fp = new FieldPacker(80);
        findMin_fp.addObj(fit);
        findMin_fp.addObj(fit_max);
        findMin_fp.addI32(cx);
        findMin_fp.addI32(cy);
        findMin_fp.addI32(cwidth);
        findMin_fp.addI32(cheight);
        invoke(mExportFuncIdx_findMin, findMin_fp);
    }

}

