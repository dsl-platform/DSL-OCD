package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOnePoints_4 implements java.io.Serializable {
    public NullableArrayOfOnePoints_4(
            final java.awt.geom.Point2D[] nullableArrayOfOnePoints,
            final java.awt.geom.Point2D[] calculatedNullableArrayOfOnePoints,
            final java.awt.geom.Point2D[] persistedNullableArrayOfOnePoints) {
        setNullableArrayOfOnePoints(nullableArrayOfOnePoints);
        this.calculatedNullableArrayOfOnePoints = calculatedNullableArrayOfOnePoints;
        this.persistedNullableArrayOfOnePoints = persistedNullableArrayOfOnePoints;
    }

    public NullableArrayOfOnePoints_4() {
        this.calculatedNullableArrayOfOnePoints = null;
        this.persistedNullableArrayOfOnePoints = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1052893777;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOnePoints_4)) return false;
        final NullableArrayOfOnePoints_4 other = (NullableArrayOfOnePoints_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOnePoints,
                other.nullableArrayOfOnePoints))) return false;
        if (!(this.calculatedNullableArrayOfOnePoints == other.calculatedNullableArrayOfOnePoints || this.calculatedNullableArrayOfOnePoints != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOnePoints,
                        other.calculatedNullableArrayOfOnePoints)))
            return false;
        if (!(this.persistedNullableArrayOfOnePoints == other.persistedNullableArrayOfOnePoints || this.persistedNullableArrayOfOnePoints != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOnePoints,
                        other.persistedNullableArrayOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOnePoints_4(" + nullableArrayOfOnePoints + ','
                + calculatedNullableArrayOfOnePoints + ','
                + persistedNullableArrayOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfOnePoints;

    @JsonProperty("nullableArrayOfOnePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfOnePoints() {
        return nullableArrayOfOnePoints;
    }

    public NullableArrayOfOnePoints_4 setNullableArrayOfOnePoints(
            final java.awt.geom.Point2D[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOnePoints = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedNullableArrayOfOnePoints;

    public java.awt.geom.Point2D[] getCalculatedNullableArrayOfOnePoints() {
        return this.calculatedNullableArrayOfOnePoints;
    }

    private final java.awt.geom.Point2D[] persistedNullableArrayOfOnePoints;

    public java.awt.geom.Point2D[] getPersistedNullableArrayOfOnePoints() {
        return this.persistedNullableArrayOfOnePoints;
    }
}
