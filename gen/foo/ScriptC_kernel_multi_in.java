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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_kernel_multi_in/kernel_multi_in.rs
 */

package foo;

import android.renderscript.*;
import foo.kernel_multi_inBitCode;

/**
 * @hide
 */
public class ScriptC_kernel_multi_in extends ScriptC {
    private static final String __rs_resource_name = "kernel_multi_in";
    // Constructor
    public  ScriptC_kernel_multi_in(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              kernel_multi_inBitCode.getBitCode32(),
              kernel_multi_inBitCode.getBitCode64());
        __U32 = Element.U32(rs);
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private Element __U32;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_multi_in = 1;
    public Script.KernelID getKernelID_multi_in() {
        return createKernelID(mExportForEachIdx_multi_in, 35, null, null);
    }

    public void forEach_multi_in(Allocation ain_in0, Allocation ain_in1, Allocation aout) {
        forEach_multi_in(ain_in0, ain_in1, aout, null);
    }

    public void forEach_multi_in(Allocation ain_in0, Allocation ain_in1, Allocation aout, Script.LaunchOptions sc) {
        // check ain_in0
        if (!ain_in0.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check ain_in1
        if (!ain_in1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = ain_in1.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and ain_in1!");
        }

        // Verify dimensions
        t0 = ain_in0.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain_in0 and aout!");
        }

        forEach(mExportForEachIdx_multi_in, new Allocation[]{ain_in0, ain_in1}, aout, null, sc);
    }

}

