package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneLocationsValue3 implements
        java.io.Serializable {
    public NullableSetOfOneLocationsValue3(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfOneLocations) {
        setNullableSetOfOneLocations(nullableSetOfOneLocations);
    }

    public NullableSetOfOneLocationsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1037664038;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneLocationsValue3)) return false;
        final NullableSetOfOneLocationsValue3 other = (NullableSetOfOneLocationsValue3) obj;

        if (!(this.nullableSetOfOneLocations == other.nullableSetOfOneLocations || this.nullableSetOfOneLocations != null
                && this.nullableSetOfOneLocations
                        .equals(other.nullableSetOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneLocationsValue3(" + nullableSetOfOneLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfOneLocations;

    @JsonProperty("nullableSetOfOneLocations")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfOneLocations() {
        return nullableSetOfOneLocations;
    }

    public NullableSetOfOneLocationsValue3 setNullableSetOfOneLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneLocations = value;

        return this;
    }
}
