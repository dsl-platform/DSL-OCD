package com.dslplatform.ocd.values.SetIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetIntValue implements java.io.Serializable {
    public SetIntValue(
            final java.util.Set<Integer> setInt) {
        setSetInt(setInt);
    }

    public SetIntValue() {
        this.setInt = new java.util.HashSet<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1600336928;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetIntValue)) return false;
        final SetIntValue other = (SetIntValue) obj;

        if (!(this.setInt.equals(other.setInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetIntValue(" + setInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> setInt;

    @JsonProperty("setInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Integer> getSetInt() {
        return setInt;
    }

    public SetIntValue setSetInt(final java.util.Set<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setInt\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setInt = value;

        return this;
    }
}
