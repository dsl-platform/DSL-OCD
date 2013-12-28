package com.dslplatform.ocd.values.OptLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptLongValue implements java.io.Serializable {
    public OptLongValue(
            final Long optLong) {
        setOptLong(optLong);
    }

    public OptLongValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 712887894;
        result = prime * result
                + (this.optLong != null ? this.optLong.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptLongValue)) return false;
        final OptLongValue other = (OptLongValue) obj;

        if (!(this.optLong == other.optLong || this.optLong != null
                && this.optLong.equals(other.optLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptLongValue(" + optLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long optLong;

    @JsonProperty("optLong")
    public Long getOptLong() {
        return optLong;
    }

    public OptLongValue setOptLong(final Long value) {
        this.optLong = value;

        return this;
    }
}
