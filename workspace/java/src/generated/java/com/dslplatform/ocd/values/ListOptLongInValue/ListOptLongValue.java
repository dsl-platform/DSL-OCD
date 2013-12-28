package com.dslplatform.ocd.values.ListOptLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptLongValue implements java.io.Serializable {
    public ListOptLongValue(
            final java.util.List<Long> listOptLong) {
        setListOptLong(listOptLong);
    }

    public ListOptLongValue() {
        this.listOptLong = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1307093978;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptLongValue)) return false;
        final ListOptLongValue other = (ListOptLongValue) obj;

        if (!(this.listOptLong.equals(other.listOptLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptLongValue(" + listOptLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> listOptLong;

    @JsonProperty("listOptLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getListOptLong() {
        return listOptLong;
    }

    public ListOptLongValue setListOptLong(final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptLong\" cannot be null!");
        this.listOptLong = value;

        return this;
    }
}
