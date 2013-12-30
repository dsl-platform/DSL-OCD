package com.dslplatform.ocd.values.ArrayOptMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptMoneyValue implements java.io.Serializable {
    public ArrayOptMoneyValue(
            final java.math.BigDecimal[] arrayOptMoney) {
        setArrayOptMoney(arrayOptMoney);
    }

    public ArrayOptMoneyValue() {
        this.arrayOptMoney = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 331729431;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptMoneyValue)) return false;
        final ArrayOptMoneyValue other = (ArrayOptMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.arrayOptMoney, other.arrayOptMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptMoneyValue(" + arrayOptMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] arrayOptMoney;

    @JsonProperty("arrayOptMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getArrayOptMoney() {
        return arrayOptMoney;
    }

    public ArrayOptMoneyValue setArrayOptMoney(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptMoney\" cannot be null!");
        this.arrayOptMoney = value;

        this.arrayOptMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.arrayOptMoney, 2);
        return this;
    }
}
