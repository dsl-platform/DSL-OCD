package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOnePointsValue6 implements java.io.Serializable {
    public OneArrayOfOnePointsValue6(
            final java.awt.geom.Point2D[] oneArrayOfOnePoints) {
        setOneArrayOfOnePoints(oneArrayOfOnePoints);
    }

    public OneArrayOfOnePointsValue6() {
        this.oneArrayOfOnePoints = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1921838480;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOnePointsValue6)) return false;
        final OneArrayOfOnePointsValue6 other = (OneArrayOfOnePointsValue6) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOnePoints,
                other.oneArrayOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOnePointsValue6(" + oneArrayOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfOnePoints;

    @JsonProperty("oneArrayOfOnePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfOnePoints() {
        return oneArrayOfOnePoints;
    }

    public OneArrayOfOnePointsValue6 setOneArrayOfOnePoints(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOnePoints\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOnePoints = value;

        return this;
    }
}
