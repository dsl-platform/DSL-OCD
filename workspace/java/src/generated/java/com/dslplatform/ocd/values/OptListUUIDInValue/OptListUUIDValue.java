package com.dslplatform.ocd.values.OptListUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListUUIDValue implements java.io.Serializable {
    public OptListUUIDValue(
            final java.util.List<java.util.UUID> optListUUID) {
        setOptListUUID(optListUUID);
    }

    public OptListUUIDValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1318660877;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListUUIDValue)) return false;
        final OptListUUIDValue other = (OptListUUIDValue) obj;

        if (!(this.optListUUID == other.optListUUID || this.optListUUID != null
                && this.optListUUID.equals(other.optListUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListUUIDValue(" + optListUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> optListUUID;

    @JsonProperty("optListUUID")
    public java.util.List<java.util.UUID> getOptListUUID() {
        return optListUUID;
    }

    public OptListUUIDValue setOptListUUID(
            final java.util.List<java.util.UUID> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListUUID = value;

        return this;
    }
}
