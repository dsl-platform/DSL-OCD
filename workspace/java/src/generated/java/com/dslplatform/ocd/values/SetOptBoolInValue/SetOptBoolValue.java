package com.dslplatform.ocd.values.SetOptBoolInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptBoolValue implements java.io.Serializable {
    public SetOptBoolValue(
            final java.util.Set<Boolean> setOptBool) {
        setSetOptBool(setOptBool);
    }

    public SetOptBoolValue() {
        this.setOptBool = new java.util.HashSet<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2054465252;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptBoolValue)) return false;
        final SetOptBoolValue other = (SetOptBoolValue) obj;

        if (!(this.setOptBool.equals(other.setOptBool))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptBoolValue(" + setOptBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> setOptBool;

    @JsonProperty("setOptBool")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getSetOptBool() {
        return setOptBool;
    }

    public SetOptBoolValue setSetOptBool(final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptBool\" cannot be null!");
        this.setOptBool = value;

        return this;
    }
}
