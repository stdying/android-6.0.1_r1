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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/double.rs
 */

package com.android.rs.test_compat;

import android.renderscript.*;
import com.android.rs.test_compat.doubleBitCode;

/**
 * @hide
 */
public class ScriptC_double extends ScriptC {
    private static final String __rs_resource_name = "double";
    // Constructor
    public  ScriptC_double(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              doubleBitCode.getBitCode32(),
              doubleBitCode.getBitCode64());
        __I32_4 = Element.I32_4(rs);
    }

    private Element __I32_4;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_doubleKernel = 1;
    public Script.KernelID getKernelID_doubleKernel() {
        return createKernelID(mExportForEachIdx_doubleKernel, 35, null, null);
    }

    public void forEach_doubleKernel(Allocation ain, Allocation aout) {
        forEach_doubleKernel(ain, aout, null);
    }

    public void forEach_doubleKernel(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
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

        forEach(mExportForEachIdx_doubleKernel, ain, aout, null, sc);
    }

}

