package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOnePoints_4 implements java.io.Serializable {
    public OneSetOfOnePoints_4(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints,
            final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfOnePoints,
            final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfOnePoints) {
        setOneSetOfOnePoints(oneSetOfOnePoints);
        this.calculatedOneSetOfOnePoints = calculatedOneSetOfOnePoints;
        this.persistedOneSetOfOnePoints = persistedOneSetOfOnePoints;
    }

    public OneSetOfOnePoints_4() {
        this.oneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.calculatedOneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
        this.persistedOneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1153696073;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOnePoints_4)) return false;
        final OneSetOfOnePoints_4 other = (OneSetOfOnePoints_4) obj;

        if (!(this.oneSetOfOnePoints.equals(other.oneSetOfOnePoints)))
            return false;
        if (!(this.calculatedOneSetOfOnePoints
                .equals(other.calculatedOneSetOfOnePoints))) return false;
        if (!(this.persistedOneSetOfOnePoints
                .equals(other.persistedOneSetOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOnePoints_4(" + oneSetOfOnePoints + ','
                + calculatedOneSetOfOnePoints + ','
                + persistedOneSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints;

    @JsonProperty("oneSetOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOnePoints() {
        return oneSetOfOnePoints;
    }

    public OneSetOfOnePoints_4 setOneSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOnePoints = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfOnePoints;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedOneSetOfOnePoints() {
        return this.calculatedOneSetOfOnePoints;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfOnePoints;

    public java.util.Set<java.awt.geom.Point2D> getPersistedOneSetOfOnePoints() {
        return this.persistedOneSetOfOnePoints;
    }
}
