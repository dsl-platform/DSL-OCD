package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneLocation_1 implements java.io.Serializable {
    public OneLocation_1(
            final java.awt.geom.Point2D oneLocation) {
        setOneLocation(oneLocation);
    }

    public OneLocation_1() {
        this.oneLocation = new java.awt.geom.Point2D.Float();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1403519753;
        result = prime * result
                + (this.oneLocation != null ? this.oneLocation.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneLocation_1)) return false;
        final OneLocation_1 other = (OneLocation_1) obj;

        if (!(this.oneLocation.equals(other.oneLocation))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneLocation_1(" + oneLocation + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D oneLocation;

    @JsonProperty("oneLocation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D getOneLocation() {
        return oneLocation;
    }

    public OneLocation_1 setOneLocation(final java.awt.geom.Point2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneLocation\" cannot be null!");
        this.oneLocation = value;

        return this;
    }
}
