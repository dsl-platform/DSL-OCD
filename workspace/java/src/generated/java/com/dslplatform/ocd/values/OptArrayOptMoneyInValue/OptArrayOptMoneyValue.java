package com.dslplatform.ocd.values.OptArrayOptMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptMoneyValue implements java.io.Serializable {
    public OptArrayOptMoneyValue(
            final java.math.BigDecimal[] optArrayOptMoney) {
        setOptArrayOptMoney(optArrayOptMoney);
    }

    public OptArrayOptMoneyValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 402223960;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptMoneyValue)) return false;
        final OptArrayOptMoneyValue other = (OptArrayOptMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optArrayOptMoney, other.optArrayOptMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptMoneyValue(" + optArrayOptMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] optArrayOptMoney;

    @JsonProperty("optArrayOptMoney")
    public java.math.BigDecimal[] getOptArrayOptMoney() {
        return optArrayOptMoney;
    }

    public OptArrayOptMoneyValue setOptArrayOptMoney(
            final java.math.BigDecimal[] value) {
        this.optArrayOptMoney = value;

        this.optArrayOptMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.optArrayOptMoney, 2);
        return this;
    }
}
