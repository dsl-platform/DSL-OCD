package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneRectanglesValue11 implements
        java.io.Serializable {
    public NullableArrayOfOneRectanglesValue11(
            final java.awt.geom.Rectangle2D[] nullableArrayOfOneRectangles) {
        setNullableArrayOfOneRectangles(nullableArrayOfOneRectangles);
    }

    public NullableArrayOfOneRectanglesValue11() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 585575676;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneRectanglesValue11))
            return false;
        final NullableArrayOfOneRectanglesValue11 other = (NullableArrayOfOneRectanglesValue11) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneRectangles,
                other.nullableArrayOfOneRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneRectanglesValue11("
                + nullableArrayOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] nullableArrayOfOneRectangles;

    @JsonProperty("nullableArrayOfOneRectangles")
    public java.awt.geom.Rectangle2D[] getNullableArrayOfOneRectangles() {
        return nullableArrayOfOneRectangles;
    }

    public NullableArrayOfOneRectanglesValue11 setNullableArrayOfOneRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneRectangles = value;

        return this;
    }
}
