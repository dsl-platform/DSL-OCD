package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableLocations_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableLocations_4(
            final java.awt.geom.Point2D[] nullableArrayOfNullableLocations,
            final java.awt.geom.Point2D[] calculatedNullableArrayOfNullableLocations,
            final java.awt.geom.Point2D[] persistedNullableArrayOfNullableLocations) {
        setNullableArrayOfNullableLocations(nullableArrayOfNullableLocations);
        this.calculatedNullableArrayOfNullableLocations = calculatedNullableArrayOfNullableLocations;
        this.persistedNullableArrayOfNullableLocations = persistedNullableArrayOfNullableLocations;
    }

    public NullableArrayOfNullableLocations_4() {
        this.calculatedNullableArrayOfNullableLocations = null;
        this.persistedNullableArrayOfNullableLocations = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1758063947;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableLocations_4)) return false;
        final NullableArrayOfNullableLocations_4 other = (NullableArrayOfNullableLocations_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableLocations,
                other.nullableArrayOfNullableLocations))) return false;
        if (!(this.calculatedNullableArrayOfNullableLocations == other.calculatedNullableArrayOfNullableLocations || this.calculatedNullableArrayOfNullableLocations != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableLocations,
                        other.calculatedNullableArrayOfNullableLocations)))
            return false;
        if (!(this.persistedNullableArrayOfNullableLocations == other.persistedNullableArrayOfNullableLocations || this.persistedNullableArrayOfNullableLocations != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableLocations,
                        other.persistedNullableArrayOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableLocations_4("
                + nullableArrayOfNullableLocations + ','
                + calculatedNullableArrayOfNullableLocations + ','
                + persistedNullableArrayOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullableLocations;

    @JsonProperty("nullableArrayOfNullableLocations")
    public java.awt.geom.Point2D[] getNullableArrayOfNullableLocations() {
        return nullableArrayOfNullableLocations;
    }

    public NullableArrayOfNullableLocations_4 setNullableArrayOfNullableLocations(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullableLocations = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedNullableArrayOfNullableLocations;

    public java.awt.geom.Point2D[] getCalculatedNullableArrayOfNullableLocations() {
        return this.calculatedNullableArrayOfNullableLocations;
    }

    private final java.awt.geom.Point2D[] persistedNullableArrayOfNullableLocations;

    public java.awt.geom.Point2D[] getPersistedNullableArrayOfNullableLocations() {
        return this.persistedNullableArrayOfNullableLocations;
    }
}
