package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLocationsValue1 implements
        java.io.Serializable {
    public NullableListOfOneLocationsValue1(
            final java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations) {
        setNullableListOfOneLocations(nullableListOfOneLocations);
    }

    public NullableListOfOneLocationsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1415895618;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLocationsValue1)) return false;
        final NullableListOfOneLocationsValue1 other = (NullableListOfOneLocationsValue1) obj;

        if (!(this.nullableListOfOneLocations == other.nullableListOfOneLocations || this.nullableListOfOneLocations != null
                && this.nullableListOfOneLocations
                        .equals(other.nullableListOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLocationsValue1(" + nullableListOfOneLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations;

    @JsonProperty("nullableListOfOneLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfOneLocations() {
        return nullableListOfOneLocations;
    }

    public NullableListOfOneLocationsValue1 setNullableListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneLocations = value;

        return this;
    }
}
