package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDoubles_4 implements
        java.io.Serializable {
    public NullableSetOfNullableDoubles_4(
            final java.util.Set<Double> nullableSetOfNullableDoubles,
            final java.util.Set<Double> calculatedNullableSetOfNullableDoubles,
            final java.util.Set<Double> persistedNullableSetOfNullableDoubles) {
        setNullableSetOfNullableDoubles(nullableSetOfNullableDoubles);
        this.calculatedNullableSetOfNullableDoubles = calculatedNullableSetOfNullableDoubles;
        this.persistedNullableSetOfNullableDoubles = persistedNullableSetOfNullableDoubles;
    }

    public NullableSetOfNullableDoubles_4() {
        this.calculatedNullableSetOfNullableDoubles = null;
        this.persistedNullableSetOfNullableDoubles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 927511414;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDoubles_4)) return false;
        final NullableSetOfNullableDoubles_4 other = (NullableSetOfNullableDoubles_4) obj;

        if (!(this.nullableSetOfNullableDoubles == other.nullableSetOfNullableDoubles || this.nullableSetOfNullableDoubles != null
                && this.nullableSetOfNullableDoubles
                        .equals(other.nullableSetOfNullableDoubles)))
            return false;
        if (!(this.calculatedNullableSetOfNullableDoubles == other.calculatedNullableSetOfNullableDoubles || this.calculatedNullableSetOfNullableDoubles != null
                && this.calculatedNullableSetOfNullableDoubles
                        .equals(other.calculatedNullableSetOfNullableDoubles)))
            return false;
        if (!(this.persistedNullableSetOfNullableDoubles == other.persistedNullableSetOfNullableDoubles || this.persistedNullableSetOfNullableDoubles != null
                && this.persistedNullableSetOfNullableDoubles
                        .equals(other.persistedNullableSetOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDoubles_4(" + nullableSetOfNullableDoubles
                + ',' + calculatedNullableSetOfNullableDoubles + ','
                + persistedNullableSetOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> nullableSetOfNullableDoubles;

    @JsonProperty("nullableSetOfNullableDoubles")
    public java.util.Set<Double> getNullableSetOfNullableDoubles() {
        return nullableSetOfNullableDoubles;
    }

    public NullableSetOfNullableDoubles_4 setNullableSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        this.nullableSetOfNullableDoubles = value;

        return this;
    }

    private final java.util.Set<Double> calculatedNullableSetOfNullableDoubles;

    public java.util.Set<Double> getCalculatedNullableSetOfNullableDoubles() {
        return this.calculatedNullableSetOfNullableDoubles;
    }

    private final java.util.Set<Double> persistedNullableSetOfNullableDoubles;

    public java.util.Set<Double> getPersistedNullableSetOfNullableDoubles() {
        return this.persistedNullableSetOfNullableDoubles;
    }
}
