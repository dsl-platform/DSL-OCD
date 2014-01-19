package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullablePoints_4 implements java.io.Serializable {
    public OneArrayOfNullablePoints_4(
            final java.awt.geom.Point2D[] oneArrayOfNullablePoints,
            final java.awt.geom.Point2D[] calculatedOneArrayOfNullablePoints,
            final java.awt.geom.Point2D[] persistedOneArrayOfNullablePoints) {
        setOneArrayOfNullablePoints(oneArrayOfNullablePoints);
        this.calculatedOneArrayOfNullablePoints = calculatedOneArrayOfNullablePoints;
        this.persistedOneArrayOfNullablePoints = persistedOneArrayOfNullablePoints;
    }

    public OneArrayOfNullablePoints_4() {
        this.oneArrayOfNullablePoints = new java.awt.geom.Point2D[] {};
        this.calculatedOneArrayOfNullablePoints = new java.awt.geom.Point2D[] {};
        this.persistedOneArrayOfNullablePoints = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 842092663;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullablePoints_4)) return false;
        final OneArrayOfNullablePoints_4 other = (OneArrayOfNullablePoints_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullablePoints,
                other.oneArrayOfNullablePoints))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullablePoints,
                other.calculatedOneArrayOfNullablePoints))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullablePoints,
                other.persistedOneArrayOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullablePoints_4(" + oneArrayOfNullablePoints + ','
                + calculatedOneArrayOfNullablePoints + ','
                + persistedOneArrayOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfNullablePoints;

    @JsonProperty("oneArrayOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfNullablePoints() {
        return oneArrayOfNullablePoints;
    }

    public OneArrayOfNullablePoints_4 setOneArrayOfNullablePoints(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullablePoints\" cannot be null!");
        this.oneArrayOfNullablePoints = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedOneArrayOfNullablePoints;

    public java.awt.geom.Point2D[] getCalculatedOneArrayOfNullablePoints() {
        return this.calculatedOneArrayOfNullablePoints;
    }

    private final java.awt.geom.Point2D[] persistedOneArrayOfNullablePoints;

    public java.awt.geom.Point2D[] getPersistedOneArrayOfNullablePoints() {
        return this.persistedOneArrayOfNullablePoints;
    }
}
