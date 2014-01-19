package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableRectangle_4 implements java.io.Serializable {
    public NullableRectangle_4(
            final java.awt.geom.Rectangle2D nullableRectangle,
            final java.awt.geom.Rectangle2D calculatedNullableRectangle,
            final java.awt.geom.Rectangle2D persistedNullableRectangle) {
        setNullableRectangle(nullableRectangle);
        this.calculatedNullableRectangle = calculatedNullableRectangle;
        this.persistedNullableRectangle = persistedNullableRectangle;
    }

    public NullableRectangle_4() {
        this.calculatedNullableRectangle = null;
        this.persistedNullableRectangle = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 818298815;
        result = prime
                * result
                + (this.nullableRectangle != null ? this.nullableRectangle
                        .hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableRectangle != null
                        ? this.calculatedNullableRectangle.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableRectangle != null
                        ? this.persistedNullableRectangle.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableRectangle_4)) return false;
        final NullableRectangle_4 other = (NullableRectangle_4) obj;

        if (!(this.nullableRectangle == other.nullableRectangle || this.nullableRectangle != null
                && this.nullableRectangle.equals(other.nullableRectangle)))
            return false;
        if (!(this.calculatedNullableRectangle == other.calculatedNullableRectangle || this.calculatedNullableRectangle != null
                && this.calculatedNullableRectangle
                        .equals(other.calculatedNullableRectangle)))
            return false;
        if (!(this.persistedNullableRectangle == other.persistedNullableRectangle || this.persistedNullableRectangle != null
                && this.persistedNullableRectangle
                        .equals(other.persistedNullableRectangle)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableRectangle_4(" + nullableRectangle + ','
                + calculatedNullableRectangle + ','
                + persistedNullableRectangle + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D nullableRectangle;

    @JsonProperty("nullableRectangle")
    public java.awt.geom.Rectangle2D getNullableRectangle() {
        return nullableRectangle;
    }

    public NullableRectangle_4 setNullableRectangle(
            final java.awt.geom.Rectangle2D value) {
        this.nullableRectangle = value;

        return this;
    }

    private final java.awt.geom.Rectangle2D calculatedNullableRectangle;

    public java.awt.geom.Rectangle2D getCalculatedNullableRectangle() {
        return this.calculatedNullableRectangle;
    }

    private final java.awt.geom.Rectangle2D persistedNullableRectangle;

    public java.awt.geom.Rectangle2D getPersistedNullableRectangle() {
        return this.persistedNullableRectangle;
    }
}
