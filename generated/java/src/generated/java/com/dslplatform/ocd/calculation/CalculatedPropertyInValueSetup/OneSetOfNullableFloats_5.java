package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableFloats_5 implements java.io.Serializable {
    public OneSetOfNullableFloats_5(
            final java.util.Set<Float> oneSetOfNullableFloats,
            final java.util.Set<Float> calculatedOneSetOfNullableFloats,
            final java.util.Set<Float> persistedOneSetOfNullableFloats) {
        setOneSetOfNullableFloats(oneSetOfNullableFloats);
        this.calculatedOneSetOfNullableFloats = calculatedOneSetOfNullableFloats;
        this.persistedOneSetOfNullableFloats = persistedOneSetOfNullableFloats;
    }

    public OneSetOfNullableFloats_5() {
        this.oneSetOfNullableFloats = new java.util.HashSet<Float>();
        this.calculatedOneSetOfNullableFloats = new java.util.HashSet<Float>();
        this.persistedOneSetOfNullableFloats = new java.util.HashSet<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 525165475;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableFloats_5)) return false;
        final OneSetOfNullableFloats_5 other = (OneSetOfNullableFloats_5) obj;

        if (!(this.oneSetOfNullableFloats.equals(other.oneSetOfNullableFloats)))
            return false;
        if (!(this.calculatedOneSetOfNullableFloats
                .equals(other.calculatedOneSetOfNullableFloats))) return false;
        if (!(this.persistedOneSetOfNullableFloats
                .equals(other.persistedOneSetOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableFloats_5(" + oneSetOfNullableFloats + ','
                + calculatedOneSetOfNullableFloats + ','
                + persistedOneSetOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> oneSetOfNullableFloats;

    @JsonProperty("oneSetOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Float> getOneSetOfNullableFloats() {
        return oneSetOfNullableFloats;
    }

    public OneSetOfNullableFloats_5 setOneSetOfNullableFloats(
            final java.util.Set<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableFloats\" cannot be null!");
        this.oneSetOfNullableFloats = value;

        return this;
    }

    private final java.util.Set<Float> calculatedOneSetOfNullableFloats;

    public java.util.Set<Float> getCalculatedOneSetOfNullableFloats() {
        return this.calculatedOneSetOfNullableFloats;
    }

    private final java.util.Set<Float> persistedOneSetOfNullableFloats;

    public java.util.Set<Float> getPersistedOneSetOfNullableFloats() {
        return this.persistedOneSetOfNullableFloats;
    }
}
