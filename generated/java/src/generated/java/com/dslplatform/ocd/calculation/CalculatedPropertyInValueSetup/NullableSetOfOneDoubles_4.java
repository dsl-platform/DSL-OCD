package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDoubles_4 implements java.io.Serializable {
    public NullableSetOfOneDoubles_4(
            final java.util.Set<Double> nullableSetOfOneDoubles,
            final java.util.Set<Double> calculatedNullableSetOfOneDoubles,
            final java.util.Set<Double> persistedNullableSetOfOneDoubles) {
        setNullableSetOfOneDoubles(nullableSetOfOneDoubles);
        this.calculatedNullableSetOfOneDoubles = calculatedNullableSetOfOneDoubles;
        this.persistedNullableSetOfOneDoubles = persistedNullableSetOfOneDoubles;
    }

    public NullableSetOfOneDoubles_4() {
        this.calculatedNullableSetOfOneDoubles = null;
        this.persistedNullableSetOfOneDoubles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 959485627;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDoubles_4)) return false;
        final NullableSetOfOneDoubles_4 other = (NullableSetOfOneDoubles_4) obj;

        if (!(this.nullableSetOfOneDoubles == other.nullableSetOfOneDoubles || this.nullableSetOfOneDoubles != null
                && this.nullableSetOfOneDoubles
                        .equals(other.nullableSetOfOneDoubles))) return false;
        if (!(this.calculatedNullableSetOfOneDoubles == other.calculatedNullableSetOfOneDoubles || this.calculatedNullableSetOfOneDoubles != null
                && this.calculatedNullableSetOfOneDoubles
                        .equals(other.calculatedNullableSetOfOneDoubles)))
            return false;
        if (!(this.persistedNullableSetOfOneDoubles == other.persistedNullableSetOfOneDoubles || this.persistedNullableSetOfOneDoubles != null
                && this.persistedNullableSetOfOneDoubles
                        .equals(other.persistedNullableSetOfOneDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDoubles_4(" + nullableSetOfOneDoubles + ','
                + calculatedNullableSetOfOneDoubles + ','
                + persistedNullableSetOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> nullableSetOfOneDoubles;

    @JsonProperty("nullableSetOfOneDoubles")
    public java.util.Set<Double> getNullableSetOfOneDoubles() {
        return nullableSetOfOneDoubles;
    }

    public NullableSetOfOneDoubles_4 setNullableSetOfOneDoubles(
            final java.util.Set<Double> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneDoubles = value;

        return this;
    }

    private final java.util.Set<Double> calculatedNullableSetOfOneDoubles;

    public java.util.Set<Double> getCalculatedNullableSetOfOneDoubles() {
        return this.calculatedNullableSetOfOneDoubles;
    }

    private final java.util.Set<Double> persistedNullableSetOfOneDoubles;

    public java.util.Set<Double> getPersistedNullableSetOfOneDoubles() {
        return this.persistedNullableSetOfOneDoubles;
    }
}
