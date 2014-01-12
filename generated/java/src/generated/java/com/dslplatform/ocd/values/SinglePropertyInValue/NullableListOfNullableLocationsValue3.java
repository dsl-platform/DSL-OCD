package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableLocationsValue3 implements
        java.io.Serializable {
    public NullableListOfNullableLocationsValue3(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations) {
        setNullableListOfNullableLocations(nullableListOfNullableLocations);
    }

    public NullableListOfNullableLocationsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 954174653;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableLocationsValue3))
            return false;
        final NullableListOfNullableLocationsValue3 other = (NullableListOfNullableLocationsValue3) obj;

        if (!(this.nullableListOfNullableLocations == other.nullableListOfNullableLocations || this.nullableListOfNullableLocations != null
                && this.nullableListOfNullableLocations
                        .equals(other.nullableListOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableLocationsValue3("
                + nullableListOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations;

    @JsonProperty("nullableListOfNullableLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullableLocations() {
        return nullableListOfNullableLocations;
    }

    public NullableListOfNullableLocationsValue3 setNullableListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullableLocations = value;

        return this;
    }
}
