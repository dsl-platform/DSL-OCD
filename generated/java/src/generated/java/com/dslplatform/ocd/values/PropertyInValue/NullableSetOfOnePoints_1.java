package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOnePoints_1 implements java.io.Serializable {
    public NullableSetOfOnePoints_1(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints) {
        setNullableSetOfOnePoints(nullableSetOfOnePoints);
    }

    public NullableSetOfOnePoints_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 892461807;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOnePoints_1)) return false;
        final NullableSetOfOnePoints_1 other = (NullableSetOfOnePoints_1) obj;

        if (!(this.nullableSetOfOnePoints == other.nullableSetOfOnePoints || this.nullableSetOfOnePoints != null
                && this.nullableSetOfOnePoints
                        .equals(other.nullableSetOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOnePoints_1(" + nullableSetOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints;

    @JsonProperty("nullableSetOfOnePoints")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfOnePoints() {
        return nullableSetOfOnePoints;
    }

    public NullableSetOfOnePoints_1 setNullableSetOfOnePoints(
            final java.util.Set<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOnePoints = value;

        return this;
    }
}
