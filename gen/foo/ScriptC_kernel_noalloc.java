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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_kernel_noalloc/kernel_noalloc.rs
 */

package foo;

import android.renderscript.*;
import foo.kernel_noallocBitCode;

/**
 * @hide
 */
public class ScriptC_kernel_noalloc extends ScriptC {
    private static final String __rs_resource_name = "kernel_noalloc";
    // Constructor
    public  ScriptC_kernel_noalloc(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              kernel_noallocBitCode.getBitCode32(),
              kernel_noallocBitCode.getBitCode64());
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 40, null, null);
    }

    public void forEach_root(Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_root, (Allocation) null, null, null, sc);
    }

}

