package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullablePoints_4 implements java.io.Serializable {
    public OneSetOfNullablePoints_4(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints,
            final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullablePoints,
            final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullablePoints) {
        setOneSetOfNullablePoints(oneSetOfNullablePoints);
        this.calculatedOneSetOfNullablePoints = calculatedOneSetOfNullablePoints;
        this.persistedOneSetOfNullablePoints = persistedOneSetOfNullablePoints;
    }

    public OneSetOfNullablePoints_4() {
        this.oneSetOfNullablePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.calculatedOneSetOfNullablePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.persistedOneSetOfNullablePoints = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1718826894;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullablePoints_4)) return false;
        final OneSetOfNullablePoints_4 other = (OneSetOfNullablePoints_4) obj;

        if (!(this.oneSetOfNullablePoints.equals(other.oneSetOfNullablePoints)))
            return false;
        if (!(this.calculatedOneSetOfNullablePoints
                .equals(other.calculatedOneSetOfNullablePoints))) return false;
        if (!(this.persistedOneSetOfNullablePoints
                .equals(other.persistedOneSetOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullablePoints_4(" + oneSetOfNullablePoints + ','
                + calculatedOneSetOfNullablePoints + ','
                + persistedOneSetOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints;

    @JsonProperty("oneSetOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfNullablePoints() {
        return oneSetOfNullablePoints;
    }

    public OneSetOfNullablePoints_4 setOneSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullablePoints\" cannot be null!");
        this.oneSetOfNullablePoints = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullablePoints;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedOneSetOfNullablePoints() {
        return this.calculatedOneSetOfNullablePoints;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullablePoints;

    public java.util.Set<java.awt.geom.Point2D> getPersistedOneSetOfNullablePoints() {
        return this.persistedOneSetOfNullablePoints;
    }
}
