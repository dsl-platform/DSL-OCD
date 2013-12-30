package com.dslplatform.ocd.values.SetOptFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptFloatValue implements java.io.Serializable {
    public SetOptFloatValue(
            final java.util.Set<Float> setOptFloat) {
        setSetOptFloat(setOptFloat);
    }

    public SetOptFloatValue() {
        this.setOptFloat = new java.util.HashSet<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 165397176;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptFloatValue)) return false;
        final SetOptFloatValue other = (SetOptFloatValue) obj;

        if (!(this.setOptFloat.equals(other.setOptFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptFloatValue(" + setOptFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> setOptFloat;

    @JsonProperty("setOptFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Float> getSetOptFloat() {
        return setOptFloat;
    }

    public SetOptFloatValue setSetOptFloat(final java.util.Set<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptFloat\" cannot be null!");
        this.setOptFloat = value;

        return this;
    }
}
