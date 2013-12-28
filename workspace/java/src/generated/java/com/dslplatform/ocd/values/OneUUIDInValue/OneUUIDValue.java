package com.dslplatform.ocd.values.OneUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneUUIDValue implements java.io.Serializable {
    public OneUUIDValue(
            final java.util.UUID oneUUID) {
        setOneUUID(oneUUID);
    }

    public OneUUIDValue() {
        this.oneUUID = java.util.UUID.randomUUID();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2037164402;
        result = prime * result
                + (this.oneUUID != null ? this.oneUUID.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneUUIDValue)) return false;
        final OneUUIDValue other = (OneUUIDValue) obj;

        if (!(this.oneUUID.equals(other.oneUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneUUIDValue(" + oneUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID oneUUID;

    @JsonProperty("oneUUID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID getOneUUID() {
        return oneUUID;
    }

    public OneUUIDValue setOneUUID(final java.util.UUID value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneUUID\" cannot be null!");
        this.oneUUID = value;

        return this;
    }
}
