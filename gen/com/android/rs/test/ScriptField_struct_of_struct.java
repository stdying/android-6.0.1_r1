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
 * The source Renderscript file: /home/useradmin/aosp7.0.0r3/frameworks/rs/java/tests/RsTest/src/com/android/rs/test/small_struct.rs
 */

package com.android.rs.test;

import android.renderscript.*;
import com.android.rs.test.small_structBitCode;

/**
 * @hide
 */
public class ScriptField_struct_of_struct extends android.renderscript.Script.FieldBase {
    static public class Item {

        ScriptField_small_struct.Item[] arr;

        Item() {
            arr = new ScriptField_small_struct.Item[3];
            for (int $ct = 0; $ct < 3; $ct++) {
                arr[$ct] = new ScriptField_small_struct.Item();
            }

        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        Element.Builder eb_ = new Element.Builder(rs);
        eb_.add(Element.I32(rs), "i");
        eb_.add(Element.U32(rs), "#rs_padding_1");
        eb_.add(Element.I64(rs), "l");
        eb.add(eb_.create(), "arr", 3);
        return eb.create();
    }

    private  ScriptField_struct_of_struct(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_struct_of_struct(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_struct_of_struct(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_struct_of_struct create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_struct_of_struct obj = new ScriptField_struct_of_struct(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_struct_of_struct create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_struct_of_struct create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_struct_of_struct create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_struct_of_struct obj = new ScriptField_struct_of_struct(rs);
        Type.Builder b = new Type.Builder(rs, obj.mElement);
        b.setX(dimX);
        b.setY(dimY);
        Type t = b.create();
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    public static Type.Builder createTypeBuilder(RenderScript rs) {
        Element e = createElement(rs);
        return new Type.Builder(rs, e);
    }

    public static ScriptField_struct_of_struct createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_struct_of_struct obj = new ScriptField_struct_of_struct(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        for (int ct2 = 0; ct2 < 3; ct2++) {
            fp.addI32(i.arr[ct2].i);
            fp.skip(4);
            fp.addI64(i.arr[ct2].l);
        }

    }

    private void copyToArray(Item i, int index) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        mIOBuffer.reset(index * mElement.getBytesSize());
        copyToArrayLocal(i, mIOBuffer);
    }

    public synchronized void set(Item i, int index, boolean copyNow) {
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        mItemArray[index] = i;
        if (copyNow)  {
            copyToArray(i, index);
            FieldPacker fp = new FieldPacker(mElement.getBytesSize());
            copyToArrayLocal(i, fp);
            mAllocation.setFromFieldPacker(index, fp);
        }

    }

    public synchronized Item get(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index];
    }

    public synchronized void set_arr(int index, ScriptField_small_struct.Item[] v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].arr = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            for (int ct1 = 0; ct1 < 3; ct1++) {
                mIOBuffer.addI32(v[ct1].i);
                mIOBuffer.skip(4);
                mIOBuffer.addI64(v[ct1].l);
            }

            FieldPacker fp = new FieldPacker(48);
            for (int ct1 = 0; ct1 < 3; ct1++) {
                fp.addI32(v[ct1].i);
                fp.skip(4);
                fp.addI64(v[ct1].l);
            }

            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized ScriptField_small_struct.Item[] get_arr(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].arr;
    }

    public synchronized void copyAll() {
        for (int ct = 0; ct < mItemArray.length; ct++) copyToArray(mItemArray[ct], ct);
        mAllocation.setFromFieldPacker(0, mIOBuffer);
    }

    public synchronized void resize(int newSize) {
        if (mItemArray != null)  {
            int oldSize = mItemArray.length;
            int copySize = Math.min(oldSize, newSize);
            if (newSize == oldSize) return;
            Item ni[] = new Item[newSize];
            System.arraycopy(mItemArray, 0, ni, 0, copySize);
            mItemArray = ni;
        }

        mAllocation.resize(newSize);
        if (mIOBuffer != null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
    }

}

