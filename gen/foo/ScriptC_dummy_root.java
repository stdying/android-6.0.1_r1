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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_dummy_root/dummy_root.rs
 */

package foo;

import android.renderscript.*;
import foo.dummy_rootBitCode;

/**
 * @hide
 */
public class ScriptC_dummy_root extends ScriptC {
    private static final String __rs_resource_name = "dummy_root";
    // Constructor
    public  ScriptC_dummy_root(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              dummy_rootBitCode.getBitCode32(),
              dummy_rootBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    //private final static int mExportForEachIdx_root = 0;
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

}

