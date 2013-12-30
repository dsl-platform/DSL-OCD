package com.dslplatform.ocd.values.SetFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetFloatValue implements java.io.Serializable {
    public SetFloatValue(
            final java.util.Set<Float> setFloat) {
        setSetFloat(setFloat);
    }

    public SetFloatValue() {
        this.setFloat = new java.util.HashSet<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 143007165;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetFloatValue)) return false;
        final SetFloatValue other = (SetFloatValue) obj;

        if (!(this.setFloat.equals(other.setFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetFloatValue(" + setFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> setFloat;

    @JsonProperty("setFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Float> getSetFloat() {
        return setFloat;
    }

    public SetFloatValue setSetFloat(final java.util.Set<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setFloat\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setFloat = value;

        return this;
    }
}
