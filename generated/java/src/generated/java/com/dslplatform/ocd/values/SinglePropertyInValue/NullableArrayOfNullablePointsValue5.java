package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullablePointsValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullablePointsValue5(
            final java.awt.geom.Point2D[] nullableArrayOfNullablePoints) {
        setNullableArrayOfNullablePoints(nullableArrayOfNullablePoints);
    }

    public NullableArrayOfNullablePointsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 464207245;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullablePointsValue5))
            return false;
        final NullableArrayOfNullablePointsValue5 other = (NullableArrayOfNullablePointsValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullablePoints,
                other.nullableArrayOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullablePointsValue5("
                + nullableArrayOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullablePoints;

    @JsonProperty("nullableArrayOfNullablePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfNullablePoints() {
        return nullableArrayOfNullablePoints;
    }

    public NullableArrayOfNullablePointsValue5 setNullableArrayOfNullablePoints(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullablePoints = value;

        return this;
    }
}
