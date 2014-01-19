package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableRectangles_4 implements
        java.io.Serializable {
    public NullableSetOfNullableRectangles_4(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> calculatedNullableSetOfNullableRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> persistedNullableSetOfNullableRectangles) {
        setNullableSetOfNullableRectangles(nullableSetOfNullableRectangles);
        this.calculatedNullableSetOfNullableRectangles = calculatedNullableSetOfNullableRectangles;
        this.persistedNullableSetOfNullableRectangles = persistedNullableSetOfNullableRectangles;
    }

    public NullableSetOfNullableRectangles_4() {
        this.calculatedNullableSetOfNullableRectangles = null;
        this.persistedNullableSetOfNullableRectangles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2096201472;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableRectangles_4)) return false;
        final NullableSetOfNullableRectangles_4 other = (NullableSetOfNullableRectangles_4) obj;

        if (!(this.nullableSetOfNullableRectangles == other.nullableSetOfNullableRectangles || this.nullableSetOfNullableRectangles != null
                && this.nullableSetOfNullableRectangles
                        .equals(other.nullableSetOfNullableRectangles)))
            return false;
        if (!(this.calculatedNullableSetOfNullableRectangles == other.calculatedNullableSetOfNullableRectangles || this.calculatedNullableSetOfNullableRectangles != null
                && this.calculatedNullableSetOfNullableRectangles
                        .equals(other.calculatedNullableSetOfNullableRectangles)))
            return false;
        if (!(this.persistedNullableSetOfNullableRectangles == other.persistedNullableSetOfNullableRectangles || this.persistedNullableSetOfNullableRectangles != null
                && this.persistedNullableSetOfNullableRectangles
                        .equals(other.persistedNullableSetOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableRectangles_4("
                + nullableSetOfNullableRectangles + ','
                + calculatedNullableSetOfNullableRectangles + ','
                + persistedNullableSetOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles;

    @JsonProperty("nullableSetOfNullableRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfNullableRectangles() {
        return nullableSetOfNullableRectangles;
    }

    public NullableSetOfNullableRectangles_4 setNullableSetOfNullableRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        this.nullableSetOfNullableRectangles = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> calculatedNullableSetOfNullableRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getCalculatedNullableSetOfNullableRectangles() {
        return this.calculatedNullableSetOfNullableRectangles;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> persistedNullableSetOfNullableRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getPersistedNullableSetOfNullableRectangles() {
        return this.persistedNullableSetOfNullableRectangles;
    }
}
