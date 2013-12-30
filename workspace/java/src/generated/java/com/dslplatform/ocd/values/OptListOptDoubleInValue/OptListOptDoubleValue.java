package com.dslplatform.ocd.values.OptListOptDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptDoubleValue implements java.io.Serializable {
    public OptListOptDoubleValue(
            final java.util.List<Double> optListOptDouble) {
        setOptListOptDouble(optListOptDouble);
    }

    public OptListOptDoubleValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1206763822;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptDoubleValue)) return false;
        final OptListOptDoubleValue other = (OptListOptDoubleValue) obj;

        if (!(this.optListOptDouble == other.optListOptDouble || this.optListOptDouble != null
                && this.optListOptDouble.equals(other.optListOptDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptDoubleValue(" + optListOptDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> optListOptDouble;

    @JsonProperty("optListOptDouble")
    public java.util.List<Double> getOptListOptDouble() {
        return optListOptDouble;
    }

    public OptListOptDoubleValue setOptListOptDouble(
            final java.util.List<Double> value) {
        this.optListOptDouble = value;

        return this;
    }
}
