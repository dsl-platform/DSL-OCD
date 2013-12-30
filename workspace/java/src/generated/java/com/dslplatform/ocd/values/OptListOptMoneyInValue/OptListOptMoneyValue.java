package com.dslplatform.ocd.values.OptListOptMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptMoneyValue implements java.io.Serializable {
    public OptListOptMoneyValue(
            final java.util.List<java.math.BigDecimal> optListOptMoney) {
        setOptListOptMoney(optListOptMoney);
    }

    public OptListOptMoneyValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2122370127;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptMoneyValue)) return false;
        final OptListOptMoneyValue other = (OptListOptMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optListOptMoney, other.optListOptMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptMoneyValue(" + optListOptMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> optListOptMoney;

    @JsonProperty("optListOptMoney")
    public java.util.List<java.math.BigDecimal> getOptListOptMoney() {
        return optListOptMoney;
    }

    public OptListOptMoneyValue setOptListOptMoney(
            final java.util.List<java.math.BigDecimal> value) {
        this.optListOptMoney = value;

        this.optListOptMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.optListOptMoney, 2);
        return this;
    }
}
