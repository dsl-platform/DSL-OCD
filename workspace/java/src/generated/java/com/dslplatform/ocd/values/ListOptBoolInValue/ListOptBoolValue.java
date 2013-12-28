package com.dslplatform.ocd.values.ListOptBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptBoolValue implements java.io.Serializable {
    public ListOptBoolValue(
            final java.util.List<Boolean> listOptBool) {
        setListOptBool(listOptBool);
    }

    public ListOptBoolValue() {
        this.listOptBool = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1696820088;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptBoolValue)) return false;
        final ListOptBoolValue other = (ListOptBoolValue) obj;

        if (!(this.listOptBool.equals(other.listOptBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptBoolValue(" + listOptBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> listOptBool;

    @JsonProperty("listOptBool")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getListOptBool() {
        return listOptBool;
    }

    public ListOptBoolValue setListOptBool(final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptBool\" cannot be null!");
        this.listOptBool = value;

        return this;
    }
}
