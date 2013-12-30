package com.dslplatform.ocd.values.OptDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptDecimalValue implements java.io.Serializable {
    public OptDecimalValue(
            final java.math.BigDecimal optDecimal) {
        setOptDecimal(optDecimal);
    }

    public OptDecimalValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1678840305;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptDecimalValue)) return false;
        final OptDecimalValue other = (OptDecimalValue) obj;

        if (!(this.optDecimal == other.optDecimal || this.optDecimal != null
                && this.optDecimal.compareTo(other.optDecimal) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptDecimalValue(" + optDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal optDecimal;

    @JsonProperty("optDecimal")
    public java.math.BigDecimal getOptDecimal() {
        return optDecimal;
    }

    public OptDecimalValue setOptDecimal(final java.math.BigDecimal value) {
        this.optDecimal = value;

        return this;
    }
}
