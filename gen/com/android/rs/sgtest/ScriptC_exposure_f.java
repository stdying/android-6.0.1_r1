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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/ScriptGroupTest/src/com/android/rs/sgtest/exposure_f.rs
 */

package com.android.rs.sgtest;

import android.renderscript.*;
import com.android.rs.sgtest.exposure_fBitCode;

/**
 * @hide
 */
public class ScriptC_exposure_f extends ScriptC {
    private static final String __rs_resource_name = "exposure_f";
    // Constructor
    public  ScriptC_exposure_f(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              exposure_fBitCode.getBitCode32(),
              exposure_fBitCode.getBitCode64());
        __F32_4 = Element.F32_4(rs);
    }

    private Element __F32_4;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_exposure = 1;
    public Script.KernelID getKernelID_exposure() {
        return createKernelID(mExportForEachIdx_exposure, 35, null, null);
    }

    public void forEach_exposure(Allocation ain, Allocation aout) {
        forEach_exposure(ain, aout, null);
    }

    public void forEach_exposure(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_exposure, ain, aout, null, sc);
    }

}

