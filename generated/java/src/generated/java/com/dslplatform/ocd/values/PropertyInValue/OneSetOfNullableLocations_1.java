package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableLocations_1 implements java.io.Serializable {
    public OneSetOfNullableLocations_1(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations) {
        setOneSetOfNullableLocations(oneSetOfNullableLocations);
    }

    public OneSetOfNullableLocations_1() {
        this.oneSetOfNullableLocations = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1272497094;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableLocations_1)) return false;
        final OneSetOfNullableLocations_1 other = (OneSetOfNullableLocations_1) obj;

        if (!(this.oneSetOfNullableLocations
                .equals(other.oneSetOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableLocations_1(" + oneSetOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations;

    @JsonProperty("oneSetOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfNullableLocations() {
        return oneSetOfNullableLocations;
    }

    public OneSetOfNullableLocations_1 setOneSetOfNullableLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableLocations\" cannot be null!");
        this.oneSetOfNullableLocations = value;

        return this;
    }
}
