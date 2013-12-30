package com.dslplatform.ocd.values.OptArrayMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayMoneyValue implements java.io.Serializable {
    public OptArrayMoneyValue(
            final java.math.BigDecimal[] optArrayMoney) {
        setOptArrayMoney(optArrayMoney);
    }

    public OptArrayMoneyValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2032550699;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayMoneyValue)) return false;
        final OptArrayMoneyValue other = (OptArrayMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optArrayMoney, other.optArrayMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayMoneyValue(" + optArrayMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] optArrayMoney;

    @JsonProperty("optArrayMoney")
    public java.math.BigDecimal[] getOptArrayMoney() {
        return optArrayMoney;
    }

    public OptArrayMoneyValue setOptArrayMoney(
            final java.math.BigDecimal[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayMoney = value;

        this.optArrayMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.optArrayMoney, 2);
        return this;
    }
}
