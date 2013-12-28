package com.dslplatform.ocd.values.ArrayOptIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptIntValue implements java.io.Serializable {
    public ArrayOptIntValue(
            final Integer[] arrayOptInt) {
        setArrayOptInt(arrayOptInt);
    }

    public ArrayOptIntValue() {
        this.arrayOptInt = new Integer[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 302128894;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptIntValue)) return false;
        final ArrayOptIntValue other = (ArrayOptIntValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptInt, other.arrayOptInt)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptIntValue(" + arrayOptInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] arrayOptInt;

    @JsonProperty("arrayOptInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer[] getArrayOptInt() {
        return arrayOptInt;
    }

    public ArrayOptIntValue setArrayOptInt(final Integer[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptInt\" cannot be null!");
        this.arrayOptInt = value;

        return this;
    }
}
