package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableLocations_1 implements java.io.Serializable {
    public OneListOfNullableLocations_1(
            final java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations) {
        setOneListOfNullableLocations(oneListOfNullableLocations);
    }

    public OneListOfNullableLocations_1() {
        this.oneListOfNullableLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 900522234;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableLocations_1)) return false;
        final OneListOfNullableLocations_1 other = (OneListOfNullableLocations_1) obj;

        if (!(this.oneListOfNullableLocations
                .equals(other.oneListOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableLocations_1(" + oneListOfNullableLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations;

    @JsonProperty("oneListOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfNullableLocations() {
        return oneListOfNullableLocations;
    }

    public OneListOfNullableLocations_1 setOneListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableLocations\" cannot be null!");
        this.oneListOfNullableLocations = value;

        return this;
    }
}
