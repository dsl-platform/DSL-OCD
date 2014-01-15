package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneRectanglesValue2 implements
        java.io.Serializable {
    public NullableSetOfOneRectanglesValue2(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles) {
        setNullableSetOfOneRectangles(nullableSetOfOneRectangles);
    }

    public NullableSetOfOneRectanglesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 496497223;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneRectanglesValue2)) return false;
        final NullableSetOfOneRectanglesValue2 other = (NullableSetOfOneRectanglesValue2) obj;

        if (!(this.nullableSetOfOneRectangles == other.nullableSetOfOneRectangles || this.nullableSetOfOneRectangles != null
                && this.nullableSetOfOneRectangles
                        .equals(other.nullableSetOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneRectanglesValue2(" + nullableSetOfOneRectangles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles;

    @JsonProperty("nullableSetOfOneRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfOneRectangles() {
        return nullableSetOfOneRectangles;
    }

    public NullableSetOfOneRectanglesValue2 setNullableSetOfOneRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneRectangles = value;

        return this;
    }
}
