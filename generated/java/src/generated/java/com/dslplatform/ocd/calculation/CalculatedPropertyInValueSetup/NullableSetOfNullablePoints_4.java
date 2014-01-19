package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullablePoints_4 implements
        java.io.Serializable {
    public NullableSetOfNullablePoints_4(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints,
            final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfNullablePoints,
            final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfNullablePoints) {
        setNullableSetOfNullablePoints(nullableSetOfNullablePoints);
        this.calculatedNullableSetOfNullablePoints = calculatedNullableSetOfNullablePoints;
        this.persistedNullableSetOfNullablePoints = persistedNullableSetOfNullablePoints;
    }

    public NullableSetOfNullablePoints_4() {
        this.calculatedNullableSetOfNullablePoints = null;
        this.persistedNullableSetOfNullablePoints = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1428639439;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullablePoints_4)) return false;
        final NullableSetOfNullablePoints_4 other = (NullableSetOfNullablePoints_4) obj;

        if (!(this.nullableSetOfNullablePoints == other.nullableSetOfNullablePoints || this.nullableSetOfNullablePoints != null
                && this.nullableSetOfNullablePoints
                        .equals(other.nullableSetOfNullablePoints)))
            return false;
        if (!(this.calculatedNullableSetOfNullablePoints == other.calculatedNullableSetOfNullablePoints || this.calculatedNullableSetOfNullablePoints != null
                && this.calculatedNullableSetOfNullablePoints
                        .equals(other.calculatedNullableSetOfNullablePoints)))
            return false;
        if (!(this.persistedNullableSetOfNullablePoints == other.persistedNullableSetOfNullablePoints || this.persistedNullableSetOfNullablePoints != null
                && this.persistedNullableSetOfNullablePoints
                        .equals(other.persistedNullableSetOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullablePoints_4(" + nullableSetOfNullablePoints
                + ',' + calculatedNullableSetOfNullablePoints + ','
                + persistedNullableSetOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints;

    @JsonProperty("nullableSetOfNullablePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullablePoints() {
        return nullableSetOfNullablePoints;
    }

    public NullableSetOfNullablePoints_4 setNullableSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullablePoints = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfNullablePoints;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedNullableSetOfNullablePoints() {
        return this.calculatedNullableSetOfNullablePoints;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfNullablePoints;

    public java.util.Set<java.awt.geom.Point2D> getPersistedNullableSetOfNullablePoints() {
        return this.persistedNullableSetOfNullablePoints;
    }
}
