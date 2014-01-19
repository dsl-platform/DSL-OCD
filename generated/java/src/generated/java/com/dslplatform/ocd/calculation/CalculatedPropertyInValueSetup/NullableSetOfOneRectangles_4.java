package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneRectangles_4 implements java.io.Serializable {
    public NullableSetOfOneRectangles_4(
            final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> calculatedNullableSetOfOneRectangles,
            final java.util.Set<java.awt.geom.Rectangle2D> persistedNullableSetOfOneRectangles) {
        setNullableSetOfOneRectangles(nullableSetOfOneRectangles);
        this.calculatedNullableSetOfOneRectangles = calculatedNullableSetOfOneRectangles;
        this.persistedNullableSetOfOneRectangles = persistedNullableSetOfOneRectangles;
    }

    public NullableSetOfOneRectangles_4() {
        this.calculatedNullableSetOfOneRectangles = null;
        this.persistedNullableSetOfOneRectangles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 617027283;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneRectangles_4)) return false;
        final NullableSetOfOneRectangles_4 other = (NullableSetOfOneRectangles_4) obj;

        if (!(this.nullableSetOfOneRectangles == other.nullableSetOfOneRectangles || this.nullableSetOfOneRectangles != null
                && this.nullableSetOfOneRectangles
                        .equals(other.nullableSetOfOneRectangles)))
            return false;
        if (!(this.calculatedNullableSetOfOneRectangles == other.calculatedNullableSetOfOneRectangles || this.calculatedNullableSetOfOneRectangles != null
                && this.calculatedNullableSetOfOneRectangles
                        .equals(other.calculatedNullableSetOfOneRectangles)))
            return false;
        if (!(this.persistedNullableSetOfOneRectangles == other.persistedNullableSetOfOneRectangles || this.persistedNullableSetOfOneRectangles != null
                && this.persistedNullableSetOfOneRectangles
                        .equals(other.persistedNullableSetOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneRectangles_4(" + nullableSetOfOneRectangles
                + ',' + calculatedNullableSetOfOneRectangles + ','
                + persistedNullableSetOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles;

    @JsonProperty("nullableSetOfOneRectangles")
    public java.util.Set<java.awt.geom.Rectangle2D> getNullableSetOfOneRectangles() {
        return nullableSetOfOneRectangles;
    }

    public NullableSetOfOneRectangles_4 setNullableSetOfOneRectangles(
            final java.util.Set<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneRectangles = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> calculatedNullableSetOfOneRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getCalculatedNullableSetOfOneRectangles() {
        return this.calculatedNullableSetOfOneRectangles;
    }

    private final java.util.Set<java.awt.geom.Rectangle2D> persistedNullableSetOfOneRectangles;

    public java.util.Set<java.awt.geom.Rectangle2D> getPersistedNullableSetOfOneRectangles() {
        return this.persistedNullableSetOfOneRectangles;
    }
}
