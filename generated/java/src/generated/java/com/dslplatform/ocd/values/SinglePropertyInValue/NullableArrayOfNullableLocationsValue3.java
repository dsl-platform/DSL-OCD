package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableLocationsValue3 implements
        java.io.Serializable {
    public NullableArrayOfNullableLocationsValue3(
            final java.awt.geom.Point2D[] nullableArrayOfNullableLocations) {
        setNullableArrayOfNullableLocations(nullableArrayOfNullableLocations);
    }

    public NullableArrayOfNullableLocationsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1873530774;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableLocationsValue3))
            return false;
        final NullableArrayOfNullableLocationsValue3 other = (NullableArrayOfNullableLocationsValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableLocations,
                other.nullableArrayOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableLocationsValue3("
                + nullableArrayOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfNullableLocations;

    @JsonProperty("nullableArrayOfNullableLocations")
    public java.awt.geom.Point2D[] getNullableArrayOfNullableLocations() {
        return nullableArrayOfNullableLocations;
    }

    public NullableArrayOfNullableLocationsValue3 setNullableArrayOfNullableLocations(
            final java.awt.geom.Point2D[] value) {
        this.nullableArrayOfNullableLocations = value;

        return this;
    }
}
