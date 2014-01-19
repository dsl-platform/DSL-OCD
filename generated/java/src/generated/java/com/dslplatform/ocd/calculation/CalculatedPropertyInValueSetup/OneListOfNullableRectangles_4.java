package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableRectangles_4 implements
        java.io.Serializable {
    public OneListOfNullableRectangles_4(
            final java.util.List<java.awt.geom.Rectangle2D> oneListOfNullableRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> calculatedOneListOfNullableRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> persistedOneListOfNullableRectangles) {
        setOneListOfNullableRectangles(oneListOfNullableRectangles);
        this.calculatedOneListOfNullableRectangles = calculatedOneListOfNullableRectangles;
        this.persistedOneListOfNullableRectangles = persistedOneListOfNullableRectangles;
    }

    public OneListOfNullableRectangles_4() {
        this.oneListOfNullableRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
        this.calculatedOneListOfNullableRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
        this.persistedOneListOfNullableRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 877370235;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableRectangles_4)) return false;
        final OneListOfNullableRectangles_4 other = (OneListOfNullableRectangles_4) obj;

        if (!(this.oneListOfNullableRectangles
                .equals(other.oneListOfNullableRectangles))) return false;
        if (!(this.calculatedOneListOfNullableRectangles
                .equals(other.calculatedOneListOfNullableRectangles)))
            return false;
        if (!(this.persistedOneListOfNullableRectangles
                .equals(other.persistedOneListOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableRectangles_4(" + oneListOfNullableRectangles
                + ',' + calculatedOneListOfNullableRectangles + ','
                + persistedOneListOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> oneListOfNullableRectangles;

    @JsonProperty("oneListOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Rectangle2D> getOneListOfNullableRectangles() {
        return oneListOfNullableRectangles;
    }

    public OneListOfNullableRectangles_4 setOneListOfNullableRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableRectangles\" cannot be null!");
        this.oneListOfNullableRectangles = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> calculatedOneListOfNullableRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getCalculatedOneListOfNullableRectangles() {
        return this.calculatedOneListOfNullableRectangles;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> persistedOneListOfNullableRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getPersistedOneListOfNullableRectangles() {
        return this.persistedOneListOfNullableRectangles;
    }
}
