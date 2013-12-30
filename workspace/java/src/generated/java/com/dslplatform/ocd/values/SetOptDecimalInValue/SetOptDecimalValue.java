package com.dslplatform.ocd.values.SetOptDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptDecimalValue implements java.io.Serializable {
    public SetOptDecimalValue(
            final java.util.Set<java.math.BigDecimal> setOptDecimal) {
        setSetOptDecimal(setOptDecimal);
    }

    public SetOptDecimalValue() {
        this.setOptDecimal = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1607783085;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptDecimalValue)) return false;
        final SetOptDecimalValue other = (SetOptDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.setOptDecimal, other.setOptDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptDecimalValue(" + setOptDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> setOptDecimal;

    @JsonProperty("setOptDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getSetOptDecimal() {
        return setOptDecimal;
    }

    public SetOptDecimalValue setSetOptDecimal(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptDecimal\" cannot be null!");
        this.setOptDecimal = value;

        return this;
    }
}
