package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneLocationValue3 implements java.io.Serializable {
    public OneLocationValue3(
            final java.awt.geom.Point2D oneLocation) {
        setOneLocation(oneLocation);
    }

    public OneLocationValue3() {
        this.oneLocation = new java.awt.geom.Point2D.Float();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1949200257;
        result = prime * result
                + (this.oneLocation != null ? this.oneLocation.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneLocationValue3)) return false;
        final OneLocationValue3 other = (OneLocationValue3) obj;

        if (!(this.oneLocation.equals(other.oneLocation))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneLocationValue3(" + oneLocation + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D oneLocation;

    @JsonProperty("oneLocation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D getOneLocation() {
        return oneLocation;
    }

    public OneLocationValue3 setOneLocation(final java.awt.geom.Point2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneLocation\" cannot be null!");
        this.oneLocation = value;

        return this;
    }
}
