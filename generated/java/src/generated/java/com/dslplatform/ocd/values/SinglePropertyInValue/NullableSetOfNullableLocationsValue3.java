package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableLocationsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableLocationsValue3(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations) {
        setNullableSetOfNullableLocations(nullableSetOfNullableLocations);
    }

    public NullableSetOfNullableLocationsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1726619399;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableLocationsValue3))
            return false;
        final NullableSetOfNullableLocationsValue3 other = (NullableSetOfNullableLocationsValue3) obj;

        if (!(this.nullableSetOfNullableLocations == other.nullableSetOfNullableLocations || this.nullableSetOfNullableLocations != null
                && this.nullableSetOfNullableLocations
                        .equals(other.nullableSetOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableLocationsValue3("
                + nullableSetOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations;

    @JsonProperty("nullableSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullableLocations() {
        return nullableSetOfNullableLocations;
    }

    public NullableSetOfNullableLocationsValue3 setNullableSetOfNullableLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullableLocations = value;

        return this;
    }
}
