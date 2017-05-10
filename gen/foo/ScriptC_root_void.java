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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_root_void/root_void.rs
 */

package foo;

import android.renderscript.*;
import foo.root_voidBitCode;

/**
 * @hide
 */
public class ScriptC_root_void extends ScriptC {
    private static final String __rs_resource_name = "root_void";
    // Constructor
    public  ScriptC_root_void(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              root_voidBitCode.getBitCode32(),
              root_voidBitCode.getBitCode64());
    }

    private final static int mExportForEachIdx_root = 0;
    public Script.KernelID getKernelID_root() {
        return createKernelID(mExportForEachIdx_root, 31, null, null);
    }

    public void forEach_root(Allocation ain, Allocation aout) {
        forEach_root(ain, aout, null);
    }

    public void forEach_root(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_root, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_usrdata_x_y_only = 1;
    public Script.KernelID getKernelID_in_out_usrdata_x_y_only() {
        return createKernelID(mExportForEachIdx_in_out_usrdata_x_y_only, 31, null, null);
    }

    public void forEach_in_out_usrdata_x_y_only(Allocation ain, Allocation aout) {
        forEach_in_out_usrdata_x_y_only(ain, aout, null);
    }

    public void forEach_in_out_usrdata_x_y_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_usrdata_x_y_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_usrdata_y_only = 2;
    public Script.KernelID getKernelID_in_out_usrdata_y_only() {
        return createKernelID(mExportForEachIdx_in_out_usrdata_y_only, 23, null, null);
    }

    public void forEach_in_out_usrdata_y_only(Allocation ain, Allocation aout) {
        forEach_in_out_usrdata_y_only(ain, aout, null);
    }

    public void forEach_in_out_usrdata_y_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_usrdata_y_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_usrdata_x_only = 3;
    public Script.KernelID getKernelID_in_out_usrdata_x_only() {
        return createKernelID(mExportForEachIdx_in_out_usrdata_x_only, 15, null, null);
    }

    public void forEach_in_out_usrdata_x_only(Allocation ain, Allocation aout) {
        forEach_in_out_usrdata_x_only(ain, aout, null);
    }

    public void forEach_in_out_usrdata_x_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_usrdata_x_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_usrdata_only = 4;
    public Script.KernelID getKernelID_in_out_usrdata_only() {
        return createKernelID(mExportForEachIdx_in_out_usrdata_only, 7, null, null);
    }

    public void forEach_in_out_usrdata_only(Allocation ain, Allocation aout) {
        forEach_in_out_usrdata_only(ain, aout, null);
    }

    public void forEach_in_out_usrdata_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_usrdata_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_x_y_only = 5;
    public Script.KernelID getKernelID_in_out_x_y_only() {
        return createKernelID(mExportForEachIdx_in_out_x_y_only, 27, null, null);
    }

    public void forEach_in_out_x_y_only(Allocation ain, Allocation aout) {
        forEach_in_out_x_y_only(ain, aout, null);
    }

    public void forEach_in_out_x_y_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_x_y_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_y_only = 6;
    public Script.KernelID getKernelID_in_out_y_only() {
        return createKernelID(mExportForEachIdx_in_out_y_only, 19, null, null);
    }

    public void forEach_in_out_y_only(Allocation ain, Allocation aout) {
        forEach_in_out_y_only(ain, aout, null);
    }

    public void forEach_in_out_y_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_y_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_x_only = 7;
    public Script.KernelID getKernelID_in_out_x_only() {
        return createKernelID(mExportForEachIdx_in_out_x_only, 11, null, null);
    }

    public void forEach_in_out_x_only(Allocation ain, Allocation aout) {
        forEach_in_out_x_only(ain, aout, null);
    }

    public void forEach_in_out_x_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_x_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_out_only = 8;
    public Script.KernelID getKernelID_in_out_only() {
        return createKernelID(mExportForEachIdx_in_out_only, 3, null, null);
    }

    public void forEach_in_out_only(Allocation ain, Allocation aout) {
        forEach_in_out_only(ain, aout, null);
    }

    public void forEach_in_out_only(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_in_out_only, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_usrdata_x_y_only = 9;
    public Script.KernelID getKernelID_out_usrdata_x_y_only() {
        return createKernelID(mExportForEachIdx_out_usrdata_x_y_only, 30, null, null);
    }

    public void forEach_out_usrdata_x_y_only(Allocation aout) {
        forEach_out_usrdata_x_y_only(aout, null);
    }

    public void forEach_out_usrdata_x_y_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_usrdata_x_y_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_usrdata_y_only = 10;
    public Script.KernelID getKernelID_out_usrdata_y_only() {
        return createKernelID(mExportForEachIdx_out_usrdata_y_only, 22, null, null);
    }

    public void forEach_out_usrdata_y_only(Allocation aout) {
        forEach_out_usrdata_y_only(aout, null);
    }

    public void forEach_out_usrdata_y_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_usrdata_y_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_usrdata_x_only = 11;
    public Script.KernelID getKernelID_out_usrdata_x_only() {
        return createKernelID(mExportForEachIdx_out_usrdata_x_only, 14, null, null);
    }

    public void forEach_out_usrdata_x_only(Allocation aout) {
        forEach_out_usrdata_x_only(aout, null);
    }

    public void forEach_out_usrdata_x_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_usrdata_x_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_usrdata_only = 12;
    public Script.KernelID getKernelID_out_usrdata_only() {
        return createKernelID(mExportForEachIdx_out_usrdata_only, 6, null, null);
    }

    public void forEach_out_usrdata_only(Allocation aout) {
        forEach_out_usrdata_only(aout, null);
    }

    public void forEach_out_usrdata_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_usrdata_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_x_y_only = 13;
    public Script.KernelID getKernelID_out_x_y_only() {
        return createKernelID(mExportForEachIdx_out_x_y_only, 26, null, null);
    }

    public void forEach_out_x_y_only(Allocation aout) {
        forEach_out_x_y_only(aout, null);
    }

    public void forEach_out_x_y_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_x_y_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_y_only = 14;
    public Script.KernelID getKernelID_out_y_only() {
        return createKernelID(mExportForEachIdx_out_y_only, 18, null, null);
    }

    public void forEach_out_y_only(Allocation aout) {
        forEach_out_y_only(aout, null);
    }

    public void forEach_out_y_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_y_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_x_only = 15;
    public Script.KernelID getKernelID_out_x_only() {
        return createKernelID(mExportForEachIdx_out_x_only, 10, null, null);
    }

    public void forEach_out_x_only(Allocation aout) {
        forEach_out_x_only(aout, null);
    }

    public void forEach_out_x_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_x_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_out_only = 16;
    public Script.KernelID getKernelID_out_only() {
        return createKernelID(mExportForEachIdx_out_only, 2, null, null);
    }

    public void forEach_out_only(Allocation aout) {
        forEach_out_only(aout, null);
    }

    public void forEach_out_only(Allocation aout, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_out_only, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_in_usrdata_x_y_only = 17;
    public Script.KernelID getKernelID_in_usrdata_x_y_only() {
        return createKernelID(mExportForEachIdx_in_usrdata_x_y_only, 29, null, null);
    }

    public void forEach_in_usrdata_x_y_only(Allocation ain) {
        forEach_in_usrdata_x_y_only(ain, null);
    }

    public void forEach_in_usrdata_x_y_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_usrdata_x_y_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_in_usrdata_y_only = 18;
    public Script.KernelID getKernelID_in_usrdata_y_only() {
        return createKernelID(mExportForEachIdx_in_usrdata_y_only, 21, null, null);
    }

    public void forEach_in_usrdata_y_only(Allocation ain) {
        forEach_in_usrdata_y_only(ain, null);
    }

    public void forEach_in_usrdata_y_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_usrdata_y_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_in_usrdata_x_only = 19;
    public Script.KernelID getKernelID_in_usrdata_x_only() {
        return createKernelID(mExportForEachIdx_in_usrdata_x_only, 13, null, null);
    }

    public void forEach_in_usrdata_x_only(Allocation ain) {
        forEach_in_usrdata_x_only(ain, null);
    }

    public void forEach_in_usrdata_x_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_usrdata_x_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_in_usrdata_only = 20;
    public Script.KernelID getKernelID_in_usrdata_only() {
        return createKernelID(mExportForEachIdx_in_usrdata_only, 5, null, null);
    }

    public void forEach_in_usrdata_only(Allocation ain) {
        forEach_in_usrdata_only(ain, null);
    }

    public void forEach_in_usrdata_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_usrdata_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_in_x_y_only = 21;
    public Script.KernelID getKernelID_in_x_y_only() {
        return createKernelID(mExportForEachIdx_in_x_y_only, 25, null, null);
    }

    public void forEach_in_x_y_only(Allocation ain) {
        forEach_in_x_y_only(ain, null);
    }

    public void forEach_in_x_y_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_x_y_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_in_y_only = 22;
    public Script.KernelID getKernelID_in_y_only() {
        return createKernelID(mExportForEachIdx_in_y_only, 17, null, null);
    }

    public void forEach_in_y_only(Allocation ain) {
        forEach_in_y_only(ain, null);
    }

    public void forEach_in_y_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_y_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_in_x_only = 23;
    public Script.KernelID getKernelID_in_x_only() {
        return createKernelID(mExportForEachIdx_in_x_only, 9, null, null);
    }

    public void forEach_in_x_only(Allocation ain) {
        forEach_in_x_only(ain, null);
    }

    public void forEach_in_x_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_x_only, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_in_only = 24;
    public Script.KernelID getKernelID_in_only() {
        return createKernelID(mExportForEachIdx_in_only, 1, null, null);
    }

    public void forEach_in_only(Allocation ain) {
        forEach_in_only(ain, null);
    }

    public void forEach_in_only(Allocation ain, Script.LaunchOptions sc) {
        forEach(mExportForEachIdx_in_only, ain, null, null, sc);
    }

}

