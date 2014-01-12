package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneLocationsValue3 implements
        java.io.Serializable {
    public NullableArrayOfOneLocationsValue3(
            final java.awt.geom.Point2D[] nullableArrayOfOneLocations) {
        setNullableArrayOfOneLocations(nullableArrayOfOneLocations);
    }

    public NullableArrayOfOneLocationsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1420359791;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneLocationsValue3)) return false;
        final NullableArrayOfOneLocationsValue3 other = (NullableArrayOfOneLocationsValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneLocations,
                other.nullableArrayOfOneLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneLocationsValue3("
                + nullableArrayOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfOneLocations;

    @JsonProperty("nullableArrayOfOneLocations")
    public java.awt.geom.Point2D[] getNullableArrayOfOneLocations() {
        return nullableArrayOfOneLocations;
    }

    public NullableArrayOfOneLocationsValue3 setNullableArrayOfOneLocations(
            final java.awt.geom.Point2D[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneLocations = value;

        return this;
    }
}
