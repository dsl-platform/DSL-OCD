package com.dslplatform.ocd.values.OptSetOptDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptDecimalValue implements java.io.Serializable {
    public OptSetOptDecimalValue(
            final java.util.Set<java.math.BigDecimal> optSetOptDecimal) {
        setOptSetOptDecimal(optSetOptDecimal);
    }

    public OptSetOptDecimalValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 948128798;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptDecimalValue)) return false;
        final OptSetOptDecimalValue other = (OptSetOptDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optSetOptDecimal, other.optSetOptDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptDecimalValue(" + optSetOptDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> optSetOptDecimal;

    @JsonProperty("optSetOptDecimal")
    public java.util.Set<java.math.BigDecimal> getOptSetOptDecimal() {
        return optSetOptDecimal;
    }

    public OptSetOptDecimalValue setOptSetOptDecimal(
            final java.util.Set<java.math.BigDecimal> value) {
        this.optSetOptDecimal = value;

        return this;
    }
}
