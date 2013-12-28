package com.dslplatform.ocd.values.ArrayOptStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptStringValue implements java.io.Serializable {
    public ArrayOptStringValue(
            final String[] arrayOptString) {
        setArrayOptString(arrayOptString);
    }

    public ArrayOptStringValue() {
        this.arrayOptString = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1648435774;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptStringValue)) return false;
        final ArrayOptStringValue other = (ArrayOptStringValue) obj;

        if (!(java.util.Arrays
                .equals(this.arrayOptString, other.arrayOptString)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptStringValue(" + arrayOptString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] arrayOptString;

    @JsonProperty("arrayOptString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getArrayOptString() {
        return arrayOptString;
    }

    public ArrayOptStringValue setArrayOptString(final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptString\" cannot be null!");
        this.arrayOptString = value;

        return this;
    }
}
