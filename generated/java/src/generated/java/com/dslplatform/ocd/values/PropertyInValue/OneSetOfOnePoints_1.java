package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOnePoints_1 implements java.io.Serializable {
    public OneSetOfOnePoints_1(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints) {
        setOneSetOfOnePoints(oneSetOfOnePoints);
    }

    public OneSetOfOnePoints_1() {
        this.oneSetOfOnePoints = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1153696070;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOnePoints_1)) return false;
        final OneSetOfOnePoints_1 other = (OneSetOfOnePoints_1) obj;

        if (!(this.oneSetOfOnePoints.equals(other.oneSetOfOnePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOnePoints_1(" + oneSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOnePoints;

    @JsonProperty("oneSetOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOnePoints() {
        return oneSetOfOnePoints;
    }

    public OneSetOfOnePoints_1 setOneSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOnePoints = value;

        return this;
    }
}
