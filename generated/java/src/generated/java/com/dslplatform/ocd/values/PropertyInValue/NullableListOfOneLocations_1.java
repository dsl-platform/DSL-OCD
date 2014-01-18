package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneLocations_1 implements java.io.Serializable {
    public NullableListOfOneLocations_1(
            final java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations) {
        setNullableListOfOneLocations(nullableListOfOneLocations);
    }

    public NullableListOfOneLocations_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1016686622;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneLocations_1)) return false;
        final NullableListOfOneLocations_1 other = (NullableListOfOneLocations_1) obj;

        if (!(this.nullableListOfOneLocations == other.nullableListOfOneLocations || this.nullableListOfOneLocations != null
                && this.nullableListOfOneLocations
                        .equals(other.nullableListOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneLocations_1(" + nullableListOfOneLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfOneLocations;

    @JsonProperty("nullableListOfOneLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfOneLocations() {
        return nullableListOfOneLocations;
    }

    public NullableListOfOneLocations_1 setNullableListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneLocations = value;

        return this;
    }
}
