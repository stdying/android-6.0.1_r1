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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_foreach/foreach.rs
 */

package com.example.foo;

import android.renderscript.*;
import com.example.foo.foreachBitCode;

/**
 * @hide
 */
public class ScriptC_foreach extends ScriptC {
    private static final String __rs_resource_name = "foreach";
    // Constructor
    public  ScriptC_foreach(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              foreachBitCode.getBitCode32(),
              foreachBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_foo = 1;
    public Script.KernelID getKernelID_foo() {
        return createKernelID(mExportForEachIdx_foo, 35, null, null);
    }

    public void forEach_foo(Allocation ain, Allocation aout) {
        forEach_foo(ain, aout, null);
    }

    public void forEach_foo(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_foo, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_oldFoo = 2;
    public Script.KernelID getKernelID_oldFoo() {
        return createKernelID(mExportForEachIdx_oldFoo, 3, null, null);
    }

    public void forEach_oldFoo(Allocation ain, Allocation aout) {
        forEach_oldFoo(ain, aout, null);
    }

    public void forEach_oldFoo(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
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

        forEach(mExportForEachIdx_oldFoo, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_testStart = 0;
    public Script.InvokeID getInvokeID_testStart() {
        return createInvokeID(mExportFuncIdx_testStart);
    }

    public void invoke_testStart(Allocation in, Allocation out) {
        FieldPacker testStart_fp = new FieldPacker(64);
        testStart_fp.addObj(in);
        testStart_fp.addObj(out);
        invoke(mExportFuncIdx_testStart, testStart_fp);
    }

}

