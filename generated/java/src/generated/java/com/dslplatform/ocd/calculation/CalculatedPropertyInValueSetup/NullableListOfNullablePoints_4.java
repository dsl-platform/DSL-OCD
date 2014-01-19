package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullablePoints_4 implements
        java.io.Serializable {
    public NullableListOfNullablePoints_4(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints,
            final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullablePoints,
            final java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullablePoints) {
        setNullableListOfNullablePoints(nullableListOfNullablePoints);
        this.calculatedNullableListOfNullablePoints = calculatedNullableListOfNullablePoints;
        this.persistedNullableListOfNullablePoints = persistedNullableListOfNullablePoints;
    }

    public NullableListOfNullablePoints_4() {
        this.calculatedNullableListOfNullablePoints = null;
        this.persistedNullableListOfNullablePoints = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2135105087;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullablePoints_4)) return false;
        final NullableListOfNullablePoints_4 other = (NullableListOfNullablePoints_4) obj;

        if (!(this.nullableListOfNullablePoints == other.nullableListOfNullablePoints || this.nullableListOfNullablePoints != null
                && this.nullableListOfNullablePoints
                        .equals(other.nullableListOfNullablePoints)))
            return false;
        if (!(this.calculatedNullableListOfNullablePoints == other.calculatedNullableListOfNullablePoints || this.calculatedNullableListOfNullablePoints != null
                && this.calculatedNullableListOfNullablePoints
                        .equals(other.calculatedNullableListOfNullablePoints)))
            return false;
        if (!(this.persistedNullableListOfNullablePoints == other.persistedNullableListOfNullablePoints || this.persistedNullableListOfNullablePoints != null
                && this.persistedNullableListOfNullablePoints
                        .equals(other.persistedNullableListOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullablePoints_4(" + nullableListOfNullablePoints
                + ',' + calculatedNullableListOfNullablePoints + ','
                + persistedNullableListOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints;

    @JsonProperty("nullableListOfNullablePoints")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullablePoints() {
        return nullableListOfNullablePoints;
    }

    public NullableListOfNullablePoints_4 setNullableListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullablePoints = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfNullablePoints;

    public java.util.List<java.awt.geom.Point2D> getCalculatedNullableListOfNullablePoints() {
        return this.calculatedNullableListOfNullablePoints;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedNullableListOfNullablePoints;

    public java.util.List<java.awt.geom.Point2D> getPersistedNullableListOfNullablePoints() {
        return this.persistedNullableListOfNullablePoints;
    }
}
