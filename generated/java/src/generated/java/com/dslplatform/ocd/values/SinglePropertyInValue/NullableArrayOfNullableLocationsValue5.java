package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableLocationsValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullableLocationsValue5(
            final java.awt.geom.Point2D[] nullableArrayOfNullableLocations) {
        setNullableArrayOfNullableLocations(nullableArrayOfNullableLocations);
    }

    public NullableArrayOfNullableLocationsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1614867468;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableLocationsValue5))
            return false;
        final NullableArrayOfNullableLocationsValue5 other = (NullableArrayOfNullableLocationsValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableLocations,
                other.nullableArrayOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableLocationsValue5("
                + nullableArrayOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullableLocations;

    @JsonProperty("nullableArrayOfNullableLocations")
    public java.awt.geom.Point2D[] getNullableArrayOfNullableLocations() {
        return nullableArrayOfNullableLocations;
    }

    public NullableArrayOfNullableLocationsValue5 setNullableArrayOfNullableLocations(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullableLocations = value;

        return this;
    }
}
