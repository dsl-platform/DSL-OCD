package com.dslplatform.ocd.values.ArrayIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayIntValue implements java.io.Serializable {
    public ArrayIntValue(
            final int[] arrayInt) {
        setArrayInt(arrayInt);
    }

    public ArrayIntValue() {
        this.arrayInt = new int[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 685918585;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayIntValue)) return false;
        final ArrayIntValue other = (ArrayIntValue) obj;

        if (!(java.util.Arrays.equals(this.arrayInt, other.arrayInt)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayIntValue(" + arrayInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] arrayInt;

    @JsonProperty("arrayInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int[] getArrayInt() {
        return arrayInt;
    }

    public ArrayIntValue setArrayInt(final int[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayInt\" cannot be null!");
        this.arrayInt = value;

        return this;
    }
}
