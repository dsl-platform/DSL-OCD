package com.dslplatform.ocd.values.ArrayOptUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptUUIDValue implements java.io.Serializable {
    public ArrayOptUUIDValue(
            final java.util.UUID[] arrayOptUUID) {
        setArrayOptUUID(arrayOptUUID);
    }

    public ArrayOptUUIDValue() {
        this.arrayOptUUID = new java.util.UUID[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 59599260;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptUUIDValue)) return false;
        final ArrayOptUUIDValue other = (ArrayOptUUIDValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptUUID, other.arrayOptUUID)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptUUIDValue(" + arrayOptUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] arrayOptUUID;

    @JsonProperty("arrayOptUUID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID[] getArrayOptUUID() {
        return arrayOptUUID;
    }

    public ArrayOptUUIDValue setArrayOptUUID(final java.util.UUID[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptUUID\" cannot be null!");
        this.arrayOptUUID = value;

        return this;
    }
}
