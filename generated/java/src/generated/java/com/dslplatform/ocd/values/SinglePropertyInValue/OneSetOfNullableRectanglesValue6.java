package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableRectanglesValue6 implements
        java.io.Serializable {
    public OneSetOfNullableRectanglesValue6(
            final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles) {
        setOneSetOfNullableRectangles(oneSetOfNullableRectangles);
    }

    public OneSetOfNullableRectanglesValue6() {
        this.oneSetOfNullableRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 543131669;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableRectanglesValue6)) return false;
        final OneSetOfNullableRectanglesValue6 other = (OneSetOfNullableRectanglesValue6) obj;

        if (!(this.oneSetOfNullableRectangles
                .equals(other.oneSetOfNullableRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableRectanglesValue6(" + oneSetOfNullableRectangles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles;

    @JsonProperty("oneSetOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Rectangle2D> getOneSetOfNullableRectangles() {
        return oneSetOfNullableRectangles;
    }

    public OneSetOfNullableRectanglesValue6 setOneSetOfNullableRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableRectangles\" cannot be null!");
        this.oneSetOfNullableRectangles = value;

        return this;
    }
}
