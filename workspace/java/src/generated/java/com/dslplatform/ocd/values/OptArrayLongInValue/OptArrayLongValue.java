package com.dslplatform.ocd.values.OptArrayLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayLongValue implements java.io.Serializable {
    public OptArrayLongValue(
            final long[] optArrayLong) {
        setOptArrayLong(optArrayLong);
    }

    public OptArrayLongValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1029089377;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayLongValue)) return false;
        final OptArrayLongValue other = (OptArrayLongValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayLong, other.optArrayLong)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayLongValue(" + optArrayLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private long[] optArrayLong;

    @JsonProperty("optArrayLong")
    public long[] getOptArrayLong() {
        return optArrayLong;
    }

    public OptArrayLongValue setOptArrayLong(final long[] value) {
        this.optArrayLong = value;

        return this;
    }
}
