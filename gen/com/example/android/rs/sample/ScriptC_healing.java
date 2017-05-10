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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/HealingBrush/src/rs/example/android/com/healingbrush/healing.rs
 */

package com.example.android.rs.sample;

import android.renderscript.*;
import com.example.android.rs.sample.healingBitCode;

/**
 * @hide
 */
public class ScriptC_healing extends ScriptC {
    private static final String __rs_resource_name = "healing";
    // Constructor
    public  ScriptC_healing(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              healingBitCode.getBitCode32(),
              healingBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32 = Element.I32(rs);
        __F32_3 = Element.F32_3(rs);
        __U8_4 = Element.U8_4(rs);
        __U8 = Element.U8(rs);
        __I32_2 = Element.I32_2(rs);
        __F32 = Element.F32(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __F32_3;
    private Element __I32;
    private Element __I32_2;
    private Element __U8;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_src = 0;
    private Allocation mExportVar_src;
    public synchronized void set_src(Allocation v) {
        setVar(mExportVarIdx_src, v);
        mExportVar_src = v;
    }

    public Allocation get_src() {
        return mExportVar_src;
    }

    public Script.FieldID getFieldID_src() {
        return createFieldID(mExportVarIdx_src, null);
    }

    private final static int mExportVarIdx_mask = 1;
    private Allocation mExportVar_mask;
    public synchronized void set_mask(Allocation v) {
        setVar(mExportVarIdx_mask, v);
        mExportVar_mask = v;
    }

    public Allocation get_mask() {
        return mExportVar_mask;
    }

    public Script.FieldID getFieldID_mask() {
        return createFieldID(mExportVarIdx_mask, null);
    }

    private final static int mExportVarIdx_laplace = 2;
    private Allocation mExportVar_laplace;
    public synchronized void set_laplace(Allocation v) {
        setVar(mExportVarIdx_laplace, v);
        mExportVar_laplace = v;
    }

    public Allocation get_laplace() {
        return mExportVar_laplace;
    }

    public Script.FieldID getFieldID_laplace() {
        return createFieldID(mExportVarIdx_laplace, null);
    }

    private final static int mExportVarIdx_dest1 = 3;
    private Allocation mExportVar_dest1;
    public synchronized void set_dest1(Allocation v) {
        setVar(mExportVarIdx_dest1, v);
        mExportVar_dest1 = v;
    }

    public Allocation get_dest1() {
        return mExportVar_dest1;
    }

    public Script.FieldID getFieldID_dest1() {
        return createFieldID(mExportVarIdx_dest1, null);
    }

    private final static int mExportVarIdx_dest2 = 4;
    private Allocation mExportVar_dest2;
    public synchronized void set_dest2(Allocation v) {
        setVar(mExportVarIdx_dest2, v);
        mExportVar_dest2 = v;
    }

    public Allocation get_dest2() {
        return mExportVar_dest2;
    }

    public Script.FieldID getFieldID_dest2() {
        return createFieldID(mExportVarIdx_dest2, null);
    }

    private final static int mExportVarIdx_image = 5;
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

    private final static int mExportVarIdx_border = 6;
    private Allocation mExportVar_border;
    public synchronized void set_border(Allocation v) {
        setVar(mExportVarIdx_border, v);
        mExportVar_border = v;
    }

    public Allocation get_border() {
        return mExportVar_border;
    }

    public Script.FieldID getFieldID_border() {
        return createFieldID(mExportVarIdx_border, null);
    }

    private final static int mExportVarIdx_border_coords = 7;
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

    private final static int mExportVarIdx_borderLength = 8;
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

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_laplacian = 1;
    public Script.KernelID getKernelID_laplacian() {
        return createKernelID(mExportForEachIdx_laplacian, 58, null, null);
    }

    public void forEach_laplacian(Allocation aout) {
        forEach_laplacian(aout, null);
    }

    public void forEach_laplacian(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        forEach(mExportForEachIdx_laplacian, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_convert_to_f = 2;
    public Script.KernelID getKernelID_convert_to_f() {
        return createKernelID(mExportForEachIdx_convert_to_f, 35, null, null);
    }

    public void forEach_convert_to_f(Allocation ain, Allocation aout) {
        forEach_convert_to_f(ain, aout, null);
    }

    public void forEach_convert_to_f(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
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

        forEach(mExportForEachIdx_convert_to_f, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_copyMasked = 3;
    public Script.KernelID getKernelID_copyMasked() {
        return createKernelID(mExportForEachIdx_copyMasked, 59, null, null);
    }

    public void forEach_copyMasked(Allocation ain, Allocation aout) {
        forEach_copyMasked(ain, aout, null);
    }

    public void forEach_copyMasked(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
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

        forEach(mExportForEachIdx_copyMasked, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_convert_to_uc = 4;
    public Script.KernelID getKernelID_convert_to_uc() {
        return createKernelID(mExportForEachIdx_convert_to_uc, 35, null, null);
    }

    public void forEach_convert_to_uc(Allocation ain, Allocation aout) {
        forEach_convert_to_uc(ain, aout, null);
    }

    public void forEach_convert_to_uc(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
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

        forEach(mExportForEachIdx_convert_to_uc, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_alphaMask = 5;
    public Script.KernelID getKernelID_alphaMask() {
        return createKernelID(mExportForEachIdx_alphaMask, 59, null, null);
    }

    public void forEach_alphaMask(Allocation ain, Allocation aout) {
        forEach_alphaMask(ain, aout, null);
    }

    public void forEach_alphaMask(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_alphaMask, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_solve1 = 6;
    public Script.KernelID getKernelID_solve1() {
        return createKernelID(mExportForEachIdx_solve1, 59, null, null);
    }

    public void forEach_solve1(Allocation ain, Allocation aout) {
        forEach_solve1(ain, aout, null);
    }

    public void forEach_solve1(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
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

        forEach(mExportForEachIdx_solve1, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_solve2 = 7;
    public Script.KernelID getKernelID_solve2() {
        return createKernelID(mExportForEachIdx_solve2, 59, null, null);
    }

    public void forEach_solve2(Allocation ain, Allocation aout) {
        forEach_solve2(ain, aout, null);
    }

    public void forEach_solve2(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
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

        forEach(mExportForEachIdx_solve2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_extractBorder = 8;
    public Script.KernelID getKernelID_extractBorder() {
        return createKernelID(mExportForEachIdx_extractBorder, 35, null, null);
    }

    public void forEach_extractBorder(Allocation ain, Allocation aout) {
        forEach_extractBorder(ain, aout, null);
    }

    public void forEach_extractBorder(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
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

    private final static int mExportForEachIdx_bordercorrelation = 9;
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

}

