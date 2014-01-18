package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneLocations_1 implements
        java.io.Serializable {
    public NullableArrayOfOneLocations_1(
            final java.awt.geom.Point2D[] nullableArrayOfOneLocations) {
        setNullableArrayOfOneLocations(nullableArrayOfOneLocations);
    }

    public NullableArrayOfOneLocations_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1094901797;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneLocations_1)) return false;
        final NullableArrayOfOneLocations_1 other = (NullableArrayOfOneLocations_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneLocations,
                other.nullableArrayOfOneLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneLocations_1(" + nullableArrayOfOneLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] nullableArrayOfOneLocations;

    @JsonProperty("nullableArrayOfOneLocations")
    public java.awt.geom.Point2D[] getNullableArrayOfOneLocations() {
        return nullableArrayOfOneLocations;
    }

    public NullableArrayOfOneLocations_1 setNullableArrayOfOneLocations(
            final java.awt.geom.Point2D[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneLocations = value;

        return this;
    }
}
