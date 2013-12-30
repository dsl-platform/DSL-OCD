package com.dslplatform.ocd.values.SetOptMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptMoneyValue implements java.io.Serializable {
    public SetOptMoneyValue(
            final java.util.Set<java.math.BigDecimal> setOptMoney) {
        setSetOptMoney(setOptMoney);
    }

    public SetOptMoneyValue() {
        this.setOptMoney = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1662252002;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptMoneyValue)) return false;
        final SetOptMoneyValue other = (SetOptMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.setOptMoney, other.setOptMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptMoneyValue(" + setOptMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> setOptMoney;

    @JsonProperty("setOptMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getSetOptMoney() {
        return setOptMoney;
    }

    public SetOptMoneyValue setSetOptMoney(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptMoney\" cannot be null!");
        this.setOptMoney = value;

        this.setOptMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.setOptMoney, 2);
        return this;
    }
}
