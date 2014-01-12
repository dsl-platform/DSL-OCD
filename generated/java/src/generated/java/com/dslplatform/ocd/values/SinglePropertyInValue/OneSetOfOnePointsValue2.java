package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOnePointsValue2 implements java.io.Serializable {
    public OneSetOfOnePointsValue2(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints) {
        setOneSetOfOnePoints(oneSetOfOnePoints);
    }

    public OneSetOfOnePointsValue2() {
        this.oneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1467416535;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOnePointsValue2)) return false;
        final OneSetOfOnePointsValue2 other = (OneSetOfOnePointsValue2) obj;

        if (!(this.oneSetOfOnePoints.equals(other.oneSetOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOnePointsValue2(" + oneSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints;

    @JsonProperty("oneSetOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOnePoints() {
        return oneSetOfOnePoints;
    }

    public OneSetOfOnePointsValue2 setOneSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOnePoints = value;

        return this;
    }
}
