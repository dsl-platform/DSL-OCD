package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableRectangles_1 implements
        java.io.Serializable {
    public OneListOfNullableRectangles_1(
            final java.util.List<java.awt.geom.Rectangle2D> oneListOfNullableRectangles) {
        setOneListOfNullableRectangles(oneListOfNullableRectangles);
    }

    public OneListOfNullableRectangles_1() {
        this.oneListOfNullableRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 877370232;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableRectangles_1)) return false;
        final OneListOfNullableRectangles_1 other = (OneListOfNullableRectangles_1) obj;

        if (!(this.oneListOfNullableRectangles
                .equals(other.oneListOfNullableRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableRectangles_1(" + oneListOfNullableRectangles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> oneListOfNullableRectangles;

    @JsonProperty("oneListOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Rectangle2D> getOneListOfNullableRectangles() {
        return oneListOfNullableRectangles;
    }

    public OneListOfNullableRectangles_1 setOneListOfNullableRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableRectangles\" cannot be null!");
        this.oneListOfNullableRectangles = value;

        return this;
    }
}
