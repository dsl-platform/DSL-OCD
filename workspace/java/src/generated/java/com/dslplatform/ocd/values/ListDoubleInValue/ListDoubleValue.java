package com.dslplatform.ocd.values.ListDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListDoubleValue implements java.io.Serializable {
    public ListDoubleValue(
            final java.util.List<Double> listDouble) {
        setListDouble(listDouble);
    }

    public ListDoubleValue() {
        this.listDouble = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 843953004;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListDoubleValue)) return false;
        final ListDoubleValue other = (ListDoubleValue) obj;

        if (!(this.listDouble.equals(other.listDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListDoubleValue(" + listDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> listDouble;

    @JsonProperty("listDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getListDouble() {
        return listDouble;
    }

    public ListDoubleValue setListDouble(final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listDouble\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listDouble = value;

        return this;
    }
}
