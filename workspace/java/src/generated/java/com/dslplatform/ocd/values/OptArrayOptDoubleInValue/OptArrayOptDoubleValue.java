package com.dslplatform.ocd.values.OptArrayOptDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptDoubleValue implements java.io.Serializable {
    public OptArrayOptDoubleValue(
            final Double[] optArrayOptDouble) {
        setOptArrayOptDouble(optArrayOptDouble);
    }

    public OptArrayOptDoubleValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 481344651;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptDoubleValue)) return false;
        final OptArrayOptDoubleValue other = (OptArrayOptDoubleValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptDouble,
                other.optArrayOptDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptDoubleValue(" + optArrayOptDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] optArrayOptDouble;

    @JsonProperty("optArrayOptDouble")
    public Double[] getOptArrayOptDouble() {
        return optArrayOptDouble;
    }

    public OptArrayOptDoubleValue setOptArrayOptDouble(final Double[] value) {
        this.optArrayOptDouble = value;

        return this;
    }
}
