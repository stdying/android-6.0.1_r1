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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/compile/slang/tests/P_math_int/math_int.rs
 */

package foo;

import android.renderscript.*;
import foo.math_intBitCode;

/**
 * @hide
 */
public class ScriptC_math_int extends ScriptC {
    private static final String __rs_resource_name = "math_int";
    // Constructor
    public  ScriptC_math_int(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              math_intBitCode.getBitCode32(),
              math_intBitCode.getBitCode64());
        __U8 = Element.U8(rs);
        __U8_2 = Element.U8_2(rs);
        __U8_3 = Element.U8_3(rs);
        __U8_4 = Element.U8_4(rs);
        __U16 = Element.U16(rs);
        __U16_2 = Element.U16_2(rs);
        __U16_3 = Element.U16_3(rs);
        __U16_4 = Element.U16_4(rs);
        __U32 = Element.U32(rs);
        __U32_2 = Element.U32_2(rs);
        __U32_3 = Element.U32_3(rs);
        __U32_4 = Element.U32_4(rs);
        __I8 = Element.I8(rs);
        __I8_2 = Element.I8_2(rs);
        __I8_3 = Element.I8_3(rs);
        __I8_4 = Element.I8_4(rs);
        __I16 = Element.I16(rs);
        __I16_2 = Element.I16_2(rs);
        __I16_3 = Element.I16_3(rs);
        __I16_4 = Element.I16_4(rs);
        __I32 = Element.I32(rs);
        __I32_2 = Element.I32_2(rs);
        __I32_3 = Element.I32_3(rs);
        __I32_4 = Element.I32_4(rs);
        __F32 = Element.F32(rs);
        __F32_2 = Element.F32_2(rs);
        __F32_3 = Element.F32_3(rs);
        __F32_4 = Element.F32_4(rs);
    }

    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    private Element __I16;
    private Element __I16_2;
    private Element __I16_3;
    private Element __I16_4;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_3;
    private Element __I32_4;
    private Element __I8;
    private Element __I8_2;
    private Element __I8_3;
    private Element __I8_4;
    private Element __U16;
    private Element __U16_2;
    private Element __U16_3;
    private Element __U16_4;
    private Element __U32;
    private Element __U32_2;
    private Element __U32_3;
    private Element __U32_4;
    private Element __U8;
    private Element __U8_2;
    private Element __U8_3;
    private Element __U8_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_I16;
    private FieldPacker __rs_fp_I16_2;
    private FieldPacker __rs_fp_I16_3;
    private FieldPacker __rs_fp_I16_4;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I32_2;
    private FieldPacker __rs_fp_I32_3;
    private FieldPacker __rs_fp_I32_4;
    private FieldPacker __rs_fp_I8;
    private FieldPacker __rs_fp_I8_2;
    private FieldPacker __rs_fp_I8_3;
    private FieldPacker __rs_fp_I8_4;
    private FieldPacker __rs_fp_U16;
    private FieldPacker __rs_fp_U16_2;
    private FieldPacker __rs_fp_U16_3;
    private FieldPacker __rs_fp_U16_4;
    private FieldPacker __rs_fp_U32;
    private FieldPacker __rs_fp_U32_2;
    private FieldPacker __rs_fp_U32_3;
    private FieldPacker __rs_fp_U32_4;
    private FieldPacker __rs_fp_U8;
    private FieldPacker __rs_fp_U8_2;
    private FieldPacker __rs_fp_U8_3;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_uc = 0;
    private short mExportVar_uc;
    public synchronized void set_uc(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_uc, __rs_fp_U8);
        mExportVar_uc = v;
    }

    public short get_uc() {
        return mExportVar_uc;
    }

    public Script.FieldID getFieldID_uc() {
        return createFieldID(mExportVarIdx_uc, null);
    }

    private final static int mExportVarIdx_uc2 = 1;
    private Short2 mExportVar_uc2;
    public synchronized void set_uc2(Short2 v) {
        mExportVar_uc2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc2, fp, __U8_2, __dimArr);
    }

    public Short2 get_uc2() {
        return mExportVar_uc2;
    }

    public Script.FieldID getFieldID_uc2() {
        return createFieldID(mExportVarIdx_uc2, null);
    }

    private final static int mExportVarIdx_uc3 = 2;
    private Short3 mExportVar_uc3;
    public synchronized void set_uc3(Short3 v) {
        mExportVar_uc3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc3, fp, __U8_3, __dimArr);
    }

    public Short3 get_uc3() {
        return mExportVar_uc3;
    }

    public Script.FieldID getFieldID_uc3() {
        return createFieldID(mExportVarIdx_uc3, null);
    }

    private final static int mExportVarIdx_uc4 = 3;
    private Short4 mExportVar_uc4;
    public synchronized void set_uc4(Short4 v) {
        mExportVar_uc4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc4, fp, __U8_4, __dimArr);
    }

    public Short4 get_uc4() {
        return mExportVar_uc4;
    }

    public Script.FieldID getFieldID_uc4() {
        return createFieldID(mExportVarIdx_uc4, null);
    }

    private final static int mExportVarIdx_us = 4;
    private int mExportVar_us;
    public synchronized void set_us(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_us, __rs_fp_U16);
        mExportVar_us = v;
    }

    public int get_us() {
        return mExportVar_us;
    }

    public Script.FieldID getFieldID_us() {
        return createFieldID(mExportVarIdx_us, null);
    }

    private final static int mExportVarIdx_us2 = 5;
    private Int2 mExportVar_us2;
    public synchronized void set_us2(Int2 v) {
        mExportVar_us2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_us2, fp, __U16_2, __dimArr);
    }

    public Int2 get_us2() {
        return mExportVar_us2;
    }

    public Script.FieldID getFieldID_us2() {
        return createFieldID(mExportVarIdx_us2, null);
    }

    private final static int mExportVarIdx_us3 = 6;
    private Int3 mExportVar_us3;
    public synchronized void set_us3(Int3 v) {
        mExportVar_us3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_us3, fp, __U16_3, __dimArr);
    }

    public Int3 get_us3() {
        return mExportVar_us3;
    }

    public Script.FieldID getFieldID_us3() {
        return createFieldID(mExportVarIdx_us3, null);
    }

    private final static int mExportVarIdx_us4 = 7;
    private Int4 mExportVar_us4;
    public synchronized void set_us4(Int4 v) {
        mExportVar_us4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_us4, fp, __U16_4, __dimArr);
    }

    public Int4 get_us4() {
        return mExportVar_us4;
    }

    public Script.FieldID getFieldID_us4() {
        return createFieldID(mExportVarIdx_us4, null);
    }

    private final static int mExportVarIdx_ui = 8;
    private long mExportVar_ui;
    public synchronized void set_ui(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_ui, __rs_fp_U32);
        mExportVar_ui = v;
    }

    public long get_ui() {
        return mExportVar_ui;
    }

    public Script.FieldID getFieldID_ui() {
        return createFieldID(mExportVarIdx_ui, null);
    }

    private final static int mExportVarIdx_ui2 = 9;
    private Long2 mExportVar_ui2;
    public synchronized void set_ui2(Long2 v) {
        mExportVar_ui2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ui2, fp, __U32_2, __dimArr);
    }

    public Long2 get_ui2() {
        return mExportVar_ui2;
    }

    public Script.FieldID getFieldID_ui2() {
        return createFieldID(mExportVarIdx_ui2, null);
    }

    private final static int mExportVarIdx_ui3 = 10;
    private Long3 mExportVar_ui3;
    public synchronized void set_ui3(Long3 v) {
        mExportVar_ui3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ui3, fp, __U32_3, __dimArr);
    }

    public Long3 get_ui3() {
        return mExportVar_ui3;
    }

    public Script.FieldID getFieldID_ui3() {
        return createFieldID(mExportVarIdx_ui3, null);
    }

    private final static int mExportVarIdx_ui4 = 11;
    private Long4 mExportVar_ui4;
    public synchronized void set_ui4(Long4 v) {
        mExportVar_ui4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ui4, fp, __U32_4, __dimArr);
    }

    public Long4 get_ui4() {
        return mExportVar_ui4;
    }

    public Script.FieldID getFieldID_ui4() {
        return createFieldID(mExportVarIdx_ui4, null);
    }

    private final static int mExportVarIdx_c = 12;
    private byte mExportVar_c;
    public synchronized void set_c(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_c, __rs_fp_I8);
        mExportVar_c = v;
    }

    public byte get_c() {
        return mExportVar_c;
    }

    public Script.FieldID getFieldID_c() {
        return createFieldID(mExportVarIdx_c, null);
    }

    private final static int mExportVarIdx_c2 = 13;
    private Byte2 mExportVar_c2;
    public synchronized void set_c2(Byte2 v) {
        mExportVar_c2 = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c2, fp, __I8_2, __dimArr);
    }

    public Byte2 get_c2() {
        return mExportVar_c2;
    }

    public Script.FieldID getFieldID_c2() {
        return createFieldID(mExportVarIdx_c2, null);
    }

    private final static int mExportVarIdx_c3 = 14;
    private Byte3 mExportVar_c3;
    public synchronized void set_c3(Byte3 v) {
        mExportVar_c3 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c3, fp, __I8_3, __dimArr);
    }

    public Byte3 get_c3() {
        return mExportVar_c3;
    }

    public Script.FieldID getFieldID_c3() {
        return createFieldID(mExportVarIdx_c3, null);
    }

    private final static int mExportVarIdx_c4 = 15;
    private Byte4 mExportVar_c4;
    public synchronized void set_c4(Byte4 v) {
        mExportVar_c4 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c4, fp, __I8_4, __dimArr);
    }

    public Byte4 get_c4() {
        return mExportVar_c4;
    }

    public Script.FieldID getFieldID_c4() {
        return createFieldID(mExportVarIdx_c4, null);
    }

    private final static int mExportVarIdx_s = 16;
    private short mExportVar_s;
    public synchronized void set_s(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_s, __rs_fp_I16);
        mExportVar_s = v;
    }

    public short get_s() {
        return mExportVar_s;
    }

    public Script.FieldID getFieldID_s() {
        return createFieldID(mExportVarIdx_s, null);
    }

    private final static int mExportVarIdx_s2 = 17;
    private Short2 mExportVar_s2;
    public synchronized void set_s2(Short2 v) {
        mExportVar_s2 = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_s2, fp, __I16_2, __dimArr);
    }

    public Short2 get_s2() {
        return mExportVar_s2;
    }

    public Script.FieldID getFieldID_s2() {
        return createFieldID(mExportVarIdx_s2, null);
    }

    private final static int mExportVarIdx_s3 = 18;
    private Short3 mExportVar_s3;
    public synchronized void set_s3(Short3 v) {
        mExportVar_s3 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_s3, fp, __I16_3, __dimArr);
    }

    public Short3 get_s3() {
        return mExportVar_s3;
    }

    public Script.FieldID getFieldID_s3() {
        return createFieldID(mExportVarIdx_s3, null);
    }

    private final static int mExportVarIdx_s4 = 19;
    private Short4 mExportVar_s4;
    public synchronized void set_s4(Short4 v) {
        mExportVar_s4 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_s4, fp, __I16_4, __dimArr);
    }

    public Short4 get_s4() {
        return mExportVar_s4;
    }

    public Script.FieldID getFieldID_s4() {
        return createFieldID(mExportVarIdx_s4, null);
    }

    private final static int mExportVarIdx_i = 20;
    private int mExportVar_i;
    public synchronized void set_i(int v) {
        setVar(mExportVarIdx_i, v);
        mExportVar_i = v;
    }

    public int get_i() {
        return mExportVar_i;
    }

    public Script.FieldID getFieldID_i() {
        return createFieldID(mExportVarIdx_i, null);
    }

    private final static int mExportVarIdx_i2 = 21;
    private Int2 mExportVar_i2;
    public synchronized void set_i2(Int2 v) {
        mExportVar_i2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i2, fp, __I32_2, __dimArr);
    }

    public Int2 get_i2() {
        return mExportVar_i2;
    }

    public Script.FieldID getFieldID_i2() {
        return createFieldID(mExportVarIdx_i2, null);
    }

    private final static int mExportVarIdx_i3 = 22;
    private Int3 mExportVar_i3;
    public synchronized void set_i3(Int3 v) {
        mExportVar_i3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i3, fp, __I32_3, __dimArr);
    }

    public Int3 get_i3() {
        return mExportVar_i3;
    }

    public Script.FieldID getFieldID_i3() {
        return createFieldID(mExportVarIdx_i3, null);
    }

    private final static int mExportVarIdx_i4 = 23;
    private Int4 mExportVar_i4;
    public synchronized void set_i4(Int4 v) {
        mExportVar_i4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i4, fp, __I32_4, __dimArr);
    }

    public Int4 get_i4() {
        return mExportVar_i4;
    }

    public Script.FieldID getFieldID_i4() {
        return createFieldID(mExportVarIdx_i4, null);
    }

    private final static int mExportVarIdx_f = 24;
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

    private final static int mExportVarIdx_f2 = 25;
    private Float2 mExportVar_f2;
    public synchronized void set_f2(Float2 v) {
        mExportVar_f2 = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f2, fp, __F32_2, __dimArr);
    }

    public Float2 get_f2() {
        return mExportVar_f2;
    }

    public Script.FieldID getFieldID_f2() {
        return createFieldID(mExportVarIdx_f2, null);
    }

    private final static int mExportVarIdx_f3 = 26;
    private Float3 mExportVar_f3;
    public synchronized void set_f3(Float3 v) {
        mExportVar_f3 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f3, fp, __F32_3, __dimArr);
    }

    public Float3 get_f3() {
        return mExportVar_f3;
    }

    public Script.FieldID getFieldID_f3() {
        return createFieldID(mExportVarIdx_f3, null);
    }

    private final static int mExportVarIdx_f4 = 27;
    private Float4 mExportVar_f4;
    public synchronized void set_f4(Float4 v) {
        mExportVar_f4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f4, fp, __F32_4, __dimArr);
    }

    public Float4 get_f4() {
        return mExportVar_f4;
    }

    public Script.FieldID getFieldID_f4() {
        return createFieldID(mExportVarIdx_f4, null);
    }

    private final static int mExportFuncIdx_compile_all_math_int_ops = 0;
    public Script.InvokeID getInvokeID_compile_all_math_int_ops() {
        return createInvokeID(mExportFuncIdx_compile_all_math_int_ops);
    }

    public void invoke_compile_all_math_int_ops() {
        invoke(mExportFuncIdx_compile_all_math_int_ops);
    }

}

