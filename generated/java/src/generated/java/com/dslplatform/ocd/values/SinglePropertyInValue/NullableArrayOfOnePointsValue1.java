package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOnePointsValue1 implements
        java.io.Serializable {
    public NullableArrayOfOnePointsValue1(
            final java.awt.geom.Point2D[] nullableArrayOfOnePoints) {
        setNullableArrayOfOnePoints(nullableArrayOfOnePoints);
    }

    public NullableArrayOfOnePointsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 923571868;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOnePointsValue1)) return false;
        final NullableArrayOfOnePointsValue1 other = (NullableArrayOfOnePointsValue1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOnePoints,
                other.nullableArrayOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOnePointsValue1(" + nullableArrayOfOnePoints
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfOnePoints;

    @JsonProperty("nullableArrayOfOnePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfOnePoints() {
        return nullableArrayOfOnePoints;
    }

    public NullableArrayOfOnePointsValue1 setNullableArrayOfOnePoints(
            final java.awt.geom.Point2D[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOnePoints = value;

        return this;
    }
}
