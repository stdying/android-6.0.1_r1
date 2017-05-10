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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/tests/cppbasic-getpointer/mono.rs
 */

package com.android.rs.cppbasic;

import android.renderscript.*;
import com.android.rs.cppbasic.monoBitCode;

/**
 * @hide
 */
public class ScriptC_mono extends ScriptC {
    private static final String __rs_resource_name = "mono";
    // Constructor
    public  ScriptC_mono(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              monoBitCode.getBitCode32(),
              monoBitCode.getBitCode64());
        __U32 = Element.U32(rs);
    }

    private Element __U32;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_copyAndNot = 1;
    public Script.KernelID getKernelID_copyAndNot() {
        return createKernelID(mExportForEachIdx_copyAndNot, 35, null, null);
    }

    public void forEach_copyAndNot(Allocation ain, Allocation aout) {
        forEach_copyAndNot(ain, aout, null);
    }

    public void forEach_copyAndNot(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
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

        forEach(mExportForEachIdx_copyAndNot, ain, aout, null, sc);
    }

}

