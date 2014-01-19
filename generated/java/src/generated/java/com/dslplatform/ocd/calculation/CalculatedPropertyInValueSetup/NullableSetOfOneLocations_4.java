package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneLocations_4 implements java.io.Serializable {
    public NullableSetOfOneLocations_4(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfOneLocations,
            final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfOneLocations,
            final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfOneLocations) {
        setNullableSetOfOneLocations(nullableSetOfOneLocations);
        this.calculatedNullableSetOfOneLocations = calculatedNullableSetOfOneLocations;
        this.persistedNullableSetOfOneLocations = persistedNullableSetOfOneLocations;
    }

    public NullableSetOfOneLocations_4() {
        this.calculatedNullableSetOfOneLocations = null;
        this.persistedNullableSetOfOneLocations = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2124470551;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneLocations_4)) return false;
        final NullableSetOfOneLocations_4 other = (NullableSetOfOneLocations_4) obj;

        if (!(this.nullableSetOfOneLocations == other.nullableSetOfOneLocations || this.nullableSetOfOneLocations != null
                && this.nullableSetOfOneLocations
                        .equals(other.nullableSetOfOneLocations)))
            return false;
        if (!(this.calculatedNullableSetOfOneLocations == other.calculatedNullableSetOfOneLocations || this.calculatedNullableSetOfOneLocations != null
                && this.calculatedNullableSetOfOneLocations
                        .equals(other.calculatedNullableSetOfOneLocations)))
            return false;
        if (!(this.persistedNullableSetOfOneLocations == other.persistedNullableSetOfOneLocations || this.persistedNullableSetOfOneLocations != null
                && this.persistedNullableSetOfOneLocations
                        .equals(other.persistedNullableSetOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneLocations_4(" + nullableSetOfOneLocations + ','
                + calculatedNullableSetOfOneLocations + ','
                + persistedNullableSetOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfOneLocations;

    @JsonProperty("nullableSetOfOneLocations")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfOneLocations() {
        return nullableSetOfOneLocations;
    }

    public NullableSetOfOneLocations_4 setNullableSetOfOneLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneLocations = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfOneLocations;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedNullableSetOfOneLocations() {
        return this.calculatedNullableSetOfOneLocations;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfOneLocations;

    public java.util.Set<java.awt.geom.Point2D> getPersistedNullableSetOfOneLocations() {
        return this.persistedNullableSetOfOneLocations;
    }
}
