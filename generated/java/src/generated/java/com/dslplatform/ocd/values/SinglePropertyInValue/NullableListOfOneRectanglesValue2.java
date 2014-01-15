package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneRectanglesValue2 implements
        java.io.Serializable {
    public NullableListOfOneRectanglesValue2(
            final java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles) {
        setNullableListOfOneRectangles(nullableListOfOneRectangles);
    }

    public NullableListOfOneRectanglesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1266830949;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneRectanglesValue2)) return false;
        final NullableListOfOneRectanglesValue2 other = (NullableListOfOneRectanglesValue2) obj;

        if (!(this.nullableListOfOneRectangles == other.nullableListOfOneRectangles || this.nullableListOfOneRectangles != null
                && this.nullableListOfOneRectangles
                        .equals(other.nullableListOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneRectanglesValue2("
                + nullableListOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles;

    @JsonProperty("nullableListOfOneRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getNullableListOfOneRectangles() {
        return nullableListOfOneRectangles;
    }

    public NullableListOfOneRectanglesValue2 setNullableListOfOneRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneRectangles = value;

        return this;
    }
}
