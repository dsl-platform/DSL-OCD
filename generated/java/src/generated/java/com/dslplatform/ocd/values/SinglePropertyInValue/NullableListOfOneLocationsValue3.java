package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLocationsValue3 implements
        java.io.Serializable {
    public NullableListOfOneLocationsValue3(
            final java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations) {
        setNullableListOfOneLocations(nullableListOfOneLocations);
    }

    public NullableListOfOneLocationsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 253096204;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLocationsValue3)) return false;
        final NullableListOfOneLocationsValue3 other = (NullableListOfOneLocationsValue3) obj;

        if (!(this.nullableListOfOneLocations == other.nullableListOfOneLocations || this.nullableListOfOneLocations != null
                && this.nullableListOfOneLocations
                        .equals(other.nullableListOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLocationsValue3(" + nullableListOfOneLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations;

    @JsonProperty("nullableListOfOneLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfOneLocations() {
        return nullableListOfOneLocations;
    }

    public NullableListOfOneLocationsValue3 setNullableListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneLocations = value;

        return this;
    }
}
