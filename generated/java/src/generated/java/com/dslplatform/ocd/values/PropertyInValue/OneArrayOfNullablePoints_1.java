package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullablePoints_1 implements java.io.Serializable {
    public OneArrayOfNullablePoints_1(
            final java.awt.geom.Point2D[] oneArrayOfNullablePoints) {
        setOneArrayOfNullablePoints(oneArrayOfNullablePoints);
    }

    public OneArrayOfNullablePoints_1() {
        this.oneArrayOfNullablePoints = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 82577776;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullablePoints_1)) return false;
        final OneArrayOfNullablePoints_1 other = (OneArrayOfNullablePoints_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullablePoints,
                other.oneArrayOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullablePoints_1(" + oneArrayOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfNullablePoints;

    @JsonProperty("oneArrayOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfNullablePoints() {
        return oneArrayOfNullablePoints;
    }

    public OneArrayOfNullablePoints_1 setOneArrayOfNullablePoints(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullablePoints\" cannot be null!");
        this.oneArrayOfNullablePoints = value;

        return this;
    }
}
