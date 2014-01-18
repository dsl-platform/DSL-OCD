package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDecimals_1 implements java.io.Serializable {
    public OneSetOfNullableDecimals_1(
            final java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimals) {
        setOneSetOfNullableDecimals(oneSetOfNullableDecimals);
    }

    public OneSetOfNullableDecimals_1() {
        this.oneSetOfNullableDecimals = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 439418330;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDecimals_1)) return false;
        final OneSetOfNullableDecimals_1 other = (OneSetOfNullableDecimals_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneSetOfNullableDecimals, other.oneSetOfNullableDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDecimals_1(" + oneSetOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimals;

    @JsonProperty("oneSetOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfNullableDecimals() {
        return oneSetOfNullableDecimals;
    }

    public OneSetOfNullableDecimals_1 setOneSetOfNullableDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDecimals\" cannot be null!");
        this.oneSetOfNullableDecimals = value;

        return this;
    }
}
