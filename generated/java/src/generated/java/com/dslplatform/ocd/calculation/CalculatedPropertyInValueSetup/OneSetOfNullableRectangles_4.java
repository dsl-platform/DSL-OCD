package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableRectangles_4 implements java.io.Serializable {
    public OneSetOfNullableRectangles_4(
            final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> calculatedOneSetOfNullableRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> persistedOneSetOfNullableRectangles) {
        setOneSetOfNullableRectangles(oneSetOfNullableRectangles);
        this.calculatedOneSetOfNullableRectangles = calculatedOneSetOfNullableRectangles;
        this.persistedOneSetOfNullableRectangles = persistedOneSetOfNullableRectangles;
    }

    public OneSetOfNullableRectangles_4() {
        this.oneSetOfNullableRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
        this.calculatedOneSetOfNullableRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
        this.persistedOneSetOfNullableRectangles = new java.util.HashSet<java.awt.geom.Rectangle2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1809143495;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableRectangles_4)) return false;
        final OneSetOfNullableRectangles_4 other = (OneSetOfNullableRectangles_4) obj;

        if (!(this.oneSetOfNullableRectangles
                .equals(other.oneSetOfNullableRectangles))) return false;
        if (!(this.calculatedOneSetOfNullableRectangles
                .equals(other.calculatedOneSetOfNullableRectangles)))
            return false;
        if (!(this.persistedOneSetOfNullableRectangles
                .equals(other.persistedOneSetOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableRectangles_4(" + oneSetOfNullableRectangles
                + ',' + calculatedOneSetOfNullableRectangles + ','
                + persistedOneSetOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles;

    @JsonProperty("oneSetOfNullableRectangles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Rectangle2D> getOneSetOfNullableRectangles() {
        return oneSetOfNullableRectangles;
    }

    public OneSetOfNullableRectangles_4 setOneSetOfNullableRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableRectangles\" cannot be null!");
        this.oneSetOfNullableRectangles = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> calculatedOneSetOfNullableRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getCalculatedOneSetOfNullableRectangles() {
        return this.calculatedOneSetOfNullableRectangles;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> persistedOneSetOfNullableRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getPersistedOneSetOfNullableRectangles() {
        return this.persistedOneSetOfNullableRectangles;
    }
}
