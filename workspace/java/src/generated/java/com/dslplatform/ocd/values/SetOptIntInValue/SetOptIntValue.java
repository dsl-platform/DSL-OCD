package com.dslplatform.ocd.values.SetOptIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptIntValue implements java.io.Serializable {
    public SetOptIntValue(
            final java.util.Set<Integer> setOptInt) {
        setSetOptInt(setOptInt);
    }

    public SetOptIntValue() {
        this.setOptInt = new java.util.HashSet<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 400968237;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptIntValue)) return false;
        final SetOptIntValue other = (SetOptIntValue) obj;

        if (!(this.setOptInt.equals(other.setOptInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptIntValue(" + setOptInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> setOptInt;

    @JsonProperty("setOptInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Integer> getSetOptInt() {
        return setOptInt;
    }

    public SetOptIntValue setSetOptInt(final java.util.Set<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptInt\" cannot be null!");
        this.setOptInt = value;

        return this;
    }
}
