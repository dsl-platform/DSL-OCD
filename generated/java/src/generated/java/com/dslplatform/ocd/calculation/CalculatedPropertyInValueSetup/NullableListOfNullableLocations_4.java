package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableLocations_4 implements
        java.io.Serializable {
    public NullableListOfNullableLocations_4(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations,
            final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullableLocations,
            final java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullableLocations) {
        setNullableListOfNullableLocations(nullableListOfNullableLocations);
        this.calculatedNullableListOfNullableLocations = calculatedNullableListOfNullableLocations;
        this.persistedNullableListOfNullableLocations = persistedNullableListOfNullableLocations;
    }

    public NullableListOfNullableLocations_4() {
        this.calculatedNullableListOfNullableLocations = null;
        this.persistedNullableListOfNullableLocations = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1873050482;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableLocations_4)) return false;
        final NullableListOfNullableLocations_4 other = (NullableListOfNullableLocations_4) obj;

        if (!(this.nullableListOfNullableLocations == other.nullableListOfNullableLocations || this.nullableListOfNullableLocations != null
                && this.nullableListOfNullableLocations
                        .equals(other.nullableListOfNullableLocations)))
            return false;
        if (!(this.calculatedNullableListOfNullableLocations == other.calculatedNullableListOfNullableLocations || this.calculatedNullableListOfNullableLocations != null
                && this.calculatedNullableListOfNullableLocations
                        .equals(other.calculatedNullableListOfNullableLocations)))
            return false;
        if (!(this.persistedNullableListOfNullableLocations == other.persistedNullableListOfNullableLocations || this.persistedNullableListOfNullableLocations != null
                && this.persistedNullableListOfNullableLocations
                        .equals(other.persistedNullableListOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableLocations_4("
                + nullableListOfNullableLocations + ','
                + calculatedNullableListOfNullableLocations + ','
                + persistedNullableListOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations;

    @JsonProperty("nullableListOfNullableLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullableLocations() {
        return nullableListOfNullableLocations;
    }

    public NullableListOfNullableLocations_4 setNullableListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullableLocations = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullableLocations;

    public java.util.List<java.awt.geom.Point2D> getCalculatedNullableListOfNullableLocations() {
        return this.calculatedNullableListOfNullableLocations;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullableLocations;

    public java.util.List<java.awt.geom.Point2D> getPersistedNullableListOfNullableLocations() {
        return this.persistedNullableListOfNullableLocations;
    }
}
