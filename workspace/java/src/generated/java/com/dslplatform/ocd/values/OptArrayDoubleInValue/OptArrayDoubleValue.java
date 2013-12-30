package com.dslplatform.ocd.values.OptArrayDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayDoubleValue implements java.io.Serializable {
    public OptArrayDoubleValue(
            final double[] optArrayDouble) {
        setOptArrayDouble(optArrayDouble);
    }

    public OptArrayDoubleValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1799913090;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayDoubleValue)) return false;
        final OptArrayDoubleValue other = (OptArrayDoubleValue) obj;

        if (!(java.util.Arrays
                .equals(this.optArrayDouble, other.optArrayDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayDoubleValue(" + optArrayDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] optArrayDouble;

    @JsonProperty("optArrayDouble")
    public double[] getOptArrayDouble() {
        return optArrayDouble;
    }

    public OptArrayDoubleValue setOptArrayDouble(final double[] value) {
        this.optArrayDouble = value;

        return this;
    }
}
