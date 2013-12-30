package com.dslplatform.ocd.values.ListOptMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptMoneyValue implements java.io.Serializable {
    public ListOptMoneyValue(
            final java.util.List<java.math.BigDecimal> listOptMoney) {
        setListOptMoney(listOptMoney);
    }

    public ListOptMoneyValue() {
        this.listOptMoney = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 588583054;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptMoneyValue)) return false;
        final ListOptMoneyValue other = (ListOptMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.listOptMoney, other.listOptMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptMoneyValue(" + listOptMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> listOptMoney;

    @JsonProperty("listOptMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getListOptMoney() {
        return listOptMoney;
    }

    public ListOptMoneyValue setListOptMoney(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptMoney\" cannot be null!");
        this.listOptMoney = value;

        this.listOptMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.listOptMoney, 2);
        return this;
    }
}
