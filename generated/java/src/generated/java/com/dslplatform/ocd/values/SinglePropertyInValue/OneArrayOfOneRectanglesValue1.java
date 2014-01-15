package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneRectanglesValue1 implements
        java.io.Serializable {
    public OneArrayOfOneRectanglesValue1(
            final java.awt.geom.Rectangle2D[] oneArrayOfOneRectangles) {
        setOneArrayOfOneRectangles(oneArrayOfOneRectangles);
    }

    public OneArrayOfOneRectanglesValue1() {
        this.oneArrayOfOneRectangles = new java.awt.geom.Rectangle2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1355822064;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneRectanglesValue1)) return false;
        final OneArrayOfOneRectanglesValue1 other = (OneArrayOfOneRectanglesValue1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneRectangles,
                other.oneArrayOfOneRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneRectanglesValue1(" + oneArrayOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] oneArrayOfOneRectangles;

    @JsonProperty("oneArrayOfOneRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Rectangle2D[] getOneArrayOfOneRectangles() {
        return oneArrayOfOneRectangles;
    }

    public OneArrayOfOneRectanglesValue1 setOneArrayOfOneRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneRectangles\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneRectangles = value;

        return this;
    }
}
