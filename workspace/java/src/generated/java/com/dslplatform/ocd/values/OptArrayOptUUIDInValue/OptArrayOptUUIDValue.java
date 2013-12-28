package com.dslplatform.ocd.values.OptArrayOptUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptUUIDValue implements java.io.Serializable {
    public OptArrayOptUUIDValue(
            final java.util.UUID[] optArrayOptUUID) {
        setOptArrayOptUUID(optArrayOptUUID);
    }

    public OptArrayOptUUIDValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 275489745;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptUUIDValue)) return false;
        final OptArrayOptUUIDValue other = (OptArrayOptUUIDValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptUUID,
                other.optArrayOptUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptUUIDValue(" + optArrayOptUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] optArrayOptUUID;

    @JsonProperty("optArrayOptUUID")
    public java.util.UUID[] getOptArrayOptUUID() {
        return optArrayOptUUID;
    }

    public OptArrayOptUUIDValue setOptArrayOptUUID(final java.util.UUID[] value) {
        this.optArrayOptUUID = value;

        return this;
    }
}
