package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDecimalsValue1 implements
        java.io.Serializable {
    public OneSetOfNullableDecimalsValue1(
            final java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimals) {
        setOneSetOfNullableDecimals(oneSetOfNullableDecimals);
    }

    public OneSetOfNullableDecimalsValue1() {
        this.oneSetOfNullableDecimals = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 378313666;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDecimalsValue1)) return false;
        final OneSetOfNullableDecimalsValue1 other = (OneSetOfNullableDecimalsValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneSetOfNullableDecimals, other.oneSetOfNullableDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDecimalsValue1(" + oneSetOfNullableDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimals;

    @JsonProperty("oneSetOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfNullableDecimals() {
        return oneSetOfNullableDecimals;
    }

    public OneSetOfNullableDecimalsValue1 setOneSetOfNullableDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDecimals\" cannot be null!");
        this.oneSetOfNullableDecimals = value;

        return this;
    }
}
