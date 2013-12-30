package com.dslplatform.ocd.values.OptSetMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetMoneyValue implements java.io.Serializable {
    public OptSetMoneyValue(
            final java.util.Set<java.math.BigDecimal> optSetMoney) {
        setOptSetMoney(optSetMoney);
    }

    public OptSetMoneyValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1223843736;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetMoneyValue)) return false;
        final OptSetMoneyValue other = (OptSetMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optSetMoney, other.optSetMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetMoneyValue(" + optSetMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> optSetMoney;

    @JsonProperty("optSetMoney")
    public java.util.Set<java.math.BigDecimal> getOptSetMoney() {
        return optSetMoney;
    }

    public OptSetMoneyValue setOptSetMoney(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetMoney = value;

        this.optSetMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(this.optSetMoney,
                        2);
        return this;
    }
}
