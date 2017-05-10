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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_local_ref_after_return/local_ref_after_return.rs
 */

package foo;

import android.renderscript.*;
import foo.local_ref_after_returnBitCode;

/**
 * @hide
 */
public class ScriptC_local_ref_after_return extends ScriptC {
    private static final String __rs_resource_name = "local_ref_after_return";
    // Constructor
    public  ScriptC_local_ref_after_return(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              local_ref_after_returnBitCode.getBitCode32(),
              local_ref_after_returnBitCode.getBitCode64());
        mExportVar_init = false;
        __BOOLEAN = Element.BOOLEAN(rs);
    }

    private Element __BOOLEAN;
    private FieldPacker __rs_fp_BOOLEAN;
    private final static int mExportVarIdx_init = 0;
    private boolean mExportVar_init;
    public synchronized void set_init(boolean v) {
        if (__rs_fp_BOOLEAN!= null) {
            __rs_fp_BOOLEAN.reset();
        } else {
            __rs_fp_BOOLEAN = new FieldPacker(1);
        }
        __rs_fp_BOOLEAN.addBoolean(v);
        setVar(mExportVarIdx_init, __rs_fp_BOOLEAN);
        mExportVar_init = v;
    }

    public boolean get_init() {
        return mExportVar_init;
    }

    public Script.FieldID getFieldID_init() {
        return createFieldID(mExportVarIdx_init, null);
    }

    private final static int mExportFuncIdx_foo = 0;
    public Script.InvokeID getInvokeID_foo() {
        return createInvokeID(mExportFuncIdx_foo);
    }

    public void invoke_foo() {
        invoke(mExportFuncIdx_foo);
    }

}

