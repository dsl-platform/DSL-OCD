package com.dslplatform.ocd.values.ArrayUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayUUIDValue implements java.io.Serializable {
    public ArrayUUIDValue(
            final java.util.UUID[] arrayUUID) {
        setArrayUUID(arrayUUID);
    }

    public ArrayUUIDValue() {
        this.arrayUUID = new java.util.UUID[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1020024403;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayUUIDValue)) return false;
        final ArrayUUIDValue other = (ArrayUUIDValue) obj;

        if (!(java.util.Arrays.equals(this.arrayUUID, other.arrayUUID)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayUUIDValue(" + arrayUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] arrayUUID;

    @JsonProperty("arrayUUID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID[] getArrayUUID() {
        return arrayUUID;
    }

    public ArrayUUIDValue setArrayUUID(final java.util.UUID[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayUUID\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayUUID = value;

        return this;
    }
}
