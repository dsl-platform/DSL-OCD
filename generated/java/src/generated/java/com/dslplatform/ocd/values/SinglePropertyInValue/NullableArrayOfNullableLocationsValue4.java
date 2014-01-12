package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableLocationsValue4 implements
        java.io.Serializable {
    public NullableArrayOfNullableLocationsValue4(
            final java.awt.geom.Point2D[] nullableArrayOfNullableLocations) {
        setNullableArrayOfNullableLocations(nullableArrayOfNullableLocations);
    }

    public NullableArrayOfNullableLocationsValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 48783527;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableLocationsValue4))
            return false;
        final NullableArrayOfNullableLocationsValue4 other = (NullableArrayOfNullableLocationsValue4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableLocations,
                other.nullableArrayOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableLocationsValue4("
                + nullableArrayOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullableLocations;

    @JsonProperty("nullableArrayOfNullableLocations")
    public java.awt.geom.Point2D[] getNullableArrayOfNullableLocations() {
        return nullableArrayOfNullableLocations;
    }

    public NullableArrayOfNullableLocationsValue4 setNullableArrayOfNullableLocations(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullableLocations = value;

        return this;
    }
}
