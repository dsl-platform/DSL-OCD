package com.dslplatform.ocd.values.OptListOptUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptUUIDValue implements java.io.Serializable {
    public OptListOptUUIDValue(
            final java.util.List<java.util.UUID> optListOptUUID) {
        setOptListOptUUID(optListOptUUID);
    }

    public OptListOptUUIDValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 208420916;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptUUIDValue)) return false;
        final OptListOptUUIDValue other = (OptListOptUUIDValue) obj;

        if (!(this.optListOptUUID == other.optListOptUUID || this.optListOptUUID != null
                && this.optListOptUUID.equals(other.optListOptUUID)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptUUIDValue(" + optListOptUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> optListOptUUID;

    @JsonProperty("optListOptUUID")
    public java.util.List<java.util.UUID> getOptListOptUUID() {
        return optListOptUUID;
    }

    public OptListOptUUIDValue setOptListOptUUID(
            final java.util.List<java.util.UUID> value) {
        this.optListOptUUID = value;

        return this;
    }
}
