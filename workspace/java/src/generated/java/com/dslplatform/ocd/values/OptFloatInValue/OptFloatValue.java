package com.dslplatform.ocd.values.OptFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptFloatValue implements java.io.Serializable {
    public OptFloatValue(
            final Float optFloat) {
        setOptFloat(optFloat);
    }

    public OptFloatValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1514933848;
        result = prime * result
                + (this.optFloat != null ? this.optFloat.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptFloatValue)) return false;
        final OptFloatValue other = (OptFloatValue) obj;

        if (!(this.optFloat == other.optFloat || this.optFloat != null
                && this.optFloat.equals(other.optFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptFloatValue(" + optFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float optFloat;

    @JsonProperty("optFloat")
    public Float getOptFloat() {
        return optFloat;
    }

    public OptFloatValue setOptFloat(final Float value) {
        this.optFloat = value;

        return this;
    }
}
