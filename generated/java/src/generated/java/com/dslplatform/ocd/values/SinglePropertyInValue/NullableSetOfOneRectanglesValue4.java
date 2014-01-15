package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneRectanglesValue4 implements
        java.io.Serializable {
    public NullableSetOfOneRectanglesValue4(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles) {
        setNullableSetOfOneRectangles(nullableSetOfOneRectangles);
    }

    public NullableSetOfOneRectanglesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 666302191;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneRectanglesValue4)) return false;
        final NullableSetOfOneRectanglesValue4 other = (NullableSetOfOneRectanglesValue4) obj;

        if (!(this.nullableSetOfOneRectangles == other.nullableSetOfOneRectangles || this.nullableSetOfOneRectangles != null
                && this.nullableSetOfOneRectangles
                        .equals(other.nullableSetOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneRectanglesValue4(" + nullableSetOfOneRectangles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles;

    @JsonProperty("nullableSetOfOneRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfOneRectangles() {
        return nullableSetOfOneRectangles;
    }

    public NullableSetOfOneRectanglesValue4 setNullableSetOfOneRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneRectangles = value;

        return this;
    }
}
