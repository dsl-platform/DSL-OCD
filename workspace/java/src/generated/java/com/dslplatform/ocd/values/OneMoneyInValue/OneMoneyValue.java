package com.dslplatform.ocd.values.OneMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneMoneyValue implements java.io.Serializable {
    public OneMoneyValue(
            final java.math.BigDecimal oneMoney) {
        setOneMoney(oneMoney);
    }

    public OneMoneyValue() {
        this.oneMoney = java.math.BigDecimal.ZERO.setScale(2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1636010413;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneMoneyValue)) return false;
        final OneMoneyValue other = (OneMoneyValue) obj;

        if (!(this.oneMoney == other.oneMoney || this.oneMoney != null
                && this.oneMoney.compareTo(other.oneMoney) == 0)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneMoneyValue(" + oneMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal oneMoney;

    @JsonProperty("oneMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneMoney() {
        return oneMoney;
    }

    public OneMoneyValue setOneMoney(final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneMoney\" cannot be null!");
        this.oneMoney = value;

        this.oneMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.oneMoney, 2);
        return this;
    }
}