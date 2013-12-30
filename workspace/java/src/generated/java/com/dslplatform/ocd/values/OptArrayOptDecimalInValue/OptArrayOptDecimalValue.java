package com.dslplatform.ocd.values.OptArrayOptDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptDecimalValue implements java.io.Serializable {
    public OptArrayOptDecimalValue(
            final java.math.BigDecimal[] optArrayOptDecimal) {
        setOptArrayOptDecimal(optArrayOptDecimal);
    }

    public OptArrayOptDecimalValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1327461419;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptDecimalValue)) return false;
        final OptArrayOptDecimalValue other = (OptArrayOptDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optArrayOptDecimal, other.optArrayOptDecimal)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptDecimalValue(" + optArrayOptDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] optArrayOptDecimal;

    @JsonProperty("optArrayOptDecimal")
    public java.math.BigDecimal[] getOptArrayOptDecimal() {
        return optArrayOptDecimal;
    }

    public OptArrayOptDecimalValue setOptArrayOptDecimal(
            final java.math.BigDecimal[] value) {
        this.optArrayOptDecimal = value;

        return this;
    }
}
