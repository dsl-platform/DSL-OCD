package com.dslplatform.ocd.values.ListOptUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptUUIDValue implements java.io.Serializable {
    public ListOptUUIDValue(
            final java.util.List<java.util.UUID> listOptUUID) {
        setListOptUUID(listOptUUID);
    }

    public ListOptUUIDValue() {
        this.listOptUUID = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1218827227;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptUUIDValue)) return false;
        final ListOptUUIDValue other = (ListOptUUIDValue) obj;

        if (!(this.listOptUUID.equals(other.listOptUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptUUIDValue(" + listOptUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> listOptUUID;

    @JsonProperty("listOptUUID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getListOptUUID() {
        return listOptUUID;
    }

    public ListOptUUIDValue setListOptUUID(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptUUID\" cannot be null!");
        this.listOptUUID = value;

        return this;
    }
}
