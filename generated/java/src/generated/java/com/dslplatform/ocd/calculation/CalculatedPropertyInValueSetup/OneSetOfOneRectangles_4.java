package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneRectangles_4 implements java.io.Serializable {
    public OneSetOfOneRectangles_4(
            final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> calculatedOneSetOfOneRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> persistedOneSetOfOneRectangles) {
        setOneSetOfOneRectangles(oneSetOfOneRectangles);
        this.calculatedOneSetOfOneRectangles = calculatedOneSetOfOneRectangles;
        this.persistedOneSetOfOneRectangles = persistedOneSetOfOneRectangles;
    }

    public OneSetOfOneRectangles_4() {
        this.oneSetOfOneRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
        this.calculatedOneSetOfOneRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
        this.persistedOneSetOfOneRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 76405336;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneRectangles_4)) return false;
        final OneSetOfOneRectangles_4 other = (OneSetOfOneRectangles_4) obj;

        if (!(this.oneSetOfOneRectangles.equals(other.oneSetOfOneRectangles)))
            return false;
        if (!(this.calculatedOneSetOfOneRectangles
                .equals(other.calculatedOneSetOfOneRectangles))) return false;
        if (!(this.persistedOneSetOfOneRectangles
                .equals(other.persistedOneSetOfOneRectangles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneRectangles_4(" + oneSetOfOneRectangles + ','
                + calculatedOneSetOfOneRectangles + ','
                + persistedOneSetOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles;

    @JsonProperty("oneSetOfOneRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Rectangle2D> getOneSetOfOneRectangles() {
        return oneSetOfOneRectangles;
    }

    public OneSetOfOneRectangles_4 setOneSetOfOneRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneRectangles\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneRectangles = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> calculatedOneSetOfOneRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getCalculatedOneSetOfOneRectangles() {
        return this.calculatedOneSetOfOneRectangles;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> persistedOneSetOfOneRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getPersistedOneSetOfOneRectangles() {
        return this.persistedOneSetOfOneRectangles;
    }
}
