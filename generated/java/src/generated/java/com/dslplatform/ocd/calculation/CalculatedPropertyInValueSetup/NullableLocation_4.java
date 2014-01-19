package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableLocation_4 implements java.io.Serializable {
    public NullableLocation_4(
            final java.awt.geom.Point2D nullableLocation,
            final java.awt.geom.Point2D calculatedNullableLocation,
            final java.awt.geom.Point2D persistedNullableLocation) {
        setNullableLocation(nullableLocation);
        this.calculatedNullableLocation = calculatedNullableLocation;
        this.persistedNullableLocation = persistedNullableLocation;
    }

    public NullableLocation_4() {
        this.calculatedNullableLocation = null;
        this.persistedNullableLocation = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1366917951;
        result = prime
                * result
                + (this.nullableLocation != null ? this.nullableLocation
                        .hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableLocation != null
                        ? this.calculatedNullableLocation.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableLocation != null
                        ? this.persistedNullableLocation.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableLocation_4)) return false;
        final NullableLocation_4 other = (NullableLocation_4) obj;

        if (!(this.nullableLocation == other.nullableLocation || this.nullableLocation != null
                && this.nullableLocation.equals(other.nullableLocation)))
            return false;
        if (!(this.calculatedNullableLocation == other.calculatedNullableLocation || this.calculatedNullableLocation != null
                && this.calculatedNullableLocation
                        .equals(other.calculatedNullableLocation)))
            return false;
        if (!(this.persistedNullableLocation == other.persistedNullableLocation || this.persistedNullableLocation != null
                && this.persistedNullableLocation
                        .equals(other.persistedNullableLocation)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLocation_4(" + nullableLocation + ','
                + calculatedNullableLocation + ',' + persistedNullableLocation
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D nullableLocation;

    @JsonProperty("nullableLocation")
    public java.awt.geom.Point2D getNullableLocation() {
        return nullableLocation;
    }

    public NullableLocation_4 setNullableLocation(
            final java.awt.geom.Point2D value) {
        this.nullableLocation = value;

        return this;
    }

    private final java.awt.geom.Point2D calculatedNullableLocation;

    public java.awt.geom.Point2D getCalculatedNullableLocation() {
        return this.calculatedNullableLocation;
    }

    private final java.awt.geom.Point2D persistedNullableLocation;

    public java.awt.geom.Point2D getPersistedNullableLocation() {
        return this.persistedNullableLocation;
    }
}
