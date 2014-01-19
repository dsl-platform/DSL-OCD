package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOnePoints_4 implements java.io.Serializable {
    public OneArrayOfOnePoints_4(
            final java.awt.geom.Point2D[] oneArrayOfOnePoints,
            final java.awt.geom.Point2D[] calculatedOneArrayOfOnePoints,
            final java.awt.geom.Point2D[] persistedOneArrayOfOnePoints) {
        setOneArrayOfOnePoints(oneArrayOfOnePoints);
        this.calculatedOneArrayOfOnePoints = calculatedOneArrayOfOnePoints;
        this.persistedOneArrayOfOnePoints = persistedOneArrayOfOnePoints;
    }

    public OneArrayOfOnePoints_4() {
        this.oneArrayOfOnePoints = new java.awt.geom.Point2D[] {};
        this.calculatedOneArrayOfOnePoints = new java.awt.geom.Point2D[] {};
        this.persistedOneArrayOfOnePoints = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1921349082;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOnePoints_4)) return false;
        final OneArrayOfOnePoints_4 other = (OneArrayOfOnePoints_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOnePoints,
                other.oneArrayOfOnePoints))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOnePoints,
                other.calculatedOneArrayOfOnePoints))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOnePoints,
                other.persistedOneArrayOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOnePoints_4(" + oneArrayOfOnePoints + ','
                + calculatedOneArrayOfOnePoints + ','
                + persistedOneArrayOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfOnePoints;

    @JsonProperty("oneArrayOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfOnePoints() {
        return oneArrayOfOnePoints;
    }

    public OneArrayOfOnePoints_4 setOneArrayOfOnePoints(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOnePoints = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedOneArrayOfOnePoints;

    public java.awt.geom.Point2D[] getCalculatedOneArrayOfOnePoints() {
        return this.calculatedOneArrayOfOnePoints;
    }

    private final java.awt.geom.Point2D[] persistedOneArrayOfOnePoints;

    public java.awt.geom.Point2D[] getPersistedOneArrayOfOnePoints() {
        return this.persistedOneArrayOfOnePoints;
    }
}
