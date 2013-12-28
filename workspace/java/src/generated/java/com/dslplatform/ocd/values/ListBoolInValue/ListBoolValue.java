package com.dslplatform.ocd.values.ListBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListBoolValue implements java.io.Serializable {
    public ListBoolValue(
            final java.util.List<Boolean> listBool) {
        setListBool(listBool);
    }

    public ListBoolValue() {
        this.listBool = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1513294221;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListBoolValue)) return false;
        final ListBoolValue other = (ListBoolValue) obj;

        if (!(this.listBool.equals(other.listBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListBoolValue(" + listBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> listBool;

    @JsonProperty("listBool")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getListBool() {
        return listBool;
    }

    public ListBoolValue setListBool(final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listBool\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listBool = value;

        return this;
    }
}
