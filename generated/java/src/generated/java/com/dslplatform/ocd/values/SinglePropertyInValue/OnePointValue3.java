package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OnePointValue3 implements java.io.Serializable {
    public OnePointValue3(
            final java.awt.geom.Point2D onePoint) {
        setOnePoint(onePoint);
    }

    public OnePointValue3() {
        this.onePoint = new java.awt.Point();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1257476630;
        result = prime * result
                + (this.onePoint != null ? this.onePoint.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OnePointValue3)) return false;
        final OnePointValue3 other = (OnePointValue3) obj;

        if (!(this.onePoint.equals(other.onePoint))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OnePointValue3(" + onePoint + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D onePoint;

    @JsonProperty("onePoint")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D getOnePoint() {
        return onePoint;
    }

    public OnePointValue3 setOnePoint(final java.awt.geom.Point2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"onePoint\" cannot be null!");
        this.onePoint = value;

        return this;
    }
}
