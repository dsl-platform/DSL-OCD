package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneLocations_1 implements java.io.Serializable {
    public NullableSetOfOneLocations_1(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfOneLocations) {
        setNullableSetOfOneLocations(nullableSetOfOneLocations);
    }

    public NullableSetOfOneLocations_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2124470548;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneLocations_1)) return false;
        final NullableSetOfOneLocations_1 other = (NullableSetOfOneLocations_1) obj;

        if (!(this.nullableSetOfOneLocations == other.nullableSetOfOneLocations || this.nullableSetOfOneLocations != null
                && this.nullableSetOfOneLocations
                        .equals(other.nullableSetOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneLocations_1(" + nullableSetOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfOneLocations;

    @JsonProperty("nullableSetOfOneLocations")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfOneLocations() {
        return nullableSetOfOneLocations;
    }

    public NullableSetOfOneLocations_1 setNullableSetOfOneLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneLocations = value;

        return this;
    }
}
