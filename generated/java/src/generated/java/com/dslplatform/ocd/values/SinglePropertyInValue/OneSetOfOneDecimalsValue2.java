package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDecimalsValue2 implements java.io.Serializable {
    public OneSetOfOneDecimalsValue2(
            final java.util.Set<java.math.BigDecimal> oneSetOfOneDecimals) {
        setOneSetOfOneDecimals(oneSetOfOneDecimals);
    }

    public OneSetOfOneDecimalsValue2() {
        this.oneSetOfOneDecimals = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 339466280;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDecimalsValue2)) return false;
        final OneSetOfOneDecimalsValue2 other = (OneSetOfOneDecimalsValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneSetOfOneDecimals, other.oneSetOfOneDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDecimalsValue2(" + oneSetOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfOneDecimals;

    @JsonProperty("oneSetOfOneDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfOneDecimals() {
        return oneSetOfOneDecimals;
    }

    public OneSetOfOneDecimalsValue2 setOneSetOfOneDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDecimals\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneDecimals = value;

        return this;
    }
}
