package com.dslplatform.ocd.values.OptListLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListLongValue implements java.io.Serializable {
    public OptListLongValue(
            final java.util.List<Long> optListLong) {
        setOptListLong(optListLong);
    }

    public OptListLongValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 992578962;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListLongValue)) return false;
        final OptListLongValue other = (OptListLongValue) obj;

        if (!(this.optListLong == other.optListLong || this.optListLong != null
                && this.optListLong.equals(other.optListLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListLongValue(" + optListLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> optListLong;

    @JsonProperty("optListLong")
    public java.util.List<Long> getOptListLong() {
        return optListLong;
    }

    public OptListLongValue setOptListLong(final java.util.List<Long> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListLong = value;

        return this;
    }
}
