package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOnePoints_4 implements java.io.Serializable {
    public NullableSetOfOnePoints_4(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints,
            final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfOnePoints,
            final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfOnePoints) {
        setNullableSetOfOnePoints(nullableSetOfOnePoints);
        this.calculatedNullableSetOfOnePoints = calculatedNullableSetOfOnePoints;
        this.persistedNullableSetOfOnePoints = persistedNullableSetOfOnePoints;
    }

    public NullableSetOfOnePoints_4() {
        this.calculatedNullableSetOfOnePoints = null;
        this.persistedNullableSetOfOnePoints = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 132946920;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOnePoints_4)) return false;
        final NullableSetOfOnePoints_4 other = (NullableSetOfOnePoints_4) obj;

        if (!(this.nullableSetOfOnePoints == other.nullableSetOfOnePoints || this.nullableSetOfOnePoints != null
                && this.nullableSetOfOnePoints
                        .equals(other.nullableSetOfOnePoints))) return false;
        if (!(this.calculatedNullableSetOfOnePoints == other.calculatedNullableSetOfOnePoints || this.calculatedNullableSetOfOnePoints != null
                && this.calculatedNullableSetOfOnePoints
                        .equals(other.calculatedNullableSetOfOnePoints)))
            return false;
        if (!(this.persistedNullableSetOfOnePoints == other.persistedNullableSetOfOnePoints || this.persistedNullableSetOfOnePoints != null
                && this.persistedNullableSetOfOnePoints
                        .equals(other.persistedNullableSetOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOnePoints_4(" + nullableSetOfOnePoints + ','
                + calculatedNullableSetOfOnePoints + ','
                + persistedNullableSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints;

    @JsonProperty("nullableSetOfOnePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfOnePoints() {
        return nullableSetOfOnePoints;
    }

    public NullableSetOfOnePoints_4 setNullableSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOnePoints = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedNullableSetOfOnePoints;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedNullableSetOfOnePoints() {
        return this.calculatedNullableSetOfOnePoints;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedNullableSetOfOnePoints;

    public java.util.Set<java.awt.geom.Point2D> getPersistedNullableSetOfOnePoints() {
        return this.persistedNullableSetOfOnePoints;
    }
}
