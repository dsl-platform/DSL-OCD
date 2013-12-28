package com.dslplatform.ocd.values.ListStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListStringValue implements java.io.Serializable {
    public ListStringValue(
            final java.util.List<String> listString) {
        setListString(listString);
    }

    public ListStringValue() {
        this.listString = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 982074824;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListStringValue)) return false;
        final ListStringValue other = (ListStringValue) obj;

        if (!(this.listString.equals(other.listString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListStringValue(" + listString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> listString;

    @JsonProperty("listString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getListString() {
        return listString;
    }

    public ListStringValue setListString(final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listString\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listString = value;

        return this;
    }
}
