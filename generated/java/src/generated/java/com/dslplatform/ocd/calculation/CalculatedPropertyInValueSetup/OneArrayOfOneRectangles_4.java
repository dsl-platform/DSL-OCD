package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneRectangles_4 implements java.io.Serializable {
    public OneArrayOfOneRectangles_4(
            final java.awt.geom.Rectangle2D[] oneArrayOfOneRectangles,
            final java.awt.geom.Rectangle2D[] calculatedOneArrayOfOneRectangles,
            final java.awt.geom.Rectangle2D[] persistedOneArrayOfOneRectangles) {
        setOneArrayOfOneRectangles(oneArrayOfOneRectangles);
        this.calculatedOneArrayOfOneRectangles = calculatedOneArrayOfOneRectangles;
        this.persistedOneArrayOfOneRectangles = persistedOneArrayOfOneRectangles;
    }

    public OneArrayOfOneRectangles_4() {
        this.oneArrayOfOneRectangles = new java.awt.geom.Rectangle2D[] {};
        this.calculatedOneArrayOfOneRectangles = new java.awt.geom.Rectangle2D[] {};
        this.persistedOneArrayOfOneRectangles = new java.awt.geom.Rectangle2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 321137791;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneRectangles_4)) return false;
        final OneArrayOfOneRectangles_4 other = (OneArrayOfOneRectangles_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneRectangles,
                other.oneArrayOfOneRectangles))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneRectangles,
                other.calculatedOneArrayOfOneRectangles))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneRectangles,
                other.persistedOneArrayOfOneRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneRectangles_4(" + oneArrayOfOneRectangles + ','
                + calculatedOneArrayOfOneRectangles + ','
                + persistedOneArrayOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] oneArrayOfOneRectangles;

    @JsonProperty("oneArrayOfOneRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Rectangle2D[] getOneArrayOfOneRectangles() {
        return oneArrayOfOneRectangles;
    }

    public OneArrayOfOneRectangles_4 setOneArrayOfOneRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneRectangles\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneRectangles = value;

        return this;
    }

    private final java.awt.geom.Rectangle2D[] calculatedOneArrayOfOneRectangles;

    public java.awt.geom.Rectangle2D[] getCalculatedOneArrayOfOneRectangles() {
        return this.calculatedOneArrayOfOneRectangles;
    }

    private final java.awt.geom.Rectangle2D[] persistedOneArrayOfOneRectangles;

    public java.awt.geom.Rectangle2D[] getPersistedOneArrayOfOneRectangles() {
        return this.persistedOneArrayOfOneRectangles;
    }
}
