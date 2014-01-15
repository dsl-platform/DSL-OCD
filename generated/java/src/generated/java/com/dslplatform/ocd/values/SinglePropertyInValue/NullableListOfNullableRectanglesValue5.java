package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableRectanglesValue5 implements
        java.io.Serializable {
    public NullableListOfNullableRectanglesValue5(
            final java.util.List<java.awt.geom.Rectangle2D> nullableListOfNullableRectangles) {
        setNullableListOfNullableRectangles(nullableListOfNullableRectangles);
    }

    public NullableListOfNullableRectanglesValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1500909875;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableRectanglesValue5))
            return false;
        final NullableListOfNullableRectanglesValue5 other = (NullableListOfNullableRectanglesValue5) obj;

        if (!(this.nullableListOfNullableRectangles == other.nullableListOfNullableRectangles || this.nullableListOfNullableRectangles != null
                && this.nullableListOfNullableRectangles
                        .equals(other.nullableListOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableRectanglesValue5("
                + nullableListOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> nullableListOfNullableRectangles;

    @JsonProperty("nullableListOfNullableRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getNullableListOfNullableRectangles() {
        return nullableListOfNullableRectangles;
    }

    public NullableListOfNullableRectanglesValue5 setNullableListOfNullableRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        this.nullableListOfNullableRectangles = value;

        return this;
    }
}
