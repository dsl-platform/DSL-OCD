package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullablePoints_4 implements java.io.Serializable {
    public OneListOfNullablePoints_4(
            final java.util.List<java.awt.geom.Point2D> oneListOfNullablePoints,
            final java.util.List<java.awt.geom.Point2D> calculatedOneListOfNullablePoints,
            final java.util.List<java.awt.geom.Point2D> persistedOneListOfNullablePoints) {
        setOneListOfNullablePoints(oneListOfNullablePoints);
        this.calculatedOneListOfNullablePoints = calculatedOneListOfNullablePoints;
        this.persistedOneListOfNullablePoints = persistedOneListOfNullablePoints;
    }

    public OneListOfNullablePoints_4() {
        this.oneListOfNullablePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.calculatedOneListOfNullablePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.persistedOneListOfNullablePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 690699498;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullablePoints_4)) return false;
        final OneListOfNullablePoints_4 other = (OneListOfNullablePoints_4) obj;

        if (!(this.oneListOfNullablePoints
                .equals(other.oneListOfNullablePoints))) return false;
        if (!(this.calculatedOneListOfNullablePoints
                .equals(other.calculatedOneListOfNullablePoints)))
            return false;
        if (!(this.persistedOneListOfNullablePoints
                .equals(other.persistedOneListOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullablePoints_4(" + oneListOfNullablePoints + ','
                + calculatedOneListOfNullablePoints + ','
                + persistedOneListOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfNullablePoints;

    @JsonProperty("oneListOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfNullablePoints() {
        return oneListOfNullablePoints;
    }

    public OneListOfNullablePoints_4 setOneListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullablePoints\" cannot be null!");
        this.oneListOfNullablePoints = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedOneListOfNullablePoints;

    public java.util.List<java.awt.geom.Point2D> getCalculatedOneListOfNullablePoints() {
        return this.calculatedOneListOfNullablePoints;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedOneListOfNullablePoints;

    public java.util.List<java.awt.geom.Point2D> getPersistedOneListOfNullablePoints() {
        return this.persistedOneListOfNullablePoints;
    }
}
