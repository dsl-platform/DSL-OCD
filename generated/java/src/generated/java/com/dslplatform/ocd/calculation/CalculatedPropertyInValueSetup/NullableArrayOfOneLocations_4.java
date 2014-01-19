package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneLocations_4 implements
        java.io.Serializable {
    public NullableArrayOfOneLocations_4(
            final java.awt.geom.Point2D[] nullableArrayOfOneLocations,
            final java.awt.geom.Point2D[] calculatedNullableArrayOfOneLocations,
            final java.awt.geom.Point2D[] persistedNullableArrayOfOneLocations) {
        setNullableArrayOfOneLocations(nullableArrayOfOneLocations);
        this.calculatedNullableArrayOfOneLocations = calculatedNullableArrayOfOneLocations;
        this.persistedNullableArrayOfOneLocations = persistedNullableArrayOfOneLocations;
    }

    public NullableArrayOfOneLocations_4() {
        this.calculatedNullableArrayOfOneLocations = null;
        this.persistedNullableArrayOfOneLocations = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1094901794;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneLocations_4)) return false;
        final NullableArrayOfOneLocations_4 other = (NullableArrayOfOneLocations_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneLocations,
                other.nullableArrayOfOneLocations))) return false;
        if (!(this.calculatedNullableArrayOfOneLocations == other.calculatedNullableArrayOfOneLocations || this.calculatedNullableArrayOfOneLocations != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneLocations,
                        other.calculatedNullableArrayOfOneLocations)))
            return false;
        if (!(this.persistedNullableArrayOfOneLocations == other.persistedNullableArrayOfOneLocations || this.persistedNullableArrayOfOneLocations != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneLocations,
                        other.persistedNullableArrayOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneLocations_4(" + nullableArrayOfOneLocations
                + ',' + calculatedNullableArrayOfOneLocations + ','
                + persistedNullableArrayOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfOneLocations;

    @JsonProperty("nullableArrayOfOneLocations")
    public java.awt.geom.Point2D[] getNullableArrayOfOneLocations() {
        return nullableArrayOfOneLocations;
    }

    public NullableArrayOfOneLocations_4 setNullableArrayOfOneLocations(
            final java.awt.geom.Point2D[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneLocations = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedNullableArrayOfOneLocations;

    public java.awt.geom.Point2D[] getCalculatedNullableArrayOfOneLocations() {
        return this.calculatedNullableArrayOfOneLocations;
    }

    private final java.awt.geom.Point2D[] persistedNullableArrayOfOneLocations;

    public java.awt.geom.Point2D[] getPersistedNullableArrayOfOneLocations() {
        return this.persistedNullableArrayOfOneLocations;
    }
}
