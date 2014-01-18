package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneRectangles_1 implements java.io.Serializable {
    public NullableSetOfOneRectangles_1(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles) {
        setNullableSetOfOneRectangles(nullableSetOfOneRectangles);
    }

    public NullableSetOfOneRectangles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1376542170;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneRectangles_1)) return false;
        final NullableSetOfOneRectangles_1 other = (NullableSetOfOneRectangles_1) obj;

        if (!(this.nullableSetOfOneRectangles == other.nullableSetOfOneRectangles || this.nullableSetOfOneRectangles != null
                && this.nullableSetOfOneRectangles
                        .equals(other.nullableSetOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneRectangles_1(" + nullableSetOfOneRectangles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles;

    @JsonProperty("nullableSetOfOneRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfOneRectangles() {
        return nullableSetOfOneRectangles;
    }

    public NullableSetOfOneRectangles_1 setNullableSetOfOneRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneRectangles = value;

        return this;
    }
}
