package com.dslplatform.ocd.values.OptArrayOptLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptLongValue implements java.io.Serializable {
    public OptArrayOptLongValue(
            final Long[] optArrayOptLong) {
        setOptArrayOptLong(optArrayOptLong);
    }

    public OptArrayOptLongValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2038464252;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptLongValue)) return false;
        final OptArrayOptLongValue other = (OptArrayOptLongValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptLong,
                other.optArrayOptLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptLongValue(" + optArrayOptLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] optArrayOptLong;

    @JsonProperty("optArrayOptLong")
    public Long[] getOptArrayOptLong() {
        return optArrayOptLong;
    }

    public OptArrayOptLongValue setOptArrayOptLong(final Long[] value) {
        this.optArrayOptLong = value;

        return this;
    }
}
