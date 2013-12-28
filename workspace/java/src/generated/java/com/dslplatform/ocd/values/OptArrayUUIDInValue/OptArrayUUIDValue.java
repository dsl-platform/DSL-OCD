package com.dslplatform.ocd.values.OptArrayUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayUUIDValue implements java.io.Serializable {
    public OptArrayUUIDValue(
            final java.util.UUID[] optArrayUUID) {
        setOptArrayUUID(optArrayUUID);
    }

    public OptArrayUUIDValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 814877360;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayUUIDValue)) return false;
        final OptArrayUUIDValue other = (OptArrayUUIDValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayUUID, other.optArrayUUID)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayUUIDValue(" + optArrayUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] optArrayUUID;

    @JsonProperty("optArrayUUID")
    public java.util.UUID[] getOptArrayUUID() {
        return optArrayUUID;
    }

    public OptArrayUUIDValue setOptArrayUUID(final java.util.UUID[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayUUID = value;

        return this;
    }
}
