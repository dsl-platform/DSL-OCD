package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableLocations_1 implements
        java.io.Serializable {
    public NullableSetOfNullableLocations_1(
            final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations) {
        setNullableSetOfNullableLocations(nullableSetOfNullableLocations);
    }

    public NullableSetOfNullableLocations_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1780938261;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableLocations_1)) return false;
        final NullableSetOfNullableLocations_1 other = (NullableSetOfNullableLocations_1) obj;

        if (!(this.nullableSetOfNullableLocations == other.nullableSetOfNullableLocations || this.nullableSetOfNullableLocations != null
                && this.nullableSetOfNullableLocations
                        .equals(other.nullableSetOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableLocations_1("
                + nullableSetOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations;

    @JsonProperty("nullableSetOfNullableLocations")
    public java.util.Set<java.awt.geom.Point2D> getNullableSetOfNullableLocations() {
        return nullableSetOfNullableLocations;
    }

    public NullableSetOfNullableLocations_1 setNullableSetOfNullableLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        this.nullableSetOfNullableLocations = value;

        return this;
    }
}
