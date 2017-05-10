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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/addup.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.addupBitCode;

/**
 * @hide
 */
public class ScriptC_addup extends ScriptC {
    private static final String __rs_resource_name = "addup";
    // Constructor
    public  ScriptC_addup(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              addupBitCode.getBitCode32(),
              addupBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32 = Element.I32(rs);
        __I32_4 = Element.I32_4(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private Element __I32_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_a_in = 0;
    private Allocation mExportVar_a_in;
    public synchronized void set_a_in(Allocation v) {
        setVar(mExportVarIdx_a_in, v);
        mExportVar_a_in = v;
    }

    public Allocation get_a_in() {
        return mExportVar_a_in;
    }

    public Script.FieldID getFieldID_a_in() {
        return createFieldID(mExportVarIdx_a_in, null);
    }

    private final static int mExportVarIdx_reduction_stride = 1;
    private int mExportVar_reduction_stride;
    public synchronized void set_reduction_stride(int v) {
        setVar(mExportVarIdx_reduction_stride, v);
        mExportVar_reduction_stride = v;
    }

    public int get_reduction_stride() {
        return mExportVar_reduction_stride;
    }

    public Script.FieldID getFieldID_reduction_stride() {
        return createFieldID(mExportVarIdx_reduction_stride, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_add = 1;
    public Script.KernelID getKernelID_add() {
        return createKernelID(mExportForEachIdx_add, 42, null, null);
    }

    public void forEach_add(Allocation aout) {
        forEach_add(aout, null);
    }

    public void forEach_add(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        forEach(mExportForEachIdx_add, (Allocation) null, aout, null, sc);
    }

}

