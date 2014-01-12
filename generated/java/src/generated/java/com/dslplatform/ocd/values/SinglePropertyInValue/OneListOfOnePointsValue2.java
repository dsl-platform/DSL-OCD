package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOnePointsValue2 implements java.io.Serializable {
    public OneListOfOnePointsValue2(
            final java.util.List<java.awt.geom.Point2D> oneListOfOnePoints) {
        setOneListOfOnePoints(oneListOfOnePoints);
    }

    public OneListOfOnePointsValue2() {
        this.oneListOfOnePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1860087073;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOnePointsValue2)) return false;
        final OneListOfOnePointsValue2 other = (OneListOfOnePointsValue2) obj;

        if (!(this.oneListOfOnePoints.equals(other.oneListOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOnePointsValue2(" + oneListOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfOnePoints;

    @JsonProperty("oneListOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfOnePoints() {
        return oneListOfOnePoints;
    }

    public OneListOfOnePointsValue2 setOneListOfOnePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOnePoints = value;

        return this;
    }
}
