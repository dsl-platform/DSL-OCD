package com.dslplatform.ocd.values.ArrayOptDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptDoubleValue implements java.io.Serializable {
    public ArrayOptDoubleValue(
            final Double[] arrayOptDouble) {
        setArrayOptDouble(arrayOptDouble);
    }

    public ArrayOptDoubleValue() {
        this.arrayOptDouble = new Double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1855816046;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptDoubleValue)) return false;
        final ArrayOptDoubleValue other = (ArrayOptDoubleValue) obj;

        if (!(java.util.Arrays
                .equals(this.arrayOptDouble, other.arrayOptDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptDoubleValue(" + arrayOptDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] arrayOptDouble;

    @JsonProperty("arrayOptDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Double[] getArrayOptDouble() {
        return arrayOptDouble;
    }

    public ArrayOptDoubleValue setArrayOptDouble(final Double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptDouble\" cannot be null!");
        this.arrayOptDouble = value;

        return this;
    }
}
