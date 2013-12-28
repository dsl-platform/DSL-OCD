package com.dslplatform.ocd.values.ListBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListBinaryValue implements java.io.Serializable {
    public ListBinaryValue(
            final java.util.List<byte[]> listBinary) {
        setListBinary(listBinary);
    }

    public ListBinaryValue() {
        this.listBinary = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 306257004;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListBinaryValue)) return false;
        final ListBinaryValue other = (ListBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(this.listBinary,
                other.listBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListBinaryValue(" + listBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> listBinary;

    @JsonProperty("listBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getListBinary() {
        return listBinary;
    }

    public ListBinaryValue setListBinary(final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listBinary\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listBinary = value;

        return this;
    }
}
