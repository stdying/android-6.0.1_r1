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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_reduce_general_input/reduce_general_input.rs
 */

package input;

import android.renderscript.*;
import input.reduce_general_inputBitCode;

/**
 * @hide
 */
public class ScriptC_reduce_general_input extends ScriptC {
    private static final String __rs_resource_name = "reduce_general_input";
    // Constructor
    public  ScriptC_reduce_general_input(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              reduce_general_inputBitCode.getBitCode32(),
              reduce_general_inputBitCode.getBitCode64());
        mRSLocal = rs;
        __I32 = Element.I32(rs);
        __F16 = Element.F16(rs);
        __F16_2 = Element.F16_2(rs);
        __F16_4 = Element.F16_4(rs);
        __F32 = Element.F32(rs);
        __F32_2 = Element.F32_2(rs);
        __F32_4 = Element.F32_4(rs);
        __F64 = Element.F64(rs);
        __F64_2 = Element.F64_2(rs);
        __F64_4 = Element.F64_4(rs);
        __I8 = Element.I8(rs);
        __I8_2 = Element.I8_2(rs);
        __I8_4 = Element.I8_4(rs);
        __I16 = Element.I16(rs);
        __I16_2 = Element.I16_2(rs);
        __I16_4 = Element.I16_4(rs);
        __I32_2 = Element.I32_2(rs);
        __I32_4 = Element.I32_4(rs);
        __I64 = Element.I64(rs);
        __I64_2 = Element.I64_2(rs);
        __I64_4 = Element.I64_4(rs);
        __U8 = Element.U8(rs);
        __U8_2 = Element.U8_2(rs);
        __U8_4 = Element.U8_4(rs);
        __U16 = Element.U16(rs);
        __U16_2 = Element.U16_2(rs);
        __U16_4 = Element.U16_4(rs);
        __U32 = Element.U32(rs);
        __U32_2 = Element.U32_2(rs);
        __U32_4 = Element.U32_4(rs);
        __U64 = Element.U64(rs);
        __U64_2 = Element.U64_2(rs);
        __U64_4 = Element.U64_4(rs);
        __BOOLEAN = Element.BOOLEAN(rs);
        __ScriptField_MyStruct = ScriptField_MyStruct.createElement(rs);
    }

    private Element __BOOLEAN;
    private Element __F16;
    private Element __F16_2;
    private Element __F16_4;
    private Element __F32;
    private Element __F32_2;
    private Element __F32_4;
    private Element __F64;
    private Element __F64_2;
    private Element __F64_4;
    private Element __I16;
    private Element __I16_2;
    private Element __I16_4;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_4;
    private Element __I64;
    private Element __I64_2;
    private Element __I64_4;
    private Element __I8;
    private Element __I8_2;
    private Element __I8_4;
    private Element __ScriptField_MyStruct;
    private Element __U16;
    private Element __U16_2;
    private Element __U16_4;
    private Element __U32;
    private Element __U32_2;
    private Element __U32_4;
    private Element __U64;
    private Element __U64_2;
    private Element __U64_4;
    private Element __U8;
    private Element __U8_2;
    private Element __U8_4;
    private RenderScript mRSLocal;
    // To obtain the result, invoke get(), which blocks
    // until the asynchronously-launched operation has completed.
    public static class result_int {
        public int get() {
            if (!mGotResult) {
                int[] outArray = new int[1];
                mOut.copyTo(outArray);
                mResult = outArray[0];
                mOut.destroy();
                mOut = null;  // make Java object eligible for garbage collection
                if (mTempIns != null) {
                    for (Allocation tempIn : mTempIns) {
                        tempIn.destroy();
                    }

                    mTempIns = null;  // make Java objects eligible for garbage collection
                }

                mGotResult = true;
            }

            return mResult;
        }

        private  result_int(Allocation out) {
            mTempIns = null;
            mOut = out;
            mGotResult = false;
        }

        private Allocation[] mTempIns;
        private Allocation mOut;
        private boolean mGotResult;
        private int mResult;
    }

    private final static int mExportReduceIdx_my_half_0 = 0;
    // in1 = "in"
    public result_int reduce_my_half_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_0(Allocation ain1) {
        return reduce_my_half_0(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_1 = 1;
    // in1 = "in"
    public result_int reduce_my_half_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_1(Allocation ain1) {
        return reduce_my_half_1(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_2 = 2;
    // in1 = "in"
    public result_int reduce_my_half_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_2(Allocation ain1) {
        return reduce_my_half_2(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_3 = 3;
    // in1 = "in"
    public result_int reduce_my_half_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_3(Allocation ain1) {
        return reduce_my_half_3(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_4 = 4;
    // in1 = "in"
    public result_int reduce_my_half_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_4(Allocation ain1) {
        return reduce_my_half_4(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_5 = 5;
    // in1 = "in"
    public result_int reduce_my_half_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_5(Allocation ain1) {
        return reduce_my_half_5(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_6 = 6;
    // in1 = "in"
    public result_int reduce_my_half_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_6(Allocation ain1) {
        return reduce_my_half_6(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_7 = 7;
    // in1 = "in"
    public result_int reduce_my_half_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_7(Allocation ain1) {
        return reduce_my_half_7(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_8 = 8;
    // in1 = "in"
    public result_int reduce_my_half_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_8(Allocation ain1) {
        return reduce_my_half_8(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_9 = 9;
    // in1 = "in"
    public result_int reduce_my_half_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_9(Allocation ain1) {
        return reduce_my_half_9(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_10 = 10;
    // in1 = "in"
    public result_int reduce_my_half_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_10(Allocation ain1) {
        return reduce_my_half_10(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_11 = 11;
    // in1 = "in"
    public result_int reduce_my_half_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_11(Allocation ain1) {
        return reduce_my_half_11(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_12 = 12;
    // in1 = "in"
    public result_int reduce_my_half_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_12(Allocation ain1) {
        return reduce_my_half_12(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_13 = 13;
    // in1 = "in"
    public result_int reduce_my_half_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_13(Allocation ain1) {
        return reduce_my_half_13(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_14 = 14;
    // in1 = "in"
    public result_int reduce_my_half_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_14(Allocation ain1) {
        return reduce_my_half_14(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half_15 = 15;
    // in1 = "in"
    public result_int reduce_my_half_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half in"
    public result_int reduce_my_half_15(Allocation ain1) {
        return reduce_my_half_15(ain1, null);
    }

    // ain1 = "half in"
    public result_int reduce_my_half_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16)) {
            throw new RSRuntimeException("Type mismatch with F16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_0 = 16;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_0(Allocation ain1) {
        return reduce_my_half2_0(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_1 = 17;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_1(Allocation ain1) {
        return reduce_my_half2_1(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_2 = 18;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_2(Allocation ain1) {
        return reduce_my_half2_2(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_3 = 19;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_3(Allocation ain1) {
        return reduce_my_half2_3(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_4 = 20;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_4(Allocation ain1) {
        return reduce_my_half2_4(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_5 = 21;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_5(Allocation ain1) {
        return reduce_my_half2_5(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_6 = 22;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_6(Allocation ain1) {
        return reduce_my_half2_6(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_7 = 23;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_7(Allocation ain1) {
        return reduce_my_half2_7(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_8 = 24;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_8(Allocation ain1) {
        return reduce_my_half2_8(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_9 = 25;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_9(Allocation ain1) {
        return reduce_my_half2_9(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_10 = 26;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_10(Allocation ain1) {
        return reduce_my_half2_10(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_11 = 27;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_11(Allocation ain1) {
        return reduce_my_half2_11(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_12 = 28;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_12(Allocation ain1) {
        return reduce_my_half2_12(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_13 = 29;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_13(Allocation ain1) {
        return reduce_my_half2_13(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_14 = 30;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_14(Allocation ain1) {
        return reduce_my_half2_14(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half2_15 = 31;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_half2_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_15(Allocation ain1) {
        return reduce_my_half2_15(ain1, null);
    }

    // ain1 = "half2 in"
    public result_int reduce_my_half2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_2)) {
            throw new RSRuntimeException("Type mismatch with F16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_0 = 32;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_0(Allocation ain1) {
        return reduce_my_half4_0(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_1 = 33;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_1(Allocation ain1) {
        return reduce_my_half4_1(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_2 = 34;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_2(Allocation ain1) {
        return reduce_my_half4_2(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_3 = 35;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_3(Allocation ain1) {
        return reduce_my_half4_3(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_4 = 36;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_4(Allocation ain1) {
        return reduce_my_half4_4(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_5 = 37;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_5(Allocation ain1) {
        return reduce_my_half4_5(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_6 = 38;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_6(Allocation ain1) {
        return reduce_my_half4_6(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_7 = 39;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_7(Allocation ain1) {
        return reduce_my_half4_7(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_8 = 40;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_8(Allocation ain1) {
        return reduce_my_half4_8(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_9 = 41;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_9(Allocation ain1) {
        return reduce_my_half4_9(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_10 = 42;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_10(Allocation ain1) {
        return reduce_my_half4_10(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_11 = 43;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_11(Allocation ain1) {
        return reduce_my_half4_11(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_12 = 44;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_12(Allocation ain1) {
        return reduce_my_half4_12(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_13 = 45;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_13(Allocation ain1) {
        return reduce_my_half4_13(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_14 = 46;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_14(Allocation ain1) {
        return reduce_my_half4_14(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_half4_15 = 47;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_half4_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_half4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_15(Allocation ain1) {
        return reduce_my_half4_15(ain1, null);
    }

    // ain1 = "half4 in"
    public result_int reduce_my_half4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F16_4)) {
            throw new RSRuntimeException("Type mismatch with F16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_half4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_0 = 48;
    // in1 = "in"
    public result_int reduce_my_float_0(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_0(Allocation ain1) {
        return reduce_my_float_0(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_1 = 49;
    // in1 = "in"
    public result_int reduce_my_float_1(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_1(Allocation ain1) {
        return reduce_my_float_1(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_2 = 50;
    // in1 = "in"
    public result_int reduce_my_float_2(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_2(Allocation ain1) {
        return reduce_my_float_2(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_3 = 51;
    // in1 = "in"
    public result_int reduce_my_float_3(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_3(Allocation ain1) {
        return reduce_my_float_3(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_4 = 52;
    // in1 = "in"
    public result_int reduce_my_float_4(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_4(Allocation ain1) {
        return reduce_my_float_4(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_5 = 53;
    // in1 = "in"
    public result_int reduce_my_float_5(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_5(Allocation ain1) {
        return reduce_my_float_5(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_6 = 54;
    // in1 = "in"
    public result_int reduce_my_float_6(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_6(Allocation ain1) {
        return reduce_my_float_6(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_7 = 55;
    // in1 = "in"
    public result_int reduce_my_float_7(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_7(Allocation ain1) {
        return reduce_my_float_7(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_8 = 56;
    // in1 = "in"
    public result_int reduce_my_float_8(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_8(Allocation ain1) {
        return reduce_my_float_8(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_9 = 57;
    // in1 = "in"
    public result_int reduce_my_float_9(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_9(Allocation ain1) {
        return reduce_my_float_9(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_10 = 58;
    // in1 = "in"
    public result_int reduce_my_float_10(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_10(Allocation ain1) {
        return reduce_my_float_10(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_11 = 59;
    // in1 = "in"
    public result_int reduce_my_float_11(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_11(Allocation ain1) {
        return reduce_my_float_11(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_12 = 60;
    // in1 = "in"
    public result_int reduce_my_float_12(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_12(Allocation ain1) {
        return reduce_my_float_12(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_13 = 61;
    // in1 = "in"
    public result_int reduce_my_float_13(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_13(Allocation ain1) {
        return reduce_my_float_13(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_14 = 62;
    // in1 = "in"
    public result_int reduce_my_float_14(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_14(Allocation ain1) {
        return reduce_my_float_14(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float_15 = 63;
    // in1 = "in"
    public result_int reduce_my_float_15(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float in"
    public result_int reduce_my_float_15(Allocation ain1) {
        return reduce_my_float_15(ain1, null);
    }

    // ain1 = "float in"
    public result_int reduce_my_float_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_0 = 64;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_0(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_0(Allocation ain1) {
        return reduce_my_float2_0(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_1 = 65;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_1(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_1(Allocation ain1) {
        return reduce_my_float2_1(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_2 = 66;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_2(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_2(Allocation ain1) {
        return reduce_my_float2_2(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_3 = 67;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_3(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_3(Allocation ain1) {
        return reduce_my_float2_3(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_4 = 68;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_4(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_4(Allocation ain1) {
        return reduce_my_float2_4(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_5 = 69;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_5(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_5(Allocation ain1) {
        return reduce_my_float2_5(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_6 = 70;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_6(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_6(Allocation ain1) {
        return reduce_my_float2_6(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_7 = 71;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_7(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_7(Allocation ain1) {
        return reduce_my_float2_7(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_8 = 72;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_8(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_8(Allocation ain1) {
        return reduce_my_float2_8(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_9 = 73;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_9(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_9(Allocation ain1) {
        return reduce_my_float2_9(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_10 = 74;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_10(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_10(Allocation ain1) {
        return reduce_my_float2_10(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_11 = 75;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_11(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_11(Allocation ain1) {
        return reduce_my_float2_11(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_12 = 76;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_12(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_12(Allocation ain1) {
        return reduce_my_float2_12(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_13 = 77;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_13(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_13(Allocation ain1) {
        return reduce_my_float2_13(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_14 = 78;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_14(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_14(Allocation ain1) {
        return reduce_my_float2_14(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float2_15 = 79;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_float2_15(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_15(Allocation ain1) {
        return reduce_my_float2_15(ain1, null);
    }

    // ain1 = "float2 in"
    public result_int reduce_my_float2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_2)) {
            throw new RSRuntimeException("Type mismatch with F32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_0 = 80;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_0(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_0(Allocation ain1) {
        return reduce_my_float4_0(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_1 = 81;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_1(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_1(Allocation ain1) {
        return reduce_my_float4_1(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_2 = 82;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_2(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_2(Allocation ain1) {
        return reduce_my_float4_2(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_3 = 83;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_3(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_3(Allocation ain1) {
        return reduce_my_float4_3(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_4 = 84;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_4(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_4(Allocation ain1) {
        return reduce_my_float4_4(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_5 = 85;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_5(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_5(Allocation ain1) {
        return reduce_my_float4_5(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_6 = 86;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_6(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_6(Allocation ain1) {
        return reduce_my_float4_6(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_7 = 87;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_7(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_7(Allocation ain1) {
        return reduce_my_float4_7(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_8 = 88;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_8(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_8(Allocation ain1) {
        return reduce_my_float4_8(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_9 = 89;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_9(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_9(Allocation ain1) {
        return reduce_my_float4_9(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_10 = 90;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_10(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_10(Allocation ain1) {
        return reduce_my_float4_10(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_11 = 91;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_11(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_11(Allocation ain1) {
        return reduce_my_float4_11(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_12 = 92;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_12(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_12(Allocation ain1) {
        return reduce_my_float4_12(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_13 = 93;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_13(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_13(Allocation ain1) {
        return reduce_my_float4_13(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_14 = 94;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_14(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_14(Allocation ain1) {
        return reduce_my_float4_14(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_float4_15 = 95;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_float4_15(float[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_float4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_15(Allocation ain1) {
        return reduce_my_float4_15(ain1, null);
    }

    // ain1 = "float4 in"
    public result_int reduce_my_float4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F32_4)) {
            throw new RSRuntimeException("Type mismatch with F32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_float4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_0 = 96;
    // in1 = "in"
    public result_int reduce_my_double_0(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_0(Allocation ain1) {
        return reduce_my_double_0(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_1 = 97;
    // in1 = "in"
    public result_int reduce_my_double_1(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_1(Allocation ain1) {
        return reduce_my_double_1(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_2 = 98;
    // in1 = "in"
    public result_int reduce_my_double_2(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_2(Allocation ain1) {
        return reduce_my_double_2(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_3 = 99;
    // in1 = "in"
    public result_int reduce_my_double_3(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_3(Allocation ain1) {
        return reduce_my_double_3(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_4 = 100;
    // in1 = "in"
    public result_int reduce_my_double_4(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_4(Allocation ain1) {
        return reduce_my_double_4(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_5 = 101;
    // in1 = "in"
    public result_int reduce_my_double_5(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_5(Allocation ain1) {
        return reduce_my_double_5(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_6 = 102;
    // in1 = "in"
    public result_int reduce_my_double_6(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_6(Allocation ain1) {
        return reduce_my_double_6(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_7 = 103;
    // in1 = "in"
    public result_int reduce_my_double_7(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_7(Allocation ain1) {
        return reduce_my_double_7(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_8 = 104;
    // in1 = "in"
    public result_int reduce_my_double_8(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_8(Allocation ain1) {
        return reduce_my_double_8(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_9 = 105;
    // in1 = "in"
    public result_int reduce_my_double_9(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_9(Allocation ain1) {
        return reduce_my_double_9(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_10 = 106;
    // in1 = "in"
    public result_int reduce_my_double_10(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_10(Allocation ain1) {
        return reduce_my_double_10(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_11 = 107;
    // in1 = "in"
    public result_int reduce_my_double_11(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_11(Allocation ain1) {
        return reduce_my_double_11(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_12 = 108;
    // in1 = "in"
    public result_int reduce_my_double_12(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_12(Allocation ain1) {
        return reduce_my_double_12(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_13 = 109;
    // in1 = "in"
    public result_int reduce_my_double_13(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_13(Allocation ain1) {
        return reduce_my_double_13(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_14 = 110;
    // in1 = "in"
    public result_int reduce_my_double_14(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_14(Allocation ain1) {
        return reduce_my_double_14(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double_15 = 111;
    // in1 = "in"
    public result_int reduce_my_double_15(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double in"
    public result_int reduce_my_double_15(Allocation ain1) {
        return reduce_my_double_15(ain1, null);
    }

    // ain1 = "double in"
    public result_int reduce_my_double_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_0 = 112;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_0(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_0(Allocation ain1) {
        return reduce_my_double2_0(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_1 = 113;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_1(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_1(Allocation ain1) {
        return reduce_my_double2_1(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_2 = 114;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_2(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_2(Allocation ain1) {
        return reduce_my_double2_2(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_3 = 115;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_3(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_3(Allocation ain1) {
        return reduce_my_double2_3(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_4 = 116;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_4(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_4(Allocation ain1) {
        return reduce_my_double2_4(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_5 = 117;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_5(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_5(Allocation ain1) {
        return reduce_my_double2_5(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_6 = 118;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_6(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_6(Allocation ain1) {
        return reduce_my_double2_6(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_7 = 119;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_7(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_7(Allocation ain1) {
        return reduce_my_double2_7(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_8 = 120;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_8(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_8(Allocation ain1) {
        return reduce_my_double2_8(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_9 = 121;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_9(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_9(Allocation ain1) {
        return reduce_my_double2_9(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_10 = 122;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_10(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_10(Allocation ain1) {
        return reduce_my_double2_10(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_11 = 123;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_11(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_11(Allocation ain1) {
        return reduce_my_double2_11(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_12 = 124;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_12(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_12(Allocation ain1) {
        return reduce_my_double2_12(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_13 = 125;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_13(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_13(Allocation ain1) {
        return reduce_my_double2_13(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_14 = 126;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_14(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_14(Allocation ain1) {
        return reduce_my_double2_14(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double2_15 = 127;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_double2_15(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_15(Allocation ain1) {
        return reduce_my_double2_15(ain1, null);
    }

    // ain1 = "double2 in"
    public result_int reduce_my_double2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_2)) {
            throw new RSRuntimeException("Type mismatch with F64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_0 = 128;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_0(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_0(Allocation ain1) {
        return reduce_my_double4_0(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_1 = 129;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_1(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_1(Allocation ain1) {
        return reduce_my_double4_1(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_2 = 130;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_2(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_2(Allocation ain1) {
        return reduce_my_double4_2(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_3 = 131;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_3(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_3(Allocation ain1) {
        return reduce_my_double4_3(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_4 = 132;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_4(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_4(Allocation ain1) {
        return reduce_my_double4_4(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_5 = 133;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_5(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_5(Allocation ain1) {
        return reduce_my_double4_5(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_6 = 134;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_6(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_6(Allocation ain1) {
        return reduce_my_double4_6(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_7 = 135;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_7(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_7(Allocation ain1) {
        return reduce_my_double4_7(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_8 = 136;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_8(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_8(Allocation ain1) {
        return reduce_my_double4_8(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_9 = 137;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_9(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_9(Allocation ain1) {
        return reduce_my_double4_9(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_10 = 138;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_10(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_10(Allocation ain1) {
        return reduce_my_double4_10(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_11 = 139;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_11(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_11(Allocation ain1) {
        return reduce_my_double4_11(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_12 = 140;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_12(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_12(Allocation ain1) {
        return reduce_my_double4_12(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_13 = 141;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_13(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_13(Allocation ain1) {
        return reduce_my_double4_13(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_14 = 142;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_14(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_14(Allocation ain1) {
        return reduce_my_double4_14(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_double4_15 = 143;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_double4_15(double[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __F64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_double4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_15(Allocation ain1) {
        return reduce_my_double4_15(ain1, null);
    }

    // ain1 = "double4 in"
    public result_int reduce_my_double4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__F64_4)) {
            throw new RSRuntimeException("Type mismatch with F64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_double4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_0 = 144;
    // in1 = "in"
    public result_int reduce_my_char_0(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_0(Allocation ain1) {
        return reduce_my_char_0(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_1 = 145;
    // in1 = "in"
    public result_int reduce_my_char_1(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_1(Allocation ain1) {
        return reduce_my_char_1(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_2 = 146;
    // in1 = "in"
    public result_int reduce_my_char_2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_2(Allocation ain1) {
        return reduce_my_char_2(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_3 = 147;
    // in1 = "in"
    public result_int reduce_my_char_3(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_3(Allocation ain1) {
        return reduce_my_char_3(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_4 = 148;
    // in1 = "in"
    public result_int reduce_my_char_4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_4(Allocation ain1) {
        return reduce_my_char_4(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_5 = 149;
    // in1 = "in"
    public result_int reduce_my_char_5(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_5(Allocation ain1) {
        return reduce_my_char_5(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_6 = 150;
    // in1 = "in"
    public result_int reduce_my_char_6(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_6(Allocation ain1) {
        return reduce_my_char_6(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_7 = 151;
    // in1 = "in"
    public result_int reduce_my_char_7(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_7(Allocation ain1) {
        return reduce_my_char_7(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_8 = 152;
    // in1 = "in"
    public result_int reduce_my_char_8(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_8(Allocation ain1) {
        return reduce_my_char_8(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_9 = 153;
    // in1 = "in"
    public result_int reduce_my_char_9(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_9(Allocation ain1) {
        return reduce_my_char_9(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_10 = 154;
    // in1 = "in"
    public result_int reduce_my_char_10(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_10(Allocation ain1) {
        return reduce_my_char_10(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_11 = 155;
    // in1 = "in"
    public result_int reduce_my_char_11(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_11(Allocation ain1) {
        return reduce_my_char_11(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_12 = 156;
    // in1 = "in"
    public result_int reduce_my_char_12(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_12(Allocation ain1) {
        return reduce_my_char_12(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_13 = 157;
    // in1 = "in"
    public result_int reduce_my_char_13(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_13(Allocation ain1) {
        return reduce_my_char_13(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_14 = 158;
    // in1 = "in"
    public result_int reduce_my_char_14(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_14(Allocation ain1) {
        return reduce_my_char_14(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char_15 = 159;
    // in1 = "in"
    public result_int reduce_my_char_15(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char in"
    public result_int reduce_my_char_15(Allocation ain1) {
        return reduce_my_char_15(ain1, null);
    }

    // ain1 = "char in"
    public result_int reduce_my_char_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_0 = 160;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_0(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_0(Allocation ain1) {
        return reduce_my_char2_0(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_1 = 161;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_1(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_1(Allocation ain1) {
        return reduce_my_char2_1(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_2 = 162;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_2(Allocation ain1) {
        return reduce_my_char2_2(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_3 = 163;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_3(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_3(Allocation ain1) {
        return reduce_my_char2_3(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_4 = 164;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_4(Allocation ain1) {
        return reduce_my_char2_4(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_5 = 165;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_5(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_5(Allocation ain1) {
        return reduce_my_char2_5(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_6 = 166;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_6(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_6(Allocation ain1) {
        return reduce_my_char2_6(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_7 = 167;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_7(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_7(Allocation ain1) {
        return reduce_my_char2_7(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_8 = 168;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_8(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_8(Allocation ain1) {
        return reduce_my_char2_8(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_9 = 169;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_9(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_9(Allocation ain1) {
        return reduce_my_char2_9(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_10 = 170;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_10(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_10(Allocation ain1) {
        return reduce_my_char2_10(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_11 = 171;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_11(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_11(Allocation ain1) {
        return reduce_my_char2_11(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_12 = 172;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_12(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_12(Allocation ain1) {
        return reduce_my_char2_12(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_13 = 173;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_13(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_13(Allocation ain1) {
        return reduce_my_char2_13(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_14 = 174;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_14(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_14(Allocation ain1) {
        return reduce_my_char2_14(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char2_15 = 175;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_char2_15(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_15(Allocation ain1) {
        return reduce_my_char2_15(ain1, null);
    }

    // ain1 = "char2 in"
    public result_int reduce_my_char2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_2)) {
            throw new RSRuntimeException("Type mismatch with I8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_0 = 176;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_0(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_0(Allocation ain1) {
        return reduce_my_char4_0(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_1 = 177;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_1(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_1(Allocation ain1) {
        return reduce_my_char4_1(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_2 = 178;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_2(Allocation ain1) {
        return reduce_my_char4_2(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_3 = 179;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_3(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_3(Allocation ain1) {
        return reduce_my_char4_3(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_4 = 180;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_4(Allocation ain1) {
        return reduce_my_char4_4(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_5 = 181;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_5(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_5(Allocation ain1) {
        return reduce_my_char4_5(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_6 = 182;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_6(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_6(Allocation ain1) {
        return reduce_my_char4_6(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_7 = 183;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_7(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_7(Allocation ain1) {
        return reduce_my_char4_7(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_8 = 184;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_8(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_8(Allocation ain1) {
        return reduce_my_char4_8(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_9 = 185;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_9(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_9(Allocation ain1) {
        return reduce_my_char4_9(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_10 = 186;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_10(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_10(Allocation ain1) {
        return reduce_my_char4_10(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_11 = 187;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_11(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_11(Allocation ain1) {
        return reduce_my_char4_11(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_12 = 188;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_12(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_12(Allocation ain1) {
        return reduce_my_char4_12(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_13 = 189;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_13(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_13(Allocation ain1) {
        return reduce_my_char4_13(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_14 = 190;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_14(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_14(Allocation ain1) {
        return reduce_my_char4_14(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_char4_15 = 191;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_char4_15(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_char4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_15(Allocation ain1) {
        return reduce_my_char4_15(ain1, null);
    }

    // ain1 = "char4 in"
    public result_int reduce_my_char4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I8_4)) {
            throw new RSRuntimeException("Type mismatch with I8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_char4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_0 = 192;
    // in1 = "in"
    public result_int reduce_my_short_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_0(Allocation ain1) {
        return reduce_my_short_0(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_1 = 193;
    // in1 = "in"
    public result_int reduce_my_short_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_1(Allocation ain1) {
        return reduce_my_short_1(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_2 = 194;
    // in1 = "in"
    public result_int reduce_my_short_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_2(Allocation ain1) {
        return reduce_my_short_2(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_3 = 195;
    // in1 = "in"
    public result_int reduce_my_short_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_3(Allocation ain1) {
        return reduce_my_short_3(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_4 = 196;
    // in1 = "in"
    public result_int reduce_my_short_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_4(Allocation ain1) {
        return reduce_my_short_4(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_5 = 197;
    // in1 = "in"
    public result_int reduce_my_short_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_5(Allocation ain1) {
        return reduce_my_short_5(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_6 = 198;
    // in1 = "in"
    public result_int reduce_my_short_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_6(Allocation ain1) {
        return reduce_my_short_6(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_7 = 199;
    // in1 = "in"
    public result_int reduce_my_short_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_7(Allocation ain1) {
        return reduce_my_short_7(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_8 = 200;
    // in1 = "in"
    public result_int reduce_my_short_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_8(Allocation ain1) {
        return reduce_my_short_8(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_9 = 201;
    // in1 = "in"
    public result_int reduce_my_short_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_9(Allocation ain1) {
        return reduce_my_short_9(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_10 = 202;
    // in1 = "in"
    public result_int reduce_my_short_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_10(Allocation ain1) {
        return reduce_my_short_10(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_11 = 203;
    // in1 = "in"
    public result_int reduce_my_short_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_11(Allocation ain1) {
        return reduce_my_short_11(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_12 = 204;
    // in1 = "in"
    public result_int reduce_my_short_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_12(Allocation ain1) {
        return reduce_my_short_12(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_13 = 205;
    // in1 = "in"
    public result_int reduce_my_short_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_13(Allocation ain1) {
        return reduce_my_short_13(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_14 = 206;
    // in1 = "in"
    public result_int reduce_my_short_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_14(Allocation ain1) {
        return reduce_my_short_14(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short_15 = 207;
    // in1 = "in"
    public result_int reduce_my_short_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short in"
    public result_int reduce_my_short_15(Allocation ain1) {
        return reduce_my_short_15(ain1, null);
    }

    // ain1 = "short in"
    public result_int reduce_my_short_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_0 = 208;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_0(Allocation ain1) {
        return reduce_my_short2_0(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_1 = 209;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_1(Allocation ain1) {
        return reduce_my_short2_1(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_2 = 210;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_2(Allocation ain1) {
        return reduce_my_short2_2(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_3 = 211;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_3(Allocation ain1) {
        return reduce_my_short2_3(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_4 = 212;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_4(Allocation ain1) {
        return reduce_my_short2_4(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_5 = 213;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_5(Allocation ain1) {
        return reduce_my_short2_5(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_6 = 214;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_6(Allocation ain1) {
        return reduce_my_short2_6(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_7 = 215;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_7(Allocation ain1) {
        return reduce_my_short2_7(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_8 = 216;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_8(Allocation ain1) {
        return reduce_my_short2_8(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_9 = 217;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_9(Allocation ain1) {
        return reduce_my_short2_9(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_10 = 218;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_10(Allocation ain1) {
        return reduce_my_short2_10(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_11 = 219;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_11(Allocation ain1) {
        return reduce_my_short2_11(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_12 = 220;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_12(Allocation ain1) {
        return reduce_my_short2_12(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_13 = 221;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_13(Allocation ain1) {
        return reduce_my_short2_13(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_14 = 222;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_14(Allocation ain1) {
        return reduce_my_short2_14(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short2_15 = 223;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_short2_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_15(Allocation ain1) {
        return reduce_my_short2_15(ain1, null);
    }

    // ain1 = "short2 in"
    public result_int reduce_my_short2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_2)) {
            throw new RSRuntimeException("Type mismatch with I16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_0 = 224;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_0(Allocation ain1) {
        return reduce_my_short4_0(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_1 = 225;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_1(Allocation ain1) {
        return reduce_my_short4_1(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_2 = 226;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_2(Allocation ain1) {
        return reduce_my_short4_2(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_3 = 227;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_3(Allocation ain1) {
        return reduce_my_short4_3(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_4 = 228;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_4(Allocation ain1) {
        return reduce_my_short4_4(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_5 = 229;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_5(Allocation ain1) {
        return reduce_my_short4_5(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_6 = 230;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_6(Allocation ain1) {
        return reduce_my_short4_6(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_7 = 231;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_7(Allocation ain1) {
        return reduce_my_short4_7(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_8 = 232;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_8(Allocation ain1) {
        return reduce_my_short4_8(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_9 = 233;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_9(Allocation ain1) {
        return reduce_my_short4_9(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_10 = 234;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_10(Allocation ain1) {
        return reduce_my_short4_10(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_11 = 235;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_11(Allocation ain1) {
        return reduce_my_short4_11(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_12 = 236;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_12(Allocation ain1) {
        return reduce_my_short4_12(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_13 = 237;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_13(Allocation ain1) {
        return reduce_my_short4_13(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_14 = 238;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_14(Allocation ain1) {
        return reduce_my_short4_14(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_short4_15 = 239;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_short4_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_short4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_15(Allocation ain1) {
        return reduce_my_short4_15(ain1, null);
    }

    // ain1 = "short4 in"
    public result_int reduce_my_short4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I16_4)) {
            throw new RSRuntimeException("Type mismatch with I16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_short4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_0 = 240;
    // in1 = "in"
    public result_int reduce_my_int_0(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_0(Allocation ain1) {
        return reduce_my_int_0(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_1 = 241;
    // in1 = "in"
    public result_int reduce_my_int_1(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_1(Allocation ain1) {
        return reduce_my_int_1(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_2 = 242;
    // in1 = "in"
    public result_int reduce_my_int_2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_2(Allocation ain1) {
        return reduce_my_int_2(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_3 = 243;
    // in1 = "in"
    public result_int reduce_my_int_3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_3(Allocation ain1) {
        return reduce_my_int_3(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_4 = 244;
    // in1 = "in"
    public result_int reduce_my_int_4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_4(Allocation ain1) {
        return reduce_my_int_4(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_5 = 245;
    // in1 = "in"
    public result_int reduce_my_int_5(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_5(Allocation ain1) {
        return reduce_my_int_5(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_6 = 246;
    // in1 = "in"
    public result_int reduce_my_int_6(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_6(Allocation ain1) {
        return reduce_my_int_6(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_7 = 247;
    // in1 = "in"
    public result_int reduce_my_int_7(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_7(Allocation ain1) {
        return reduce_my_int_7(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_8 = 248;
    // in1 = "in"
    public result_int reduce_my_int_8(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_8(Allocation ain1) {
        return reduce_my_int_8(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_9 = 249;
    // in1 = "in"
    public result_int reduce_my_int_9(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_9(Allocation ain1) {
        return reduce_my_int_9(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_10 = 250;
    // in1 = "in"
    public result_int reduce_my_int_10(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_10(Allocation ain1) {
        return reduce_my_int_10(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_11 = 251;
    // in1 = "in"
    public result_int reduce_my_int_11(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_11(Allocation ain1) {
        return reduce_my_int_11(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_12 = 252;
    // in1 = "in"
    public result_int reduce_my_int_12(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_12(Allocation ain1) {
        return reduce_my_int_12(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_13 = 253;
    // in1 = "in"
    public result_int reduce_my_int_13(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_13(Allocation ain1) {
        return reduce_my_int_13(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_14 = 254;
    // in1 = "in"
    public result_int reduce_my_int_14(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_14(Allocation ain1) {
        return reduce_my_int_14(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int_15 = 255;
    // in1 = "in"
    public result_int reduce_my_int_15(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int in"
    public result_int reduce_my_int_15(Allocation ain1) {
        return reduce_my_int_15(ain1, null);
    }

    // ain1 = "int in"
    public result_int reduce_my_int_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_0 = 256;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_0(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_0(Allocation ain1) {
        return reduce_my_int2_0(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_1 = 257;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_1(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_1(Allocation ain1) {
        return reduce_my_int2_1(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_2 = 258;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_2(Allocation ain1) {
        return reduce_my_int2_2(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_3 = 259;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_3(Allocation ain1) {
        return reduce_my_int2_3(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_4 = 260;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_4(Allocation ain1) {
        return reduce_my_int2_4(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_5 = 261;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_5(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_5(Allocation ain1) {
        return reduce_my_int2_5(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_6 = 262;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_6(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_6(Allocation ain1) {
        return reduce_my_int2_6(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_7 = 263;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_7(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_7(Allocation ain1) {
        return reduce_my_int2_7(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_8 = 264;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_8(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_8(Allocation ain1) {
        return reduce_my_int2_8(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_9 = 265;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_9(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_9(Allocation ain1) {
        return reduce_my_int2_9(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_10 = 266;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_10(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_10(Allocation ain1) {
        return reduce_my_int2_10(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_11 = 267;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_11(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_11(Allocation ain1) {
        return reduce_my_int2_11(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_12 = 268;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_12(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_12(Allocation ain1) {
        return reduce_my_int2_12(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_13 = 269;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_13(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_13(Allocation ain1) {
        return reduce_my_int2_13(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_14 = 270;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_14(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_14(Allocation ain1) {
        return reduce_my_int2_14(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int2_15 = 271;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_int2_15(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_15(Allocation ain1) {
        return reduce_my_int2_15(ain1, null);
    }

    // ain1 = "int2 in"
    public result_int reduce_my_int2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_2)) {
            throw new RSRuntimeException("Type mismatch with I32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_0 = 272;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_0(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_0(Allocation ain1) {
        return reduce_my_int4_0(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_1 = 273;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_1(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_1(Allocation ain1) {
        return reduce_my_int4_1(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_2 = 274;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_2(Allocation ain1) {
        return reduce_my_int4_2(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_3 = 275;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_3(Allocation ain1) {
        return reduce_my_int4_3(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_4 = 276;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_4(Allocation ain1) {
        return reduce_my_int4_4(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_5 = 277;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_5(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_5(Allocation ain1) {
        return reduce_my_int4_5(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_6 = 278;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_6(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_6(Allocation ain1) {
        return reduce_my_int4_6(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_7 = 279;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_7(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_7(Allocation ain1) {
        return reduce_my_int4_7(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_8 = 280;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_8(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_8(Allocation ain1) {
        return reduce_my_int4_8(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_9 = 281;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_9(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_9(Allocation ain1) {
        return reduce_my_int4_9(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_10 = 282;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_10(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_10(Allocation ain1) {
        return reduce_my_int4_10(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_11 = 283;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_11(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_11(Allocation ain1) {
        return reduce_my_int4_11(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_12 = 284;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_12(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_12(Allocation ain1) {
        return reduce_my_int4_12(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_13 = 285;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_13(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_13(Allocation ain1) {
        return reduce_my_int4_13(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_14 = 286;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_14(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_14(Allocation ain1) {
        return reduce_my_int4_14(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_int4_15 = 287;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_int4_15(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_int4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_15(Allocation ain1) {
        return reduce_my_int4_15(ain1, null);
    }

    // ain1 = "int4 in"
    public result_int reduce_my_int4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I32_4)) {
            throw new RSRuntimeException("Type mismatch with I32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_int4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_0 = 288;
    // in1 = "in"
    public result_int reduce_my_long_0(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_0(Allocation ain1) {
        return reduce_my_long_0(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_1 = 289;
    // in1 = "in"
    public result_int reduce_my_long_1(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_1(Allocation ain1) {
        return reduce_my_long_1(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_2 = 290;
    // in1 = "in"
    public result_int reduce_my_long_2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_2(Allocation ain1) {
        return reduce_my_long_2(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_3 = 291;
    // in1 = "in"
    public result_int reduce_my_long_3(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_3(Allocation ain1) {
        return reduce_my_long_3(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_4 = 292;
    // in1 = "in"
    public result_int reduce_my_long_4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_4(Allocation ain1) {
        return reduce_my_long_4(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_5 = 293;
    // in1 = "in"
    public result_int reduce_my_long_5(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_5(Allocation ain1) {
        return reduce_my_long_5(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_6 = 294;
    // in1 = "in"
    public result_int reduce_my_long_6(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_6(Allocation ain1) {
        return reduce_my_long_6(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_7 = 295;
    // in1 = "in"
    public result_int reduce_my_long_7(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_7(Allocation ain1) {
        return reduce_my_long_7(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_8 = 296;
    // in1 = "in"
    public result_int reduce_my_long_8(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_8(Allocation ain1) {
        return reduce_my_long_8(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_9 = 297;
    // in1 = "in"
    public result_int reduce_my_long_9(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_9(Allocation ain1) {
        return reduce_my_long_9(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_10 = 298;
    // in1 = "in"
    public result_int reduce_my_long_10(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_10(Allocation ain1) {
        return reduce_my_long_10(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_11 = 299;
    // in1 = "in"
    public result_int reduce_my_long_11(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_11(Allocation ain1) {
        return reduce_my_long_11(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_12 = 300;
    // in1 = "in"
    public result_int reduce_my_long_12(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_12(Allocation ain1) {
        return reduce_my_long_12(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_13 = 301;
    // in1 = "in"
    public result_int reduce_my_long_13(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_13(Allocation ain1) {
        return reduce_my_long_13(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_14 = 302;
    // in1 = "in"
    public result_int reduce_my_long_14(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_14(Allocation ain1) {
        return reduce_my_long_14(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long_15 = 303;
    // in1 = "in"
    public result_int reduce_my_long_15(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long in"
    public result_int reduce_my_long_15(Allocation ain1) {
        return reduce_my_long_15(ain1, null);
    }

    // ain1 = "long in"
    public result_int reduce_my_long_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_0 = 304;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_0(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_0(Allocation ain1) {
        return reduce_my_long2_0(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_1 = 305;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_1(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_1(Allocation ain1) {
        return reduce_my_long2_1(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_2 = 306;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_2(Allocation ain1) {
        return reduce_my_long2_2(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_3 = 307;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_3(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_3(Allocation ain1) {
        return reduce_my_long2_3(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_4 = 308;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_4(Allocation ain1) {
        return reduce_my_long2_4(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_5 = 309;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_5(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_5(Allocation ain1) {
        return reduce_my_long2_5(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_6 = 310;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_6(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_6(Allocation ain1) {
        return reduce_my_long2_6(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_7 = 311;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_7(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_7(Allocation ain1) {
        return reduce_my_long2_7(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_8 = 312;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_8(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_8(Allocation ain1) {
        return reduce_my_long2_8(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_9 = 313;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_9(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_9(Allocation ain1) {
        return reduce_my_long2_9(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_10 = 314;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_10(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_10(Allocation ain1) {
        return reduce_my_long2_10(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_11 = 315;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_11(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_11(Allocation ain1) {
        return reduce_my_long2_11(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_12 = 316;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_12(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_12(Allocation ain1) {
        return reduce_my_long2_12(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_13 = 317;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_13(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_13(Allocation ain1) {
        return reduce_my_long2_13(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_14 = 318;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_14(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_14(Allocation ain1) {
        return reduce_my_long2_14(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long2_15 = 319;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_long2_15(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_15(Allocation ain1) {
        return reduce_my_long2_15(ain1, null);
    }

    // ain1 = "long2 in"
    public result_int reduce_my_long2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_2)) {
            throw new RSRuntimeException("Type mismatch with I64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_0 = 320;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_0(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_0(Allocation ain1) {
        return reduce_my_long4_0(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_1 = 321;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_1(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_1(Allocation ain1) {
        return reduce_my_long4_1(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_2 = 322;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_2(Allocation ain1) {
        return reduce_my_long4_2(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_3 = 323;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_3(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_3(Allocation ain1) {
        return reduce_my_long4_3(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_4 = 324;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_4(Allocation ain1) {
        return reduce_my_long4_4(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_5 = 325;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_5(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_5(Allocation ain1) {
        return reduce_my_long4_5(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_6 = 326;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_6(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_6(Allocation ain1) {
        return reduce_my_long4_6(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_7 = 327;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_7(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_7(Allocation ain1) {
        return reduce_my_long4_7(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_8 = 328;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_8(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_8(Allocation ain1) {
        return reduce_my_long4_8(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_9 = 329;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_9(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_9(Allocation ain1) {
        return reduce_my_long4_9(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_10 = 330;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_10(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_10(Allocation ain1) {
        return reduce_my_long4_10(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_11 = 331;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_11(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_11(Allocation ain1) {
        return reduce_my_long4_11(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_12 = 332;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_12(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_12(Allocation ain1) {
        return reduce_my_long4_12(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_13 = 333;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_13(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_13(Allocation ain1) {
        return reduce_my_long4_13(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_14 = 334;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_14(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_14(Allocation ain1) {
        return reduce_my_long4_14(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_long4_15 = 335;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_long4_15(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __I64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_long4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_15(Allocation ain1) {
        return reduce_my_long4_15(ain1, null);
    }

    // ain1 = "long4 in"
    public result_int reduce_my_long4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__I64_4)) {
            throw new RSRuntimeException("Type mismatch with I64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_long4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_0 = 336;
    // in1 = "in"
    public result_int reduce_my_uchar_0(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_0(Allocation ain1) {
        return reduce_my_uchar_0(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_1 = 337;
    // in1 = "in"
    public result_int reduce_my_uchar_1(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_1(Allocation ain1) {
        return reduce_my_uchar_1(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_2 = 338;
    // in1 = "in"
    public result_int reduce_my_uchar_2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_2(Allocation ain1) {
        return reduce_my_uchar_2(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_3 = 339;
    // in1 = "in"
    public result_int reduce_my_uchar_3(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_3(Allocation ain1) {
        return reduce_my_uchar_3(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_4 = 340;
    // in1 = "in"
    public result_int reduce_my_uchar_4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_4(Allocation ain1) {
        return reduce_my_uchar_4(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_5 = 341;
    // in1 = "in"
    public result_int reduce_my_uchar_5(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_5(Allocation ain1) {
        return reduce_my_uchar_5(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_6 = 342;
    // in1 = "in"
    public result_int reduce_my_uchar_6(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_6(Allocation ain1) {
        return reduce_my_uchar_6(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_7 = 343;
    // in1 = "in"
    public result_int reduce_my_uchar_7(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_7(Allocation ain1) {
        return reduce_my_uchar_7(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_8 = 344;
    // in1 = "in"
    public result_int reduce_my_uchar_8(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_8(Allocation ain1) {
        return reduce_my_uchar_8(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_9 = 345;
    // in1 = "in"
    public result_int reduce_my_uchar_9(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_9(Allocation ain1) {
        return reduce_my_uchar_9(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_10 = 346;
    // in1 = "in"
    public result_int reduce_my_uchar_10(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_10(Allocation ain1) {
        return reduce_my_uchar_10(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_11 = 347;
    // in1 = "in"
    public result_int reduce_my_uchar_11(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_11(Allocation ain1) {
        return reduce_my_uchar_11(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_12 = 348;
    // in1 = "in"
    public result_int reduce_my_uchar_12(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_12(Allocation ain1) {
        return reduce_my_uchar_12(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_13 = 349;
    // in1 = "in"
    public result_int reduce_my_uchar_13(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_13(Allocation ain1) {
        return reduce_my_uchar_13(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_14 = 350;
    // in1 = "in"
    public result_int reduce_my_uchar_14(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_14(Allocation ain1) {
        return reduce_my_uchar_14(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar_15 = 351;
    // in1 = "in"
    public result_int reduce_my_uchar_15(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_15(Allocation ain1) {
        return reduce_my_uchar_15(ain1, null);
    }

    // ain1 = "uchar in"
    public result_int reduce_my_uchar_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_0 = 352;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_0(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_0(Allocation ain1) {
        return reduce_my_uchar2_0(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_1 = 353;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_1(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_1(Allocation ain1) {
        return reduce_my_uchar2_1(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_2 = 354;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_2(Allocation ain1) {
        return reduce_my_uchar2_2(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_3 = 355;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_3(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_3(Allocation ain1) {
        return reduce_my_uchar2_3(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_4 = 356;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_4(Allocation ain1) {
        return reduce_my_uchar2_4(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_5 = 357;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_5(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_5(Allocation ain1) {
        return reduce_my_uchar2_5(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_6 = 358;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_6(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_6(Allocation ain1) {
        return reduce_my_uchar2_6(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_7 = 359;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_7(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_7(Allocation ain1) {
        return reduce_my_uchar2_7(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_8 = 360;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_8(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_8(Allocation ain1) {
        return reduce_my_uchar2_8(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_9 = 361;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_9(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_9(Allocation ain1) {
        return reduce_my_uchar2_9(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_10 = 362;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_10(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_10(Allocation ain1) {
        return reduce_my_uchar2_10(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_11 = 363;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_11(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_11(Allocation ain1) {
        return reduce_my_uchar2_11(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_12 = 364;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_12(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_12(Allocation ain1) {
        return reduce_my_uchar2_12(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_13 = 365;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_13(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_13(Allocation ain1) {
        return reduce_my_uchar2_13(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_14 = 366;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_14(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_14(Allocation ain1) {
        return reduce_my_uchar2_14(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar2_15 = 367;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uchar2_15(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_15(Allocation ain1) {
        return reduce_my_uchar2_15(ain1, null);
    }

    // ain1 = "uchar2 in"
    public result_int reduce_my_uchar2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_2)) {
            throw new RSRuntimeException("Type mismatch with U8_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_0 = 368;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_0(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_0(Allocation ain1) {
        return reduce_my_uchar4_0(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_1 = 369;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_1(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_1(Allocation ain1) {
        return reduce_my_uchar4_1(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_2 = 370;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_2(Allocation ain1) {
        return reduce_my_uchar4_2(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_3 = 371;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_3(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_3(Allocation ain1) {
        return reduce_my_uchar4_3(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_4 = 372;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_4(Allocation ain1) {
        return reduce_my_uchar4_4(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_5 = 373;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_5(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_5(Allocation ain1) {
        return reduce_my_uchar4_5(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_6 = 374;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_6(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_6(Allocation ain1) {
        return reduce_my_uchar4_6(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_7 = 375;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_7(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_7(Allocation ain1) {
        return reduce_my_uchar4_7(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_8 = 376;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_8(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_8(Allocation ain1) {
        return reduce_my_uchar4_8(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_9 = 377;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_9(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_9(Allocation ain1) {
        return reduce_my_uchar4_9(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_10 = 378;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_10(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_10(Allocation ain1) {
        return reduce_my_uchar4_10(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_11 = 379;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_11(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_11(Allocation ain1) {
        return reduce_my_uchar4_11(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_12 = 380;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_12(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_12(Allocation ain1) {
        return reduce_my_uchar4_12(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_13 = 381;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_13(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_13(Allocation ain1) {
        return reduce_my_uchar4_13(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_14 = 382;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_14(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_14(Allocation ain1) {
        return reduce_my_uchar4_14(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uchar4_15 = 383;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uchar4_15(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U8_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uchar4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_15(Allocation ain1) {
        return reduce_my_uchar4_15(ain1, null);
    }

    // ain1 = "uchar4 in"
    public result_int reduce_my_uchar4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uchar4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_0 = 384;
    // in1 = "in"
    public result_int reduce_my_ushort_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_0(Allocation ain1) {
        return reduce_my_ushort_0(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_1 = 385;
    // in1 = "in"
    public result_int reduce_my_ushort_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_1(Allocation ain1) {
        return reduce_my_ushort_1(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_2 = 386;
    // in1 = "in"
    public result_int reduce_my_ushort_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_2(Allocation ain1) {
        return reduce_my_ushort_2(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_3 = 387;
    // in1 = "in"
    public result_int reduce_my_ushort_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_3(Allocation ain1) {
        return reduce_my_ushort_3(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_4 = 388;
    // in1 = "in"
    public result_int reduce_my_ushort_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_4(Allocation ain1) {
        return reduce_my_ushort_4(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_5 = 389;
    // in1 = "in"
    public result_int reduce_my_ushort_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_5(Allocation ain1) {
        return reduce_my_ushort_5(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_6 = 390;
    // in1 = "in"
    public result_int reduce_my_ushort_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_6(Allocation ain1) {
        return reduce_my_ushort_6(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_7 = 391;
    // in1 = "in"
    public result_int reduce_my_ushort_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_7(Allocation ain1) {
        return reduce_my_ushort_7(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_8 = 392;
    // in1 = "in"
    public result_int reduce_my_ushort_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_8(Allocation ain1) {
        return reduce_my_ushort_8(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_9 = 393;
    // in1 = "in"
    public result_int reduce_my_ushort_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_9(Allocation ain1) {
        return reduce_my_ushort_9(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_10 = 394;
    // in1 = "in"
    public result_int reduce_my_ushort_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_10(Allocation ain1) {
        return reduce_my_ushort_10(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_11 = 395;
    // in1 = "in"
    public result_int reduce_my_ushort_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_11(Allocation ain1) {
        return reduce_my_ushort_11(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_12 = 396;
    // in1 = "in"
    public result_int reduce_my_ushort_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_12(Allocation ain1) {
        return reduce_my_ushort_12(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_13 = 397;
    // in1 = "in"
    public result_int reduce_my_ushort_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_13(Allocation ain1) {
        return reduce_my_ushort_13(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_14 = 398;
    // in1 = "in"
    public result_int reduce_my_ushort_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_14(Allocation ain1) {
        return reduce_my_ushort_14(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort_15 = 399;
    // in1 = "in"
    public result_int reduce_my_ushort_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_15(Allocation ain1) {
        return reduce_my_ushort_15(ain1, null);
    }

    // ain1 = "ushort in"
    public result_int reduce_my_ushort_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_0 = 400;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_0(Allocation ain1) {
        return reduce_my_ushort2_0(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_1 = 401;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_1(Allocation ain1) {
        return reduce_my_ushort2_1(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_2 = 402;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_2(Allocation ain1) {
        return reduce_my_ushort2_2(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_3 = 403;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_3(Allocation ain1) {
        return reduce_my_ushort2_3(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_4 = 404;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_4(Allocation ain1) {
        return reduce_my_ushort2_4(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_5 = 405;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_5(Allocation ain1) {
        return reduce_my_ushort2_5(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_6 = 406;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_6(Allocation ain1) {
        return reduce_my_ushort2_6(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_7 = 407;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_7(Allocation ain1) {
        return reduce_my_ushort2_7(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_8 = 408;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_8(Allocation ain1) {
        return reduce_my_ushort2_8(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_9 = 409;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_9(Allocation ain1) {
        return reduce_my_ushort2_9(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_10 = 410;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_10(Allocation ain1) {
        return reduce_my_ushort2_10(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_11 = 411;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_11(Allocation ain1) {
        return reduce_my_ushort2_11(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_12 = 412;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_12(Allocation ain1) {
        return reduce_my_ushort2_12(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_13 = 413;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_13(Allocation ain1) {
        return reduce_my_ushort2_13(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_14 = 414;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_14(Allocation ain1) {
        return reduce_my_ushort2_14(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort2_15 = 415;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ushort2_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_15(Allocation ain1) {
        return reduce_my_ushort2_15(ain1, null);
    }

    // ain1 = "ushort2 in"
    public result_int reduce_my_ushort2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_2)) {
            throw new RSRuntimeException("Type mismatch with U16_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_0 = 416;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_0(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_0(Allocation ain1) {
        return reduce_my_ushort4_0(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_1 = 417;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_1(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_1(Allocation ain1) {
        return reduce_my_ushort4_1(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_2 = 418;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_2(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_2(Allocation ain1) {
        return reduce_my_ushort4_2(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_3 = 419;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_3(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_3(Allocation ain1) {
        return reduce_my_ushort4_3(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_4 = 420;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_4(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_4(Allocation ain1) {
        return reduce_my_ushort4_4(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_5 = 421;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_5(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_5(Allocation ain1) {
        return reduce_my_ushort4_5(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_6 = 422;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_6(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_6(Allocation ain1) {
        return reduce_my_ushort4_6(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_7 = 423;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_7(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_7(Allocation ain1) {
        return reduce_my_ushort4_7(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_8 = 424;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_8(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_8(Allocation ain1) {
        return reduce_my_ushort4_8(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_9 = 425;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_9(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_9(Allocation ain1) {
        return reduce_my_ushort4_9(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_10 = 426;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_10(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_10(Allocation ain1) {
        return reduce_my_ushort4_10(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_11 = 427;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_11(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_11(Allocation ain1) {
        return reduce_my_ushort4_11(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_12 = 428;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_12(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_12(Allocation ain1) {
        return reduce_my_ushort4_12(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_13 = 429;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_13(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_13(Allocation ain1) {
        return reduce_my_ushort4_13(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_14 = 430;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_14(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_14(Allocation ain1) {
        return reduce_my_ushort4_14(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ushort4_15 = 431;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ushort4_15(short[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U16_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ushort4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_15(Allocation ain1) {
        return reduce_my_ushort4_15(ain1, null);
    }

    // ain1 = "ushort4 in"
    public result_int reduce_my_ushort4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U16_4)) {
            throw new RSRuntimeException("Type mismatch with U16_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ushort4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_0 = 432;
    // in1 = "in"
    public result_int reduce_my_uint_0(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_0(Allocation ain1) {
        return reduce_my_uint_0(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_1 = 433;
    // in1 = "in"
    public result_int reduce_my_uint_1(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_1(Allocation ain1) {
        return reduce_my_uint_1(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_2 = 434;
    // in1 = "in"
    public result_int reduce_my_uint_2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_2(Allocation ain1) {
        return reduce_my_uint_2(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_3 = 435;
    // in1 = "in"
    public result_int reduce_my_uint_3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_3(Allocation ain1) {
        return reduce_my_uint_3(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_4 = 436;
    // in1 = "in"
    public result_int reduce_my_uint_4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_4(Allocation ain1) {
        return reduce_my_uint_4(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_5 = 437;
    // in1 = "in"
    public result_int reduce_my_uint_5(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_5(Allocation ain1) {
        return reduce_my_uint_5(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_6 = 438;
    // in1 = "in"
    public result_int reduce_my_uint_6(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_6(Allocation ain1) {
        return reduce_my_uint_6(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_7 = 439;
    // in1 = "in"
    public result_int reduce_my_uint_7(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_7(Allocation ain1) {
        return reduce_my_uint_7(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_8 = 440;
    // in1 = "in"
    public result_int reduce_my_uint_8(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_8(Allocation ain1) {
        return reduce_my_uint_8(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_9 = 441;
    // in1 = "in"
    public result_int reduce_my_uint_9(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_9(Allocation ain1) {
        return reduce_my_uint_9(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_10 = 442;
    // in1 = "in"
    public result_int reduce_my_uint_10(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_10(Allocation ain1) {
        return reduce_my_uint_10(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_11 = 443;
    // in1 = "in"
    public result_int reduce_my_uint_11(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_11(Allocation ain1) {
        return reduce_my_uint_11(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_12 = 444;
    // in1 = "in"
    public result_int reduce_my_uint_12(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_12(Allocation ain1) {
        return reduce_my_uint_12(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_13 = 445;
    // in1 = "in"
    public result_int reduce_my_uint_13(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_13(Allocation ain1) {
        return reduce_my_uint_13(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_14 = 446;
    // in1 = "in"
    public result_int reduce_my_uint_14(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_14(Allocation ain1) {
        return reduce_my_uint_14(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint_15 = 447;
    // in1 = "in"
    public result_int reduce_my_uint_15(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_15(Allocation ain1) {
        return reduce_my_uint_15(ain1, null);
    }

    // ain1 = "uint in"
    public result_int reduce_my_uint_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_0 = 448;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_0(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_0(Allocation ain1) {
        return reduce_my_uint2_0(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_1 = 449;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_1(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_1(Allocation ain1) {
        return reduce_my_uint2_1(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_2 = 450;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_2(Allocation ain1) {
        return reduce_my_uint2_2(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_3 = 451;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_3(Allocation ain1) {
        return reduce_my_uint2_3(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_4 = 452;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_4(Allocation ain1) {
        return reduce_my_uint2_4(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_5 = 453;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_5(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_5(Allocation ain1) {
        return reduce_my_uint2_5(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_6 = 454;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_6(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_6(Allocation ain1) {
        return reduce_my_uint2_6(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_7 = 455;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_7(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_7(Allocation ain1) {
        return reduce_my_uint2_7(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_8 = 456;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_8(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_8(Allocation ain1) {
        return reduce_my_uint2_8(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_9 = 457;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_9(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_9(Allocation ain1) {
        return reduce_my_uint2_9(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_10 = 458;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_10(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_10(Allocation ain1) {
        return reduce_my_uint2_10(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_11 = 459;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_11(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_11(Allocation ain1) {
        return reduce_my_uint2_11(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_12 = 460;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_12(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_12(Allocation ain1) {
        return reduce_my_uint2_12(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_13 = 461;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_13(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_13(Allocation ain1) {
        return reduce_my_uint2_13(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_14 = 462;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_14(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_14(Allocation ain1) {
        return reduce_my_uint2_14(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint2_15 = 463;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_uint2_15(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_15(Allocation ain1) {
        return reduce_my_uint2_15(ain1, null);
    }

    // ain1 = "uint2 in"
    public result_int reduce_my_uint2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_2)) {
            throw new RSRuntimeException("Type mismatch with U32_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_0 = 464;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_0(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_0(Allocation ain1) {
        return reduce_my_uint4_0(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_1 = 465;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_1(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_1(Allocation ain1) {
        return reduce_my_uint4_1(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_2 = 466;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_2(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_2(Allocation ain1) {
        return reduce_my_uint4_2(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_3 = 467;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_3(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_3(Allocation ain1) {
        return reduce_my_uint4_3(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_4 = 468;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_4(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_4(Allocation ain1) {
        return reduce_my_uint4_4(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_5 = 469;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_5(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_5(Allocation ain1) {
        return reduce_my_uint4_5(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_6 = 470;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_6(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_6(Allocation ain1) {
        return reduce_my_uint4_6(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_7 = 471;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_7(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_7(Allocation ain1) {
        return reduce_my_uint4_7(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_8 = 472;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_8(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_8(Allocation ain1) {
        return reduce_my_uint4_8(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_9 = 473;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_9(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_9(Allocation ain1) {
        return reduce_my_uint4_9(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_10 = 474;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_10(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_10(Allocation ain1) {
        return reduce_my_uint4_10(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_11 = 475;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_11(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_11(Allocation ain1) {
        return reduce_my_uint4_11(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_12 = 476;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_12(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_12(Allocation ain1) {
        return reduce_my_uint4_12(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_13 = 477;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_13(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_13(Allocation ain1) {
        return reduce_my_uint4_13(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_14 = 478;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_14(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_14(Allocation ain1) {
        return reduce_my_uint4_14(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_uint4_15 = 479;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_uint4_15(int[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U32_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_uint4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_15(Allocation ain1) {
        return reduce_my_uint4_15(ain1, null);
    }

    // ain1 = "uint4 in"
    public result_int reduce_my_uint4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U32_4)) {
            throw new RSRuntimeException("Type mismatch with U32_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_uint4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_0 = 480;
    // in1 = "in"
    public result_int reduce_my_ulong_0(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_0(Allocation ain1) {
        return reduce_my_ulong_0(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_1 = 481;
    // in1 = "in"
    public result_int reduce_my_ulong_1(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_1(Allocation ain1) {
        return reduce_my_ulong_1(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_2 = 482;
    // in1 = "in"
    public result_int reduce_my_ulong_2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_2(Allocation ain1) {
        return reduce_my_ulong_2(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_3 = 483;
    // in1 = "in"
    public result_int reduce_my_ulong_3(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_3(Allocation ain1) {
        return reduce_my_ulong_3(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_4 = 484;
    // in1 = "in"
    public result_int reduce_my_ulong_4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_4(Allocation ain1) {
        return reduce_my_ulong_4(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_5 = 485;
    // in1 = "in"
    public result_int reduce_my_ulong_5(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_5(Allocation ain1) {
        return reduce_my_ulong_5(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_6 = 486;
    // in1 = "in"
    public result_int reduce_my_ulong_6(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_6(Allocation ain1) {
        return reduce_my_ulong_6(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_7 = 487;
    // in1 = "in"
    public result_int reduce_my_ulong_7(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_7(Allocation ain1) {
        return reduce_my_ulong_7(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_8 = 488;
    // in1 = "in"
    public result_int reduce_my_ulong_8(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_8(Allocation ain1) {
        return reduce_my_ulong_8(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_9 = 489;
    // in1 = "in"
    public result_int reduce_my_ulong_9(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_9(Allocation ain1) {
        return reduce_my_ulong_9(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_10 = 490;
    // in1 = "in"
    public result_int reduce_my_ulong_10(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_10(Allocation ain1) {
        return reduce_my_ulong_10(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_11 = 491;
    // in1 = "in"
    public result_int reduce_my_ulong_11(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_11(Allocation ain1) {
        return reduce_my_ulong_11(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_12 = 492;
    // in1 = "in"
    public result_int reduce_my_ulong_12(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_12(Allocation ain1) {
        return reduce_my_ulong_12(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_13 = 493;
    // in1 = "in"
    public result_int reduce_my_ulong_13(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_13(Allocation ain1) {
        return reduce_my_ulong_13(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_14 = 494;
    // in1 = "in"
    public result_int reduce_my_ulong_14(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_14(Allocation ain1) {
        return reduce_my_ulong_14(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong_15 = 495;
    // in1 = "in"
    public result_int reduce_my_ulong_15(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_15(Allocation ain1) {
        return reduce_my_ulong_15(ain1, null);
    }

    // ain1 = "ulong in"
    public result_int reduce_my_ulong_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_0 = 496;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_0(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_0(Allocation ain1) {
        return reduce_my_ulong2_0(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_1 = 497;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_1(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_1(Allocation ain1) {
        return reduce_my_ulong2_1(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_2 = 498;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_2(Allocation ain1) {
        return reduce_my_ulong2_2(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_3 = 499;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_3(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_3(Allocation ain1) {
        return reduce_my_ulong2_3(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_4 = 500;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_4(Allocation ain1) {
        return reduce_my_ulong2_4(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_5 = 501;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_5(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_5(Allocation ain1) {
        return reduce_my_ulong2_5(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_6 = 502;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_6(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_6(Allocation ain1) {
        return reduce_my_ulong2_6(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_7 = 503;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_7(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_7(Allocation ain1) {
        return reduce_my_ulong2_7(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_8 = 504;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_8(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_8(Allocation ain1) {
        return reduce_my_ulong2_8(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_9 = 505;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_9(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_9(Allocation ain1) {
        return reduce_my_ulong2_9(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_10 = 506;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_10(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_10(Allocation ain1) {
        return reduce_my_ulong2_10(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_11 = 507;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_11(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_11(Allocation ain1) {
        return reduce_my_ulong2_11(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_12 = 508;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_12(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_12(Allocation ain1) {
        return reduce_my_ulong2_12(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_13 = 509;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_13(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_13(Allocation ain1) {
        return reduce_my_ulong2_13(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_14 = 510;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_14(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_14(Allocation ain1) {
        return reduce_my_ulong2_14(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong2_15 = 511;
    // in1 = "in", flattened 2-vectors
    public result_int reduce_my_ulong2_15(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 2 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 2 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_2, in1.length / 2);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong2_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_15(Allocation ain1) {
        return reduce_my_ulong2_15(ain1, null);
    }

    // ain1 = "ulong2 in"
    public result_int reduce_my_ulong2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_2)) {
            throw new RSRuntimeException("Type mismatch with U64_2!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_0 = 512;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_0(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_0(Allocation ain1) {
        return reduce_my_ulong4_0(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_1 = 513;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_1(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_1(Allocation ain1) {
        return reduce_my_ulong4_1(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_2 = 514;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_2(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_2(Allocation ain1) {
        return reduce_my_ulong4_2(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_3 = 515;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_3(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_3(Allocation ain1) {
        return reduce_my_ulong4_3(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_4 = 516;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_4(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_4(Allocation ain1) {
        return reduce_my_ulong4_4(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_5 = 517;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_5(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_5(Allocation ain1) {
        return reduce_my_ulong4_5(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_6 = 518;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_6(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_6(Allocation ain1) {
        return reduce_my_ulong4_6(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_7 = 519;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_7(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_7(Allocation ain1) {
        return reduce_my_ulong4_7(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_8 = 520;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_8(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_8(Allocation ain1) {
        return reduce_my_ulong4_8(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_9 = 521;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_9(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_9(Allocation ain1) {
        return reduce_my_ulong4_9(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_10 = 522;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_10(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_10(Allocation ain1) {
        return reduce_my_ulong4_10(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_11 = 523;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_11(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_11(Allocation ain1) {
        return reduce_my_ulong4_11(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_12 = 524;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_12(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_12(Allocation ain1) {
        return reduce_my_ulong4_12(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_13 = 525;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_13(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_13(Allocation ain1) {
        return reduce_my_ulong4_13(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_14 = 526;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_14(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_14(Allocation ain1) {
        return reduce_my_ulong4_14(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_ulong4_15 = 527;
    // in1 = "in", flattened 4-vectors
    public result_int reduce_my_ulong4_15(long[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        // Verify that the array length is a multiple of the vector size.
        if (in1.length % 4 != 0) {
            throw new RSIllegalArgumentException("Array \"in1\" is not a multiple of 4 in length!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __U64_4, in1.length / 4);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_ulong4_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_15(Allocation ain1) {
        return reduce_my_ulong4_15(ain1, null);
    }

    // ain1 = "ulong4 in"
    public result_int reduce_my_ulong4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__U64_4)) {
            throw new RSRuntimeException("Type mismatch with U64_4!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_ulong4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_0 = 528;
    // in1 = "in"
    public result_int reduce_my_bool_0(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_0(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_0(Allocation ain1) {
        return reduce_my_bool_0(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_1 = 529;
    // in1 = "in"
    public result_int reduce_my_bool_1(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_1(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_1(Allocation ain1) {
        return reduce_my_bool_1(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_2 = 530;
    // in1 = "in"
    public result_int reduce_my_bool_2(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_2(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_2(Allocation ain1) {
        return reduce_my_bool_2(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_3 = 531;
    // in1 = "in"
    public result_int reduce_my_bool_3(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_3(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_3(Allocation ain1) {
        return reduce_my_bool_3(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_4 = 532;
    // in1 = "in"
    public result_int reduce_my_bool_4(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_4(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_4(Allocation ain1) {
        return reduce_my_bool_4(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_5 = 533;
    // in1 = "in"
    public result_int reduce_my_bool_5(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_5(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_5(Allocation ain1) {
        return reduce_my_bool_5(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_6 = 534;
    // in1 = "in"
    public result_int reduce_my_bool_6(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_6(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_6(Allocation ain1) {
        return reduce_my_bool_6(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_7 = 535;
    // in1 = "in"
    public result_int reduce_my_bool_7(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_7(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_7(Allocation ain1) {
        return reduce_my_bool_7(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_8 = 536;
    // in1 = "in"
    public result_int reduce_my_bool_8(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_8(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_8(Allocation ain1) {
        return reduce_my_bool_8(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_9 = 537;
    // in1 = "in"
    public result_int reduce_my_bool_9(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_9(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_9(Allocation ain1) {
        return reduce_my_bool_9(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_10 = 538;
    // in1 = "in"
    public result_int reduce_my_bool_10(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_10(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_10(Allocation ain1) {
        return reduce_my_bool_10(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_11 = 539;
    // in1 = "in"
    public result_int reduce_my_bool_11(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_11(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_11(Allocation ain1) {
        return reduce_my_bool_11(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_12 = 540;
    // in1 = "in"
    public result_int reduce_my_bool_12(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_12(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_12(Allocation ain1) {
        return reduce_my_bool_12(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_13 = 541;
    // in1 = "in"
    public result_int reduce_my_bool_13(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_13(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_13(Allocation ain1) {
        return reduce_my_bool_13(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_14 = 542;
    // in1 = "in"
    public result_int reduce_my_bool_14(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_14(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_14(Allocation ain1) {
        return reduce_my_bool_14(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_bool_15 = 543;
    // in1 = "in"
    public result_int reduce_my_bool_15(byte[] in1) {
        // Verify that "in1" is non-null.
        if (in1 == null) {
            throw new RSIllegalArgumentException("Array \"in1\" is null!");
        }
        Allocation ain1 = Allocation.createSized(mRSLocal, __BOOLEAN, in1.length);
        ain1.setAutoPadding(true);
        ain1.copyFrom(in1);

        result_int result = reduce_my_bool_15(ain1, null);
        result.mTempIns = new Allocation[]{ain1};
        return result;
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_15(Allocation ain1) {
        return reduce_my_bool_15(ain1, null);
    }

    // ain1 = "bool in"
    public result_int reduce_my_bool_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_bool_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_0 = 544;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_0(Allocation ain1) {
        return reduce_my_rs_matrix2x2_0(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_1 = 545;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_1(Allocation ain1) {
        return reduce_my_rs_matrix2x2_1(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_2 = 546;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_2(Allocation ain1) {
        return reduce_my_rs_matrix2x2_2(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_3 = 547;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_3(Allocation ain1) {
        return reduce_my_rs_matrix2x2_3(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_4 = 548;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_4(Allocation ain1) {
        return reduce_my_rs_matrix2x2_4(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_5 = 549;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_5(Allocation ain1) {
        return reduce_my_rs_matrix2x2_5(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_6 = 550;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_6(Allocation ain1) {
        return reduce_my_rs_matrix2x2_6(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_7 = 551;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_7(Allocation ain1) {
        return reduce_my_rs_matrix2x2_7(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_8 = 552;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_8(Allocation ain1) {
        return reduce_my_rs_matrix2x2_8(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_9 = 553;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_9(Allocation ain1) {
        return reduce_my_rs_matrix2x2_9(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_10 = 554;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_10(Allocation ain1) {
        return reduce_my_rs_matrix2x2_10(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_11 = 555;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_11(Allocation ain1) {
        return reduce_my_rs_matrix2x2_11(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_12 = 556;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_12(Allocation ain1) {
        return reduce_my_rs_matrix2x2_12(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_13 = 557;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_13(Allocation ain1) {
        return reduce_my_rs_matrix2x2_13(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_14 = 558;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_14(Allocation ain1) {
        return reduce_my_rs_matrix2x2_14(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix2x2_15 = 559;
    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_15(Allocation ain1) {
        return reduce_my_rs_matrix2x2_15(ain1, null);
    }

    // ain1 = "rs_matrix2x2 in"
    public result_int reduce_my_rs_matrix2x2_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix2x2_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_0 = 560;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_0(Allocation ain1) {
        return reduce_my_rs_matrix3x3_0(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_1 = 561;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_1(Allocation ain1) {
        return reduce_my_rs_matrix3x3_1(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_2 = 562;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_2(Allocation ain1) {
        return reduce_my_rs_matrix3x3_2(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_3 = 563;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_3(Allocation ain1) {
        return reduce_my_rs_matrix3x3_3(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_4 = 564;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_4(Allocation ain1) {
        return reduce_my_rs_matrix3x3_4(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_5 = 565;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_5(Allocation ain1) {
        return reduce_my_rs_matrix3x3_5(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_6 = 566;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_6(Allocation ain1) {
        return reduce_my_rs_matrix3x3_6(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_7 = 567;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_7(Allocation ain1) {
        return reduce_my_rs_matrix3x3_7(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_8 = 568;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_8(Allocation ain1) {
        return reduce_my_rs_matrix3x3_8(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_9 = 569;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_9(Allocation ain1) {
        return reduce_my_rs_matrix3x3_9(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_10 = 570;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_10(Allocation ain1) {
        return reduce_my_rs_matrix3x3_10(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_11 = 571;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_11(Allocation ain1) {
        return reduce_my_rs_matrix3x3_11(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_12 = 572;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_12(Allocation ain1) {
        return reduce_my_rs_matrix3x3_12(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_13 = 573;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_13(Allocation ain1) {
        return reduce_my_rs_matrix3x3_13(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_14 = 574;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_14(Allocation ain1) {
        return reduce_my_rs_matrix3x3_14(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix3x3_15 = 575;
    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_15(Allocation ain1) {
        return reduce_my_rs_matrix3x3_15(ain1, null);
    }

    // ain1 = "rs_matrix3x3 in"
    public result_int reduce_my_rs_matrix3x3_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix3x3_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_0 = 576;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_0(Allocation ain1) {
        return reduce_my_rs_matrix4x4_0(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_1 = 577;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_1(Allocation ain1) {
        return reduce_my_rs_matrix4x4_1(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_2 = 578;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_2(Allocation ain1) {
        return reduce_my_rs_matrix4x4_2(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_3 = 579;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_3(Allocation ain1) {
        return reduce_my_rs_matrix4x4_3(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_4 = 580;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_4(Allocation ain1) {
        return reduce_my_rs_matrix4x4_4(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_5 = 581;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_5(Allocation ain1) {
        return reduce_my_rs_matrix4x4_5(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_6 = 582;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_6(Allocation ain1) {
        return reduce_my_rs_matrix4x4_6(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_7 = 583;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_7(Allocation ain1) {
        return reduce_my_rs_matrix4x4_7(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_8 = 584;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_8(Allocation ain1) {
        return reduce_my_rs_matrix4x4_8(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_9 = 585;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_9(Allocation ain1) {
        return reduce_my_rs_matrix4x4_9(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_10 = 586;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_10(Allocation ain1) {
        return reduce_my_rs_matrix4x4_10(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_11 = 587;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_11(Allocation ain1) {
        return reduce_my_rs_matrix4x4_11(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_12 = 588;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_12(Allocation ain1) {
        return reduce_my_rs_matrix4x4_12(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_13 = 589;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_13(Allocation ain1) {
        return reduce_my_rs_matrix4x4_13(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_14 = 590;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_14(Allocation ain1) {
        return reduce_my_rs_matrix4x4_14(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_rs_matrix4x4_15 = 591;
    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_15(Allocation ain1) {
        return reduce_my_rs_matrix4x4_15(ain1, null);
    }

    // ain1 = "rs_matrix4x4 in"
    public result_int reduce_my_rs_matrix4x4_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_rs_matrix4x4_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_0 = 592;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_0(Allocation ain1) {
        return reduce_my_MyStruct_0(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_0(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_0, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_1 = 593;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_1(Allocation ain1) {
        return reduce_my_MyStruct_1(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_1(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_1, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_2 = 594;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_2(Allocation ain1) {
        return reduce_my_MyStruct_2(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_2(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_2, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_3 = 595;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_3(Allocation ain1) {
        return reduce_my_MyStruct_3(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_3(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_3, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_4 = 596;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_4(Allocation ain1) {
        return reduce_my_MyStruct_4(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_4(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_4, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_5 = 597;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_5(Allocation ain1) {
        return reduce_my_MyStruct_5(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_5(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_5, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_6 = 598;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_6(Allocation ain1) {
        return reduce_my_MyStruct_6(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_6(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_6, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_7 = 599;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_7(Allocation ain1) {
        return reduce_my_MyStruct_7(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_7(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_7, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_8 = 600;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_8(Allocation ain1) {
        return reduce_my_MyStruct_8(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_8(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_8, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_9 = 601;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_9(Allocation ain1) {
        return reduce_my_MyStruct_9(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_9(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_9, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_10 = 602;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_10(Allocation ain1) {
        return reduce_my_MyStruct_10(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_10(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_10, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_11 = 603;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_11(Allocation ain1) {
        return reduce_my_MyStruct_11(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_11(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_11, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_12 = 604;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_12(Allocation ain1) {
        return reduce_my_MyStruct_12(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_12(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_12, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_13 = 605;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_13(Allocation ain1) {
        return reduce_my_MyStruct_13(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_13(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_13, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_14 = 606;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_14(Allocation ain1) {
        return reduce_my_MyStruct_14(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_14(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_14, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

    private final static int mExportReduceIdx_my_MyStruct_15 = 607;
    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_15(Allocation ain1) {
        return reduce_my_MyStruct_15(ain1, null);
    }

    // ain1 = "/* struct <> */ in"
    public result_int reduce_my_MyStruct_15(Allocation ain1, Script.LaunchOptions sc) {
        // check ain1
        if (!ain1.getType().getElement().isCompatible(__ScriptField_MyStruct)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_MyStruct!");
        }
        Allocation aout = Allocation.createSized(mRSLocal, __I32, 1);
        aout.setAutoPadding(true);
        reduce(mExportReduceIdx_my_MyStruct_15, new Allocation[]{ain1}, aout, sc);
        return new result_int(aout);
    }

}

