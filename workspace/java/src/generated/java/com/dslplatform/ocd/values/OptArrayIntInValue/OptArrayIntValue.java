package com.dslplatform.ocd.values.OptArrayIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayIntValue implements java.io.Serializable {
    public OptArrayIntValue(
            final int[] optArrayInt) {
        setOptArrayInt(optArrayInt);
    }

    public OptArrayIntValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2110788118;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayIntValue)) return false;
        final OptArrayIntValue other = (OptArrayIntValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayInt, other.optArrayInt)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayIntValue(" + optArrayInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] optArrayInt;

    @JsonProperty("optArrayInt")
    public int[] getOptArrayInt() {
        return optArrayInt;
    }

    public OptArrayIntValue setOptArrayInt(final int[] value) {
        this.optArrayInt = value;

        return this;
    }
}
