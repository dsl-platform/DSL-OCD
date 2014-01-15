package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableRectanglesValue4 implements
        java.io.Serializable {
    public OneArrayOfNullableRectanglesValue4(
            final java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles) {
        setOneArrayOfNullableRectangles(oneArrayOfNullableRectangles);
    }

    public OneArrayOfNullableRectanglesValue4() {
        this.oneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 787928050;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableRectanglesValue4)) return false;
        final OneArrayOfNullableRectanglesValue4 other = (OneArrayOfNullableRectanglesValue4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableRectangles,
                other.oneArrayOfNullableRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableRectanglesValue4("
                + oneArrayOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles;

    @JsonProperty("oneArrayOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Rectangle2D[] getOneArrayOfNullableRectangles() {
        return oneArrayOfNullableRectangles;
    }

    public OneArrayOfNullableRectanglesValue4 setOneArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableRectangles\" cannot be null!");
        this.oneArrayOfNullableRectangles = value;

        return this;
    }
}
