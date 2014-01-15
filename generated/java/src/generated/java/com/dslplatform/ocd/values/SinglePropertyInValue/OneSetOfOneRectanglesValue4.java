package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneRectanglesValue4 implements java.io.Serializable {
    public OneSetOfOneRectanglesValue4(
            final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles) {
        setOneSetOfOneRectangles(oneSetOfOneRectangles);
    }

    public OneSetOfOneRectanglesValue4() {
        this.oneSetOfOneRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 933195268;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneRectanglesValue4)) return false;
        final OneSetOfOneRectanglesValue4 other = (OneSetOfOneRectanglesValue4) obj;

        if (!(this.oneSetOfOneRectangles.equals(other.oneSetOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneRectanglesValue4(" + oneSetOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles;

    @JsonProperty("oneSetOfOneRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Rectangle2D> getOneSetOfOneRectangles() {
        return oneSetOfOneRectangles;
    }

    public OneSetOfOneRectanglesValue4 setOneSetOfOneRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneRectangles\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneRectangles = value;

        return this;
    }
}
