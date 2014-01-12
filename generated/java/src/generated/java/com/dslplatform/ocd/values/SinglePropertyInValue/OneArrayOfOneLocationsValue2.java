package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneLocationsValue2 implements java.io.Serializable {
    public OneArrayOfOneLocationsValue2(
            final java.awt.geom.Point2D[] oneArrayOfOneLocations) {
        setOneArrayOfOneLocations(oneArrayOfOneLocations);
    }

    public OneArrayOfOneLocationsValue2() {
        this.oneArrayOfOneLocations = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2043872567;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneLocationsValue2)) return false;
        final OneArrayOfOneLocationsValue2 other = (OneArrayOfOneLocationsValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneLocations,
                other.oneArrayOfOneLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneLocationsValue2(" + oneArrayOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfOneLocations;

    @JsonProperty("oneArrayOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfOneLocations() {
        return oneArrayOfOneLocations;
    }

    public OneArrayOfOneLocationsValue2 setOneArrayOfOneLocations(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneLocations = value;

        return this;
    }
}
