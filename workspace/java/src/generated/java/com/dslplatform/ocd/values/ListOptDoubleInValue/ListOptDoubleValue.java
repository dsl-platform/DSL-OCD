package com.dslplatform.ocd.values.ListOptDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptDoubleValue implements java.io.Serializable {
    public ListOptDoubleValue(
            final java.util.List<Double> listOptDouble) {
        setListOptDouble(listOptDouble);
    }

    public ListOptDoubleValue() {
        this.listOptDouble = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1010789745;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptDoubleValue)) return false;
        final ListOptDoubleValue other = (ListOptDoubleValue) obj;

        if (!(this.listOptDouble.equals(other.listOptDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptDoubleValue(" + listOptDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> listOptDouble;

    @JsonProperty("listOptDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getListOptDouble() {
        return listOptDouble;
    }

    public ListOptDoubleValue setListOptDouble(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptDouble\" cannot be null!");
        this.listOptDouble = value;

        return this;
    }
}
