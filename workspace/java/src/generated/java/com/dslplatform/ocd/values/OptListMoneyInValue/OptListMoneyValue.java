package com.dslplatform.ocd.values.OptListMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListMoneyValue implements java.io.Serializable {
    public OptListMoneyValue(
            final java.util.List<java.math.BigDecimal> optListMoney) {
        setOptListMoney(optListMoney);
    }

    public OptListMoneyValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2140686518;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListMoneyValue)) return false;
        final OptListMoneyValue other = (OptListMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optListMoney, other.optListMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListMoneyValue(" + optListMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> optListMoney;

    @JsonProperty("optListMoney")
    public java.util.List<java.math.BigDecimal> getOptListMoney() {
        return optListMoney;
    }

    public OptListMoneyValue setOptListMoney(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListMoney = value;

        this.optListMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(this.optListMoney,
                        2);
        return this;
    }
}
