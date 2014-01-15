package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneRectanglesValue6 implements java.io.Serializable {
    public OneSetOfOneRectanglesValue6(
            final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles) {
        setOneSetOfOneRectangles(oneSetOfOneRectangles);
    }

    public OneSetOfOneRectanglesValue6() {
        this.oneSetOfOneRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 933195270;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneRectanglesValue6)) return false;
        final OneSetOfOneRectanglesValue6 other = (OneSetOfOneRectanglesValue6) obj;

        if (!(this.oneSetOfOneRectangles.equals(other.oneSetOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneRectanglesValue6(" + oneSetOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles;

    @JsonProperty("oneSetOfOneRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Rectangle2D> getOneSetOfOneRectangles() {
        return oneSetOfOneRectangles;
    }

    public OneSetOfOneRectanglesValue6 setOneSetOfOneRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneRectangles\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneRectangles = value;

        return this;
    }
}
