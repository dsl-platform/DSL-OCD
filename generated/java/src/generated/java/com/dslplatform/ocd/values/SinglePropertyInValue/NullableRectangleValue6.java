package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableRectangleValue6 implements java.io.Serializable {
    public NullableRectangleValue6(
            final java.awt.geom.Rectangle2D nullableRectangle) {
        setNullableRectangle(nullableRectangle);
    }

    public NullableRectangleValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1917131885;
        result = prime
                * result
                + (this.nullableRectangle != null ? this.nullableRectangle
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableRectangleValue6)) return false;
        final NullableRectangleValue6 other = (NullableRectangleValue6) obj;

        if (!(this.nullableRectangle == other.nullableRectangle || this.nullableRectangle != null
                && this.nullableRectangle.equals(other.nullableRectangle)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableRectangleValue6(" + nullableRectangle + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D nullableRectangle;

    @JsonProperty("nullableRectangle")
    public java.awt.geom.Rectangle2D getNullableRectangle() {
        return nullableRectangle;
    }

    public NullableRectangleValue6 setNullableRectangle(
            final java.awt.geom.Rectangle2D value) {
        this.nullableRectangle = value;

        return this;
    }
}
