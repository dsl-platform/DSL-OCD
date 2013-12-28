package com.dslplatform.ocd.values.ArrayBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayBoolValue implements java.io.Serializable {
    public ArrayBoolValue(
            final boolean[] arrayBool) {
        setArrayBool(arrayBool);
    }

    public ArrayBoolValue() {
        this.arrayBool = new boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 868601780;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayBoolValue)) return false;
        final ArrayBoolValue other = (ArrayBoolValue) obj;

        if (!(java.util.Arrays.equals(this.arrayBool, other.arrayBool)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayBoolValue(" + arrayBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] arrayBool;

    @JsonProperty("arrayBool")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean[] getArrayBool() {
        return arrayBool;
    }

    public ArrayBoolValue setArrayBool(final boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayBool\" cannot be null!");
        this.arrayBool = value;

        return this;
    }
}
