package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOnePointsValue2 implements
        java.io.Serializable {
    public NullableListOfOnePointsValue2(
            final java.util.List<java.awt.geom.Point2D> nullableListOfOnePoints) {
        setNullableListOfOnePoints(nullableListOfOnePoints);
    }

    public NullableListOfOnePointsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 315819952;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOnePointsValue2)) return false;
        final NullableListOfOnePointsValue2 other = (NullableListOfOnePointsValue2) obj;

        if (!(this.nullableListOfOnePoints == other.nullableListOfOnePoints || this.nullableListOfOnePoints != null
                && this.nullableListOfOnePoints
                        .equals(other.nullableListOfOnePoints))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOnePointsValue2(" + nullableListOfOnePoints + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfOnePoints;

    @JsonProperty("nullableListOfOnePoints")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfOnePoints() {
        return nullableListOfOnePoints;
    }

    public NullableListOfOnePointsValue2 setNullableListOfOnePoints(
            final java.util.List<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOnePoints = value;

        return this;
    }
}
