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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_warnings_rsSetElementAt/setelementat.rs
 */

package foo;

import android.renderscript.*;
import foo.setelementatBitCode;

/**
 * @hide
 */
public class ScriptC_setelementat extends ScriptC {
    private static final String __rs_resource_name = "setelementat";
    // Constructor
    public  ScriptC_setelementat(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              setelementatBitCode.getBitCode32(),
              setelementatBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
    }

    private Element __ALLOCATION;
    private FieldPacker __rs_fp_ALLOCATION;
    private final static int mExportVarIdx_A = 0;
    private Allocation mExportVar_A;
    public synchronized void set_A(Allocation v) {
        setVar(mExportVarIdx_A, v);
        mExportVar_A = v;
    }

    public Allocation get_A() {
        return mExportVar_A;
    }

    public Script.FieldID getFieldID_A() {
        return createFieldID(mExportVarIdx_A, null);
    }

}

