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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/libbcc/tests/debuginfo/target-tests/breakpoint_function.rs
 */

package com.android.test.rsdebug.breakpoint_function;

import android.renderscript.*;
import com.android.test.rsdebug.breakpoint_function.breakpoint_functionBitCode;

/**
 * @hide
 */
public class ScriptC_breakpoint_function extends ScriptC {
    private static final String __rs_resource_name = "breakpoint_function";
    // Constructor
    public  ScriptC_breakpoint_function(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              breakpoint_functionBitCode.getBitCode32(),
              breakpoint_functionBitCode.getBitCode64());
    }

    private final static int mExportFuncIdx_entry = 0;
    public Script.InvokeID getInvokeID_entry() {
        return createInvokeID(mExportFuncIdx_entry);
    }

    public void invoke_entry() {
        invoke(mExportFuncIdx_entry);
    }

}

