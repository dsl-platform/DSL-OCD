package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullablePointsValue2 implements
        java.io.Serializable {
    public NullableListOfNullablePointsValue2(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints) {
        setNullableListOfNullablePoints(nullableListOfNullablePoints);
    }

    public NullableListOfNullablePointsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1651916711;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullablePointsValue2)) return false;
        final NullableListOfNullablePointsValue2 other = (NullableListOfNullablePointsValue2) obj;

        if (!(this.nullableListOfNullablePoints == other.nullableListOfNullablePoints || this.nullableListOfNullablePoints != null
                && this.nullableListOfNullablePoints
                        .equals(other.nullableListOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullablePointsValue2("
                + nullableListOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints;

    @JsonProperty("nullableListOfNullablePoints")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullablePoints() {
        return nullableListOfNullablePoints;
    }

    public NullableListOfNullablePointsValue2 setNullableListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullablePoints = value;

        return this;
    }
}
