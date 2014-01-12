package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullablePointValue3 implements java.io.Serializable {
    public NullablePointValue3(
            final java.awt.geom.Point2D nullablePoint) {
        setNullablePoint(nullablePoint);
    }

    public NullablePointValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 11166009;
        result = prime
                * result
                + (this.nullablePoint != null
                        ? this.nullablePoint.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullablePointValue3)) return false;
        final NullablePointValue3 other = (NullablePointValue3) obj;

        if (!(this.nullablePoint == other.nullablePoint || this.nullablePoint != null
                && this.nullablePoint.equals(other.nullablePoint)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullablePointValue3(" + nullablePoint + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D nullablePoint;

    @JsonProperty("nullablePoint")
    public java.awt.geom.Point2D getNullablePoint() {
        return nullablePoint;
    }

    public NullablePointValue3 setNullablePoint(
            final java.awt.geom.Point2D value) {
        this.nullablePoint = value;

        return this;
    }
}
