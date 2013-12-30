package com.dslplatform.ocd.values.ListMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListMapValue implements java.io.Serializable {
    public ListMapValue(
            final java.util.List<java.util.Map<String, String>> listMap) {
        setListMap(listMap);
    }

    public ListMapValue() {
        this.listMap = new java.util.ArrayList<java.util.Map<String, String>>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1172690513;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListMapValue)) return false;
        final ListMapValue other = (ListMapValue) obj;

        if (!(this.listMap.equals(other.listMap))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListMapValue(" + listMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.Map<String, String>> listMap;

    @JsonProperty("listMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.Map<String, String>> getListMap() {
        return listMap;
    }

    public ListMapValue setListMap(
            final java.util.List<java.util.Map<String, String>> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listMap\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listMap = value;

        return this;
    }
}
