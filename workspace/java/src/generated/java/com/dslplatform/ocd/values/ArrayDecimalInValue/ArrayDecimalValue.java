package com.dslplatform.ocd.values.ArrayDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayDecimalValue implements java.io.Serializable {
    public ArrayDecimalValue(
            final java.math.BigDecimal[] arrayDecimal) {
        setArrayDecimal(arrayDecimal);
    }

    public ArrayDecimalValue() {
        this.arrayDecimal = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 979690705;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayDecimalValue)) return false;
        final ArrayDecimalValue other = (ArrayDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.arrayDecimal, other.arrayDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayDecimalValue(" + arrayDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] arrayDecimal;

    @JsonProperty("arrayDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getArrayDecimal() {
        return arrayDecimal;
    }

    public ArrayDecimalValue setArrayDecimal(final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayDecimal\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayDecimal = value;

        return this;
    }
}
