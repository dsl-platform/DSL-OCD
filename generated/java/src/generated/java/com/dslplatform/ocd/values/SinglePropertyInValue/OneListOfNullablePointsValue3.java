package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullablePointsValue3 implements
        java.io.Serializable {
    public OneListOfNullablePointsValue3(
            final java.util.List<java.awt.geom.Point2D> oneListOfNullablePoints) {
        setOneListOfNullablePoints(oneListOfNullablePoints);
    }

    public OneListOfNullablePointsValue3() {
        this.oneListOfNullablePoints = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1964542307;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullablePointsValue3)) return false;
        final OneListOfNullablePointsValue3 other = (OneListOfNullablePointsValue3) obj;

        if (!(this.oneListOfNullablePoints
                .equals(other.oneListOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullablePointsValue3(" + oneListOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfNullablePoints;

    @JsonProperty("oneListOfNullablePoints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfNullablePoints() {
        return oneListOfNullablePoints;
    }

    public OneListOfNullablePointsValue3 setOneListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullablePoints\" cannot be null!");
        this.oneListOfNullablePoints = value;

        return this;
    }
}
