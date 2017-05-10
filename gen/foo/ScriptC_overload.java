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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_overload/overload.rs
 */

package foo;

import android.renderscript.*;
import foo.overloadBitCode;

/**
 * @hide
 */
public class ScriptC_overload extends ScriptC {
    private static final String __rs_resource_name = "overload";
    // Constructor
    public  ScriptC_overload(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              overloadBitCode.getBitCode32(),
              overloadBitCode.getBitCode64());
    }

    private final static int mExportFuncIdx__Z3fooi = 0;
    public Script.InvokeID getInvokeID__Z3fooi() {
        return createInvokeID(mExportFuncIdx__Z3fooi);
    }

    public void invoke_foo(int i) {
        FieldPacker _Z3fooi_fp = new FieldPacker(4);
        _Z3fooi_fp.addI32(i);
        invoke(mExportFuncIdx__Z3fooi, _Z3fooi_fp);
    }

    private final static int mExportFuncIdx__Z3foof = 1;
    public Script.InvokeID getInvokeID__Z3foof() {
        return createInvokeID(mExportFuncIdx__Z3foof);
    }

    public void invoke_foo(float f) {
        FieldPacker _Z3foof_fp = new FieldPacker(4);
        _Z3foof_fp.addF32(f);
        invoke(mExportFuncIdx__Z3foof, _Z3foof_fp);
    }

}

