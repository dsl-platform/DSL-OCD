package com.dslplatform.ocd.values.OptSetOptUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptUUIDValue implements java.io.Serializable {
    public OptSetOptUUIDValue(
            final java.util.Set<java.util.UUID> optSetOptUUID) {
        setOptSetOptUUID(optSetOptUUID);
    }

    public OptSetOptUUIDValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1783630666;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptUUIDValue)) return false;
        final OptSetOptUUIDValue other = (OptSetOptUUIDValue) obj;

        if (!(this.optSetOptUUID == other.optSetOptUUID || this.optSetOptUUID != null
                && this.optSetOptUUID.equals(other.optSetOptUUID)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptUUIDValue(" + optSetOptUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> optSetOptUUID;

    @JsonProperty("optSetOptUUID")
    public java.util.Set<java.util.UUID> getOptSetOptUUID() {
        return optSetOptUUID;
    }

    public OptSetOptUUIDValue setOptSetOptUUID(
            final java.util.Set<java.util.UUID> value) {
        this.optSetOptUUID = value;

        return this;
    }
}
