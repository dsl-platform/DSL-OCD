package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OnePoint_1 implements java.io.Serializable {
    public OnePoint_1(
            final java.awt.geom.Point2D onePoint) {
        setOnePoint(onePoint);
    }

    public OnePoint_1() {
        this.onePoint = new java.awt.Point();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1359040604;
        result = prime * result
                + (this.onePoint != null ? this.onePoint.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OnePoint_1)) return false;
        final OnePoint_1 other = (OnePoint_1) obj;

        if (!(this.onePoint.equals(other.onePoint))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OnePoint_1(" + onePoint + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D onePoint;

    @JsonProperty("onePoint")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D getOnePoint() {
        return onePoint;
    }

    public OnePoint_1 setOnePoint(final java.awt.geom.Point2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"onePoint\" cannot be null!");
        this.onePoint = value;

        return this;
    }
}
