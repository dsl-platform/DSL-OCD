package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableMoniesValue1 implements java.io.Serializable {
    public OneSetOfNullableMoniesValue1(
            final java.util.Set<java.math.BigDecimal> oneSetOfNullableMonies) {
        setOneSetOfNullableMonies(oneSetOfNullableMonies);
    }

    public OneSetOfNullableMoniesValue1() {
        this.oneSetOfNullableMonies = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1192496377;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableMoniesValue1)) return false;
        final OneSetOfNullableMoniesValue1 other = (OneSetOfNullableMoniesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneSetOfNullableMonies, other.oneSetOfNullableMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableMoniesValue1(" + oneSetOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfNullableMonies;

    @JsonProperty("oneSetOfNullableMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfNullableMonies() {
        return oneSetOfNullableMonies;
    }

    public OneSetOfNullableMoniesValue1 setOneSetOfNullableMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableMonies\" cannot be null!");
        this.oneSetOfNullableMonies = value;

        this.oneSetOfNullableMonies = com.dslplatform.ocd.values.Guards
                .setScale(this.oneSetOfNullableMonies, 2);
        return this;
    }
}
