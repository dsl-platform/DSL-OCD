package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableRectanglesValue4 implements
        java.io.Serializable {
    public NullableArrayOfNullableRectanglesValue4(
            final java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles) {
        setNullableArrayOfNullableRectangles(nullableArrayOfNullableRectangles);
    }

    public NullableArrayOfNullableRectanglesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1536912303;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableRectanglesValue4))
            return false;
        final NullableArrayOfNullableRectanglesValue4 other = (NullableArrayOfNullableRectanglesValue4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableRectangles,
                other.nullableArrayOfNullableRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableRectanglesValue4("
                + nullableArrayOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles;

    @JsonProperty("nullableArrayOfNullableRectangles")
    public java.awt.geom.Rectangle2D[] getNullableArrayOfNullableRectangles() {
        return nullableArrayOfNullableRectangles;
    }

    public NullableArrayOfNullableRectanglesValue4 setNullableArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        this.nullableArrayOfNullableRectangles = value;

        return this;
    }
}
