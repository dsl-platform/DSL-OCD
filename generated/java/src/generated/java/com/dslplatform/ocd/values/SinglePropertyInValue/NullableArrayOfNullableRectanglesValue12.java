package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableRectanglesValue12 implements
        java.io.Serializable {
    public NullableArrayOfNullableRectanglesValue12(
            final java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles) {
        setNullableArrayOfNullableRectangles(nullableArrayOfNullableRectangles);
    }

    public NullableArrayOfNullableRectanglesValue12() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1475331792;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableRectanglesValue12))
            return false;
        final NullableArrayOfNullableRectanglesValue12 other = (NullableArrayOfNullableRectanglesValue12) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableRectangles,
                other.nullableArrayOfNullableRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableRectanglesValue12("
                + nullableArrayOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles;

    @JsonProperty("nullableArrayOfNullableRectangles")
    public java.awt.geom.Rectangle2D[] getNullableArrayOfNullableRectangles() {
        return nullableArrayOfNullableRectangles;
    }

    public NullableArrayOfNullableRectanglesValue12 setNullableArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        this.nullableArrayOfNullableRectangles = value;

        return this;
    }
}
