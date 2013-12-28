package com.dslplatform.ocd.values.OptSetUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetUUIDValue implements java.io.Serializable {
    public OptSetUUIDValue(
            final java.util.Set<java.util.UUID> optSetUUID) {
        setOptSetUUID(optSetUUID);
    }

    public OptSetUUIDValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2063533451;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetUUIDValue)) return false;
        final OptSetUUIDValue other = (OptSetUUIDValue) obj;

        if (!(this.optSetUUID == other.optSetUUID || this.optSetUUID != null
                && this.optSetUUID.equals(other.optSetUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetUUIDValue(" + optSetUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> optSetUUID;

    @JsonProperty("optSetUUID")
    public java.util.Set<java.util.UUID> getOptSetUUID() {
        return optSetUUID;
    }

    public OptSetUUIDValue setOptSetUUID(
            final java.util.Set<java.util.UUID> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetUUID = value;

        return this;
    }
}
