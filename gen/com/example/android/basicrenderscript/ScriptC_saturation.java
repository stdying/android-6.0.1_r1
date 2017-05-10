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
 * The source Renderscript file: /media/li/old/asop/aosp/developers/samples/android/renderScript/BasicRenderScript/Application/src/main/rs/saturation.rs
 */

package com.example.android.basicrenderscript;

import android.renderscript.*;
import com.example.android.basicrenderscript.saturationBitCode;

/**
 * @hide
 */
public class ScriptC_saturation extends ScriptC {
    private static final String __rs_resource_name = "saturation";
    // Constructor
    public  ScriptC_saturation(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              saturationBitCode.getBitCode32(),
              saturationBitCode.getBitCode64());
        mExportVar_saturationValue = 0.f;
        __F32 = Element.F32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    private Element __F32;
    private Element __U8_4;
    private FieldPacker __rs_fp_F32;
    private final static int mExportVarIdx_saturationValue = 0;
    private float mExportVar_saturationValue;
    public synchronized void set_saturationValue(float v) {
        setVar(mExportVarIdx_saturationValue, v);
        mExportVar_saturationValue = v;
    }

    public float get_saturationValue() {
        return mExportVar_saturationValue;
    }

    public Script.FieldID getFieldID_saturationValue() {
        return createFieldID(mExportVarIdx_saturationValue, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_saturation = 1;
    public Script.KernelID getKernelID_saturation() {
        return createKernelID(mExportForEachIdx_saturation, 35, null, null);
    }

    public void forEach_saturation(Allocation ain, Allocation aout) {
        forEach_saturation(ain, aout, null);
    }

    public void forEach_saturation(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_saturation, ain, aout, null, sc);
    }

}

