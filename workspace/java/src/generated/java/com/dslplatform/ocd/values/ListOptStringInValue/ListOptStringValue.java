package com.dslplatform.ocd.values.ListOptStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptStringValue implements java.io.Serializable {
    public ListOptStringValue(
            final java.util.List<String> listOptString) {
        setListOptString(listOptString);
    }

    public ListOptStringValue() {
        this.listOptString = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2103463559;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptStringValue)) return false;
        final ListOptStringValue other = (ListOptStringValue) obj;

        if (!(this.listOptString.equals(other.listOptString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptStringValue(" + listOptString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> listOptString;

    @JsonProperty("listOptString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getListOptString() {
        return listOptString;
    }

    public ListOptStringValue setListOptString(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptString\" cannot be null!");
        this.listOptString = value;

        return this;
    }
}
