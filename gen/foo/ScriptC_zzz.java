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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/F_unknown_function/zzz.rs
 */

package foo;

import android.renderscript.*;
import foo.zzzBitCode;

/**
 * @hide
 */
public class ScriptC_zzz extends ScriptC {
    private static final String __rs_resource_name = "zzz";
    // Constructor
    public  ScriptC_zzz(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              zzzBitCode.getBitCode32(),
              zzzBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_i = 0;
    private int mExportVar_i;
    public synchronized void set_i(int v) {
        setVar(mExportVarIdx_i, v);
        mExportVar_i = v;
    }

    public int get_i() {
        return mExportVar_i;
    }

    public Script.FieldID getFieldID_i() {
        return createFieldID(mExportVarIdx_i, null);
    }

}

