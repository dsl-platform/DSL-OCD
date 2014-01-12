package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullablePointsValue2 implements
        java.io.Serializable {
    public OneListOfNullablePointsValue2(
            final java.util.List<java.awt.geom.Point2D> oneListOfNullablePoints) {
        setOneListOfNullablePoints(oneListOfNullablePoints);
    }

    public OneListOfNullablePointsValue2() {
        this.oneListOfNullablePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1964542308;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullablePointsValue2)) return false;
        final OneListOfNullablePointsValue2 other = (OneListOfNullablePointsValue2) obj;

        if (!(this.oneListOfNullablePoints
                .equals(other.oneListOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullablePointsValue2(" + oneListOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfNullablePoints;

    @JsonProperty("oneListOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfNullablePoints() {
        return oneListOfNullablePoints;
    }

    public OneListOfNullablePointsValue2 setOneListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullablePoints\" cannot be null!");
        this.oneListOfNullablePoints = value;

        return this;
    }
}
