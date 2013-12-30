package com.dslplatform.ocd.values.SetOptDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptDoubleValue implements java.io.Serializable {
    public SetOptDoubleValue(
            final java.util.Set<Double> setOptDouble) {
        setSetOptDouble(setOptDouble);
    }

    public SetOptDoubleValue() {
        this.setOptDouble = new java.util.HashSet<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1752572909;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptDoubleValue)) return false;
        final SetOptDoubleValue other = (SetOptDoubleValue) obj;

        if (!(this.setOptDouble.equals(other.setOptDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptDoubleValue(" + setOptDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> setOptDouble;

    @JsonProperty("setOptDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getSetOptDouble() {
        return setOptDouble;
    }

    public SetOptDoubleValue setSetOptDouble(final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptDouble\" cannot be null!");
        this.setOptDouble = value;

        return this;
    }
}
