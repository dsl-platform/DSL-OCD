package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDoubles_5 implements java.io.Serializable {
    public OneSetOfNullableDoubles_5(
            final java.util.Set<Double> oneSetOfNullableDoubles,
            final java.util.Set<Double> calculatedOneSetOfNullableDoubles,
            final java.util.Set<Double> persistedOneSetOfNullableDoubles) {
        setOneSetOfNullableDoubles(oneSetOfNullableDoubles);
        this.calculatedOneSetOfNullableDoubles = calculatedOneSetOfNullableDoubles;
        this.persistedOneSetOfNullableDoubles = persistedOneSetOfNullableDoubles;
    }

    public OneSetOfNullableDoubles_5() {
        this.oneSetOfNullableDoubles = new java.util.HashSet<Double>();
        this.calculatedOneSetOfNullableDoubles = new java.util.HashSet<Double>();
        this.persistedOneSetOfNullableDoubles = new java.util.HashSet<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 981343840;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDoubles_5)) return false;
        final OneSetOfNullableDoubles_5 other = (OneSetOfNullableDoubles_5) obj;

        if (!(this.oneSetOfNullableDoubles
                .equals(other.oneSetOfNullableDoubles))) return false;
        if (!(this.calculatedOneSetOfNullableDoubles
                .equals(other.calculatedOneSetOfNullableDoubles)))
            return false;
        if (!(this.persistedOneSetOfNullableDoubles
                .equals(other.persistedOneSetOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDoubles_5(" + oneSetOfNullableDoubles + ','
                + calculatedOneSetOfNullableDoubles + ','
                + persistedOneSetOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> oneSetOfNullableDoubles;

    @JsonProperty("oneSetOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Double> getOneSetOfNullableDoubles() {
        return oneSetOfNullableDoubles;
    }

    public OneSetOfNullableDoubles_5 setOneSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDoubles\" cannot be null!");
        this.oneSetOfNullableDoubles = value;

        return this;
    }

    private final java.util.Set<Double> calculatedOneSetOfNullableDoubles;

    public java.util.Set<Double> getCalculatedOneSetOfNullableDoubles() {
        return this.calculatedOneSetOfNullableDoubles;
    }

    private final java.util.Set<Double> persistedOneSetOfNullableDoubles;

    public java.util.Set<Double> getPersistedOneSetOfNullableDoubles() {
        return this.persistedOneSetOfNullableDoubles;
    }
}
