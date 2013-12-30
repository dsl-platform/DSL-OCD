package com.dslplatform.ocd.values.OptSetOptMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptMoneyValue implements java.io.Serializable {
    public OptSetOptMoneyValue(
            final java.util.Set<java.math.BigDecimal> optSetOptMoney) {
        setOptSetOptMoney(optSetOptMoney);
    }

    public OptSetOptMoneyValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1620909585;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptMoneyValue)) return false;
        final OptSetOptMoneyValue other = (OptSetOptMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optSetOptMoney, other.optSetOptMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptMoneyValue(" + optSetOptMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> optSetOptMoney;

    @JsonProperty("optSetOptMoney")
    public java.util.Set<java.math.BigDecimal> getOptSetOptMoney() {
        return optSetOptMoney;
    }

    public OptSetOptMoneyValue setOptSetOptMoney(
            final java.util.Set<java.math.BigDecimal> value) {
        this.optSetOptMoney = value;

        this.optSetOptMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.optSetOptMoney, 2);
        return this;
    }
}
