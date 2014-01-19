package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullablePoint_4 implements java.io.Serializable {
    public NullablePoint_4(
            final java.awt.geom.Point2D nullablePoint,
            final java.awt.geom.Point2D calculatedNullablePoint,
            final java.awt.geom.Point2D persistedNullablePoint) {
        setNullablePoint(nullablePoint);
        this.calculatedNullablePoint = calculatedNullablePoint;
        this.persistedNullablePoint = persistedNullablePoint;
    }

    public NullablePoint_4() {
        this.calculatedNullablePoint = null;
        this.persistedNullablePoint = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2103567980;
        result = prime
                * result
                + (this.nullablePoint != null
                        ? this.nullablePoint.hashCode()
                        : 0);
        result = prime
                * result
                + (this.calculatedNullablePoint != null
                        ? this.calculatedNullablePoint.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullablePoint != null
                        ? this.persistedNullablePoint.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullablePoint_4)) return false;
        final NullablePoint_4 other = (NullablePoint_4) obj;

        if (!(this.nullablePoint == other.nullablePoint || this.nullablePoint != null
                && this.nullablePoint.equals(other.nullablePoint)))
            return false;
        if (!(this.calculatedNullablePoint == other.calculatedNullablePoint || this.calculatedNullablePoint != null
                && this.calculatedNullablePoint
                        .equals(other.calculatedNullablePoint))) return false;
        if (!(this.persistedNullablePoint == other.persistedNullablePoint || this.persistedNullablePoint != null
                && this.persistedNullablePoint
                        .equals(other.persistedNullablePoint))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullablePoint_4(" + nullablePoint + ','
                + calculatedNullablePoint + ',' + persistedNullablePoint + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D nullablePoint;

    @JsonProperty("nullablePoint")
    public java.awt.geom.Point2D getNullablePoint() {
        return nullablePoint;
    }

    public NullablePoint_4 setNullablePoint(final java.awt.geom.Point2D value) {
        this.nullablePoint = value;

        return this;
    }

    private final java.awt.geom.Point2D calculatedNullablePoint;

    public java.awt.geom.Point2D getCalculatedNullablePoint() {
        return this.calculatedNullablePoint;
    }

    private final java.awt.geom.Point2D persistedNullablePoint;

    public java.awt.geom.Point2D getPersistedNullablePoint() {
        return this.persistedNullablePoint;
    }
}
