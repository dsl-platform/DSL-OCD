package com.dslplatform.ocd.values.ListOptMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptMapValue implements java.io.Serializable {
    public ListOptMapValue(
            final java.util.List<java.util.Map<String, String>> listOptMap) {
        setListOptMap(listOptMap);
    }

    public ListOptMapValue() {
        this.listOptMap = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1044304772;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptMapValue)) return false;
        final ListOptMapValue other = (ListOptMapValue) obj;

        if (!(this.listOptMap.equals(other.listOptMap))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptMapValue(" + listOptMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> listOptMap;

    @JsonProperty("listOptMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getListOptMap() {
        return listOptMap;
    }

    public ListOptMapValue setListOptMap(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptMap\" cannot be null!");
        this.listOptMap = value;

        return this;
    }
}
