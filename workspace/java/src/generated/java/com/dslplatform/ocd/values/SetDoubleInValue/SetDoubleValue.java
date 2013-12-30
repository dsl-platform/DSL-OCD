package com.dslplatform.ocd.values.SetDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetDoubleValue implements java.io.Serializable {
    public SetDoubleValue(
            final java.util.Set<Double> setDouble) {
        setSetDouble(setDouble);
    }

    public SetDoubleValue() {
        this.setDouble = new java.util.HashSet<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 377664984;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetDoubleValue)) return false;
        final SetDoubleValue other = (SetDoubleValue) obj;

        if (!(this.setDouble.equals(other.setDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetDoubleValue(" + setDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> setDouble;

    @JsonProperty("setDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getSetDouble() {
        return setDouble;
    }

    public SetDoubleValue setSetDouble(final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setDouble\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setDouble = value;

        return this;
    }
}
