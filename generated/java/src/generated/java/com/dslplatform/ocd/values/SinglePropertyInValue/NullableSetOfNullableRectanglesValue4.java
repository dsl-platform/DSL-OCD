package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableRectanglesValue4 implements
        java.io.Serializable {
    public NullableSetOfNullableRectanglesValue4(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles) {
        setNullableSetOfNullableRectangles(nullableSetOfNullableRectangles);
    }

    public NullableSetOfNullableRectanglesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 198237940;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableRectanglesValue4))
            return false;
        final NullableSetOfNullableRectanglesValue4 other = (NullableSetOfNullableRectanglesValue4) obj;

        if (!(this.nullableSetOfNullableRectangles == other.nullableSetOfNullableRectangles || this.nullableSetOfNullableRectangles != null
                && this.nullableSetOfNullableRectangles
                        .equals(other.nullableSetOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableRectanglesValue4("
                + nullableSetOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles;

    @JsonProperty("nullableSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfNullableRectangles() {
        return nullableSetOfNullableRectangles;
    }

    public NullableSetOfNullableRectanglesValue4 setNullableSetOfNullableRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        this.nullableSetOfNullableRectangles = value;

        return this;
    }
}
