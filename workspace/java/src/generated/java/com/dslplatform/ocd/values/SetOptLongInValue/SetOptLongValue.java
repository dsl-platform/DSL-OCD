package com.dslplatform.ocd.values.SetOptLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptLongValue implements java.io.Serializable {
    public SetOptLongValue(
            final java.util.Set<Long> setOptLong) {
        setSetOptLong(setOptLong);
    }

    public SetOptLongValue() {
        this.setOptLong = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 847759314;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptLongValue)) return false;
        final SetOptLongValue other = (SetOptLongValue) obj;

        if (!(this.setOptLong.equals(other.setOptLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptLongValue(" + setOptLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> setOptLong;

    @JsonProperty("setOptLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getSetOptLong() {
        return setOptLong;
    }

    public SetOptLongValue setSetOptLong(final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptLong\" cannot be null!");
        this.setOptLong = value;

        return this;
    }
}
