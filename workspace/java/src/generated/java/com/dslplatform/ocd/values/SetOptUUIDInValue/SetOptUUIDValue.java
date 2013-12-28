package com.dslplatform.ocd.values.SetOptUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptUUIDValue implements java.io.Serializable {
    public SetOptUUIDValue(
            final java.util.Set<java.util.UUID> setOptUUID) {
        setSetOptUUID(setOptUUID);
    }

    public SetOptUUIDValue() {
        this.setOptUUID = new java.util.HashSet<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 449829657;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptUUIDValue)) return false;
        final SetOptUUIDValue other = (SetOptUUIDValue) obj;

        if (!(this.setOptUUID.equals(other.setOptUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptUUIDValue(" + setOptUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> setOptUUID;

    @JsonProperty("setOptUUID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getSetOptUUID() {
        return setOptUUID;
    }

    public SetOptUUIDValue setSetOptUUID(
            final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptUUID\" cannot be null!");
        this.setOptUUID = value;

        return this;
    }
}
