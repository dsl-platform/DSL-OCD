package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullablePoints_4 implements
        java.io.Serializable {
    public NullableArrayOfNullablePoints_4(
            final java.awt.geom.Point2D[] nullableArrayOfNullablePoints,
            final java.awt.geom.Point2D[] calculatedNullableArrayOfNullablePoints,
            final java.awt.geom.Point2D[] persistedNullableArrayOfNullablePoints) {
        setNullableArrayOfNullablePoints(nullableArrayOfNullablePoints);
        this.calculatedNullableArrayOfNullablePoints = calculatedNullableArrayOfNullablePoints;
        this.persistedNullableArrayOfNullablePoints = persistedNullableArrayOfNullablePoints;
    }

    public NullableArrayOfNullablePoints_4() {
        this.calculatedNullableArrayOfNullablePoints = null;
        this.persistedNullableArrayOfNullablePoints = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 757934208;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullablePoints_4)) return false;
        final NullableArrayOfNullablePoints_4 other = (NullableArrayOfNullablePoints_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullablePoints,
                other.nullableArrayOfNullablePoints))) return false;
        if (!(this.calculatedNullableArrayOfNullablePoints == other.calculatedNullableArrayOfNullablePoints || this.calculatedNullableArrayOfNullablePoints != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullablePoints,
                        other.calculatedNullableArrayOfNullablePoints)))
            return false;
        if (!(this.persistedNullableArrayOfNullablePoints == other.persistedNullableArrayOfNullablePoints || this.persistedNullableArrayOfNullablePoints != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullablePoints,
                        other.persistedNullableArrayOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullablePoints_4("
                + nullableArrayOfNullablePoints + ','
                + calculatedNullableArrayOfNullablePoints + ','
                + persistedNullableArrayOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullablePoints;

    @JsonProperty("nullableArrayOfNullablePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfNullablePoints() {
        return nullableArrayOfNullablePoints;
    }

    public NullableArrayOfNullablePoints_4 setNullableArrayOfNullablePoints(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullablePoints = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedNullableArrayOfNullablePoints;

    public java.awt.geom.Point2D[] getCalculatedNullableArrayOfNullablePoints() {
        return this.calculatedNullableArrayOfNullablePoints;
    }

    private final java.awt.geom.Point2D[] persistedNullableArrayOfNullablePoints;

    public java.awt.geom.Point2D[] getPersistedNullableArrayOfNullablePoints() {
        return this.persistedNullableArrayOfNullablePoints;
    }
}
