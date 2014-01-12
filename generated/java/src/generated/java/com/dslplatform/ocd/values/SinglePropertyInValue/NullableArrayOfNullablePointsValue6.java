package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullablePointsValue6 implements
        java.io.Serializable {
    public NullableArrayOfNullablePointsValue6(
            final java.awt.geom.Point2D[] nullableArrayOfNullablePoints) {
        setNullableArrayOfNullablePoints(nullableArrayOfNullablePoints);
    }

    public NullableArrayOfNullablePointsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 464207242;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullablePointsValue6))
            return false;
        final NullableArrayOfNullablePointsValue6 other = (NullableArrayOfNullablePointsValue6) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullablePoints,
                other.nullableArrayOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullablePointsValue6("
                + nullableArrayOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullablePoints;

    @JsonProperty("nullableArrayOfNullablePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfNullablePoints() {
        return nullableArrayOfNullablePoints;
    }

    public NullableArrayOfNullablePointsValue6 setNullableArrayOfNullablePoints(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullablePoints = value;

        return this;
    }
}
