package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneMoney_1 implements java.io.Serializable {
    public OneMoney_1(
            final java.math.BigDecimal oneMoney) {
        setOneMoney(oneMoney);
    }

    public OneMoney_1() {
        this.oneMoney = java.math.BigDecimal.ZERO.setScale(2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 897366406;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneMoney_1)) return false;
        final OneMoney_1 other = (OneMoney_1) obj;

        if (!(this.oneMoney == other.oneMoney || this.oneMoney != null
                && this.oneMoney.compareTo(other.oneMoney) == 0)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneMoney_1(" + oneMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal oneMoney;

    @JsonProperty("oneMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneMoney() {
        return oneMoney;
    }

    public OneMoney_1 setOneMoney(final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneMoney\" cannot be null!");
        this.oneMoney = value;

        this.oneMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.oneMoney, 2);
        return this;
    }
}
