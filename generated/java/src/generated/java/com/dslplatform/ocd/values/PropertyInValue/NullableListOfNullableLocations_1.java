package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableLocations_1 implements
        java.io.Serializable {
    public NullableListOfNullableLocations_1(
            final java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations) {
        setNullableListOfNullableLocations(nullableListOfNullableLocations);
    }

    public NullableListOfNullableLocations_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1873050485;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableLocations_1)) return false;
        final NullableListOfNullableLocations_1 other = (NullableListOfNullableLocations_1) obj;

        if (!(this.nullableListOfNullableLocations == other.nullableListOfNullableLocations || this.nullableListOfNullableLocations != null
                && this.nullableListOfNullableLocations
                        .equals(other.nullableListOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableLocations_1("
                + nullableListOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations;

    @JsonProperty("nullableListOfNullableLocations")
    public java.util.List<java.awt.geom.Point2D> getNullableListOfNullableLocations() {
        return nullableListOfNullableLocations;
    }

    public NullableListOfNullableLocations_1 setNullableListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        this.nullableListOfNullableLocations = value;

        return this;
    }
}
