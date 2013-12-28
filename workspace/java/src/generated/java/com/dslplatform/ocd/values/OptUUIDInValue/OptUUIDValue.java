package com.dslplatform.ocd.values.OptUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptUUIDValue implements java.io.Serializable {
    public OptUUIDValue(
            final java.util.UUID optUUID) {
        setOptUUID(optUUID);
    }

    public OptUUIDValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 657680393;
        result = prime * result
                + (this.optUUID != null ? this.optUUID.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptUUIDValue)) return false;
        final OptUUIDValue other = (OptUUIDValue) obj;

        if (!(this.optUUID == other.optUUID || this.optUUID != null
                && this.optUUID.equals(other.optUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptUUIDValue(" + optUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID optUUID;

    @JsonProperty("optUUID")
    public java.util.UUID getOptUUID() {
        return optUUID;
    }

    public OptUUIDValue setOptUUID(final java.util.UUID value) {
        this.optUUID = value;

        return this;
    }
}
