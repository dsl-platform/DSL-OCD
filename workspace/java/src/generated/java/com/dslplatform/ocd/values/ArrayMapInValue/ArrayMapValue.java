package com.dslplatform.ocd.values.ArrayMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayMapValue implements java.io.Serializable {
    public ArrayMapValue(
            final java.util.Map<String, String>[] arrayMap) {
        setArrayMap(arrayMap);
    }

    @SuppressWarnings("unchecked")
    public ArrayMapValue() {
        this.arrayMap = new java.util.Map[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1416418188;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayMapValue)) return false;
        final ArrayMapValue other = (ArrayMapValue) obj;

        if (!(java.util.Arrays.equals(this.arrayMap, other.arrayMap)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayMapValue(" + arrayMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] arrayMap;

    @JsonProperty("arrayMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getArrayMap() {
        return arrayMap;
    }

    public ArrayMapValue setArrayMap(final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayMap\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayMap = value;

        return this;
    }
}
