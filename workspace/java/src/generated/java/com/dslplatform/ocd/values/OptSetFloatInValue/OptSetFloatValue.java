package com.dslplatform.ocd.values.OptSetFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetFloatValue implements java.io.Serializable {
    public OptSetFloatValue(
            final java.util.Set<Float> optSetFloat) {
        setOptSetFloat(optSetFloat);
    }

    public OptSetFloatValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2058593906;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetFloatValue)) return false;
        final OptSetFloatValue other = (OptSetFloatValue) obj;

        if (!(this.optSetFloat == other.optSetFloat || this.optSetFloat != null
                && this.optSetFloat.equals(other.optSetFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetFloatValue(" + optSetFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> optSetFloat;

    @JsonProperty("optSetFloat")
    public java.util.Set<Float> getOptSetFloat() {
        return optSetFloat;
    }

    public OptSetFloatValue setOptSetFloat(final java.util.Set<Float> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetFloat = value;

        return this;
    }
}
