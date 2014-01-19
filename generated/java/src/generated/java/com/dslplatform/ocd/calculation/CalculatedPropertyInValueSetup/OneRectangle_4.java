package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneRectangle_4 implements java.io.Serializable {
    public OneRectangle_4(
            final java.awt.geom.Rectangle2D oneRectangle,
            final java.awt.geom.Rectangle2D calculatedOneRectangle,
            final java.awt.geom.Rectangle2D persistedOneRectangle) {
        setOneRectangle(oneRectangle);
        this.calculatedOneRectangle = calculatedOneRectangle;
        this.persistedOneRectangle = persistedOneRectangle;
    }

    public OneRectangle_4() {
        this.oneRectangle = new java.awt.geom.Rectangle2D.Float();
        this.calculatedOneRectangle = new java.awt.geom.Rectangle2D.Float();
        this.persistedOneRectangle = new java.awt.geom.Rectangle2D.Float();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 181285276;
        result = prime
                * result
                + (this.oneRectangle != null ? this.oneRectangle.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneRectangle != null
                        ? this.calculatedOneRectangle.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedOneRectangle != null
                        ? this.persistedOneRectangle.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneRectangle_4)) return false;
        final OneRectangle_4 other = (OneRectangle_4) obj;

        if (!(this.oneRectangle.equals(other.oneRectangle))) return false;
        if (!(this.calculatedOneRectangle.equals(other.calculatedOneRectangle)))
            return false;
        if (!(this.persistedOneRectangle.equals(other.persistedOneRectangle)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneRectangle_4(" + oneRectangle + ',' + calculatedOneRectangle
                + ',' + persistedOneRectangle + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D oneRectangle;

    @JsonProperty("oneRectangle")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Rectangle2D getOneRectangle() {
        return oneRectangle;
    }

    public OneRectangle_4 setOneRectangle(final java.awt.geom.Rectangle2D value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneRectangle\" cannot be null!");
        this.oneRectangle = value;

        return this;
    }

    private final java.awt.geom.Rectangle2D calculatedOneRectangle;

    public java.awt.geom.Rectangle2D getCalculatedOneRectangle() {
        return this.calculatedOneRectangle;
    }

    private final java.awt.geom.Rectangle2D persistedOneRectangle;

    public java.awt.geom.Rectangle2D getPersistedOneRectangle() {
        return this.persistedOneRectangle;
    }
}
