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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_fs_kernel/fs_kernel.fs
 */

package foo;

import android.renderscript.*;
import foo.fs_kernelBitCode;

/**
 * @hide
 */
public class ScriptC_fs_kernel extends ScriptC {
    private static final String __rs_resource_name = "fs_kernel";
    // Constructor
    public  ScriptC_fs_kernel(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              fs_kernelBitCode.getBitCode32(),
              fs_kernelBitCode.getBitCode64());
        __U32 = Element.U32(rs);
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private Element __U32;
    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 35, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        forEach_root(ain, aout, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
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

        forEach(mExportForEachIdx_root, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_only = 1;
    public Script.KernelID getKernelID_in_only() {
        return createKernelID(mExportForEachIdx_in_only, 33, null, null);
    }

    public void forEach_in_only(Allocation ain) {
        forEach_in_only(ain, null);
    }

    public void forEach_in_only(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        forEach(mExportForEachIdx_in_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_out_only = 2;
    public Script.KernelID getKernelID_out_only() {
        return createKernelID(mExportForEachIdx_out_only, 34, null, null);
    }

    public void forEach_out_only(Allocation aout) {
        forEach_out_only(aout, null);
    }

    public void forEach_out_only(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_out_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_everything = 3;
    public Script.KernelID getKernelID_everything() {
        return createKernelID(mExportForEachIdx_everything, 59, null, null);
    }

    public void forEach_everything(Allocation ain, Allocation aout) {
        forEach_everything(ain, aout, null);
    }

    public void forEach_everything(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
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

        forEach(mExportForEachIdx_everything, ain, aout, null, sc);
    }

}

