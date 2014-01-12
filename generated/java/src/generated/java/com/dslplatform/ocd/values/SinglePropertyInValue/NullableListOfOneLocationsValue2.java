package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLocationsValue2 implements
        java.io.Serializable {
    public NullableListOfOneLocationsValue2(
            final java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations) {
        setNullableListOfOneLocations(nullableListOfOneLocations);
    }

    public NullableListOfOneLocationsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1819180145;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLocationsValue2)) return false;
        final NullableListOfOneLocationsValue2 other = (NullableListOfOneLocationsValue2) obj;

        if (!(this.nullableListOfOneLocations == other.nullableListOfOneLocations || this.nullableListOfOneLocations != null
                && this.nullableListOfOneLocations
                        .equals(other.nullableListOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLocationsValue2(" + nullableListOfOneLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations;

    @JsonProperty("nullableListOfOneLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfOneLocations() {
        return nullableListOfOneLocations;
    }

    public NullableListOfOneLocationsValue2 setNullableListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneLocations = value;

        return this;
    }
}
