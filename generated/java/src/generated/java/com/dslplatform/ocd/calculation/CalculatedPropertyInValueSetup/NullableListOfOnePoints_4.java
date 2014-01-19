package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOnePoints_4 implements java.io.Serializable {
    public NullableListOfOnePoints_4(
            final java.util.List<java.awt.geom.Point2D> nullableListOfOnePoints,
            final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfOnePoints,
            final java.util.List<java.awt.geom.Point2D> persistedNullableListOfOnePoints) {
        setNullableListOfOnePoints(nullableListOfOnePoints);
        this.calculatedNullableListOfOnePoints = calculatedNullableListOfOnePoints;
        this.persistedNullableListOfOnePoints = persistedNullableListOfOnePoints;
    }

    public NullableListOfOnePoints_4() {
        this.calculatedNullableListOfOnePoints = null;
        this.persistedNullableListOfOnePoints = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1605475934;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOnePoints_4)) return false;
        final NullableListOfOnePoints_4 other = (NullableListOfOnePoints_4) obj;

        if (!(this.nullableListOfOnePoints == other.nullableListOfOnePoints || this.nullableListOfOnePoints != null
                && this.nullableListOfOnePoints
                        .equals(other.nullableListOfOnePoints))) return false;
        if (!(this.calculatedNullableListOfOnePoints == other.calculatedNullableListOfOnePoints || this.calculatedNullableListOfOnePoints != null
                && this.calculatedNullableListOfOnePoints
                        .equals(other.calculatedNullableListOfOnePoints)))
            return false;
        if (!(this.persistedNullableListOfOnePoints == other.persistedNullableListOfOnePoints || this.persistedNullableListOfOnePoints != null
                && this.persistedNullableListOfOnePoints
                        .equals(other.persistedNullableListOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOnePoints_4(" + nullableListOfOnePoints + ','
                + calculatedNullableListOfOnePoints + ','
                + persistedNullableListOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfOnePoints;

    @JsonProperty("nullableListOfOnePoints")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfOnePoints() {
        return nullableListOfOnePoints;
    }

    public NullableListOfOnePoints_4 setNullableListOfOnePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOnePoints = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedNullableListOfOnePoints;

    public java.util.List<java.awt.geom.Point2D> getCalculatedNullableListOfOnePoints() {
        return this.calculatedNullableListOfOnePoints;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedNullableListOfOnePoints;

    public java.util.List<java.awt.geom.Point2D> getPersistedNullableListOfOnePoints() {
        return this.persistedNullableListOfOnePoints;
    }
}
