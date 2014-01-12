package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullablePointsValue2 implements
        java.io.Serializable {
    public NullableSetOfNullablePointsValue2(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints) {
        setNullableSetOfNullablePoints(nullableSetOfNullablePoints);
    }

    public NullableSetOfNullablePointsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 636957853;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullablePointsValue2)) return false;
        final NullableSetOfNullablePointsValue2 other = (NullableSetOfNullablePointsValue2) obj;

        if (!(this.nullableSetOfNullablePoints == other.nullableSetOfNullablePoints || this.nullableSetOfNullablePoints != null
                && this.nullableSetOfNullablePoints
                        .equals(other.nullableSetOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullablePointsValue2("
                + nullableSetOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints;

    @JsonProperty("nullableSetOfNullablePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullablePoints() {
        return nullableSetOfNullablePoints;
    }

    public NullableSetOfNullablePointsValue2 setNullableSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullablePoints = value;

        return this;
    }
}
