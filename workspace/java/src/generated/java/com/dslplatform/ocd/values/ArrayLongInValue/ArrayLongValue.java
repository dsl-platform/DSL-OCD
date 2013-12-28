package com.dslplatform.ocd.values.ArrayLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayLongValue implements java.io.Serializable {
    public ArrayLongValue(
            final long[] arrayLong) {
        setArrayLong(arrayLong);
    }

    public ArrayLongValue() {
        this.arrayLong = new long[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 747951958;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayLongValue)) return false;
        final ArrayLongValue other = (ArrayLongValue) obj;

        if (!(java.util.Arrays.equals(this.arrayLong, other.arrayLong)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayLongValue(" + arrayLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long[] arrayLong;

    @JsonProperty("arrayLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public long[] getArrayLong() {
        return arrayLong;
    }

    public ArrayLongValue setArrayLong(final long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayLong\" cannot be null!");
        this.arrayLong = value;

        return this;
    }
}
