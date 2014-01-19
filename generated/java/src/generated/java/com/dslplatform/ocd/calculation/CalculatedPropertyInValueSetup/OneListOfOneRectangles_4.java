package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneRectangles_4 implements java.io.Serializable {
    public OneListOfOneRectangles_4(
            final java.util.List<java.awt.geom.Rectangle2D> oneListOfOneRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> calculatedOneListOfOneRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> persistedOneListOfOneRectangles) {
        setOneListOfOneRectangles(oneListOfOneRectangles);
        this.calculatedOneListOfOneRectangles = calculatedOneListOfOneRectangles;
        this.persistedOneListOfOneRectangles = persistedOneListOfOneRectangles;
    }

    public OneListOfOneRectangles_4() {
        this.oneListOfOneRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
        this.calculatedOneListOfOneRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
        this.persistedOneListOfOneRectangles = new java.util.ArrayList<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1936797520;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneRectangles_4)) return false;
        final OneListOfOneRectangles_4 other = (OneListOfOneRectangles_4) obj;

        if (!(this.oneListOfOneRectangles.equals(other.oneListOfOneRectangles)))
            return false;
        if (!(this.calculatedOneListOfOneRectangles
                .equals(other.calculatedOneListOfOneRectangles))) return false;
        if (!(this.persistedOneListOfOneRectangles
                .equals(other.persistedOneListOfOneRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneRectangles_4(" + oneListOfOneRectangles + ','
                + calculatedOneListOfOneRectangles + ','
                + persistedOneListOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> oneListOfOneRectangles;

    @JsonProperty("oneListOfOneRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Rectangle2D> getOneListOfOneRectangles() {
        return oneListOfOneRectangles;
    }

    public OneListOfOneRectangles_4 setOneListOfOneRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneRectangles\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneRectangles = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> calculatedOneListOfOneRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getCalculatedOneListOfOneRectangles() {
        return this.calculatedOneListOfOneRectangles;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> persistedOneListOfOneRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getPersistedOneListOfOneRectangles() {
        return this.persistedOneListOfOneRectangles;
    }
}
