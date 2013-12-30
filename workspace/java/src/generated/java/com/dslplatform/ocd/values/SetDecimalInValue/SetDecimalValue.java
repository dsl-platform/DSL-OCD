package com.dslplatform.ocd.values.SetDecimalInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetDecimalValue implements java.io.Serializable {
    public SetDecimalValue(
            final java.util.Set<java.math.BigDecimal> setDecimal) {
        setSetDecimal(setDecimal);
    }

    public SetDecimalValue() {
        this.setDecimal = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 513850666;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetDecimalValue)) return false;
        final SetDecimalValue other = (SetDecimalValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.setDecimal, other.setDecimal))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetDecimalValue(" + setDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> setDecimal;

    @JsonProperty("setDecimal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getSetDecimal() {
        return setDecimal;
    }

    public SetDecimalValue setSetDecimal(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setDecimal\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setDecimal = value;

        return this;
    }
}
