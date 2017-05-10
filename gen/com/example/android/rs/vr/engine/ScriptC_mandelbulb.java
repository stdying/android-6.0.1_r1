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
 * The source Renderscript file: /media/li/old/asop/aosp/frameworks/rs/java/tests/VrDemo/src/com/example/android/rs/vr/engine/mandelbulb.rs
 */

package com.example.android.rs.vr.engine;

import android.renderscript.*;
import com.example.android.rs.vr.engine.mandelbulbBitCode;

/**
 * @hide
 */
public class ScriptC_mandelbulb extends ScriptC {
    private static final String __rs_resource_name = "mandelbulb";
    // Constructor
    public  ScriptC_mandelbulb(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              mandelbulbBitCode.getBitCode32(),
              mandelbulbBitCode.getBitCode64());
        __I32 = Element.I32(rs);
        __ALLOCATION = Element.ALLOCATION(rs);
        __I16 = Element.I16(rs);
    }

    private Element __ALLOCATION;
    private Element __I16;
    private Element __I32;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_size = 0;
    private int mExportVar_size;
    public synchronized void set_size(int v) {
        setVar(mExportVarIdx_size, v);
        mExportVar_size = v;
    }

    public int get_size() {
        return mExportVar_size;
    }

    public Script.FieldID getFieldID_size() {
        return createFieldID(mExportVarIdx_size, null);
    }

    private final static int mExportVarIdx_z = 1;
    private int mExportVar_z;
    public synchronized void set_z(int v) {
        setVar(mExportVarIdx_z, v);
        mExportVar_z = v;
    }

    public int get_z() {
        return mExportVar_z;
    }

    public Script.FieldID getFieldID_z() {
        return createFieldID(mExportVarIdx_z, null);
    }

    private final static int mExportVarIdx_volume = 2;
    private Allocation mExportVar_volume;
    public synchronized void set_volume(Allocation v) {
        setVar(mExportVarIdx_volume, v);
        mExportVar_volume = v;
    }

    public Allocation get_volume() {
        return mExportVar_volume;
    }

    public Script.FieldID getFieldID_volume() {
        return createFieldID(mExportVarIdx_volume, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_mandelbulb = 1;
    public Script.KernelID getKernelID_mandelbulb() {
        return createKernelID(mExportForEachIdx_mandelbulb, 58, null, null);
    }

    public void forEach_mandelbulb(Allocation aout) {
        forEach_mandelbulb(aout, null);
    }

    public void forEach_mandelbulb(Allocation aout, Script.LaunchOptions sc) {
        // check aout
        if (!aout.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        forEach(mExportForEachIdx_mandelbulb, (Allocation) null, aout, null, sc);
    }

    private final static int mExportForEachIdx_copy = 2;
    public Script.KernelID getKernelID_copy() {
        return createKernelID(mExportForEachIdx_copy, 57, null, null);
    }

    public void forEach_copy(Allocation ain) {
        forEach_copy(ain, null);
    }

    public void forEach_copy(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        forEach(mExportForEachIdx_copy, ain, null, null, sc);
    }

}

