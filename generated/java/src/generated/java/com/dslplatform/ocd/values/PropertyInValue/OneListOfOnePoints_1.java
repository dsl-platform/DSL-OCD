package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOnePoints_1 implements java.io.Serializable {
    public OneListOfOnePoints_1(
            final java.util.List<java.awt.geom.Point2D> oneListOfOnePoints) {
        setOneListOfOnePoints(oneListOfOnePoints);
    }

    public OneListOfOnePoints_1() {
        this.oneListOfOnePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 698626334;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOnePoints_1)) return false;
        final OneListOfOnePoints_1 other = (OneListOfOnePoints_1) obj;

        if (!(this.oneListOfOnePoints.equals(other.oneListOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOnePoints_1(" + oneListOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfOnePoints;

    @JsonProperty("oneListOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfOnePoints() {
        return oneListOfOnePoints;
    }

    public OneListOfOnePoints_1 setOneListOfOnePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOnePoints = value;

        return this;
    }
}
