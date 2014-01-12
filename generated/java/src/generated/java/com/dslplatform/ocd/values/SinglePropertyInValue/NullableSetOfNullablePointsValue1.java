package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullablePointsValue1 implements
        java.io.Serializable {
    public NullableSetOfNullablePointsValue1(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints) {
        setNullableSetOfNullablePoints(nullableSetOfNullablePoints);
    }

    public NullableSetOfNullablePointsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 636957854;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullablePointsValue1)) return false;
        final NullableSetOfNullablePointsValue1 other = (NullableSetOfNullablePointsValue1) obj;

        if (!(this.nullableSetOfNullablePoints == other.nullableSetOfNullablePoints || this.nullableSetOfNullablePoints != null
                && this.nullableSetOfNullablePoints
                        .equals(other.nullableSetOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullablePointsValue1("
                + nullableSetOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints;

    @JsonProperty("nullableSetOfNullablePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullablePoints() {
        return nullableSetOfNullablePoints;
    }

    public NullableSetOfNullablePointsValue1 setNullableSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullablePoints = value;

        return this;
    }
}
