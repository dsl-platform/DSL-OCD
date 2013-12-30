package com.dslplatform.ocd.values.OptSetOptDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptDoubleValue implements java.io.Serializable {
    public OptSetOptDoubleValue(
            final java.util.Set<Double> optSetOptDouble) {
        setOptSetOptDouble(optSetOptDouble);
    }

    public OptSetOptDoubleValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 319230172;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptDoubleValue)) return false;
        final OptSetOptDoubleValue other = (OptSetOptDoubleValue) obj;

        if (!(this.optSetOptDouble == other.optSetOptDouble || this.optSetOptDouble != null
                && this.optSetOptDouble.equals(other.optSetOptDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptDoubleValue(" + optSetOptDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> optSetOptDouble;

    @JsonProperty("optSetOptDouble")
    public java.util.Set<Double> getOptSetOptDouble() {
        return optSetOptDouble;
    }

    public OptSetOptDoubleValue setOptSetOptDouble(
            final java.util.Set<Double> value) {
        this.optSetOptDouble = value;

        return this;
    }
}
