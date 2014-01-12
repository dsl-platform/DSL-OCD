package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableLocationValue3 implements java.io.Serializable {
    public NullableLocationValue3(
            final java.awt.geom.Point2D nullableLocation) {
        setNullableLocation(nullableLocation);
    }

    public NullableLocationValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 589747766;
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

        if (!(obj instanceof NullableLocationValue3)) return false;
        final NullableLocationValue3 other = (NullableLocationValue3) obj;

        if (!(this.nullableLocation == other.nullableLocation || this.nullableLocation != null
                && this.nullableLocation.equals(other.nullableLocation)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLocationValue3(" + nullableLocation + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D nullableLocation;

    @JsonProperty("nullableLocation")
    public java.awt.geom.Point2D getNullableLocation() {
        return nullableLocation;
    }

    public NullableLocationValue3 setNullableLocation(
            final java.awt.geom.Point2D value) {
        this.nullableLocation = value;

        return this;
    }
}
