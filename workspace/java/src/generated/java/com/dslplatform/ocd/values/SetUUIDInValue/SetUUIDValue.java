package com.dslplatform.ocd.values.SetUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetUUIDValue implements java.io.Serializable {
    public SetUUIDValue(
            final java.util.Set<java.util.UUID> setUUID) {
        setSetUUID(setUUID);
    }

    public SetUUIDValue() {
        this.setUUID = new java.util.HashSet<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 97774506;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetUUIDValue)) return false;
        final SetUUIDValue other = (SetUUIDValue) obj;

        if (!(this.setUUID.equals(other.setUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetUUIDValue(" + setUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> setUUID;

    @JsonProperty("setUUID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getSetUUID() {
        return setUUID;
    }

    public SetUUIDValue setSetUUID(final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setUUID\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setUUID = value;

        return this;
    }
}
