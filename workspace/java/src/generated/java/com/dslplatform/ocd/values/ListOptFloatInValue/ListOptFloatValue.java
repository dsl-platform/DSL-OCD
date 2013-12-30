package com.dslplatform.ocd.values.ListOptFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptFloatValue implements java.io.Serializable {
    public ListOptFloatValue(
            final java.util.List<Float> listOptFloat) {
        setListOptFloat(listOptFloat);
    }

    public ListOptFloatValue() {
        this.listOptFloat = new java.util.ArrayList<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 271847592;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptFloatValue)) return false;
        final ListOptFloatValue other = (ListOptFloatValue) obj;

        if (!(this.listOptFloat.equals(other.listOptFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptFloatValue(" + listOptFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> listOptFloat;

    @JsonProperty("listOptFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getListOptFloat() {
        return listOptFloat;
    }

    public ListOptFloatValue setListOptFloat(final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptFloat\" cannot be null!");
        this.listOptFloat = value;

        return this;
    }
}
