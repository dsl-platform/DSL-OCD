package com.dslplatform.ocd.values.ArrayOptDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptDecimalValue implements java.io.Serializable {
    public ArrayOptDecimalValue(
            final java.math.BigDecimal[] arrayOptDecimal) {
        setArrayOptDecimal(arrayOptDecimal);
    }

    public ArrayOptDecimalValue() {
        this.arrayOptDecimal = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 599336616;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptDecimalValue)) return false;
        final ArrayOptDecimalValue other = (ArrayOptDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.arrayOptDecimal, other.arrayOptDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptDecimalValue(" + arrayOptDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] arrayOptDecimal;

    @JsonProperty("arrayOptDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getArrayOptDecimal() {
        return arrayOptDecimal;
    }

    public ArrayOptDecimalValue setArrayOptDecimal(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptDecimal\" cannot be null!");
        this.arrayOptDecimal = value;

        return this;
    }
}
