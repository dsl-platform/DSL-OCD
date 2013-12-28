package com.dslplatform.ocd.values.ListUUIDInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListUUIDValue implements java.io.Serializable {
    public ListUUIDValue(
            final java.util.List<java.util.UUID> listUUID) {
        setListUUID(listUUID);
    }

    public ListUUIDValue() {
        this.listUUID = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1873430294;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListUUIDValue)) return false;
        final ListUUIDValue other = (ListUUIDValue) obj;

        if (!(this.listUUID.equals(other.listUUID))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListUUIDValue(" + listUUID + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> listUUID;

    @JsonProperty("listUUID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getListUUID() {
        return listUUID;
    }

    public ListUUIDValue setListUUID(final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listUUID\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listUUID = value;

        return this;
    }
}
