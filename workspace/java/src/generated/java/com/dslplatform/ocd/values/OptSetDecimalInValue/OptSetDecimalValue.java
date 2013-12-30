package com.dslplatform.ocd.values.OptSetDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetDecimalValue implements java.io.Serializable {
    public OptSetDecimalValue(
            final java.util.Set<java.math.BigDecimal> optSetDecimal) {
        setOptSetDecimal(optSetDecimal);
    }

    public OptSetDecimalValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2024938857;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetDecimalValue)) return false;
        final OptSetDecimalValue other = (OptSetDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optSetDecimal, other.optSetDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetDecimalValue(" + optSetDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> optSetDecimal;

    @JsonProperty("optSetDecimal")
    public java.util.Set<java.math.BigDecimal> getOptSetDecimal() {
        return optSetDecimal;
    }

    public OptSetDecimalValue setOptSetDecimal(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetDecimal = value;

        return this;
    }
}
