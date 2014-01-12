package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOnePointsValue3 implements java.io.Serializable {
    public NullableSetOfOnePointsValue3(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints) {
        setNullableSetOfOnePoints(nullableSetOfOnePoints);
    }

    public NullableSetOfOnePointsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 521633885;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOnePointsValue3)) return false;
        final NullableSetOfOnePointsValue3 other = (NullableSetOfOnePointsValue3) obj;

        if (!(this.nullableSetOfOnePoints == other.nullableSetOfOnePoints || this.nullableSetOfOnePoints != null
                && this.nullableSetOfOnePoints
                        .equals(other.nullableSetOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOnePointsValue3(" + nullableSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints;

    @JsonProperty("nullableSetOfOnePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfOnePoints() {
        return nullableSetOfOnePoints;
    }

    public NullableSetOfOnePointsValue3 setNullableSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOnePoints = value;

        return this;
    }
}
