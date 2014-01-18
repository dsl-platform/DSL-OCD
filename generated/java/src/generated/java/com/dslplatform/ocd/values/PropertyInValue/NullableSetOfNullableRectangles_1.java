package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableRectangles_1 implements
        java.io.Serializable {
    public NullableSetOfNullableRectangles_1(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles) {
        setNullableSetOfNullableRectangles(nullableSetOfNullableRectangles);
    }

    public NullableSetOfNullableRectangles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2096201469;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableRectangles_1)) return false;
        final NullableSetOfNullableRectangles_1 other = (NullableSetOfNullableRectangles_1) obj;

        if (!(this.nullableSetOfNullableRectangles == other.nullableSetOfNullableRectangles || this.nullableSetOfNullableRectangles != null
                && this.nullableSetOfNullableRectangles
                        .equals(other.nullableSetOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableRectangles_1("
                + nullableSetOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles;

    @JsonProperty("nullableSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfNullableRectangles() {
        return nullableSetOfNullableRectangles;
    }

    public NullableSetOfNullableRectangles_1 setNullableSetOfNullableRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        this.nullableSetOfNullableRectangles = value;

        return this;
    }
}
