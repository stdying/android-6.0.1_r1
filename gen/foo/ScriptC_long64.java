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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_long64/long64.rs
 */

package foo;

import android.renderscript.*;
import foo.long64BitCode;

/**
 * @hide
 */
public class ScriptC_long64 extends ScriptC {
    private static final String __rs_resource_name = "long64";
    // Constructor
    public  ScriptC_long64(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              long64BitCode.getBitCode32(),
              long64BitCode.getBitCode64());
        mExportVar_l = 4294967296L;
        __I64 = Element.I64(rs);
    }

    private Element __I64;
    private FieldPacker __rs_fp_I64;
    private final static int mExportVarIdx_l = 0;
    private long mExportVar_l;
    public synchronized void set_l(long v) {
        setVar(mExportVarIdx_l, v);
        mExportVar_l = v;
    }

    public long get_l() {
        return mExportVar_l;
    }

    public Script.FieldID getFieldID_l() {
        return createFieldID(mExportVarIdx_l, null);
    }

}

