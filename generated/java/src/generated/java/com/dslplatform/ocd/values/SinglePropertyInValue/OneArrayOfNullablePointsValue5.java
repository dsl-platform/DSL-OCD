package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullablePointsValue5 implements
        java.io.Serializable {
    public OneArrayOfNullablePointsValue5(
            final java.awt.geom.Point2D[] oneArrayOfNullablePoints) {
        setOneArrayOfNullablePoints(oneArrayOfNullablePoints);
    }

    public OneArrayOfNullablePointsValue5() {
        this.oneArrayOfNullablePoints = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 245476832;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullablePointsValue5)) return false;
        final OneArrayOfNullablePointsValue5 other = (OneArrayOfNullablePointsValue5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullablePoints,
                other.oneArrayOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullablePointsValue5(" + oneArrayOfNullablePoints
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfNullablePoints;

    @JsonProperty("oneArrayOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfNullablePoints() {
        return oneArrayOfNullablePoints;
    }

    public OneArrayOfNullablePointsValue5 setOneArrayOfNullablePoints(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullablePoints\" cannot be null!");
        this.oneArrayOfNullablePoints = value;

        return this;
    }
}
