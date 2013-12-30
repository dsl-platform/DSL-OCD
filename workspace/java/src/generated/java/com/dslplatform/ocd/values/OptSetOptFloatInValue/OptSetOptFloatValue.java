package com.dslplatform.ocd.values.OptSetOptFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptFloatValue implements java.io.Serializable {
    public OptSetOptFloatValue(
            final java.util.Set<Float> optSetOptFloat) {
        setOptSetOptFloat(optSetOptFloat);
    }

    public OptSetOptFloatValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1720645897;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptFloatValue)) return false;
        final OptSetOptFloatValue other = (OptSetOptFloatValue) obj;

        if (!(this.optSetOptFloat == other.optSetOptFloat || this.optSetOptFloat != null
                && this.optSetOptFloat.equals(other.optSetOptFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptFloatValue(" + optSetOptFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> optSetOptFloat;

    @JsonProperty("optSetOptFloat")
    public java.util.Set<Float> getOptSetOptFloat() {
        return optSetOptFloat;
    }

    public OptSetOptFloatValue setOptSetOptFloat(
            final java.util.Set<Float> value) {
        this.optSetOptFloat = value;

        return this;
    }
}
