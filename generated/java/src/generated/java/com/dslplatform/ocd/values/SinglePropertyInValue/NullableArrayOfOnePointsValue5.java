package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOnePointsValue5 implements
        java.io.Serializable {
    public NullableArrayOfOnePointsValue5(
            final java.awt.geom.Point2D[] nullableArrayOfOnePoints) {
        setNullableArrayOfOnePoints(nullableArrayOfOnePoints);
    }

    public NullableArrayOfOnePointsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1402026960;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOnePointsValue5)) return false;
        final NullableArrayOfOnePointsValue5 other = (NullableArrayOfOnePointsValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOnePoints,
                other.nullableArrayOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOnePointsValue5(" + nullableArrayOfOnePoints
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfOnePoints;

    @JsonProperty("nullableArrayOfOnePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfOnePoints() {
        return nullableArrayOfOnePoints;
    }

    public NullableArrayOfOnePointsValue5 setNullableArrayOfOnePoints(
            final java.awt.geom.Point2D[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOnePoints = value;

        return this;
    }
}
