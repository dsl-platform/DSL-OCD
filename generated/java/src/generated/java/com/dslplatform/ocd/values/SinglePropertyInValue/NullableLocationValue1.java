package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableLocationValue1 implements java.io.Serializable {
    public NullableLocationValue1(
            final java.awt.geom.Point2D nullableLocation) {
        setNullableLocation(nullableLocation);
    }

    public NullableLocationValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1752547180;
        result = prime
                * result
                + (this.nullableLocation != null ? this.nullableLocation
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableLocationValue1)) return false;
        final NullableLocationValue1 other = (NullableLocationValue1) obj;

        if (!(this.nullableLocation == other.nullableLocation || this.nullableLocation != null
                && this.nullableLocation.equals(other.nullableLocation)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLocationValue1(" + nullableLocation + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D nullableLocation;

    @JsonProperty("nullableLocation")
    public java.awt.geom.Point2D getNullableLocation() {
        return nullableLocation;
    }

    public NullableLocationValue1 setNullableLocation(
            final java.awt.geom.Point2D value) {
        this.nullableLocation = value;

        return this;
    }
}
