package com.dslplatform.ocd.values.ArrayStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayStringValue implements java.io.Serializable {
    public ArrayStringValue(
            final String[] arrayString) {
        setArrayString(arrayString);
    }

    public ArrayStringValue() {
        this.arrayString = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 559672481;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayStringValue)) return false;
        final ArrayStringValue other = (ArrayStringValue) obj;

        if (!(java.util.Arrays.equals(this.arrayString, other.arrayString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayStringValue(" + arrayString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] arrayString;

    @JsonProperty("arrayString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getArrayString() {
        return arrayString;
    }

    public ArrayStringValue setArrayString(final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayString\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayString = value;

        return this;
    }
}
