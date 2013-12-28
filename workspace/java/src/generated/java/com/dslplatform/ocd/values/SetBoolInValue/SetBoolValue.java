package com.dslplatform.ocd.values.SetBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetBoolValue implements java.io.Serializable {
    public SetBoolValue(
            final java.util.Set<Boolean> setBool) {
        setSetBool(setBool);
    }

    public SetBoolValue() {
        this.setBool = new java.util.HashSet<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 380009263;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetBoolValue)) return false;
        final SetBoolValue other = (SetBoolValue) obj;

        if (!(this.setBool.equals(other.setBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetBoolValue(" + setBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> setBool;

    @JsonProperty("setBool")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getSetBool() {
        return setBool;
    }

    public SetBoolValue setSetBool(final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setBool\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setBool = value;

        return this;
    }
}
