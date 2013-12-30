package com.dslplatform.ocd.values.ArrayMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayMoneyValue implements java.io.Serializable {
    public ArrayMoneyValue(
            final java.math.BigDecimal[] arrayMoney) {
        setArrayMoney(arrayMoney);
    }

    public ArrayMoneyValue() {
        this.arrayMoney = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1501975982;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayMoneyValue)) return false;
        final ArrayMoneyValue other = (ArrayMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.arrayMoney, other.arrayMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayMoneyValue(" + arrayMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] arrayMoney;

    @JsonProperty("arrayMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getArrayMoney() {
        return arrayMoney;
    }

    public ArrayMoneyValue setArrayMoney(final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayMoney\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayMoney = value;

        this.arrayMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.arrayMoney, 2);
        return this;
    }
}
