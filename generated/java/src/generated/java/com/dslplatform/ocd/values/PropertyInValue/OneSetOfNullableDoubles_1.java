package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDoubles_1 implements java.io.Serializable {
    public OneSetOfNullableDoubles_1(
            final java.util.Set<Double> oneSetOfNullableDoubles) {
        setOneSetOfNullableDoubles(oneSetOfNullableDoubles);
    }

    public OneSetOfNullableDoubles_1() {
        this.oneSetOfNullableDoubles = new java.util.HashSet<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 981343836;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDoubles_1)) return false;
        final OneSetOfNullableDoubles_1 other = (OneSetOfNullableDoubles_1) obj;

        if (!(this.oneSetOfNullableDoubles
                .equals(other.oneSetOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDoubles_1(" + oneSetOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> oneSetOfNullableDoubles;

    @JsonProperty("oneSetOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getOneSetOfNullableDoubles() {
        return oneSetOfNullableDoubles;
    }

    public OneSetOfNullableDoubles_1 setOneSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDoubles\" cannot be null!");
        this.oneSetOfNullableDoubles = value;

        return this;
    }
}
