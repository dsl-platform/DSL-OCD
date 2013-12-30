package com.dslplatform.ocd.values.OptListDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListDecimalValue implements java.io.Serializable {
    public OptListDecimalValue(
            final java.util.List<java.math.BigDecimal> optListDecimal) {
        setOptListDecimal(optListDecimal);
    }

    public OptListDecimalValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 674748215;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListDecimalValue)) return false;
        final OptListDecimalValue other = (OptListDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.optListDecimal, other.optListDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListDecimalValue(" + optListDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> optListDecimal;

    @JsonProperty("optListDecimal")
    public java.util.List<java.math.BigDecimal> getOptListDecimal() {
        return optListDecimal;
    }

    public OptListDecimalValue setOptListDecimal(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListDecimal = value;

        return this;
    }
}
