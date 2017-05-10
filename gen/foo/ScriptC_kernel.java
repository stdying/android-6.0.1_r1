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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_kernel/kernel.rs
 */

package foo;

import android.renderscript.*;
import foo.kernelBitCode;

/**
 * @hide
 */
public class ScriptC_kernel extends ScriptC {
    private static final String __rs_resource_name = "kernel";
    // Constructor
    public  ScriptC_kernel(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              kernelBitCode.getBitCode32(),
              kernelBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_add_foreach = 1;
    public Script.KernelID getKernelID_add_foreach() {
        return createKernelID(mExportForEachIdx_add_foreach, 35, null, null);
    }

    public void forEach_add_foreach(Allocation ain_a, Allocation ain_b, Allocation aout) {
        forEach_add_foreach(ain_a, ain_b, aout, null);
    }

    public void forEach_add_foreach(Allocation ain_a, Allocation ain_b, Allocation aout, Script.LaunchOptions sc) {
        // check ain_a
        if (!ain_a.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check ain_b
        if (!ain_b.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain_a.getType();
        t1 = ain_b.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_a and ain_b!");
        }

        // Verify dimensions
        t0 = ain_a.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_a and aout!");
        }

        forEach(mExportForEachIdx_add_foreach, new Allocation[]{ain_a, ain_b}, aout, null, sc);
    }

}

