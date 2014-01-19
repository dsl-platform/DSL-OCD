package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableIntegers_5 implements java.io.Serializable {
    public OneSetOfNullableIntegers_5(
            final java.util.Set<Integer> oneSetOfNullableIntegers,
            final java.util.Set<Integer> calculatedOneSetOfNullableIntegers,
            final java.util.Set<Integer> persistedOneSetOfNullableIntegers) {
        setOneSetOfNullableIntegers(oneSetOfNullableIntegers);
        this.calculatedOneSetOfNullableIntegers = calculatedOneSetOfNullableIntegers;
        this.persistedOneSetOfNullableIntegers = persistedOneSetOfNullableIntegers;
    }

    public OneSetOfNullableIntegers_5() {
        this.oneSetOfNullableIntegers = new java.util.HashSet<Integer>();
        this.calculatedOneSetOfNullableIntegers = new java.util.HashSet<Integer>();
        this.persistedOneSetOfNullableIntegers = new java.util.HashSet<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 716638889;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableIntegers_5)) return false;
        final OneSetOfNullableIntegers_5 other = (OneSetOfNullableIntegers_5) obj;

        if (!(this.oneSetOfNullableIntegers
                .equals(other.oneSetOfNullableIntegers))) return false;
        if (!(this.calculatedOneSetOfNullableIntegers
                .equals(other.calculatedOneSetOfNullableIntegers)))
            return false;
        if (!(this.persistedOneSetOfNullableIntegers
                .equals(other.persistedOneSetOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableIntegers_5(" + oneSetOfNullableIntegers + ','
                + calculatedOneSetOfNullableIntegers + ','
                + persistedOneSetOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> oneSetOfNullableIntegers;

    @JsonProperty("oneSetOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Integer> getOneSetOfNullableIntegers() {
        return oneSetOfNullableIntegers;
    }

    public OneSetOfNullableIntegers_5 setOneSetOfNullableIntegers(
            final java.util.Set<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableIntegers\" cannot be null!");
        this.oneSetOfNullableIntegers = value;

        return this;
    }

    private final java.util.Set<Integer> calculatedOneSetOfNullableIntegers;

    public java.util.Set<Integer> getCalculatedOneSetOfNullableIntegers() {
        return this.calculatedOneSetOfNullableIntegers;
    }

    private final java.util.Set<Integer> persistedOneSetOfNullableIntegers;

    public java.util.Set<Integer> getPersistedOneSetOfNullableIntegers() {
        return this.persistedOneSetOfNullableIntegers;
    }
}
