package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableLocationsValue3 implements
        java.io.Serializable {
    public OneListOfNullableLocationsValue3(
            final java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations) {
        setOneListOfNullableLocations(oneListOfNullableLocations);
    }

    public OneListOfNullableLocationsValue3() {
        this.oneListOfNullableLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 864260736;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableLocationsValue3)) return false;
        final OneListOfNullableLocationsValue3 other = (OneListOfNullableLocationsValue3) obj;

        if (!(this.oneListOfNullableLocations
                .equals(other.oneListOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableLocationsValue3(" + oneListOfNullableLocations
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations;

    @JsonProperty("oneListOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfNullableLocations() {
        return oneListOfNullableLocations;
    }

    public OneListOfNullableLocationsValue3 setOneListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableLocations\" cannot be null!");
        this.oneListOfNullableLocations = value;

        return this;
    }
}
