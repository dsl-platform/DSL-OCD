package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneLocationsValue3 implements java.io.Serializable {
    public OneListOfOneLocationsValue3(
            final java.util.List<java.awt.geom.Point2D> oneListOfOneLocations) {
        setOneListOfOneLocations(oneListOfOneLocations);
    }

    public OneListOfOneLocationsValue3() {
        this.oneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 619567683;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneLocationsValue3)) return false;
        final OneListOfOneLocationsValue3 other = (OneListOfOneLocationsValue3) obj;

        if (!(this.oneListOfOneLocations.equals(other.oneListOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneLocationsValue3(" + oneListOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfOneLocations;

    @JsonProperty("oneListOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfOneLocations() {
        return oneListOfOneLocations;
    }

    public OneListOfOneLocationsValue3 setOneListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneLocations = value;

        return this;
    }
}
