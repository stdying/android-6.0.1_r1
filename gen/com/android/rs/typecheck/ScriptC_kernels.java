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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/tests/typecheck/kernels.rs
 */

package com.android.rs.typecheck;

import android.renderscript.*;
import com.android.rs.typecheck.kernelsBitCode;

/**
 * @hide
 */
public class ScriptC_kernels extends ScriptC {
    private static final String __rs_resource_name = "kernels";
    // Constructor
    public  ScriptC_kernels(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              kernelsBitCode.getBitCode32(),
              kernelsBitCode.getBitCode64());
        __I8 = Element.I8(rs);
        mExportVar_c1i = 1;
        __I8_2 = Element.I8_2(rs);
        mExportVar_c2i = new Byte2();
        mExportVar_c2i.x = 1;
        mExportVar_c2i.y = 2;
        __I8_3 = Element.I8_3(rs);
        mExportVar_c3i = new Byte3();
        mExportVar_c3i.x = 1;
        mExportVar_c3i.y = 2;
        mExportVar_c3i.z = 3;
        __I8_4 = Element.I8_4(rs);
        mExportVar_c4i = new Byte4();
        mExportVar_c4i.x = 1;
        mExportVar_c4i.y = 2;
        mExportVar_c4i.z = 3;
        mExportVar_c4i.w = 4;
        __U8 = Element.U8(rs);
        mExportVar_uc1i = 1;
        __U8_2 = Element.U8_2(rs);
        mExportVar_uc2i = new Short2();
        mExportVar_uc2i.x = 1;
        mExportVar_uc2i.y = 2;
        __U8_3 = Element.U8_3(rs);
        mExportVar_uc3i = new Short3();
        mExportVar_uc3i.x = 1;
        mExportVar_uc3i.y = 2;
        mExportVar_uc3i.z = 3;
        __U8_4 = Element.U8_4(rs);
        mExportVar_uc4i = new Short4();
        mExportVar_uc4i.x = 1;
        mExportVar_uc4i.y = 2;
        mExportVar_uc4i.z = 3;
        mExportVar_uc4i.w = 4;
        __I16 = Element.I16(rs);
        mExportVar_s1i = 1;
        __I16_2 = Element.I16_2(rs);
        mExportVar_s2i = new Short2();
        mExportVar_s2i.x = 1;
        mExportVar_s2i.y = 2;
        __I16_3 = Element.I16_3(rs);
        mExportVar_s3i = new Short3();
        mExportVar_s3i.x = 1;
        mExportVar_s3i.y = 2;
        mExportVar_s3i.z = 3;
        __I16_4 = Element.I16_4(rs);
        mExportVar_s4i = new Short4();
        mExportVar_s4i.x = 1;
        mExportVar_s4i.y = 2;
        mExportVar_s4i.z = 3;
        mExportVar_s4i.w = 4;
        __U16 = Element.U16(rs);
        mExportVar_us1i = 1;
        __U16_2 = Element.U16_2(rs);
        mExportVar_us2i = new Int2();
        mExportVar_us2i.x = 1;
        mExportVar_us2i.y = 2;
        __U16_3 = Element.U16_3(rs);
        mExportVar_us3i = new Int3();
        mExportVar_us3i.x = 1;
        mExportVar_us3i.y = 2;
        mExportVar_us3i.z = 3;
        __U16_4 = Element.U16_4(rs);
        mExportVar_us4i = new Int4();
        mExportVar_us4i.x = 1;
        mExportVar_us4i.y = 2;
        mExportVar_us4i.z = 3;
        mExportVar_us4i.w = 4;
        __I32 = Element.I32(rs);
        mExportVar_i1i = 1;
        __I32_2 = Element.I32_2(rs);
        mExportVar_i2i = new Int2();
        mExportVar_i2i.x = 1;
        mExportVar_i2i.y = 2;
        __I32_3 = Element.I32_3(rs);
        mExportVar_i3i = new Int3();
        mExportVar_i3i.x = 1;
        mExportVar_i3i.y = 2;
        mExportVar_i3i.z = 3;
        __I32_4 = Element.I32_4(rs);
        mExportVar_i4i = new Int4();
        mExportVar_i4i.x = 1;
        mExportVar_i4i.y = 2;
        mExportVar_i4i.z = 3;
        mExportVar_i4i.w = 4;
        __U32 = Element.U32(rs);
        mExportVar_ui1i = 1;
        __U32_2 = Element.U32_2(rs);
        mExportVar_ui2i = new Long2();
        mExportVar_ui2i.x = 1;
        mExportVar_ui2i.y = 2;
        __U32_3 = Element.U32_3(rs);
        mExportVar_ui3i = new Long3();
        mExportVar_ui3i.x = 1;
        mExportVar_ui3i.y = 2;
        mExportVar_ui3i.z = 3;
        __U32_4 = Element.U32_4(rs);
        mExportVar_ui4i = new Long4();
        mExportVar_ui4i.x = 1;
        mExportVar_ui4i.y = 2;
        mExportVar_ui4i.z = 3;
        mExportVar_ui4i.w = 4;
        __I64 = Element.I64(rs);
        mExportVar_l1i = 1L;
        __I64_2 = Element.I64_2(rs);
        mExportVar_l2i = new Long2();
        mExportVar_l2i.x = 1L;
        mExportVar_l2i.y = 2L;
        __I64_3 = Element.I64_3(rs);
        mExportVar_l3i = new Long3();
        mExportVar_l3i.x = 1L;
        mExportVar_l3i.y = 2L;
        mExportVar_l3i.z = 3L;
        __I64_4 = Element.I64_4(rs);
        mExportVar_l4i = new Long4();
        mExportVar_l4i.x = 1L;
        mExportVar_l4i.y = 2L;
        mExportVar_l4i.z = 3L;
        mExportVar_l4i.w = 4L;
        __U64 = Element.U64(rs);
        mExportVar_ul1i = 1L;
        __U64_2 = Element.U64_2(rs);
        mExportVar_ul2i = new Long2();
        mExportVar_ul2i.x = 1L;
        mExportVar_ul2i.y = 2L;
        __U64_3 = Element.U64_3(rs);
        mExportVar_ul3i = new Long3();
        mExportVar_ul3i.x = 1L;
        mExportVar_ul3i.y = 2L;
        mExportVar_ul3i.z = 3L;
        __U64_4 = Element.U64_4(rs);
        mExportVar_ul4i = new Long4();
        mExportVar_ul4i.x = 1L;
        mExportVar_ul4i.y = 2L;
        mExportVar_ul4i.z = 3L;
        mExportVar_ul4i.w = 4L;
        __F32 = Element.F32(rs);
        mExportVar_f1i = 3.14159226f;
        __F32_2 = Element.F32_2(rs);
        mExportVar_f2i = new Float2();
        mExportVar_f2i.x = 1.f;
        mExportVar_f2i.y = 2.f;
        __F32_3 = Element.F32_3(rs);
        mExportVar_f3i = new Float3();
        mExportVar_f3i.x = 1.f;
        mExportVar_f3i.y = 2.f;
        mExportVar_f3i.z = 3.f;
        __F32_4 = Element.F32_4(rs);
        mExportVar_f4i = new Float4();
        mExportVar_f4i.x = 1.f;
        mExportVar_f4i.y = 2.f;
        mExportVar_f4i.z = 3.f;
        mExportVar_f4i.w = 4.f;
        __F64 = Element.F64(rs);
        mExportVar_d1i = 3.141592265358979;
        __F64_2 = Element.F64_2(rs);
        mExportVar_d2i = new Double2();
        mExportVar_d2i.x = 1;
        mExportVar_d2i.y = 2;
        __F64_3 = Element.F64_3(rs);
        mExportVar_d3i = new Double3();
        mExportVar_d3i.x = 1;
        mExportVar_d3i.y = 2;
        mExportVar_d3i.z = 3;
        __F64_4 = Element.F64_4(rs);
        mExportVar_d4i = new Double4();
        mExportVar_d4i.x = 1;
        mExportVar_d4i.y = 2;
        mExportVar_d4i.z = 3;
        mExportVar_d4i.w = 4;
        __BOOLEAN = Element.BOOLEAN(rs);
    }

    private Element __BOOLEAN;
    private Element __F32;
    private Element __F32_2;
    private Element __F32_3;
    private Element __F32_4;
    private Element __F64;
    private Element __F64_2;
    private Element __F64_3;
    private Element __F64_4;
    private Element __I16;
    private Element __I16_2;
    private Element __I16_3;
    private Element __I16_4;
    private Element __I32;
    private Element __I32_2;
    private Element __I32_3;
    private Element __I32_4;
    private Element __I64;
    private Element __I64_2;
    private Element __I64_3;
    private Element __I64_4;
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
    private Element __U64;
    private Element __U64_2;
    private Element __U64_3;
    private Element __U64_4;
    private Element __U8;
    private Element __U8_2;
    private Element __U8_3;
    private Element __U8_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_2;
    private FieldPacker __rs_fp_F32_3;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_F64;
    private FieldPacker __rs_fp_F64_2;
    private FieldPacker __rs_fp_F64_3;
    private FieldPacker __rs_fp_F64_4;
    private FieldPacker __rs_fp_I16;
    private FieldPacker __rs_fp_I16_2;
    private FieldPacker __rs_fp_I16_3;
    private FieldPacker __rs_fp_I16_4;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I32_2;
    private FieldPacker __rs_fp_I32_3;
    private FieldPacker __rs_fp_I32_4;
    private FieldPacker __rs_fp_I64;
    private FieldPacker __rs_fp_I64_2;
    private FieldPacker __rs_fp_I64_3;
    private FieldPacker __rs_fp_I64_4;
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
    private FieldPacker __rs_fp_U64;
    private FieldPacker __rs_fp_U64_2;
    private FieldPacker __rs_fp_U64_3;
    private FieldPacker __rs_fp_U64_4;
    private FieldPacker __rs_fp_U8;
    private FieldPacker __rs_fp_U8_2;
    private FieldPacker __rs_fp_U8_3;
    private FieldPacker __rs_fp_U8_4;
    private final static int mExportVarIdx_c1 = 0;
    private byte mExportVar_c1;
    public synchronized void set_c1(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_c1, __rs_fp_I8);
        mExportVar_c1 = v;
    }

    public byte get_c1() {
        return mExportVar_c1;
    }

    public Script.FieldID getFieldID_c1() {
        return createFieldID(mExportVarIdx_c1, null);
    }

    private final static int mExportVarIdx_c1i = 1;
    private byte mExportVar_c1i;
    public synchronized void set_c1i(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_c1i, __rs_fp_I8);
        mExportVar_c1i = v;
    }

    public byte get_c1i() {
        return mExportVar_c1i;
    }

    public Script.FieldID getFieldID_c1i() {
        return createFieldID(mExportVarIdx_c1i, null);
    }

    private final static int mExportVarIdx_c2 = 2;
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

    private final static int mExportVarIdx_c2i = 3;
    private Byte2 mExportVar_c2i;
    public synchronized void set_c2i(Byte2 v) {
        mExportVar_c2i = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c2i, fp, __I8_2, __dimArr);
    }

    public Byte2 get_c2i() {
        return mExportVar_c2i;
    }

    public Script.FieldID getFieldID_c2i() {
        return createFieldID(mExportVarIdx_c2i, null);
    }

    private final static int mExportVarIdx_c3 = 4;
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

    private final static int mExportVarIdx_c3i = 5;
    private Byte3 mExportVar_c3i;
    public synchronized void set_c3i(Byte3 v) {
        mExportVar_c3i = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c3i, fp, __I8_3, __dimArr);
    }

    public Byte3 get_c3i() {
        return mExportVar_c3i;
    }

    public Script.FieldID getFieldID_c3i() {
        return createFieldID(mExportVarIdx_c3i, null);
    }

    private final static int mExportVarIdx_c4 = 6;
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

    private final static int mExportVarIdx_c4i = 7;
    private Byte4 mExportVar_c4i;
    public synchronized void set_c4i(Byte4 v) {
        mExportVar_c4i = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_c4i, fp, __I8_4, __dimArr);
    }

    public Byte4 get_c4i() {
        return mExportVar_c4i;
    }

    public Script.FieldID getFieldID_c4i() {
        return createFieldID(mExportVarIdx_c4i, null);
    }

    private final static int mExportVarIdx_uc1 = 8;
    private short mExportVar_uc1;
    public synchronized void set_uc1(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_uc1, __rs_fp_U8);
        mExportVar_uc1 = v;
    }

    public short get_uc1() {
        return mExportVar_uc1;
    }

    public Script.FieldID getFieldID_uc1() {
        return createFieldID(mExportVarIdx_uc1, null);
    }

    private final static int mExportVarIdx_uc1i = 9;
    private short mExportVar_uc1i;
    public synchronized void set_uc1i(short v) {
        if (__rs_fp_U8!= null) {
            __rs_fp_U8.reset();
        } else {
            __rs_fp_U8 = new FieldPacker(1);
        }
        __rs_fp_U8.addU8(v);
        setVar(mExportVarIdx_uc1i, __rs_fp_U8);
        mExportVar_uc1i = v;
    }

    public short get_uc1i() {
        return mExportVar_uc1i;
    }

    public Script.FieldID getFieldID_uc1i() {
        return createFieldID(mExportVarIdx_uc1i, null);
    }

    private final static int mExportVarIdx_uc2 = 10;
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

    private final static int mExportVarIdx_uc2i = 11;
    private Short2 mExportVar_uc2i;
    public synchronized void set_uc2i(Short2 v) {
        mExportVar_uc2i = v;
        FieldPacker fp = new FieldPacker(2);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc2i, fp, __U8_2, __dimArr);
    }

    public Short2 get_uc2i() {
        return mExportVar_uc2i;
    }

    public Script.FieldID getFieldID_uc2i() {
        return createFieldID(mExportVarIdx_uc2i, null);
    }

    private final static int mExportVarIdx_uc3 = 12;
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

    private final static int mExportVarIdx_uc3i = 13;
    private Short3 mExportVar_uc3i;
    public synchronized void set_uc3i(Short3 v) {
        mExportVar_uc3i = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc3i, fp, __U8_3, __dimArr);
    }

    public Short3 get_uc3i() {
        return mExportVar_uc3i;
    }

    public Script.FieldID getFieldID_uc3i() {
        return createFieldID(mExportVarIdx_uc3i, null);
    }

    private final static int mExportVarIdx_uc4 = 14;
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

    private final static int mExportVarIdx_uc4i = 15;
    private Short4 mExportVar_uc4i;
    public synchronized void set_uc4i(Short4 v) {
        mExportVar_uc4i = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU8(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_uc4i, fp, __U8_4, __dimArr);
    }

    public Short4 get_uc4i() {
        return mExportVar_uc4i;
    }

    public Script.FieldID getFieldID_uc4i() {
        return createFieldID(mExportVarIdx_uc4i, null);
    }

    private final static int mExportVarIdx_s1 = 16;
    private short mExportVar_s1;
    public synchronized void set_s1(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_s1, __rs_fp_I16);
        mExportVar_s1 = v;
    }

    public short get_s1() {
        return mExportVar_s1;
    }

    public Script.FieldID getFieldID_s1() {
        return createFieldID(mExportVarIdx_s1, null);
    }

    private final static int mExportVarIdx_s1i = 17;
    private short mExportVar_s1i;
    public synchronized void set_s1i(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_s1i, __rs_fp_I16);
        mExportVar_s1i = v;
    }

    public short get_s1i() {
        return mExportVar_s1i;
    }

    public Script.FieldID getFieldID_s1i() {
        return createFieldID(mExportVarIdx_s1i, null);
    }

    private final static int mExportVarIdx_s2 = 18;
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

    private final static int mExportVarIdx_s2i = 19;
    private Short2 mExportVar_s2i;
    public synchronized void set_s2i(Short2 v) {
        mExportVar_s2i = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_s2i, fp, __I16_2, __dimArr);
    }

    public Short2 get_s2i() {
        return mExportVar_s2i;
    }

    public Script.FieldID getFieldID_s2i() {
        return createFieldID(mExportVarIdx_s2i, null);
    }

    private final static int mExportVarIdx_s3 = 20;
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

    private final static int mExportVarIdx_s3i = 21;
    private Short3 mExportVar_s3i;
    public synchronized void set_s3i(Short3 v) {
        mExportVar_s3i = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_s3i, fp, __I16_3, __dimArr);
    }

    public Short3 get_s3i() {
        return mExportVar_s3i;
    }

    public Script.FieldID getFieldID_s3i() {
        return createFieldID(mExportVarIdx_s3i, null);
    }

    private final static int mExportVarIdx_s4 = 22;
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

    private final static int mExportVarIdx_s4i = 23;
    private Short4 mExportVar_s4i;
    public synchronized void set_s4i(Short4 v) {
        mExportVar_s4i = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_s4i, fp, __I16_4, __dimArr);
    }

    public Short4 get_s4i() {
        return mExportVar_s4i;
    }

    public Script.FieldID getFieldID_s4i() {
        return createFieldID(mExportVarIdx_s4i, null);
    }

    private final static int mExportVarIdx_us1 = 24;
    private int mExportVar_us1;
    public synchronized void set_us1(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_us1, __rs_fp_U16);
        mExportVar_us1 = v;
    }

    public int get_us1() {
        return mExportVar_us1;
    }

    public Script.FieldID getFieldID_us1() {
        return createFieldID(mExportVarIdx_us1, null);
    }

    private final static int mExportVarIdx_us1i = 25;
    private int mExportVar_us1i;
    public synchronized void set_us1i(int v) {
        if (__rs_fp_U16!= null) {
            __rs_fp_U16.reset();
        } else {
            __rs_fp_U16 = new FieldPacker(2);
        }
        __rs_fp_U16.addU16(v);
        setVar(mExportVarIdx_us1i, __rs_fp_U16);
        mExportVar_us1i = v;
    }

    public int get_us1i() {
        return mExportVar_us1i;
    }

    public Script.FieldID getFieldID_us1i() {
        return createFieldID(mExportVarIdx_us1i, null);
    }

    private final static int mExportVarIdx_us2 = 26;
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

    private final static int mExportVarIdx_us2i = 27;
    private Int2 mExportVar_us2i;
    public synchronized void set_us2i(Int2 v) {
        mExportVar_us2i = v;
        FieldPacker fp = new FieldPacker(4);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_us2i, fp, __U16_2, __dimArr);
    }

    public Int2 get_us2i() {
        return mExportVar_us2i;
    }

    public Script.FieldID getFieldID_us2i() {
        return createFieldID(mExportVarIdx_us2i, null);
    }

    private final static int mExportVarIdx_us3 = 28;
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

    private final static int mExportVarIdx_us3i = 29;
    private Int3 mExportVar_us3i;
    public synchronized void set_us3i(Int3 v) {
        mExportVar_us3i = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_us3i, fp, __U16_3, __dimArr);
    }

    public Int3 get_us3i() {
        return mExportVar_us3i;
    }

    public Script.FieldID getFieldID_us3i() {
        return createFieldID(mExportVarIdx_us3i, null);
    }

    private final static int mExportVarIdx_us4 = 30;
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

    private final static int mExportVarIdx_us4i = 31;
    private Int4 mExportVar_us4i;
    public synchronized void set_us4i(Int4 v) {
        mExportVar_us4i = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU16(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_us4i, fp, __U16_4, __dimArr);
    }

    public Int4 get_us4i() {
        return mExportVar_us4i;
    }

    public Script.FieldID getFieldID_us4i() {
        return createFieldID(mExportVarIdx_us4i, null);
    }

    private final static int mExportVarIdx_i1 = 32;
    private int mExportVar_i1;
    public synchronized void set_i1(int v) {
        setVar(mExportVarIdx_i1, v);
        mExportVar_i1 = v;
    }

    public int get_i1() {
        return mExportVar_i1;
    }

    public Script.FieldID getFieldID_i1() {
        return createFieldID(mExportVarIdx_i1, null);
    }

    private final static int mExportVarIdx_i1i = 33;
    private int mExportVar_i1i;
    public synchronized void set_i1i(int v) {
        setVar(mExportVarIdx_i1i, v);
        mExportVar_i1i = v;
    }

    public int get_i1i() {
        return mExportVar_i1i;
    }

    public Script.FieldID getFieldID_i1i() {
        return createFieldID(mExportVarIdx_i1i, null);
    }

    private final static int mExportVarIdx_i2 = 34;
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

    private final static int mExportVarIdx_i2i = 35;
    private Int2 mExportVar_i2i;
    public synchronized void set_i2i(Int2 v) {
        mExportVar_i2i = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i2i, fp, __I32_2, __dimArr);
    }

    public Int2 get_i2i() {
        return mExportVar_i2i;
    }

    public Script.FieldID getFieldID_i2i() {
        return createFieldID(mExportVarIdx_i2i, null);
    }

    private final static int mExportVarIdx_i3 = 36;
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

    private final static int mExportVarIdx_i3i = 37;
    private Int3 mExportVar_i3i;
    public synchronized void set_i3i(Int3 v) {
        mExportVar_i3i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i3i, fp, __I32_3, __dimArr);
    }

    public Int3 get_i3i() {
        return mExportVar_i3i;
    }

    public Script.FieldID getFieldID_i3i() {
        return createFieldID(mExportVarIdx_i3i, null);
    }

    private final static int mExportVarIdx_i4 = 38;
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

    private final static int mExportVarIdx_i4i = 39;
    private Int4 mExportVar_i4i;
    public synchronized void set_i4i(Int4 v) {
        mExportVar_i4i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_i4i, fp, __I32_4, __dimArr);
    }

    public Int4 get_i4i() {
        return mExportVar_i4i;
    }

    public Script.FieldID getFieldID_i4i() {
        return createFieldID(mExportVarIdx_i4i, null);
    }

    private final static int mExportVarIdx_ui1 = 40;
    private long mExportVar_ui1;
    public synchronized void set_ui1(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_ui1, __rs_fp_U32);
        mExportVar_ui1 = v;
    }

    public long get_ui1() {
        return mExportVar_ui1;
    }

    public Script.FieldID getFieldID_ui1() {
        return createFieldID(mExportVarIdx_ui1, null);
    }

    private final static int mExportVarIdx_ui1i = 41;
    private long mExportVar_ui1i;
    public synchronized void set_ui1i(long v) {
        if (__rs_fp_U32!= null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_ui1i, __rs_fp_U32);
        mExportVar_ui1i = v;
    }

    public long get_ui1i() {
        return mExportVar_ui1i;
    }

    public Script.FieldID getFieldID_ui1i() {
        return createFieldID(mExportVarIdx_ui1i, null);
    }

    private final static int mExportVarIdx_ui2 = 42;
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

    private final static int mExportVarIdx_ui2i = 43;
    private Long2 mExportVar_ui2i;
    public synchronized void set_ui2i(Long2 v) {
        mExportVar_ui2i = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ui2i, fp, __U32_2, __dimArr);
    }

    public Long2 get_ui2i() {
        return mExportVar_ui2i;
    }

    public Script.FieldID getFieldID_ui2i() {
        return createFieldID(mExportVarIdx_ui2i, null);
    }

    private final static int mExportVarIdx_ui3 = 44;
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

    private final static int mExportVarIdx_ui3i = 45;
    private Long3 mExportVar_ui3i;
    public synchronized void set_ui3i(Long3 v) {
        mExportVar_ui3i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ui3i, fp, __U32_3, __dimArr);
    }

    public Long3 get_ui3i() {
        return mExportVar_ui3i;
    }

    public Script.FieldID getFieldID_ui3i() {
        return createFieldID(mExportVarIdx_ui3i, null);
    }

    private final static int mExportVarIdx_ui4 = 46;
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

    private final static int mExportVarIdx_ui4i = 47;
    private Long4 mExportVar_ui4i;
    public synchronized void set_ui4i(Long4 v) {
        mExportVar_ui4i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ui4i, fp, __U32_4, __dimArr);
    }

    public Long4 get_ui4i() {
        return mExportVar_ui4i;
    }

    public Script.FieldID getFieldID_ui4i() {
        return createFieldID(mExportVarIdx_ui4i, null);
    }

    private final static int mExportVarIdx_l1 = 48;
    private long mExportVar_l1;
    public synchronized void set_l1(long v) {
        setVar(mExportVarIdx_l1, v);
        mExportVar_l1 = v;
    }

    public long get_l1() {
        return mExportVar_l1;
    }

    public Script.FieldID getFieldID_l1() {
        return createFieldID(mExportVarIdx_l1, null);
    }

    private final static int mExportVarIdx_l1i = 49;
    private long mExportVar_l1i;
    public synchronized void set_l1i(long v) {
        setVar(mExportVarIdx_l1i, v);
        mExportVar_l1i = v;
    }

    public long get_l1i() {
        return mExportVar_l1i;
    }

    public Script.FieldID getFieldID_l1i() {
        return createFieldID(mExportVarIdx_l1i, null);
    }

    private final static int mExportVarIdx_l2 = 50;
    private Long2 mExportVar_l2;
    public synchronized void set_l2(Long2 v) {
        mExportVar_l2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_l2, fp, __I64_2, __dimArr);
    }

    public Long2 get_l2() {
        return mExportVar_l2;
    }

    public Script.FieldID getFieldID_l2() {
        return createFieldID(mExportVarIdx_l2, null);
    }

    private final static int mExportVarIdx_l2i = 51;
    private Long2 mExportVar_l2i;
    public synchronized void set_l2i(Long2 v) {
        mExportVar_l2i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_l2i, fp, __I64_2, __dimArr);
    }

    public Long2 get_l2i() {
        return mExportVar_l2i;
    }

    public Script.FieldID getFieldID_l2i() {
        return createFieldID(mExportVarIdx_l2i, null);
    }

    private final static int mExportVarIdx_l3 = 52;
    private Long3 mExportVar_l3;
    public synchronized void set_l3(Long3 v) {
        mExportVar_l3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_l3, fp, __I64_3, __dimArr);
    }

    public Long3 get_l3() {
        return mExportVar_l3;
    }

    public Script.FieldID getFieldID_l3() {
        return createFieldID(mExportVarIdx_l3, null);
    }

    private final static int mExportVarIdx_l3i = 53;
    private Long3 mExportVar_l3i;
    public synchronized void set_l3i(Long3 v) {
        mExportVar_l3i = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_l3i, fp, __I64_3, __dimArr);
    }

    public Long3 get_l3i() {
        return mExportVar_l3i;
    }

    public Script.FieldID getFieldID_l3i() {
        return createFieldID(mExportVarIdx_l3i, null);
    }

    private final static int mExportVarIdx_l4 = 54;
    private Long4 mExportVar_l4;
    public synchronized void set_l4(Long4 v) {
        mExportVar_l4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_l4, fp, __I64_4, __dimArr);
    }

    public Long4 get_l4() {
        return mExportVar_l4;
    }

    public Script.FieldID getFieldID_l4() {
        return createFieldID(mExportVarIdx_l4, null);
    }

    private final static int mExportVarIdx_l4i = 55;
    private Long4 mExportVar_l4i;
    public synchronized void set_l4i(Long4 v) {
        mExportVar_l4i = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addI64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_l4i, fp, __I64_4, __dimArr);
    }

    public Long4 get_l4i() {
        return mExportVar_l4i;
    }

    public Script.FieldID getFieldID_l4i() {
        return createFieldID(mExportVarIdx_l4i, null);
    }

    private final static int mExportVarIdx_ul1 = 56;
    private long mExportVar_ul1;
    public synchronized void set_ul1(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_ul1, __rs_fp_U64);
        mExportVar_ul1 = v;
    }

    public long get_ul1() {
        return mExportVar_ul1;
    }

    public Script.FieldID getFieldID_ul1() {
        return createFieldID(mExportVarIdx_ul1, null);
    }

    private final static int mExportVarIdx_ul1i = 57;
    private long mExportVar_ul1i;
    public synchronized void set_ul1i(long v) {
        if (__rs_fp_U64!= null) {
            __rs_fp_U64.reset();
        } else {
            __rs_fp_U64 = new FieldPacker(8);
        }
        __rs_fp_U64.addU64(v);
        setVar(mExportVarIdx_ul1i, __rs_fp_U64);
        mExportVar_ul1i = v;
    }

    public long get_ul1i() {
        return mExportVar_ul1i;
    }

    public Script.FieldID getFieldID_ul1i() {
        return createFieldID(mExportVarIdx_ul1i, null);
    }

    private final static int mExportVarIdx_ul2 = 58;
    private Long2 mExportVar_ul2;
    public synchronized void set_ul2(Long2 v) {
        mExportVar_ul2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ul2, fp, __U64_2, __dimArr);
    }

    public Long2 get_ul2() {
        return mExportVar_ul2;
    }

    public Script.FieldID getFieldID_ul2() {
        return createFieldID(mExportVarIdx_ul2, null);
    }

    private final static int mExportVarIdx_ul2i = 59;
    private Long2 mExportVar_ul2i;
    public synchronized void set_ul2i(Long2 v) {
        mExportVar_ul2i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ul2i, fp, __U64_2, __dimArr);
    }

    public Long2 get_ul2i() {
        return mExportVar_ul2i;
    }

    public Script.FieldID getFieldID_ul2i() {
        return createFieldID(mExportVarIdx_ul2i, null);
    }

    private final static int mExportVarIdx_ul3 = 60;
    private Long3 mExportVar_ul3;
    public synchronized void set_ul3(Long3 v) {
        mExportVar_ul3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ul3, fp, __U64_3, __dimArr);
    }

    public Long3 get_ul3() {
        return mExportVar_ul3;
    }

    public Script.FieldID getFieldID_ul3() {
        return createFieldID(mExportVarIdx_ul3, null);
    }

    private final static int mExportVarIdx_ul3i = 61;
    private Long3 mExportVar_ul3i;
    public synchronized void set_ul3i(Long3 v) {
        mExportVar_ul3i = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ul3i, fp, __U64_3, __dimArr);
    }

    public Long3 get_ul3i() {
        return mExportVar_ul3i;
    }

    public Script.FieldID getFieldID_ul3i() {
        return createFieldID(mExportVarIdx_ul3i, null);
    }

    private final static int mExportVarIdx_ul4 = 62;
    private Long4 mExportVar_ul4;
    public synchronized void set_ul4(Long4 v) {
        mExportVar_ul4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ul4, fp, __U64_4, __dimArr);
    }

    public Long4 get_ul4() {
        return mExportVar_ul4;
    }

    public Script.FieldID getFieldID_ul4() {
        return createFieldID(mExportVarIdx_ul4, null);
    }

    private final static int mExportVarIdx_ul4i = 63;
    private Long4 mExportVar_ul4i;
    public synchronized void set_ul4i(Long4 v) {
        mExportVar_ul4i = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addU64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_ul4i, fp, __U64_4, __dimArr);
    }

    public Long4 get_ul4i() {
        return mExportVar_ul4i;
    }

    public Script.FieldID getFieldID_ul4i() {
        return createFieldID(mExportVarIdx_ul4i, null);
    }

    private final static int mExportVarIdx_f1 = 64;
    private float mExportVar_f1;
    public synchronized void set_f1(float v) {
        setVar(mExportVarIdx_f1, v);
        mExportVar_f1 = v;
    }

    public float get_f1() {
        return mExportVar_f1;
    }

    public Script.FieldID getFieldID_f1() {
        return createFieldID(mExportVarIdx_f1, null);
    }

    private final static int mExportVarIdx_f1i = 65;
    private float mExportVar_f1i;
    public synchronized void set_f1i(float v) {
        setVar(mExportVarIdx_f1i, v);
        mExportVar_f1i = v;
    }

    public float get_f1i() {
        return mExportVar_f1i;
    }

    public Script.FieldID getFieldID_f1i() {
        return createFieldID(mExportVarIdx_f1i, null);
    }

    private final static int mExportVarIdx_f2 = 66;
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

    private final static int mExportVarIdx_f2i = 67;
    private Float2 mExportVar_f2i;
    public synchronized void set_f2i(Float2 v) {
        mExportVar_f2i = v;
        FieldPacker fp = new FieldPacker(8);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f2i, fp, __F32_2, __dimArr);
    }

    public Float2 get_f2i() {
        return mExportVar_f2i;
    }

    public Script.FieldID getFieldID_f2i() {
        return createFieldID(mExportVarIdx_f2i, null);
    }

    private final static int mExportVarIdx_f3 = 68;
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

    private final static int mExportVarIdx_f3i = 69;
    private Float3 mExportVar_f3i;
    public synchronized void set_f3i(Float3 v) {
        mExportVar_f3i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f3i, fp, __F32_3, __dimArr);
    }

    public Float3 get_f3i() {
        return mExportVar_f3i;
    }

    public Script.FieldID getFieldID_f3i() {
        return createFieldID(mExportVarIdx_f3i, null);
    }

    private final static int mExportVarIdx_f4 = 70;
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

    private final static int mExportVarIdx_f4i = 71;
    private Float4 mExportVar_f4i;
    public synchronized void set_f4i(Float4 v) {
        mExportVar_f4i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_f4i, fp, __F32_4, __dimArr);
    }

    public Float4 get_f4i() {
        return mExportVar_f4i;
    }

    public Script.FieldID getFieldID_f4i() {
        return createFieldID(mExportVarIdx_f4i, null);
    }

    private final static int mExportVarIdx_d1 = 72;
    private double mExportVar_d1;
    public synchronized void set_d1(double v) {
        setVar(mExportVarIdx_d1, v);
        mExportVar_d1 = v;
    }

    public double get_d1() {
        return mExportVar_d1;
    }

    public Script.FieldID getFieldID_d1() {
        return createFieldID(mExportVarIdx_d1, null);
    }

    private final static int mExportVarIdx_d1i = 73;
    private double mExportVar_d1i;
    public synchronized void set_d1i(double v) {
        setVar(mExportVarIdx_d1i, v);
        mExportVar_d1i = v;
    }

    public double get_d1i() {
        return mExportVar_d1i;
    }

    public Script.FieldID getFieldID_d1i() {
        return createFieldID(mExportVarIdx_d1i, null);
    }

    private final static int mExportVarIdx_d2 = 74;
    private Double2 mExportVar_d2;
    public synchronized void set_d2(Double2 v) {
        mExportVar_d2 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_d2, fp, __F64_2, __dimArr);
    }

    public Double2 get_d2() {
        return mExportVar_d2;
    }

    public Script.FieldID getFieldID_d2() {
        return createFieldID(mExportVarIdx_d2, null);
    }

    private final static int mExportVarIdx_d2i = 75;
    private Double2 mExportVar_d2i;
    public synchronized void set_d2i(Double2 v) {
        mExportVar_d2i = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_d2i, fp, __F64_2, __dimArr);
    }

    public Double2 get_d2i() {
        return mExportVar_d2i;
    }

    public Script.FieldID getFieldID_d2i() {
        return createFieldID(mExportVarIdx_d2i, null);
    }

    private final static int mExportVarIdx_d3 = 76;
    private Double3 mExportVar_d3;
    public synchronized void set_d3(Double3 v) {
        mExportVar_d3 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_d3, fp, __F64_3, __dimArr);
    }

    public Double3 get_d3() {
        return mExportVar_d3;
    }

    public Script.FieldID getFieldID_d3() {
        return createFieldID(mExportVarIdx_d3, null);
    }

    private final static int mExportVarIdx_d3i = 77;
    private Double3 mExportVar_d3i;
    public synchronized void set_d3i(Double3 v) {
        mExportVar_d3i = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_d3i, fp, __F64_3, __dimArr);
    }

    public Double3 get_d3i() {
        return mExportVar_d3i;
    }

    public Script.FieldID getFieldID_d3i() {
        return createFieldID(mExportVarIdx_d3i, null);
    }

    private final static int mExportVarIdx_d4 = 78;
    private Double4 mExportVar_d4;
    public synchronized void set_d4(Double4 v) {
        mExportVar_d4 = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_d4, fp, __F64_4, __dimArr);
    }

    public Double4 get_d4() {
        return mExportVar_d4;
    }

    public Script.FieldID getFieldID_d4() {
        return createFieldID(mExportVarIdx_d4, null);
    }

    private final static int mExportVarIdx_d4i = 79;
    private Double4 mExportVar_d4i;
    public synchronized void set_d4i(Double4 v) {
        mExportVar_d4i = v;
        FieldPacker fp = new FieldPacker(32);
        fp.addF64(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_d4i, fp, __F64_4, __dimArr);
    }

    public Double4 get_d4i() {
        return mExportVar_d4i;
    }

    public Script.FieldID getFieldID_d4i() {
        return createFieldID(mExportVarIdx_d4i, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_test_BOOLEAN = 1;
    public Script.KernelID getKernelID_test_BOOLEAN() {
        return createKernelID(mExportForEachIdx_test_BOOLEAN, 33, null, null);
    }

    public void forEach_test_BOOLEAN(Allocation ain) {
        forEach_test_BOOLEAN(ain, null);
    }

    public void forEach_test_BOOLEAN(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__BOOLEAN)) {
            throw new RSRuntimeException("Type mismatch with BOOLEAN!");
        }
        forEach(mExportForEachIdx_test_BOOLEAN, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_I8 = 2;
    public Script.KernelID getKernelID_test_I8() {
        return createKernelID(mExportForEachIdx_test_I8, 33, null, null);
    }

    public void forEach_test_I8(Allocation ain) {
        forEach_test_I8(ain, null);
    }

    public void forEach_test_I8(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I8)) {
            throw new RSRuntimeException("Type mismatch with I8!");
        }
        forEach(mExportForEachIdx_test_I8, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_U8 = 3;
    public Script.KernelID getKernelID_test_U8() {
        return createKernelID(mExportForEachIdx_test_U8, 33, null, null);
    }

    public void forEach_test_U8(Allocation ain) {
        forEach_test_U8(ain, null);
    }

    public void forEach_test_U8(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        forEach(mExportForEachIdx_test_U8, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_I16 = 4;
    public Script.KernelID getKernelID_test_I16() {
        return createKernelID(mExportForEachIdx_test_I16, 33, null, null);
    }

    public void forEach_test_I16(Allocation ain) {
        forEach_test_I16(ain, null);
    }

    public void forEach_test_I16(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I16)) {
            throw new RSRuntimeException("Type mismatch with I16!");
        }
        forEach(mExportForEachIdx_test_I16, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_U16 = 5;
    public Script.KernelID getKernelID_test_U16() {
        return createKernelID(mExportForEachIdx_test_U16, 33, null, null);
    }

    public void forEach_test_U16(Allocation ain) {
        forEach_test_U16(ain, null);
    }

    public void forEach_test_U16(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U16)) {
            throw new RSRuntimeException("Type mismatch with U16!");
        }
        forEach(mExportForEachIdx_test_U16, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_I32 = 6;
    public Script.KernelID getKernelID_test_I32() {
        return createKernelID(mExportForEachIdx_test_I32, 33, null, null);
    }

    public void forEach_test_I32(Allocation ain) {
        forEach_test_I32(ain, null);
    }

    public void forEach_test_I32(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I32)) {
            throw new RSRuntimeException("Type mismatch with I32!");
        }
        forEach(mExportForEachIdx_test_I32, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_U32 = 7;
    public Script.KernelID getKernelID_test_U32() {
        return createKernelID(mExportForEachIdx_test_U32, 33, null, null);
    }

    public void forEach_test_U32(Allocation ain) {
        forEach_test_U32(ain, null);
    }

    public void forEach_test_U32(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U32)) {
            throw new RSRuntimeException("Type mismatch with U32!");
        }
        forEach(mExportForEachIdx_test_U32, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_I64 = 8;
    public Script.KernelID getKernelID_test_I64() {
        return createKernelID(mExportForEachIdx_test_I64, 33, null, null);
    }

    public void forEach_test_I64(Allocation ain) {
        forEach_test_I64(ain, null);
    }

    public void forEach_test_I64(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__I64)) {
            throw new RSRuntimeException("Type mismatch with I64!");
        }
        forEach(mExportForEachIdx_test_I64, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_U64 = 9;
    public Script.KernelID getKernelID_test_U64() {
        return createKernelID(mExportForEachIdx_test_U64, 33, null, null);
    }

    public void forEach_test_U64(Allocation ain) {
        forEach_test_U64(ain, null);
    }

    public void forEach_test_U64(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U64)) {
            throw new RSRuntimeException("Type mismatch with U64!");
        }
        forEach(mExportForEachIdx_test_U64, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_F32 = 10;
    public Script.KernelID getKernelID_test_F32() {
        return createKernelID(mExportForEachIdx_test_F32, 33, null, null);
    }

    public void forEach_test_F32(Allocation ain) {
        forEach_test_F32(ain, null);
    }

    public void forEach_test_F32(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        forEach(mExportForEachIdx_test_F32, ain, null, null, sc);
    }

    private final static int mExportForEachIdx_test_F64 = 11;
    public Script.KernelID getKernelID_test_F64() {
        return createKernelID(mExportForEachIdx_test_F64, 33, null, null);
    }

    public void forEach_test_F64(Allocation ain) {
        forEach_test_F64(ain, null);
    }

    public void forEach_test_F64(Allocation ain, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F64)) {
            throw new RSRuntimeException("Type mismatch with F64!");
        }
        forEach(mExportForEachIdx_test_F64, ain, null, null, sc);
    }

}

