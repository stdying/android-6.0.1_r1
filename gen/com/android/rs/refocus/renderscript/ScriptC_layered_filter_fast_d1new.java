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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/Refocus/src/com/android/rs/test/layered_filter_fast_d1new.rs
 */

package com.android.rs.refocus.renderscript;

import android.renderscript.*;
import com.android.rs.refocus.renderscript.layered_filter_fast_d1newBitCode;

/**
 * @hide
 */
public class ScriptC_layered_filter_fast_d1new extends ScriptC {
    private static final String __rs_resource_name = "layered_filter_fast_d1new";
    // Constructor
    public  ScriptC_layered_filter_fast_d1new(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              layered_filter_fast_d1newBitCode.getBitCode32(),
              layered_filter_fast_d1newBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __F64 = Element.F64(rs);
        __U8_4 = Element.U8_4(rs);
        __U8 = Element.U8(rs);
        __F32_4 = Element.F32_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32_4;
    private Element __F64;
    private Element __U8;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F64;
    private final static int mExportVarIdx_g_lut_apply_crf_float = 0;
    private Allocation mExportVar_g_lut_apply_crf_float;
    public synchronized void set_g_lut_apply_crf_float(Allocation v) {
        setVar(mExportVarIdx_g_lut_apply_crf_float, v);
        mExportVar_g_lut_apply_crf_float = v;
    }

    public Allocation get_g_lut_apply_crf_float() {
        return mExportVar_g_lut_apply_crf_float;
    }

    public Script.FieldID getFieldID_g_lut_apply_crf_float() {
        return createFieldID(mExportVarIdx_g_lut_apply_crf_float, null);
    }

    private final static int mExportVarIdx_g_lut_remove_crf_float = 1;
    private Allocation mExportVar_g_lut_remove_crf_float;
    public synchronized void set_g_lut_remove_crf_float(Allocation v) {
        setVar(mExportVarIdx_g_lut_remove_crf_float, v);
        mExportVar_g_lut_remove_crf_float = v;
    }

    public Allocation get_g_lut_remove_crf_float() {
        return mExportVar_g_lut_remove_crf_float;
    }

    public Script.FieldID getFieldID_g_lut_remove_crf_float() {
        return createFieldID(mExportVarIdx_g_lut_remove_crf_float, null);
    }

    private final static int mExportVarIdx_g_sharp_RGBA = 2;
    private Allocation mExportVar_g_sharp_RGBA;
    public synchronized void set_g_sharp_RGBA(Allocation v) {
        setVar(mExportVarIdx_g_sharp_RGBA, v);
        mExportVar_g_sharp_RGBA = v;
    }

    public Allocation get_g_sharp_RGBA() {
        return mExportVar_g_sharp_RGBA;
    }

    public Script.FieldID getFieldID_g_sharp_RGBA() {
        return createFieldID(mExportVarIdx_g_sharp_RGBA, null);
    }

    private final static int mExportVarIdx_g_sharp_actual_depth = 3;
    private Allocation mExportVar_g_sharp_actual_depth;
    public synchronized void set_g_sharp_actual_depth(Allocation v) {
        setVar(mExportVarIdx_g_sharp_actual_depth, v);
        mExportVar_g_sharp_actual_depth = v;
    }

    public Allocation get_g_sharp_actual_depth() {
        return mExportVar_g_sharp_actual_depth;
    }

    public Script.FieldID getFieldID_g_sharp_actual_depth() {
        return createFieldID(mExportVarIdx_g_sharp_actual_depth, null);
    }

    private final static int mExportVarIdx_g_sharp_active = 4;
    private Allocation mExportVar_g_sharp_active;
    public synchronized void set_g_sharp_active(Allocation v) {
        setVar(mExportVarIdx_g_sharp_active, v);
        mExportVar_g_sharp_active = v;
    }

    public Allocation get_g_sharp_active() {
        return mExportVar_g_sharp_active;
    }

    public Script.FieldID getFieldID_g_sharp_active() {
        return createFieldID(mExportVarIdx_g_sharp_active, null);
    }

    private final static int mExportVarIdx_g_sharp_matte = 5;
    private Allocation mExportVar_g_sharp_matte;
    public synchronized void set_g_sharp_matte(Allocation v) {
        setVar(mExportVarIdx_g_sharp_matte, v);
        mExportVar_g_sharp_matte = v;
    }

    public Allocation get_g_sharp_matte() {
        return mExportVar_g_sharp_matte;
    }

    public Script.FieldID getFieldID_g_sharp_matte() {
        return createFieldID(mExportVarIdx_g_sharp_matte, null);
    }

    private final static int mExportVarIdx_g_sharp_dilated_depth = 6;
    private Allocation mExportVar_g_sharp_dilated_depth;
    public synchronized void set_g_sharp_dilated_depth(Allocation v) {
        setVar(mExportVarIdx_g_sharp_dilated_depth, v);
        mExportVar_g_sharp_dilated_depth = v;
    }

    public Allocation get_g_sharp_dilated_depth() {
        return mExportVar_g_sharp_dilated_depth;
    }

    public Script.FieldID getFieldID_g_sharp_dilated_depth() {
        return createFieldID(mExportVarIdx_g_sharp_dilated_depth, null);
    }

    private final static int mExportVarIdx_g_fuzzy_RGBA = 7;
    private Allocation mExportVar_g_fuzzy_RGBA;
    public synchronized void set_g_fuzzy_RGBA(Allocation v) {
        setVar(mExportVarIdx_g_fuzzy_RGBA, v);
        mExportVar_g_fuzzy_RGBA = v;
    }

    public Allocation get_g_fuzzy_RGBA() {
        return mExportVar_g_fuzzy_RGBA;
    }

    public Script.FieldID getFieldID_g_fuzzy_RGBA() {
        return createFieldID(mExportVarIdx_g_fuzzy_RGBA, null);
    }

    private final static int mExportVarIdx_g_integral_RGBA = 8;
    private Allocation mExportVar_g_integral_RGBA;
    public synchronized void set_g_integral_RGBA(Allocation v) {
        setVar(mExportVarIdx_g_integral_RGBA, v);
        mExportVar_g_integral_RGBA = v;
    }

    public Allocation get_g_integral_RGBA() {
        return mExportVar_g_integral_RGBA;
    }

    public Script.FieldID getFieldID_g_integral_RGBA() {
        return createFieldID(mExportVarIdx_g_integral_RGBA, null);
    }

    private final static int mExportVarIdx_g_kernel_stack = 9;
    private Allocation mExportVar_g_kernel_stack;
    public synchronized void set_g_kernel_stack(Allocation v) {
        setVar(mExportVarIdx_g_kernel_stack, v);
        mExportVar_g_kernel_stack = v;
    }

    public Allocation get_g_kernel_stack() {
        return mExportVar_g_kernel_stack;
    }

    public Script.FieldID getFieldID_g_kernel_stack() {
        return createFieldID(mExportVarIdx_g_kernel_stack, null);
    }

    private final static int mExportVarIdx_cpuDummy = 10;
    private double mExportVar_cpuDummy;
    public synchronized void set_cpuDummy(double v) {
        setVar(mExportVarIdx_cpuDummy, v);
        mExportVar_cpuDummy = v;
    }

    public double get_cpuDummy() {
        return mExportVar_cpuDummy;
    }

    public Script.FieldID getFieldID_cpuDummy() {
        return createFieldID(mExportVarIdx_cpuDummy, null);
    }

    private final static int mExportVarIdx_galloc_kernel_info = 11;
    private Allocation mExportVar_galloc_kernel_info;
    public synchronized void set_galloc_kernel_info(Allocation v) {
        setVar(mExportVarIdx_galloc_kernel_info, v);
        mExportVar_galloc_kernel_info = v;
    }

    public Allocation get_galloc_kernel_info() {
        return mExportVar_galloc_kernel_info;
    }

    public Script.FieldID getFieldID_galloc_kernel_info() {
        return createFieldID(mExportVarIdx_galloc_kernel_info, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_UnpackInputImage = 1;
    public Script.KernelID getKernelID_UnpackInputImage() {
        return createKernelID(mExportForEachIdx_UnpackInputImage, 57, null, null);
    }

    public void forEach_UnpackInputImage(Allocation ain) {
        forEach_UnpackInputImage(ain, null);
    }

    public void forEach_UnpackInputImage(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_UnpackInputImage, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_MarkLayerMask = 2;
    public Script.KernelID getKernelID_MarkLayerMask() {
        return createKernelID(mExportForEachIdx_MarkLayerMask, 57, null, null);
    }

    public void forEach_MarkLayerMask(Allocation ain) {
        forEach_MarkLayerMask(ain, null);
    }

    public void forEach_MarkLayerMask(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_MarkLayerMask, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_MarkLayerMaskPassInput = 3;
    public Script.KernelID getKernelID_MarkLayerMaskPassInput() {
        return createKernelID(mExportForEachIdx_MarkLayerMaskPassInput, 43, null, null);
    }

    public void forEach_MarkLayerMaskPassInput(Allocation ain, Allocation aout) {
        forEach_MarkLayerMaskPassInput(ain, aout, null);
    }

    public void forEach_MarkLayerMaskPassInput(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_MarkLayerMaskPassInput, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_ComputeLayerMatteBehindFocalDepth = 4;
    public Script.KernelID getKernelID_ComputeLayerMatteBehindFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeLayerMatteBehindFocalDepth, 57, null, null);
    }

    public void forEach_ComputeLayerMatteBehindFocalDepth(Allocation ain) {
        forEach_ComputeLayerMatteBehindFocalDepth(ain, null);
    }

    public void forEach_ComputeLayerMatteBehindFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeLayerMatteBehindFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_ComputeLayerMatteBehindFocalDepthPassInput = 5;
    public Script.KernelID getKernelID_ComputeLayerMatteBehindFocalDepthPassInput() {
        return createKernelID(mExportForEachIdx_ComputeLayerMatteBehindFocalDepthPassInput, 43, null, null);
    }

    public void forEach_ComputeLayerMatteBehindFocalDepthPassInput(Allocation ain, Allocation aout) {
        forEach_ComputeLayerMatteBehindFocalDepthPassInput(ain, aout, null);
    }

    public void forEach_ComputeLayerMatteBehindFocalDepthPassInput(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_ComputeLayerMatteBehindFocalDepthPassInput, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepth = 6;
    public Script.KernelID getKernelID_ComputeLayerMatteInFrontOfFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepth, 57, null, null);
    }

    public void forEach_ComputeLayerMatteInFrontOfFocalDepth(Allocation ain) {
        forEach_ComputeLayerMatteInFrontOfFocalDepth(ain, null);
    }

    public void forEach_ComputeLayerMatteInFrontOfFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepthPassInput = 7;
    public Script.KernelID getKernelID_ComputeLayerMatteInFrontOfFocalDepthPassInput() {
        return createKernelID(mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepthPassInput, 43, null, null);
    }

    public void forEach_ComputeLayerMatteInFrontOfFocalDepthPassInput(Allocation ain, Allocation aout) {
        forEach_ComputeLayerMatteInFrontOfFocalDepthPassInput(ain, aout, null);
    }

    public void forEach_ComputeLayerMatteInFrontOfFocalDepthPassInput(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_ComputeLayerMatteInFrontOfFocalDepthPassInput, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_ComputeIntegralImageForLayerBehindFocalDepth = 8;
    public Script.KernelID getKernelID_ComputeIntegralImageForLayerBehindFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeIntegralImageForLayerBehindFocalDepth, 57, null, null);
    }

    public void forEach_ComputeIntegralImageForLayerBehindFocalDepth(Allocation ain) {
        forEach_ComputeIntegralImageForLayerBehindFocalDepth(ain, null);
    }

    public void forEach_ComputeIntegralImageForLayerBehindFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeIntegralImageForLayerBehindFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_ComputeIntegralImageForLayerInFrontOfFocalDepth = 9;
    public Script.KernelID getKernelID_ComputeIntegralImageForLayerInFrontOfFocalDepth() {
        return createKernelID(mExportForEachIdx_ComputeIntegralImageForLayerInFrontOfFocalDepth, 57, null, null);
    }

    public void forEach_ComputeIntegralImageForLayerInFrontOfFocalDepth(Allocation ain) {
        forEach_ComputeIntegralImageForLayerInFrontOfFocalDepth(ain, null);
    }

    public void forEach_ComputeIntegralImageForLayerInFrontOfFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_ComputeIntegralImageForLayerInFrontOfFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_FilterLayerBehindFocalDepth = 10;
    public Script.KernelID getKernelID_FilterLayerBehindFocalDepth() {
        return createKernelID(mExportForEachIdx_FilterLayerBehindFocalDepth, 57, null, null);
    }

    public void forEach_FilterLayerBehindFocalDepth(Allocation ain) {
        forEach_FilterLayerBehindFocalDepth(ain, null);
    }

    public void forEach_FilterLayerBehindFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_FilterLayerBehindFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_FilterLayerBehindFocalDepthPassInput = 11;
    public Script.KernelID getKernelID_FilterLayerBehindFocalDepthPassInput() {
        return createKernelID(mExportForEachIdx_FilterLayerBehindFocalDepthPassInput, 43, null, null);
    }

    public void forEach_FilterLayerBehindFocalDepthPassInput(Allocation ain, Allocation aout) {
        forEach_FilterLayerBehindFocalDepthPassInput(ain, aout, null);
    }

    public void forEach_FilterLayerBehindFocalDepthPassInput(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_FilterLayerBehindFocalDepthPassInput, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_FilterLayerInFrontOfFocalDepth = 12;
    public Script.KernelID getKernelID_FilterLayerInFrontOfFocalDepth() {
        return createKernelID(mExportForEachIdx_FilterLayerInFrontOfFocalDepth, 57, null, null);
    }

    public void forEach_FilterLayerInFrontOfFocalDepth(Allocation ain) {
        forEach_FilterLayerInFrontOfFocalDepth(ain, null);
    }

    public void forEach_FilterLayerInFrontOfFocalDepth(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_FilterLayerInFrontOfFocalDepth, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_FilterLayerInFrontOfFocalDepthPassInput = 13;
    public Script.KernelID getKernelID_FilterLayerInFrontOfFocalDepthPassInput() {
        return createKernelID(mExportForEachIdx_FilterLayerInFrontOfFocalDepthPassInput, 43, null, null);
    }

    public void forEach_FilterLayerInFrontOfFocalDepthPassInput(Allocation ain, Allocation aout) {
        forEach_FilterLayerInFrontOfFocalDepthPassInput(ain, aout, null);
    }

    public void forEach_FilterLayerInFrontOfFocalDepthPassInput(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_FilterLayerInFrontOfFocalDepthPassInput, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_UpdateSharpImageUsingFuzzyImage = 14;
    public Script.KernelID getKernelID_UpdateSharpImageUsingFuzzyImage() {
        return createKernelID(mExportForEachIdx_UpdateSharpImageUsingFuzzyImage, 57, null, null);
    }

    public void forEach_UpdateSharpImageUsingFuzzyImage(Allocation ain) {
        forEach_UpdateSharpImageUsingFuzzyImage(ain, null);
    }

    public void forEach_UpdateSharpImageUsingFuzzyImage(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_UpdateSharpImageUsingFuzzyImage, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_UpdateSharpUsingFuzzyPassInput = 15;
    public Script.KernelID getKernelID_UpdateSharpUsingFuzzyPassInput() {
        return createKernelID(mExportForEachIdx_UpdateSharpUsingFuzzyPassInput, 43, null, null);
    }

    public void forEach_UpdateSharpUsingFuzzyPassInput(Allocation ain, Allocation aout) {
        forEach_UpdateSharpUsingFuzzyPassInput(ain, aout, null);
    }

    public void forEach_UpdateSharpUsingFuzzyPassInput(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_UpdateSharpUsingFuzzyPassInput, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_FinalizeFuzzyImageUsingSharpImage = 16;
    public Script.KernelID getKernelID_FinalizeFuzzyImageUsingSharpImage() {
        return createKernelID(mExportForEachIdx_FinalizeFuzzyImageUsingSharpImage, 57, null, null);
    }

    public void forEach_FinalizeFuzzyImageUsingSharpImage(Allocation ain) {
        forEach_FinalizeFuzzyImageUsingSharpImage(ain, null);
    }

    public void forEach_FinalizeFuzzyImageUsingSharpImage(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_FinalizeFuzzyImageUsingSharpImage, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_FinalizeFuzzyImageUsingSharpImagePassInput = 17;
    public Script.KernelID getKernelID_FinalizeFuzzyImageUsingSharpImagePassInput() {
        return createKernelID(mExportForEachIdx_FinalizeFuzzyImageUsingSharpImagePassInput, 43, null, null);
    }

    public void forEach_FinalizeFuzzyImageUsingSharpImagePassInput(Allocation ain, Allocation aout) {
        forEach_FinalizeFuzzyImageUsingSharpImagePassInput(ain, aout, null);
    }

    public void forEach_FinalizeFuzzyImageUsingSharpImagePassInput(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
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

        forEach(mExportForEachIdx_FinalizeFuzzyImageUsingSharpImagePassInput, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_PackOutputImage = 18;
    public Script.KernelID getKernelID_PackOutputImage() {
        return createKernelID(mExportForEachIdx_PackOutputImage, 58, null, null);
    }

    public void forEach_PackOutputImage(Allocation aout) {
        forEach_PackOutputImage(aout, null);
    }

    public void forEach_PackOutputImage(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_PackOutputImage, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_PackSharpImage = 19;
    public Script.KernelID getKernelID_PackSharpImage() {
        return createKernelID(mExportForEachIdx_PackSharpImage, 58, null, null);
    }

    public void forEach_PackSharpImage(Allocation aout) {
        forEach_PackSharpImage(aout, null);
    }

    public void forEach_PackSharpImage(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_PackSharpImage, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_PackFuzzyImage = 20;
    public Script.KernelID getKernelID_PackFuzzyImage() {
        return createKernelID(mExportForEachIdx_PackFuzzyImage, 58, null, null);
    }

    public void forEach_PackFuzzyImage(Allocation aout) {
        forEach_PackFuzzyImage(aout, null);
    }

    public void forEach_PackFuzzyImage(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_PackFuzzyImage, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_SetTargetLayer = 0;
    public Script.InvokeID getInvokeID_SetTargetLayer() {
        return createInvokeID(mExportFuncIdx_SetTargetLayer);
    }

    public void invoke_SetTargetLayer(int front, int back) {
        FieldPacker SetTargetLayer_fp = new FieldPacker(8);
        SetTargetLayer_fp.addI32(front);
        SetTargetLayer_fp.addI32(back);
        invoke(mExportFuncIdx_SetTargetLayer, SetTargetLayer_fp);
    }

    private final static int mExportFuncIdx_SetBlendInfo = 1;
    public Script.InvokeID getInvokeID_SetBlendInfo() {
        return createInvokeID(mExportFuncIdx_SetBlendInfo);
    }

    public void invoke_SetBlendInfo(int radius) {
        FieldPacker SetBlendInfo_fp = new FieldPacker(4);
        SetBlendInfo_fp.addI32(radius);
        invoke(mExportFuncIdx_SetBlendInfo, SetBlendInfo_fp);
    }

    private final static int mExportFuncIdx_SetUseIntegralImage = 2;
    public Script.InvokeID getInvokeID_SetUseIntegralImage() {
        return createInvokeID(mExportFuncIdx_SetUseIntegralImage);
    }

    public void invoke_SetUseIntegralImage(int use_integral_image) {
        FieldPacker SetUseIntegralImage_fp = new FieldPacker(4);
        SetUseIntegralImage_fp.addI32(use_integral_image);
        invoke(mExportFuncIdx_SetUseIntegralImage, SetUseIntegralImage_fp);
    }

    private final static int mExportFuncIdx_InitializeFast = 3;
    public Script.InvokeID getInvokeID_InitializeFast() {
        return createInvokeID(mExportFuncIdx_InitializeFast);
    }

    public void invoke_InitializeFast(int width, int height, int margin, int front, int back) {
        FieldPacker InitializeFast_fp = new FieldPacker(20);
        InitializeFast_fp.addI32(width);
        InitializeFast_fp.addI32(height);
        InitializeFast_fp.addI32(margin);
        InitializeFast_fp.addI32(front);
        InitializeFast_fp.addI32(back);
        invoke(mExportFuncIdx_InitializeFast, InitializeFast_fp);
    }

}

