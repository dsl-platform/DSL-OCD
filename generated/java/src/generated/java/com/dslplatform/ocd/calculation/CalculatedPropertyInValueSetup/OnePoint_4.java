package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OnePoint_4 implements java.io.Serializable {
    public OnePoint_4(
            final java.awt.geom.Point2D onePoint,
            final java.awt.geom.Point2D calculatedOnePoint,
            final java.awt.geom.Point2D persistedOnePoint) {
        setOnePoint(onePoint);
        this.calculatedOnePoint = calculatedOnePoint;
        this.persistedOnePoint = persistedOnePoint;
    }

    public OnePoint_4() {
        this.onePoint = new java.awt.Point();
        this.calculatedOnePoint = new java.awt.Point();
        this.persistedOnePoint = new java.awt.Point();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 599525717;
        result = prime * result
                + (this.onePoint != null ? this.onePoint.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOnePoint != null ? this.calculatedOnePoint
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOnePoint != null ? this.persistedOnePoint
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OnePoint_4)) return false;
        final OnePoint_4 other = (OnePoint_4) obj;

        if (!(this.onePoint.equals(other.onePoint))) return false;
        if (!(this.calculatedOnePoint.equals(other.calculatedOnePoint)))
            return false;
        if (!(this.persistedOnePoint.equals(other.persistedOnePoint)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OnePoint_4(" + onePoint + ',' + calculatedOnePoint + ','
                + persistedOnePoint + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D onePoint;

    @JsonProperty("onePoint")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D getOnePoint() {
        return onePoint;
    }

    public OnePoint_4 setOnePoint(final java.awt.geom.Point2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"onePoint\" cannot be null!");
        this.onePoint = value;

        return this;
    }

    private final java.awt.geom.Point2D calculatedOnePoint;

    public java.awt.geom.Point2D getCalculatedOnePoint() {
        return this.calculatedOnePoint;
    }

    private final java.awt.geom.Point2D persistedOnePoint;

    public java.awt.geom.Point2D getPersistedOnePoint() {
        return this.persistedOnePoint;
    }
}
