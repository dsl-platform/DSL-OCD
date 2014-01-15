package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableRectanglesValue4 implements
        java.io.Serializable {
    public NullableListOfNullableRectanglesValue4(
            final java.util.List<java.awt.geom.Rectangle2D> nullableListOfNullableRectangles) {
        setNullableListOfNullableRectangles(nullableListOfNullableRectangles);
    }

    public NullableListOfNullableRectanglesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 65174066;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableRectanglesValue4))
            return false;
        final NullableListOfNullableRectanglesValue4 other = (NullableListOfNullableRectanglesValue4) obj;

        if (!(this.nullableListOfNullableRectangles == other.nullableListOfNullableRectangles || this.nullableListOfNullableRectangles != null
                && this.nullableListOfNullableRectangles
                        .equals(other.nullableListOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableRectanglesValue4("
                + nullableListOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> nullableListOfNullableRectangles;

    @JsonProperty("nullableListOfNullableRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getNullableListOfNullableRectangles() {
        return nullableListOfNullableRectangles;
    }

    public NullableListOfNullableRectanglesValue4 setNullableListOfNullableRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        this.nullableListOfNullableRectangles = value;

        return this;
    }
}
