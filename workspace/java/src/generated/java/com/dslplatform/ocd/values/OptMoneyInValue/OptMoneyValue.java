package com.dslplatform.ocd.values.OptMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptMoneyValue implements java.io.Serializable {
    public OptMoneyValue(
            final java.math.BigDecimal optMoney) {
        setOptMoney(optMoney);
    }

    public OptMoneyValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2068586286;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptMoneyValue)) return false;
        final OptMoneyValue other = (OptMoneyValue) obj;

        if (!(this.optMoney == other.optMoney || this.optMoney != null
                && this.optMoney.compareTo(other.optMoney) == 0)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptMoneyValue(" + optMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal optMoney;

    @JsonProperty("optMoney")
    public java.math.BigDecimal getOptMoney() {
        return optMoney;
    }

    public OptMoneyValue setOptMoney(final java.math.BigDecimal value) {
        this.optMoney = value;

        this.optMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(this.optMoney, 2);
        return this;
    }
}
