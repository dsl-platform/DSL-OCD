package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDoublesValue1 implements
        java.io.Serializable {
    public OneSetOfNullableDoublesValue1(
            final java.util.Set<Double> oneSetOfNullableDoubles) {
        setOneSetOfNullableDoubles(oneSetOfNullableDoubles);
    }

    public OneSetOfNullableDoublesValue1() {
        this.oneSetOfNullableDoubles = new java.util.HashSet<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1713230672;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDoublesValue1)) return false;
        final OneSetOfNullableDoublesValue1 other = (OneSetOfNullableDoublesValue1) obj;

        if (!(this.oneSetOfNullableDoubles
                .equals(other.oneSetOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDoublesValue1(" + oneSetOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> oneSetOfNullableDoubles;

    @JsonProperty("oneSetOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getOneSetOfNullableDoubles() {
        return oneSetOfNullableDoubles;
    }

    public OneSetOfNullableDoublesValue1 setOneSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDoubles\" cannot be null!");
        this.oneSetOfNullableDoubles = value;

        return this;
    }
}
