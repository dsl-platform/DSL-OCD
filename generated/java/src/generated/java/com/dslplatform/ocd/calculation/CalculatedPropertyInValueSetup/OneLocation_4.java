package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneLocation_4 implements java.io.Serializable {
    public OneLocation_4(
            final java.awt.geom.Point2D oneLocation,
            final java.awt.geom.Point2D calculatedOneLocation,
            final java.awt.geom.Point2D persistedOneLocation) {
        setOneLocation(oneLocation);
        this.calculatedOneLocation = calculatedOneLocation;
        this.persistedOneLocation = persistedOneLocation;
    }

    public OneLocation_4() {
        this.oneLocation = new java.awt.geom.Point2D.Float();
        this.calculatedOneLocation = new java.awt.geom.Point2D.Float();
        this.persistedOneLocation = new java.awt.geom.Point2D.Float();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1403519758;
        result = prime * result
                + (this.oneLocation != null ? this.oneLocation.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneLocation != null
                        ? this.calculatedOneLocation.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedOneLocation != null
                        ? this.persistedOneLocation.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneLocation_4)) return false;
        final OneLocation_4 other = (OneLocation_4) obj;

        if (!(this.oneLocation.equals(other.oneLocation))) return false;
        if (!(this.calculatedOneLocation.equals(other.calculatedOneLocation)))
            return false;
        if (!(this.persistedOneLocation.equals(other.persistedOneLocation)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneLocation_4(" + oneLocation + ',' + calculatedOneLocation
                + ',' + persistedOneLocation + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D oneLocation;

    @JsonProperty("oneLocation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D getOneLocation() {
        return oneLocation;
    }

    public OneLocation_4 setOneLocation(final java.awt.geom.Point2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneLocation\" cannot be null!");
        this.oneLocation = value;

        return this;
    }

    private final java.awt.geom.Point2D calculatedOneLocation;

    public java.awt.geom.Point2D getCalculatedOneLocation() {
        return this.calculatedOneLocation;
    }

    private final java.awt.geom.Point2D persistedOneLocation;

    public java.awt.geom.Point2D getPersistedOneLocation() {
        return this.persistedOneLocation;
    }
}
