package com.dslplatform.ocd.values.SetLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetLongValue implements java.io.Serializable {
    public SetLongValue(
            final java.util.Set<Long> setLong) {
        setSetLong(setLong);
    }

    public SetLongValue() {
        this.setLong = new java.util.HashSet<Long>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1416836015;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetLongValue)) return false;
        final SetLongValue other = (SetLongValue) obj;

        if (!(this.setLong.equals(other.setLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetLongValue(" + setLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> setLong;

    @JsonProperty("setLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Long> getSetLong() {
        return setLong;
    }

    public SetLongValue setSetLong(final java.util.Set<Long> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setLong\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setLong = value;

        return this;
    }
}
