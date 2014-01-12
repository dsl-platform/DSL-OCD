package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullablePointsValue3 implements
        java.io.Serializable {
    public NullableArrayOfNullablePointsValue3(
            final java.awt.geom.Point2D[] nullableArrayOfNullablePoints) {
        setNullableArrayOfNullablePoints(nullableArrayOfNullablePoints);
    }

    public NullableArrayOfNullablePointsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 464207247;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullablePointsValue3))
            return false;
        final NullableArrayOfNullablePointsValue3 other = (NullableArrayOfNullablePointsValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullablePoints,
                other.nullableArrayOfNullablePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullablePointsValue3("
                + nullableArrayOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullablePoints;

    @JsonProperty("nullableArrayOfNullablePoints")
    public java.awt.geom.Point2D[] getNullableArrayOfNullablePoints() {
        return nullableArrayOfNullablePoints;
    }

    public NullableArrayOfNullablePointsValue3 setNullableArrayOfNullablePoints(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullablePoints = value;

        return this;
    }
}
