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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RSTest_CompatLib/src/com/android/rs/test/increment2.rs
 */

package com.android.rs.test_compat;

import android.renderscript.*;
import com.android.rs.test_compat.increment2BitCode;

/**
 * @hide
 */
public class ScriptC_increment2 extends ScriptC {
    private static final String __rs_resource_name = "increment2";
    // Constructor
    public  ScriptC_increment2(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              increment2BitCode.getBitCode32(),
              increment2BitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        __I32_4 = Element.I32_4(rs);
    }

    private Element __ALLOCATION;
    private Element __I32_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private final static int mExportVarIdx_a = 0;
    private Allocation mExportVar_a;
    public synchronized void set_a(Allocation v) {
        setVar(mExportVarIdx_a, v);
        mExportVar_a = v;
    }

    public Allocation get_a() {
        return mExportVar_a;
    }

    public Script.FieldID getFieldID_a() {
        return createFieldID(mExportVarIdx_a, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_increment2 = 1;
    public Script.KernelID getKernelID_increment2() {
        return createKernelID(mExportForEachIdx_increment2, 41, null, null);
    }

    public void forEach_increment2(Allocation ain) {
        forEach_increment2(ain, null);
    }

    public void forEach_increment2(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        forEach(mExportForEachIdx_increment2, ain, null, null, sc);
    }

}

