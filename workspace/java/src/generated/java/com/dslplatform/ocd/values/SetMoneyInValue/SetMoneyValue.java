package com.dslplatform.ocd.values.SetMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetMoneyValue implements java.io.Serializable {
    public SetMoneyValue(
            final java.util.Set<java.math.BigDecimal> setMoney) {
        setSetMoney(setMoney);
    }

    public SetMoneyValue() {
        this.setMoney = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 870963805;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetMoneyValue)) return false;
        final SetMoneyValue other = (SetMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.setMoney, other.setMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetMoneyValue(" + setMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> setMoney;

    @JsonProperty("setMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getSetMoney() {
        return setMoney;
    }

    public SetMoneyValue setSetMoney(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setMoney\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setMoney = value;

        this.setMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.setMoney, 2);
        return this;
    }
}
