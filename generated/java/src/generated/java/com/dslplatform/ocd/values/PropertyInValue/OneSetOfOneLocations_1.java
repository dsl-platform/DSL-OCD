package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneLocations_1 implements java.io.Serializable {
    public OneSetOfOneLocations_1(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations) {
        setOneSetOfOneLocations(oneSetOfOneLocations);
    }

    public OneSetOfOneLocations_1() {
        this.oneSetOfOneLocations = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1807554547;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneLocations_1)) return false;
        final OneSetOfOneLocations_1 other = (OneSetOfOneLocations_1) obj;

        if (!(this.oneSetOfOneLocations.equals(other.oneSetOfOneLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneLocations_1(" + oneSetOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations;

    @JsonProperty("oneSetOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOneLocations() {
        return oneSetOfOneLocations;
    }

    public OneSetOfOneLocations_1 setOneSetOfOneLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneLocations = value;

        return this;
    }
}
