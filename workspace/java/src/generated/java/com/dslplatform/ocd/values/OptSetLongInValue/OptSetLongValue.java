package com.dslplatform.ocd.values.OptSetLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetLongValue implements java.io.Serializable {
    public OptSetLongValue(
            final java.util.Set<Long> optSetLong) {
        setOptSetLong(optSetLong);
    }

    public OptSetLongValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1142710676;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetLongValue)) return false;
        final OptSetLongValue other = (OptSetLongValue) obj;

        if (!(this.optSetLong == other.optSetLong || this.optSetLong != null
                && this.optSetLong.equals(other.optSetLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetLongValue(" + optSetLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> optSetLong;

    @JsonProperty("optSetLong")
    public java.util.Set<Long> getOptSetLong() {
        return optSetLong;
    }

    public OptSetLongValue setOptSetLong(final java.util.Set<Long> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetLong = value;

        return this;
    }
}
