package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableLocationsValue2 implements
        java.io.Serializable {
    public NullableListOfNullableLocationsValue2(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations) {
        setNullableListOfNullableLocations(nullableListOfNullableLocations);
    }

    public NullableListOfNullableLocationsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 954174652;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableLocationsValue2))
            return false;
        final NullableListOfNullableLocationsValue2 other = (NullableListOfNullableLocationsValue2) obj;

        if (!(this.nullableListOfNullableLocations == other.nullableListOfNullableLocations || this.nullableListOfNullableLocations != null
                && this.nullableListOfNullableLocations
                        .equals(other.nullableListOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableLocationsValue2("
                + nullableListOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations;

    @JsonProperty("nullableListOfNullableLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullableLocations() {
        return nullableListOfNullableLocations;
    }

    public NullableListOfNullableLocationsValue2 setNullableListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullableLocations = value;

        return this;
    }
}
