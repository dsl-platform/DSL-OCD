package com.dslplatform.ocd.values.OptListOptDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptDecimalValue implements java.io.Serializable {
    public OptListOptDecimalValue(
            final java.util.List<java.math.BigDecimal> optListOptDecimal) {
        setOptListOptDecimal(optListOptDecimal);
    }

    public OptListOptDecimalValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 729201392;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptDecimalValue)) return false;
        final OptListOptDecimalValue other = (OptListOptDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optListOptDecimal, other.optListOptDecimal)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptDecimalValue(" + optListOptDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> optListOptDecimal;

    @JsonProperty("optListOptDecimal")
    public java.util.List<java.math.BigDecimal> getOptListOptDecimal() {
        return optListOptDecimal;
    }

    public OptListOptDecimalValue setOptListOptDecimal(
            final java.util.List<java.math.BigDecimal> value) {
        this.optListOptDecimal = value;

        return this;
    }
}
