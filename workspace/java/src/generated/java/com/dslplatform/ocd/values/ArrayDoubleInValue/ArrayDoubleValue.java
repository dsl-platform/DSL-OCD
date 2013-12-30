package com.dslplatform.ocd.values.ArrayDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayDoubleValue implements java.io.Serializable {
    public ArrayDoubleValue(
            final double[] arrayDouble) {
        setArrayDouble(arrayDouble);
    }

    public ArrayDoubleValue() {
        this.arrayDouble = new double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 729680905;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayDoubleValue)) return false;
        final ArrayDoubleValue other = (ArrayDoubleValue) obj;

        if (!(java.util.Arrays.equals(this.arrayDouble, other.arrayDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayDoubleValue(" + arrayDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] arrayDouble;

    @JsonProperty("arrayDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double[] getArrayDouble() {
        return arrayDouble;
    }

    public ArrayDoubleValue setArrayDouble(final double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayDouble\" cannot be null!");
        this.arrayDouble = value;

        return this;
    }
}
