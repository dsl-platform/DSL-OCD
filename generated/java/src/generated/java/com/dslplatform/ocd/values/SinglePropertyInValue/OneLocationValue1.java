package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneLocationValue1 implements java.io.Serializable {
    public OneLocationValue1(
            final java.awt.geom.Point2D oneLocation) {
        setOneLocation(oneLocation);
    }

    public OneLocationValue1() {
        this.oneLocation = new java.awt.geom.Point2D.Float();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1949200259;
        result = prime * result
                + (this.oneLocation != null ? this.oneLocation.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneLocationValue1)) return false;
        final OneLocationValue1 other = (OneLocationValue1) obj;

        if (!(this.oneLocation.equals(other.oneLocation))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneLocationValue1(" + oneLocation + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D oneLocation;

    @JsonProperty("oneLocation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D getOneLocation() {
        return oneLocation;
    }

    public OneLocationValue1 setOneLocation(final java.awt.geom.Point2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneLocation\" cannot be null!");
        this.oneLocation = value;

        return this;
    }
}
