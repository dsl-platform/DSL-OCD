package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableLocationsValue3 implements
        java.io.Serializable {
    public OneArrayOfNullableLocationsValue3(
            final java.awt.geom.Point2D[] oneArrayOfNullableLocations) {
        setOneArrayOfNullableLocations(oneArrayOfNullableLocations);
    }

    public OneArrayOfNullableLocationsValue3() {
        this.oneArrayOfNullableLocations = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1955477543;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableLocationsValue3)) return false;
        final OneArrayOfNullableLocationsValue3 other = (OneArrayOfNullableLocationsValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableLocations,
                other.oneArrayOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableLocationsValue3("
                + oneArrayOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfNullableLocations;

    @JsonProperty("oneArrayOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfNullableLocations() {
        return oneArrayOfNullableLocations;
    }

    public OneArrayOfNullableLocationsValue3 setOneArrayOfNullableLocations(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableLocations\" cannot be null!");
        this.oneArrayOfNullableLocations = value;

        return this;
    }
}
