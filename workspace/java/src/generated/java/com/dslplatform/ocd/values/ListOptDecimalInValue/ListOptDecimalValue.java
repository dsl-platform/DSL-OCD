package com.dslplatform.ocd.values.ListOptDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptDecimalValue implements java.io.Serializable {
    public ListOptDecimalValue(
            final java.util.List<java.math.BigDecimal> listOptDecimal) {
        setListOptDecimal(listOptDecimal);
    }

    public ListOptDecimalValue() {
        this.listOptDecimal = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 865530059;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptDecimalValue)) return false;
        final ListOptDecimalValue other = (ListOptDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.listOptDecimal, other.listOptDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptDecimalValue(" + listOptDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> listOptDecimal;

    @JsonProperty("listOptDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getListOptDecimal() {
        return listOptDecimal;
    }

    public ListOptDecimalValue setListOptDecimal(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptDecimal\" cannot be null!");
        this.listOptDecimal = value;

        return this;
    }
}
