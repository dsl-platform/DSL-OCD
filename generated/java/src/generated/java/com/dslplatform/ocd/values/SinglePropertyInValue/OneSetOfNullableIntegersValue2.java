package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableIntegersValue2 implements
        java.io.Serializable {
    public OneSetOfNullableIntegersValue2(
            final java.util.Set<Integer> oneSetOfNullableIntegers) {
        setOneSetOfNullableIntegers(oneSetOfNullableIntegers);
    }

    public OneSetOfNullableIntegersValue2() {
        this.oneSetOfNullableIntegers = new java.util.HashSet<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 817507816;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableIntegersValue2)) return false;
        final OneSetOfNullableIntegersValue2 other = (OneSetOfNullableIntegersValue2) obj;

        if (!(this.oneSetOfNullableIntegers
                .equals(other.oneSetOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableIntegersValue2(" + oneSetOfNullableIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> oneSetOfNullableIntegers;

    @JsonProperty("oneSetOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Integer> getOneSetOfNullableIntegers() {
        return oneSetOfNullableIntegers;
    }

    public OneSetOfNullableIntegersValue2 setOneSetOfNullableIntegers(
            final java.util.Set<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableIntegers\" cannot be null!");
        this.oneSetOfNullableIntegers = value;

        return this;
    }
}
