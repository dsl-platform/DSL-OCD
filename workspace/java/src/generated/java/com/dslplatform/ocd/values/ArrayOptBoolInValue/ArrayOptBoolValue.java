package com.dslplatform.ocd.values.ArrayOptBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptBoolValue implements java.io.Serializable {
    public ArrayOptBoolValue(
            final Boolean[] arrayOptBool) {
        setArrayOptBool(arrayOptBool);
    }

    public ArrayOptBoolValue() {
        this.arrayOptBool = new Boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 972688817;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptBoolValue)) return false;
        final ArrayOptBoolValue other = (ArrayOptBoolValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptBool, other.arrayOptBool)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptBoolValue(" + arrayOptBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] arrayOptBool;

    @JsonProperty("arrayOptBool")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean[] getArrayOptBool() {
        return arrayOptBool;
    }

    public ArrayOptBoolValue setArrayOptBool(final Boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptBool\" cannot be null!");
        this.arrayOptBool = value;

        return this;
    }
}
