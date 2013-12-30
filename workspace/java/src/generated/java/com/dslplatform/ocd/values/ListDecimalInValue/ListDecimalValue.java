package com.dslplatform.ocd.values.ListDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListDecimalValue implements java.io.Serializable {
    public ListDecimalValue(
            final java.util.List<java.math.BigDecimal> listDecimal) {
        setListDecimal(listDecimal);
    }

    public ListDecimalValue() {
        this.listDecimal = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2046499322;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListDecimalValue)) return false;
        final ListDecimalValue other = (ListDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.listDecimal, other.listDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListDecimalValue(" + listDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> listDecimal;

    @JsonProperty("listDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getListDecimal() {
        return listDecimal;
    }

    public ListDecimalValue setListDecimal(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listDecimal\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listDecimal = value;

        return this;
    }
}
