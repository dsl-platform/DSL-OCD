package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOnePointsValue1 implements java.io.Serializable {
    public NullableSetOfOnePointsValue1(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints) {
        setNullableSetOfOnePoints(nullableSetOfOnePoints);
    }

    public NullableSetOfOnePointsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1684433299;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOnePointsValue1)) return false;
        final NullableSetOfOnePointsValue1 other = (NullableSetOfOnePointsValue1) obj;

        if (!(this.nullableSetOfOnePoints == other.nullableSetOfOnePoints || this.nullableSetOfOnePoints != null
                && this.nullableSetOfOnePoints
                        .equals(other.nullableSetOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOnePointsValue1(" + nullableSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints;

    @JsonProperty("nullableSetOfOnePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfOnePoints() {
        return nullableSetOfOnePoints;
    }

    public NullableSetOfOnePointsValue1 setNullableSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOnePoints = value;

        return this;
    }
}
