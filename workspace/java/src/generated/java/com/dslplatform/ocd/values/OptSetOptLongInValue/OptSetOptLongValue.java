package com.dslplatform.ocd.values.OptSetOptLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptLongValue implements java.io.Serializable {
    public OptSetOptLongValue(
            final java.util.Set<Long> optSetOptLong) {
        setOptSetOptLong(optSetOptLong);
    }

    public OptSetOptLongValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 456344457;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptLongValue)) return false;
        final OptSetOptLongValue other = (OptSetOptLongValue) obj;

        if (!(this.optSetOptLong == other.optSetOptLong || this.optSetOptLong != null
                && this.optSetOptLong.equals(other.optSetOptLong)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptLongValue(" + optSetOptLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> optSetOptLong;

    @JsonProperty("optSetOptLong")
    public java.util.Set<Long> getOptSetOptLong() {
        return optSetOptLong;
    }

    public OptSetOptLongValue setOptSetOptLong(final java.util.Set<Long> value) {
        this.optSetOptLong = value;

        return this;
    }
}
