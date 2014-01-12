package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneLocationsValue2 implements java.io.Serializable {
    public OneListOfOneLocationsValue2(
            final java.util.List<java.awt.geom.Point2D> oneListOfOneLocations) {
        setOneListOfOneLocations(oneListOfOneLocations);
    }

    public OneListOfOneLocationsValue2() {
        this.oneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 619567682;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneLocationsValue2)) return false;
        final OneListOfOneLocationsValue2 other = (OneListOfOneLocationsValue2) obj;

        if (!(this.oneListOfOneLocations.equals(other.oneListOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneLocationsValue2(" + oneListOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfOneLocations;

    @JsonProperty("oneListOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfOneLocations() {
        return oneListOfOneLocations;
    }

    public OneListOfOneLocationsValue2 setOneListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneLocations = value;

        return this;
    }
}
