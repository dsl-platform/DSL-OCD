package com.dslplatform.ocd.values.OptDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptDoubleValue implements java.io.Serializable {
    public OptDoubleValue(
            final Double optDouble) {
        setOptDouble(optDouble);
    }

    public OptDoubleValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1564634133;
        result = prime * result
                + (this.optDouble != null ? this.optDouble.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptDoubleValue)) return false;
        final OptDoubleValue other = (OptDoubleValue) obj;

        if (!(this.optDouble == other.optDouble || this.optDouble != null
                && this.optDouble.equals(other.optDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptDoubleValue(" + optDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double optDouble;

    @JsonProperty("optDouble")
    public Double getOptDouble() {
        return optDouble;
    }

    public OptDoubleValue setOptDouble(final Double value) {
        this.optDouble = value;

        return this;
    }
}
