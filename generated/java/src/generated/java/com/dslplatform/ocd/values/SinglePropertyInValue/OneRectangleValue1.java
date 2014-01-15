package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneRectangleValue1 implements java.io.Serializable {
    public OneRectangleValue1(
            final java.awt.geom.Rectangle2D oneRectangle) {
        setOneRectangle(oneRectangle);
    }

    public OneRectangleValue1() {
        this.oneRectangle = new java.awt.Rectangle.Float();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 179549615;
        result = prime
                * result
                + (this.oneRectangle != null ? this.oneRectangle.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneRectangleValue1)) return false;
        final OneRectangleValue1 other = (OneRectangleValue1) obj;

        if (!(this.oneRectangle.equals(other.oneRectangle))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneRectangleValue1(" + oneRectangle + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D oneRectangle;

    @JsonProperty("oneRectangle")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Rectangle2D getOneRectangle() {
        return oneRectangle;
    }

    public OneRectangleValue1 setOneRectangle(
            final java.awt.geom.Rectangle2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneRectangle\" cannot be null!");
        this.oneRectangle = value;

        return this;
    }
}
