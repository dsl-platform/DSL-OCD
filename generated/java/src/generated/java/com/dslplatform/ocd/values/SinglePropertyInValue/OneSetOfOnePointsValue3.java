package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOnePointsValue3 implements java.io.Serializable {
    public OneSetOfOnePointsValue3(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints) {
        setOneSetOfOnePoints(oneSetOfOnePoints);
    }

    public OneSetOfOnePointsValue3() {
        this.oneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1467416536;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOnePointsValue3)) return false;
        final OneSetOfOnePointsValue3 other = (OneSetOfOnePointsValue3) obj;

        if (!(this.oneSetOfOnePoints.equals(other.oneSetOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOnePointsValue3(" + oneSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints;

    @JsonProperty("oneSetOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOnePoints() {
        return oneSetOfOnePoints;
    }

    public OneSetOfOnePointsValue3 setOneSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOnePoints = value;

        return this;
    }
}
