package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullablePoints_1 implements
        java.io.Serializable {
    public NullableSetOfNullablePoints_1(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints) {
        setNullableSetOfNullablePoints(nullableSetOfNullablePoints);
    }

    public NullableSetOfNullablePoints_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1428639442;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullablePoints_1)) return false;
        final NullableSetOfNullablePoints_1 other = (NullableSetOfNullablePoints_1) obj;

        if (!(this.nullableSetOfNullablePoints == other.nullableSetOfNullablePoints || this.nullableSetOfNullablePoints != null
                && this.nullableSetOfNullablePoints
                        .equals(other.nullableSetOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullablePoints_1(" + nullableSetOfNullablePoints
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints;

    @JsonProperty("nullableSetOfNullablePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullablePoints() {
        return nullableSetOfNullablePoints;
    }

    public NullableSetOfNullablePoints_1 setNullableSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullablePoints = value;

        return this;
    }
}
