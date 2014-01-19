package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDoubles_4 implements
        java.io.Serializable {
    public NullableListOfNullableDoubles_4(
            final java.util.List<Double> nullableListOfNullableDoubles,
            final java.util.List<Double> calculatedNullableListOfNullableDoubles,
            final java.util.List<Double> persistedNullableListOfNullableDoubles) {
        setNullableListOfNullableDoubles(nullableListOfNullableDoubles);
        this.calculatedNullableListOfNullableDoubles = calculatedNullableListOfNullableDoubles;
        this.persistedNullableListOfNullableDoubles = persistedNullableListOfNullableDoubles;
    }

    public NullableListOfNullableDoubles_4() {
        this.calculatedNullableListOfNullableDoubles = null;
        this.persistedNullableListOfNullableDoubles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1641698404;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDoubles_4)) return false;
        final NullableListOfNullableDoubles_4 other = (NullableListOfNullableDoubles_4) obj;

        if (!(this.nullableListOfNullableDoubles == other.nullableListOfNullableDoubles || this.nullableListOfNullableDoubles != null
                && this.nullableListOfNullableDoubles
                        .equals(other.nullableListOfNullableDoubles)))
            return false;
        if (!(this.calculatedNullableListOfNullableDoubles == other.calculatedNullableListOfNullableDoubles || this.calculatedNullableListOfNullableDoubles != null
                && this.calculatedNullableListOfNullableDoubles
                        .equals(other.calculatedNullableListOfNullableDoubles)))
            return false;
        if (!(this.persistedNullableListOfNullableDoubles == other.persistedNullableListOfNullableDoubles || this.persistedNullableListOfNullableDoubles != null
                && this.persistedNullableListOfNullableDoubles
                        .equals(other.persistedNullableListOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDoubles_4("
                + nullableListOfNullableDoubles + ','
                + calculatedNullableListOfNullableDoubles + ','
                + persistedNullableListOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfNullableDoubles;

    @JsonProperty("nullableListOfNullableDoubles")
    public java.util.List<Double> getNullableListOfNullableDoubles() {
        return nullableListOfNullableDoubles;
    }

    public NullableListOfNullableDoubles_4 setNullableListOfNullableDoubles(
            final java.util.List<Double> value) {
        this.nullableListOfNullableDoubles = value;

        return this;
    }

    private final java.util.List<Double> calculatedNullableListOfNullableDoubles;

    public java.util.List<Double> getCalculatedNullableListOfNullableDoubles() {
        return this.calculatedNullableListOfNullableDoubles;
    }

    private final java.util.List<Double> persistedNullableListOfNullableDoubles;

    public java.util.List<Double> getPersistedNullableListOfNullableDoubles() {
        return this.persistedNullableListOfNullableDoubles;
    }
}
