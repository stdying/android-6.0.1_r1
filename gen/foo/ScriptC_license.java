/*___Generated_by_IDEA___*/

/* this is a test license *//*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_license/license.rs
 */

package foo;

import android.renderscript.*;
import foo.licenseBitCode;

/**
 * @hide
 */
public class ScriptC_license extends ScriptC {
    private static final String __rs_resource_name = "license";
    // Constructor
    public  ScriptC_license(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              licenseBitCode.getBitCode32(),
              licenseBitCode.getBitCode64());
        __F32 = Element.F32(rs);
    }

    private Element __F32;
    private FieldPacker __rs_fp_F32;
    private final static int mExportVarIdx_f = 0;
    private float mExportVar_f;
    public synchronized void set_f(float v) {
        setVar(mExportVarIdx_f, v);
        mExportVar_f = v;
    }

    public float get_f() {
        return mExportVar_f;
    }

    public Script.FieldID getFieldID_f() {
        return createFieldID(mExportVarIdx_f, null);
    }

}

