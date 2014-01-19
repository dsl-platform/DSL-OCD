package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLocations_4 implements java.io.Serializable {
    public NullableListOfOneLocations_4(
            final java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations,
            final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfOneLocations,
            final java.util.List<java.awt.geom.Point2D> persistedNullableListOfOneLocations) {
        setNullableListOfOneLocations(nullableListOfOneLocations);
        this.calculatedNullableListOfOneLocations = calculatedNullableListOfOneLocations;
        this.persistedNullableListOfOneLocations = persistedNullableListOfOneLocations;
    }

    public NullableListOfOneLocations_4() {
        this.calculatedNullableListOfOneLocations = null;
        this.persistedNullableListOfOneLocations = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 257171735;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLocations_4)) return false;
        final NullableListOfOneLocations_4 other = (NullableListOfOneLocations_4) obj;

        if (!(this.nullableListOfOneLocations == other.nullableListOfOneLocations || this.nullableListOfOneLocations != null
                && this.nullableListOfOneLocations
                        .equals(other.nullableListOfOneLocations)))
            return false;
        if (!(this.calculatedNullableListOfOneLocations == other.calculatedNullableListOfOneLocations || this.calculatedNullableListOfOneLocations != null
                && this.calculatedNullableListOfOneLocations
                        .equals(other.calculatedNullableListOfOneLocations)))
            return false;
        if (!(this.persistedNullableListOfOneLocations == other.persistedNullableListOfOneLocations || this.persistedNullableListOfOneLocations != null
                && this.persistedNullableListOfOneLocations
                        .equals(other.persistedNullableListOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLocations_4(" + nullableListOfOneLocations
                + ',' + calculatedNullableListOfOneLocations + ','
                + persistedNullableListOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations;

    @JsonProperty("nullableListOfOneLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfOneLocations() {
        return nullableListOfOneLocations;
    }

    public NullableListOfOneLocations_4 setNullableListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneLocations = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfOneLocations;

    public java.util.List<java.awt.geom.Point2D> getCalculatedNullableListOfOneLocations() {
        return this.calculatedNullableListOfOneLocations;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedNullableListOfOneLocations;

    public java.util.List<java.awt.geom.Point2D> getPersistedNullableListOfOneLocations() {
        return this.persistedNullableListOfOneLocations;
    }
}
