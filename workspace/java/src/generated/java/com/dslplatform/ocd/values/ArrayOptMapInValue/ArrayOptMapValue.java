package com.dslplatform.ocd.values.ArrayOptMapInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptMapValue implements java.io.Serializable {
    public ArrayOptMapValue(
            final java.util.Map<String, String>[] arrayOptMap) {
        setArrayOptMap(arrayOptMap);
    }

    @SuppressWarnings("unchecked")
    public ArrayOptMapValue() {
        this.arrayOptMap = new java.util.Map[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 958165013;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptMapValue)) return false;
        final ArrayOptMapValue other = (ArrayOptMapValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptMap, other.arrayOptMap)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptMapValue(" + arrayOptMap + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] arrayOptMap;

    @JsonProperty("arrayOptMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getArrayOptMap() {
        return arrayOptMap;
    }

    public ArrayOptMapValue setArrayOptMap(
            final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptMap\" cannot be null!");
        this.arrayOptMap = value;

        return this;
    }
}
