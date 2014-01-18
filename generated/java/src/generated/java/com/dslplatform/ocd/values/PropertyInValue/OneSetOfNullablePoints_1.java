package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullablePoints_1 implements java.io.Serializable {
    public OneSetOfNullablePoints_1(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints) {
        setOneSetOfNullablePoints(oneSetOfNullablePoints);
    }

    public OneSetOfNullablePoints_1() {
        this.oneSetOfNullablePoints = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1816625515;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullablePoints_1)) return false;
        final OneSetOfNullablePoints_1 other = (OneSetOfNullablePoints_1) obj;

        if (!(this.oneSetOfNullablePoints.equals(other.oneSetOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullablePoints_1(" + oneSetOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints;

    @JsonProperty("oneSetOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfNullablePoints() {
        return oneSetOfNullablePoints;
    }

    public OneSetOfNullablePoints_1 setOneSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullablePoints\" cannot be null!");
        this.oneSetOfNullablePoints = value;

        return this;
    }
}
