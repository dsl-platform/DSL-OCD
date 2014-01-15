package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneRectanglesValue3 implements
        java.io.Serializable {
    public NullableListOfOneRectanglesValue3(
            final java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles) {
        setNullableListOfOneRectangles(nullableListOfOneRectangles);
    }

    public NullableListOfOneRectanglesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1266830950;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneRectanglesValue3)) return false;
        final NullableListOfOneRectanglesValue3 other = (NullableListOfOneRectanglesValue3) obj;

        if (!(this.nullableListOfOneRectangles == other.nullableListOfOneRectangles || this.nullableListOfOneRectangles != null
                && this.nullableListOfOneRectangles
                        .equals(other.nullableListOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneRectanglesValue3("
                + nullableListOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles;

    @JsonProperty("nullableListOfOneRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getNullableListOfOneRectangles() {
        return nullableListOfOneRectangles;
    }

    public NullableListOfOneRectanglesValue3 setNullableListOfOneRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneRectangles = value;

        return this;
    }
}
