package com.dslplatform.ocd.values.OptSetDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetDoubleValue implements java.io.Serializable {
    public OptSetDoubleValue(
            final java.util.Set<Double> optSetDouble) {
        setOptSetDouble(optSetDouble);
    }

    public OptSetDoubleValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1808414977;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetDoubleValue)) return false;
        final OptSetDoubleValue other = (OptSetDoubleValue) obj;

        if (!(this.optSetDouble == other.optSetDouble || this.optSetDouble != null
                && this.optSetDouble.equals(other.optSetDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetDoubleValue(" + optSetDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> optSetDouble;

    @JsonProperty("optSetDouble")
    public java.util.Set<Double> getOptSetDouble() {
        return optSetDouble;
    }

    public OptSetDoubleValue setOptSetDouble(final java.util.Set<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetDouble = value;

        return this;
    }
}
