package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneRectangles_1 implements
        java.io.Serializable {
    public NullableListOfOneRectangles_1(
            final java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles) {
        setNullableListOfOneRectangles(nullableListOfOneRectangles);
    }

    public NullableListOfOneRectangles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2113547472;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneRectangles_1)) return false;
        final NullableListOfOneRectangles_1 other = (NullableListOfOneRectangles_1) obj;

        if (!(this.nullableListOfOneRectangles == other.nullableListOfOneRectangles || this.nullableListOfOneRectangles != null
                && this.nullableListOfOneRectangles
                        .equals(other.nullableListOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneRectangles_1(" + nullableListOfOneRectangles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles;

    @JsonProperty("nullableListOfOneRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getNullableListOfOneRectangles() {
        return nullableListOfOneRectangles;
    }

    public NullableListOfOneRectangles_1 setNullableListOfOneRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneRectangles = value;

        return this;
    }
}
