package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullablePoints_1 implements
        java.io.Serializable {
    public NullableListOfNullablePoints_1(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints) {
        setNullableListOfNullablePoints(nullableListOfNullablePoints);
    }

    public NullableListOfNullablePoints_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1375590200;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullablePoints_1)) return false;
        final NullableListOfNullablePoints_1 other = (NullableListOfNullablePoints_1) obj;

        if (!(this.nullableListOfNullablePoints == other.nullableListOfNullablePoints || this.nullableListOfNullablePoints != null
                && this.nullableListOfNullablePoints
                        .equals(other.nullableListOfNullablePoints)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullablePoints_1(" + nullableListOfNullablePoints
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints;

    @JsonProperty("nullableListOfNullablePoints")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullablePoints() {
        return nullableListOfNullablePoints;
    }

    public NullableListOfNullablePoints_1 setNullableListOfNullablePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullablePoints = value;

        return this;
    }
}
