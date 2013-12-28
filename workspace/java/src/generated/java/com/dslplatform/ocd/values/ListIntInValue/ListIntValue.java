package com.dslplatform.ocd.values.ListIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListIntValue implements java.io.Serializable {
    public ListIntValue(
            final java.util.List<Integer> listInt) {
        setListInt(listInt);
    }

    public ListIntValue() {
        this.listInt = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1897860000;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListIntValue)) return false;
        final ListIntValue other = (ListIntValue) obj;

        if (!(this.listInt.equals(other.listInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListIntValue(" + listInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> listInt;

    @JsonProperty("listInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getListInt() {
        return listInt;
    }

    public ListIntValue setListInt(final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listInt\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listInt = value;

        return this;
    }
}
