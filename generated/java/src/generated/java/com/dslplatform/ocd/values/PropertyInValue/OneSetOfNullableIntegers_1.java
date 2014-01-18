package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableIntegers_1 implements java.io.Serializable {
    public OneSetOfNullableIntegers_1(
            final java.util.Set<Integer> oneSetOfNullableIntegers) {
        setOneSetOfNullableIntegers(oneSetOfNullableIntegers);
    }

    public OneSetOfNullableIntegers_1() {
        this.oneSetOfNullableIntegers = new java.util.HashSet<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1252729579;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableIntegers_1)) return false;
        final OneSetOfNullableIntegers_1 other = (OneSetOfNullableIntegers_1) obj;

        if (!(this.oneSetOfNullableIntegers
                .equals(other.oneSetOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableIntegers_1(" + oneSetOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> oneSetOfNullableIntegers;

    @JsonProperty("oneSetOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Integer> getOneSetOfNullableIntegers() {
        return oneSetOfNullableIntegers;
    }

    public OneSetOfNullableIntegers_1 setOneSetOfNullableIntegers(
            final java.util.Set<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableIntegers\" cannot be null!");
        this.oneSetOfNullableIntegers = value;

        return this;
    }
}
