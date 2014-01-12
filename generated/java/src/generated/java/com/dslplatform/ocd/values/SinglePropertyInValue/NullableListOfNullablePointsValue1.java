package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullablePointsValue1 implements
        java.io.Serializable {
    public NullableListOfNullablePointsValue1(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints) {
        setNullableListOfNullablePoints(nullableListOfNullablePoints);
    }

    public NullableListOfNullablePointsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1076966644;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullablePointsValue1)) return false;
        final NullableListOfNullablePointsValue1 other = (NullableListOfNullablePointsValue1) obj;

        if (!(this.nullableListOfNullablePoints == other.nullableListOfNullablePoints || this.nullableListOfNullablePoints != null
                && this.nullableListOfNullablePoints
                        .equals(other.nullableListOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullablePointsValue1("
                + nullableListOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints;

    @JsonProperty("nullableListOfNullablePoints")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullablePoints() {
        return nullableListOfNullablePoints;
    }

    public NullableListOfNullablePointsValue1 setNullableListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullablePoints = value;

        return this;
    }
}
