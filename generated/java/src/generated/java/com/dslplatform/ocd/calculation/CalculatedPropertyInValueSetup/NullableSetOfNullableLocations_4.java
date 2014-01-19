package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableLocations_4 implements
        java.io.Serializable {
    public NullableSetOfNullableLocations_4(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations,
            final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfNullableLocations,
            final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfNullableLocations) {
        setNullableSetOfNullableLocations(nullableSetOfNullableLocations);
        this.calculatedNullableSetOfNullableLocations = calculatedNullableSetOfNullableLocations;
        this.persistedNullableSetOfNullableLocations = persistedNullableSetOfNullableLocations;
    }

    public NullableSetOfNullableLocations_4() {
        this.calculatedNullableSetOfNullableLocations = null;
        this.persistedNullableSetOfNullableLocations = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1754514148;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableLocations_4)) return false;
        final NullableSetOfNullableLocations_4 other = (NullableSetOfNullableLocations_4) obj;

        if (!(this.nullableSetOfNullableLocations == other.nullableSetOfNullableLocations || this.nullableSetOfNullableLocations != null
                && this.nullableSetOfNullableLocations
                        .equals(other.nullableSetOfNullableLocations)))
            return false;
        if (!(this.calculatedNullableSetOfNullableLocations == other.calculatedNullableSetOfNullableLocations || this.calculatedNullableSetOfNullableLocations != null
                && this.calculatedNullableSetOfNullableLocations
                        .equals(other.calculatedNullableSetOfNullableLocations)))
            return false;
        if (!(this.persistedNullableSetOfNullableLocations == other.persistedNullableSetOfNullableLocations || this.persistedNullableSetOfNullableLocations != null
                && this.persistedNullableSetOfNullableLocations
                        .equals(other.persistedNullableSetOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableLocations_4("
                + nullableSetOfNullableLocations + ','
                + calculatedNullableSetOfNullableLocations + ','
                + persistedNullableSetOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations;

    @JsonProperty("nullableSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullableLocations() {
        return nullableSetOfNullableLocations;
    }

    public NullableSetOfNullableLocations_4 setNullableSetOfNullableLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullableLocations = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfNullableLocations;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedNullableSetOfNullableLocations() {
        return this.calculatedNullableSetOfNullableLocations;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfNullableLocations;

    public java.util.Set<java.awt.geom.Point2D> getPersistedNullableSetOfNullableLocations() {
        return this.persistedNullableSetOfNullableLocations;
    }
}
