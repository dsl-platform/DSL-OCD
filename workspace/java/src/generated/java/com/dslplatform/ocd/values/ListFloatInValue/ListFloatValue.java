package com.dslplatform.ocd.values.ListFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListFloatValue implements java.io.Serializable {
    public ListFloatValue(
            final java.util.List<Float> listFloat) {
        setListFloat(listFloat);
    }

    public ListFloatValue() {
        this.listFloat = new java.util.ArrayList<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1321365083;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListFloatValue)) return false;
        final ListFloatValue other = (ListFloatValue) obj;

        if (!(this.listFloat.equals(other.listFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListFloatValue(" + listFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> listFloat;

    @JsonProperty("listFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getListFloat() {
        return listFloat;
    }

    public ListFloatValue setListFloat(final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listFloat\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listFloat = value;

        return this;
    }
}
