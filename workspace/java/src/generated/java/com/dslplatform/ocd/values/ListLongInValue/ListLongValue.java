package com.dslplatform.ocd.values.ListLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListLongValue implements java.io.Serializable {
    public ListLongValue(
            final java.util.List<Long> listLong) {
        setListLong(listLong);
    }

    public ListLongValue() {
        this.listLong = new java.util.ArrayList<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1192051003;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListLongValue)) return false;
        final ListLongValue other = (ListLongValue) obj;

        if (!(this.listLong.equals(other.listLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListLongValue(" + listLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> listLong;

    @JsonProperty("listLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Long> getListLong() {
        return listLong;
    }

    public ListLongValue setListLong(final java.util.List<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listLong\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listLong = value;

        return this;
    }
}
