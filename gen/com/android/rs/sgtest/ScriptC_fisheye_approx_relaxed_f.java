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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/ScriptGroupTest/src/com/android/rs/sgtest/fisheye_approx_relaxed_f.rs
 */

package com.android.rs.sgtest;

import android.renderscript.*;
import com.android.rs.sgtest.fisheye_approx_relaxed_fBitCode;

/**
 * @hide
 */
public class ScriptC_fisheye_approx_relaxed_f extends ScriptC {
    private static final String __rs_resource_name = "fisheye_approx_relaxed_f";
    // Constructor
    public  ScriptC_fisheye_approx_relaxed_f(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              fisheye_approx_relaxed_fBitCode.getBitCode32(),
              fisheye_approx_relaxed_fBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __F32_4 = Element.F32_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private final static int mExportVarIdx_in_alloc = 0;
    private Allocation mExportVar_in_alloc;
    public synchronized void set_in_alloc(Allocation v) {
        setVar(mExportVarIdx_in_alloc, v);
        mExportVar_in_alloc = v;
    }

    public Allocation get_in_alloc() {
        return mExportVar_in_alloc;
    }

    public Script.FieldID getFieldID_in_alloc() {
        return createFieldID(mExportVarIdx_in_alloc, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_fisheye = 1;
    public Script.KernelID getKernelID_fisheye() {
        return createKernelID(mExportForEachIdx_fisheye, 58, null, null);
    }

    public void forEach_fisheye(Allocation aout) {
        forEach_fisheye(aout, null);
    }

    public void forEach_fisheye(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        forEach(mExportForEachIdx_fisheye, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_init_filter = 0;
    public Script.InvokeID getInvokeID_init_filter() {
        return createInvokeID(mExportFuncIdx_init_filter);
    }

    public void invoke_init_filter(long dim_x, long dim_y, float center_x, float center_y, float k, Sampler sam) {
        FieldPacker init_filter_fp = new FieldPacker(56);
        init_filter_fp.addU32(dim_x);
        init_filter_fp.addU32(dim_y);
        init_filter_fp.addF32(center_x);
        init_filter_fp.addF32(center_y);
        init_filter_fp.addF32(k);
        init_filter_fp.skip(4);
        init_filter_fp.addObj(sam);
        invoke(mExportFuncIdx_init_filter, init_filter_fp);
    }

}

