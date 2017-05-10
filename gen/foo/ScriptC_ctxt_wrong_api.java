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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/F_ctxt_wrong_api/ctxt_wrong_api.rs
 */

package foo;

import android.renderscript.*;
import foo.ctxt_wrong_apiBitCode;

/**
 * @hide
 */
public class ScriptC_ctxt_wrong_api extends ScriptC {
    private static final String __rs_resource_name = "ctxt_wrong_api";
    // Constructor
    public  ScriptC_ctxt_wrong_api(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              ctxt_wrong_apiBitCode.getBitCode32(),
              ctxt_wrong_apiBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_good = 1;
    public Script.KernelID getKernelID_good() {
        return createKernelID(mExportForEachIdx_good, 163, null, null);
    }

    public void forEach_good(Allocation ain, Allocation aout) {
        forEach_good(ain, aout, null);
    }

    public void forEach_good(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
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

        forEach(mExportForEachIdx_good, ain, aout, null, sc);
    }

}

