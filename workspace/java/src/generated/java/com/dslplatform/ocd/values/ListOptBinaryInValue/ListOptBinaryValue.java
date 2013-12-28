package com.dslplatform.ocd.values.ListOptBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptBinaryValue implements java.io.Serializable {
    public ListOptBinaryValue(
            final java.util.List<byte[]> listOptBinary) {
        setListOptBinary(listOptBinary);
    }

    public ListOptBinaryValue() {
        this.listOptBinary = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 16342257;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptBinaryValue)) return false;
        final ListOptBinaryValue other = (ListOptBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.listOptBinary, other.listOptBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptBinaryValue(" + listOptBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> listOptBinary;

    @JsonProperty("listOptBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getListOptBinary() {
        return listOptBinary;
    }

    public ListOptBinaryValue setListOptBinary(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptBinary\" cannot be null!");
        this.listOptBinary = value;

        return this;
    }
}
