package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableRectangles_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableRectangles_1(
            final java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles) {
        setNullableArrayOfNullableRectangles(nullableArrayOfNullableRectangles);
    }

    public NullableArrayOfNullableRectangles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 430791646;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableRectangles_1))
            return false;
        final NullableArrayOfNullableRectangles_1 other = (NullableArrayOfNullableRectangles_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableRectangles,
                other.nullableArrayOfNullableRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableRectangles_1("
                + nullableArrayOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles;

    @JsonProperty("nullableArrayOfNullableRectangles")
    public java.awt.geom.Rectangle2D[] getNullableArrayOfNullableRectangles() {
        return nullableArrayOfNullableRectangles;
    }

    public NullableArrayOfNullableRectangles_1 setNullableArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        this.nullableArrayOfNullableRectangles = value;

        return this;
    }
}
