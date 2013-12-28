package com.dslplatform.ocd.values.ListOptIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptIntValue implements java.io.Serializable {
    public ListOptIntValue(
            final java.util.List<Integer> listOptInt) {
        setListOptInt(listOptInt);
    }

    public ListOptIntValue() {
        this.listOptInt = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1774884565;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptIntValue)) return false;
        final ListOptIntValue other = (ListOptIntValue) obj;

        if (!(this.listOptInt.equals(other.listOptInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptIntValue(" + listOptInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> listOptInt;

    @JsonProperty("listOptInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getListOptInt() {
        return listOptInt;
    }

    public ListOptIntValue setListOptInt(final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptInt\" cannot be null!");
        this.listOptInt = value;

        return this;
    }
}
