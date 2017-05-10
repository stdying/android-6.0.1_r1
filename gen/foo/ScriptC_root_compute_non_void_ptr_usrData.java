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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_root_compute_non_void_ptr_usrData/root_compute_non_void_ptr_usrData.rs
 */

package foo;

import android.renderscript.*;
import foo.root_compute_non_void_ptr_usrDataBitCode;

/**
 * @hide
 */
public class ScriptC_root_compute_non_void_ptr_usrData extends ScriptC {
    private static final String __rs_resource_name = "root_compute_non_void_ptr_usrdata";
    // Constructor
    public  ScriptC_root_compute_non_void_ptr_usrData(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              root_compute_non_void_ptr_usrDataBitCode.getBitCode32(),
              root_compute_non_void_ptr_usrDataBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 7, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, int usrData) {
        forEach_root(ain, aout, usrData, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, int usrData, Script.LaunchOptions sc) {
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

        FieldPacker root_fp = new FieldPacker(4);
        root_fp.addI32(usrData);
        forEach(mExportForEachIdx_root, ain, aout, root_fp, sc);
    }

}

