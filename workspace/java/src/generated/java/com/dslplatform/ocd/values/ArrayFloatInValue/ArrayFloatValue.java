package com.dslplatform.ocd.values.ArrayFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayFloatValue implements java.io.Serializable {
    public ArrayFloatValue(
            final float[] arrayFloat) {
        setArrayFloat(arrayFloat);
    }

    public ArrayFloatValue() {
        this.arrayFloat = new float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1153602056;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayFloatValue)) return false;
        final ArrayFloatValue other = (ArrayFloatValue) obj;

        if (!(java.util.Arrays.equals(this.arrayFloat, other.arrayFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayFloatValue(" + arrayFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float[] arrayFloat;

    @JsonProperty("arrayFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public float[] getArrayFloat() {
        return arrayFloat;
    }

    public ArrayFloatValue setArrayFloat(final float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayFloat\" cannot be null!");
        this.arrayFloat = value;

        return this;
    }
}
