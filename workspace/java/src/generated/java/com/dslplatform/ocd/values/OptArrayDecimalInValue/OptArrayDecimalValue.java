package com.dslplatform.ocd.values.OptArrayDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayDecimalValue implements java.io.Serializable {
    public OptArrayDecimalValue(
            final java.math.BigDecimal[] optArrayDecimal) {
        setOptArrayDecimal(optArrayDecimal);
    }

    public OptArrayDecimalValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 951701088;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayDecimalValue)) return false;
        final OptArrayDecimalValue other = (OptArrayDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optArrayDecimal, other.optArrayDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayDecimalValue(" + optArrayDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] optArrayDecimal;

    @JsonProperty("optArrayDecimal")
    public java.math.BigDecimal[] getOptArrayDecimal() {
        return optArrayDecimal;
    }

    public OptArrayDecimalValue setOptArrayDecimal(
            final java.math.BigDecimal[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayDecimal = value;

        return this;
    }
}
