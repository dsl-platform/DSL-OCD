package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneLocationsValue2 implements java.io.Serializable {
    public OneSetOfOneLocationsValue2(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations) {
        setOneSetOfOneLocations(oneSetOfOneLocations);
    }

    public OneSetOfOneLocationsValue2() {
        this.oneSetOfOneLocations = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1222577074;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneLocationsValue2)) return false;
        final OneSetOfOneLocationsValue2 other = (OneSetOfOneLocationsValue2) obj;

        if (!(this.oneSetOfOneLocations.equals(other.oneSetOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneLocationsValue2(" + oneSetOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations;

    @JsonProperty("oneSetOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOneLocations() {
        return oneSetOfOneLocations;
    }

    public OneSetOfOneLocationsValue2 setOneSetOfOneLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneLocations = value;

        return this;
    }
}
