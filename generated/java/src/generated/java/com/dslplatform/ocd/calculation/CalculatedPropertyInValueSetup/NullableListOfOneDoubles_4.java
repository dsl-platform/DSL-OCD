package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDoubles_4 implements java.io.Serializable {
    public NullableListOfOneDoubles_4(
            final java.util.List<Double> nullableListOfOneDoubles,
            final java.util.List<Double> calculatedNullableListOfOneDoubles,
            final java.util.List<Double> persistedNullableListOfOneDoubles) {
        setNullableListOfOneDoubles(nullableListOfOneDoubles);
        this.calculatedNullableListOfOneDoubles = calculatedNullableListOfOneDoubles;
        this.persistedNullableListOfOneDoubles = persistedNullableListOfOneDoubles;
    }

    public NullableListOfOneDoubles_4() {
        this.calculatedNullableListOfOneDoubles = null;
        this.persistedNullableListOfOneDoubles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1140230539;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDoubles_4)) return false;
        final NullableListOfOneDoubles_4 other = (NullableListOfOneDoubles_4) obj;

        if (!(this.nullableListOfOneDoubles == other.nullableListOfOneDoubles || this.nullableListOfOneDoubles != null
                && this.nullableListOfOneDoubles
                        .equals(other.nullableListOfOneDoubles))) return false;
        if (!(this.calculatedNullableListOfOneDoubles == other.calculatedNullableListOfOneDoubles || this.calculatedNullableListOfOneDoubles != null
                && this.calculatedNullableListOfOneDoubles
                        .equals(other.calculatedNullableListOfOneDoubles)))
            return false;
        if (!(this.persistedNullableListOfOneDoubles == other.persistedNullableListOfOneDoubles || this.persistedNullableListOfOneDoubles != null
                && this.persistedNullableListOfOneDoubles
                        .equals(other.persistedNullableListOfOneDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDoubles_4(" + nullableListOfOneDoubles + ','
                + calculatedNullableListOfOneDoubles + ','
                + persistedNullableListOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfOneDoubles;

    @JsonProperty("nullableListOfOneDoubles")
    public java.util.List<Double> getNullableListOfOneDoubles() {
        return nullableListOfOneDoubles;
    }

    public NullableListOfOneDoubles_4 setNullableListOfOneDoubles(
            final java.util.List<Double> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneDoubles = value;

        return this;
    }

    private final java.util.List<Double> calculatedNullableListOfOneDoubles;

    public java.util.List<Double> getCalculatedNullableListOfOneDoubles() {
        return this.calculatedNullableListOfOneDoubles;
    }

    private final java.util.List<Double> persistedNullableListOfOneDoubles;

    public java.util.List<Double> getPersistedNullableListOfOneDoubles() {
        return this.persistedNullableListOfOneDoubles;
    }
}
