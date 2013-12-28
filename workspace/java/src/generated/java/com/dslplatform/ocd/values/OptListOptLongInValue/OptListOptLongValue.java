package com.dslplatform.ocd.values.OptListOptLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptLongValue implements java.io.Serializable {
    public OptListOptLongValue(
            final java.util.List<Long> optListOptLong) {
        setOptListOptLong(optListOptLong);
    }

    public OptListOptLongValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2037163567;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptLongValue)) return false;
        final OptListOptLongValue other = (OptListOptLongValue) obj;

        if (!(this.optListOptLong == other.optListOptLong || this.optListOptLong != null
                && this.optListOptLong.equals(other.optListOptLong)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptLongValue(" + optListOptLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> optListOptLong;

    @JsonProperty("optListOptLong")
    public java.util.List<Long> getOptListOptLong() {
        return optListOptLong;
    }

    public OptListOptLongValue setOptListOptLong(
            final java.util.List<Long> value) {
        this.optListOptLong = value;

        return this;
    }
}
