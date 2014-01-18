package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableLocations_1 implements
        java.io.Serializable {
    public OneArrayOfNullableLocations_1(
            final java.awt.geom.Point2D[] oneArrayOfNullableLocations) {
        setOneArrayOfNullableLocations(oneArrayOfNullableLocations);
    }

    public OneArrayOfNullableLocations_1() {
        this.oneArrayOfNullableLocations = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 964538955;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableLocations_1)) return false;
        final OneArrayOfNullableLocations_1 other = (OneArrayOfNullableLocations_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableLocations,
                other.oneArrayOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableLocations_1(" + oneArrayOfNullableLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfNullableLocations;

    @JsonProperty("oneArrayOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfNullableLocations() {
        return oneArrayOfNullableLocations;
    }

    public OneArrayOfNullableLocations_1 setOneArrayOfNullableLocations(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableLocations\" cannot be null!");
        this.oneArrayOfNullableLocations = value;

        return this;
    }
}
