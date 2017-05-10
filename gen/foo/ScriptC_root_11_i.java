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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_root_11_i/root_11_i.rs
 */

package foo;

import android.renderscript.*;
import foo.root_11_iBitCode;

/**
 * @hide
 */
public class ScriptC_root_11_i extends ScriptC {
    private static final String __rs_resource_name = "root_11_i";
    // Constructor
    public  ScriptC_root_11_i(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              root_11_iBitCode.getBitCode32(),
              root_11_iBitCode.getBitCode64());
        __I32 = Element.I32(rs);
    }

    private Element __I32;
    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 1, null, null);
    }

    public void forEach_root(Allocation ain) {
        forEach_root(ain, null);
    }

    public void forEach_root(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_root, ain, null, null, sc);
    }

}

