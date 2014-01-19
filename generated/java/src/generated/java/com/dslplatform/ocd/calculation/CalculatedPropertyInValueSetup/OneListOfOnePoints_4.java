package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOnePoints_4 implements java.io.Serializable {
    public OneListOfOnePoints_4(
            final java.util.List<java.awt.geom.Point2D> oneListOfOnePoints,
            final java.util.List<java.awt.geom.Point2D> calculatedOneListOfOnePoints,
            final java.util.List<java.awt.geom.Point2D> persistedOneListOfOnePoints) {
        setOneListOfOnePoints(oneListOfOnePoints);
        this.calculatedOneListOfOnePoints = calculatedOneListOfOnePoints;
        this.persistedOneListOfOnePoints = persistedOneListOfOnePoints;
    }

    public OneListOfOnePoints_4() {
        this.oneListOfOnePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.calculatedOneListOfOnePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.persistedOneListOfOnePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1458141221;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOnePoints_4)) return false;
        final OneListOfOnePoints_4 other = (OneListOfOnePoints_4) obj;

        if (!(this.oneListOfOnePoints.equals(other.oneListOfOnePoints)))
            return false;
        if (!(this.calculatedOneListOfOnePoints
                .equals(other.calculatedOneListOfOnePoints))) return false;
        if (!(this.persistedOneListOfOnePoints
                .equals(other.persistedOneListOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOnePoints_4(" + oneListOfOnePoints + ','
                + calculatedOneListOfOnePoints + ','
                + persistedOneListOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfOnePoints;

    @JsonProperty("oneListOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfOnePoints() {
        return oneListOfOnePoints;
    }

    public OneListOfOnePoints_4 setOneListOfOnePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOnePoints = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedOneListOfOnePoints;

    public java.util.List<java.awt.geom.Point2D> getCalculatedOneListOfOnePoints() {
        return this.calculatedOneListOfOnePoints;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedOneListOfOnePoints;

    public java.util.List<java.awt.geom.Point2D> getPersistedOneListOfOnePoints() {
        return this.persistedOneListOfOnePoints;
    }
}
