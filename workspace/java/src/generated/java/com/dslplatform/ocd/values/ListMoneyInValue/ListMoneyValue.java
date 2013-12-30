package com.dslplatform.ocd.values.ListMoneyInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListMoneyValue implements java.io.Serializable {
    public ListMoneyValue(
            final java.util.List<java.math.BigDecimal> listMoney) {
        setListMoney(listMoney);
    }

    public ListMoneyValue() {
        this.listMoney = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1640423157;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListMoneyValue)) return false;
        final ListMoneyValue other = (ListMoneyValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.listMoney, other.listMoney))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListMoneyValue(" + listMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> listMoney;

    @JsonProperty("listMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getListMoney() {
        return listMoney;
    }

    public ListMoneyValue setListMoney(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listMoney\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listMoney = value;

        this.listMoney = com.dslplatform.ocd.values.Guards.setScale(
                this.listMoney, 2);
        return this;
    }
}
