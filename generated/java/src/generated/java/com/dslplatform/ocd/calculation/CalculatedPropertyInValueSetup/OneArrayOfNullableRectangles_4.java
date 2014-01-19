package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableRectangles_4 implements
        java.io.Serializable {
    public OneArrayOfNullableRectangles_4(
            final java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles,
            final java.awt.geom.Rectangle2D[] calculatedOneArrayOfNullableRectangles,
            final java.awt.geom.Rectangle2D[] persistedOneArrayOfNullableRectangles) {
        setOneArrayOfNullableRectangles(oneArrayOfNullableRectangles);
        this.calculatedOneArrayOfNullableRectangles = calculatedOneArrayOfNullableRectangles;
        this.persistedOneArrayOfNullableRectangles = persistedOneArrayOfNullableRectangles;
    }

    public OneArrayOfNullableRectangles_4() {
        this.oneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
        this.calculatedOneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
        this.persistedOneArrayOfNullableRectangles = new java.awt.geom.Rectangle2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1429539186;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableRectangles_4)) return false;
        final OneArrayOfNullableRectangles_4 other = (OneArrayOfNullableRectangles_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableRectangles,
                other.oneArrayOfNullableRectangles))) return false;
        if (!(java.util.Arrays.equals(
                this.calculatedOneArrayOfNullableRectangles,
                other.calculatedOneArrayOfNullableRectangles))) return false;
        if (!(java.util.Arrays.equals(
                this.persistedOneArrayOfNullableRectangles,
                other.persistedOneArrayOfNullableRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableRectangles_4(" + oneArrayOfNullableRectangles
                + ',' + calculatedOneArrayOfNullableRectangles + ','
                + persistedOneArrayOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] oneArrayOfNullableRectangles;

    @JsonProperty("oneArrayOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Rectangle2D[] getOneArrayOfNullableRectangles() {
        return oneArrayOfNullableRectangles;
    }

    public OneArrayOfNullableRectangles_4 setOneArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableRectangles\" cannot be null!");
        this.oneArrayOfNullableRectangles = value;

        return this;
    }

    private final java.awt.geom.Rectangle2D[] calculatedOneArrayOfNullableRectangles;

    public java.awt.geom.Rectangle2D[] getCalculatedOneArrayOfNullableRectangles() {
        return this.calculatedOneArrayOfNullableRectangles;
    }

    private final java.awt.geom.Rectangle2D[] persistedOneArrayOfNullableRectangles;

    public java.awt.geom.Rectangle2D[] getPersistedOneArrayOfNullableRectangles() {
        return this.persistedOneArrayOfNullableRectangles;
    }
}
