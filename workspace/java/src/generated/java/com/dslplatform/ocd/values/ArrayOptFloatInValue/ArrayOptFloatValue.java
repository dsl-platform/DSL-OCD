package com.dslplatform.ocd.values.ArrayOptFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptFloatValue implements java.io.Serializable {
    public ArrayOptFloatValue(
            final Float[] arrayOptFloat) {
        setArrayOptFloat(arrayOptFloat);
    }

    public ArrayOptFloatValue() {
        this.arrayOptFloat = new Float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 207393583;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptFloatValue)) return false;
        final ArrayOptFloatValue other = (ArrayOptFloatValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptFloat, other.arrayOptFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptFloatValue(" + arrayOptFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] arrayOptFloat;

    @JsonProperty("arrayOptFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Float[] getArrayOptFloat() {
        return arrayOptFloat;
    }

    public ArrayOptFloatValue setArrayOptFloat(final Float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptFloat\" cannot be null!");
        this.arrayOptFloat = value;

        return this;
    }
}
