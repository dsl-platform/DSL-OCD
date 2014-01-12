package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullablePointsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullablePointsValue3(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints) {
        setNullableSetOfNullablePoints(nullableSetOfNullablePoints);
    }

    public NullableSetOfNullablePointsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 636957852;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullablePointsValue3)) return false;
        final NullableSetOfNullablePointsValue3 other = (NullableSetOfNullablePointsValue3) obj;

        if (!(this.nullableSetOfNullablePoints == other.nullableSetOfNullablePoints || this.nullableSetOfNullablePoints != null
                && this.nullableSetOfNullablePoints
                        .equals(other.nullableSetOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullablePointsValue3("
                + nullableSetOfNullablePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints;

    @JsonProperty("nullableSetOfNullablePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullablePoints() {
        return nullableSetOfNullablePoints;
    }

    public NullableSetOfNullablePointsValue3 setNullableSetOfNullablePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullablePoints = value;

        return this;
    }
}
