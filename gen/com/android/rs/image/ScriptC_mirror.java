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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/ImageProcessing/src/com/android/rs/image/mirror.rs
 */

package com.android.rs.image;

import android.renderscript.*;
import com.android.rs.image.mirrorBitCode;

/**
 * @hide
 */
public class ScriptC_mirror extends ScriptC {
    private static final String __rs_resource_name = "mirror";
    // Constructor
    public  ScriptC_mirror(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              mirrorBitCode.getBitCode32(),
              mirrorBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_gWidth = 0;
    private int mExportVar_gWidth;
    public synchronized void set_gWidth(int v) {
        setVar(mExportVarIdx_gWidth, v);
        mExportVar_gWidth = v;
    }

    public int get_gWidth() {
        return mExportVar_gWidth;
    }

    public Script.FieldID getFieldID_gWidth() {
        return createFieldID(mExportVarIdx_gWidth, null);
    }

    private final static int mExportVarIdx_gHeight = 1;
    private int mExportVar_gHeight;
    public synchronized void set_gHeight(int v) {
        setVar(mExportVarIdx_gHeight, v);
        mExportVar_gHeight = v;
    }

    public int get_gHeight() {
        return mExportVar_gHeight;
    }

    public Script.FieldID getFieldID_gHeight() {
        return createFieldID(mExportVarIdx_gHeight, null);
    }

    private final static int mExportVarIdx_gIn = 2;
    private Allocation mExportVar_gIn;
    public synchronized void set_gIn(Allocation v) {
        setVar(mExportVarIdx_gIn, v);
        mExportVar_gIn = v;
    }

    public Allocation get_gIn() {
        return mExportVar_gIn;
    }

    public Script.FieldID getFieldID_gIn() {
        return createFieldID(mExportVarIdx_gIn, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_mirror = 1;
    public Script.KernelID getKernelID_mirror() {
        return createKernelID(mExportForEachIdx_mirror, 58, null, null);
    }

    public void forEach_mirror(Allocation aout) {
        forEach_mirror(aout, null);
    }

    public void forEach_mirror(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(mExportForEachIdx_mirror, (Allocation) null, aout, null, sc);
    }

}

