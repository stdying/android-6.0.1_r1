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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/lit-tests/P_compute/compute.rs
 */

package compute;

import android.renderscript.*;
import compute.computeBitCode;

/**
 * @hide
 */
public class ScriptC_compute extends ScriptC {
    private static final String __rs_resource_name = "compute";
    // Constructor
    public  ScriptC_compute(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              computeBitCode.getBitCode32(),
              computeBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 31, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        forEach_root(ain, aout, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_root, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_foo = 1;
    public Script.KernelID getKernelID_foo() {
        return createKernelID(mExportForEachIdx_foo, 2, null, null);
    }

    public void forEach_foo(Allocation aout) {
        forEach_foo(aout, null);
    }

    public void forEach_foo(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_foo, (Allocation) null, aout, null, sc);
    }

    private final static int mExportFuncIdx_bar = 0;
    public Script.InvokeID getInvokeID_bar() {
        return createInvokeID(mExportFuncIdx_bar);
    }

    public void invoke_bar(int i, float f) {
        FieldPacker bar_fp = new FieldPacker(8);
        bar_fp.addI32(i);
        bar_fp.addF32(f);
        invoke(mExportFuncIdx_bar, bar_fp);
    }

}

