package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableRectangles_4 implements
        java.io.Serializable {
    public NullableListOfNullableRectangles_4(
            final java.util.List<java.awt.geom.Rectangle2D> nullableListOfNullableRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> calculatedNullableListOfNullableRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> persistedNullableListOfNullableRectangles) {
        setNullableListOfNullableRectangles(nullableListOfNullableRectangles);
        this.calculatedNullableListOfNullableRectangles = calculatedNullableListOfNullableRectangles;
        this.persistedNullableListOfNullableRectangles = persistedNullableListOfNullableRectangles;
    }

    public NullableListOfNullableRectangles_4() {
        this.calculatedNullableListOfNullableRectangles = null;
        this.persistedNullableListOfNullableRectangles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 510858166;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableRectangles_4)) return false;
        final NullableListOfNullableRectangles_4 other = (NullableListOfNullableRectangles_4) obj;

        if (!(this.nullableListOfNullableRectangles == other.nullableListOfNullableRectangles || this.nullableListOfNullableRectangles != null
                && this.nullableListOfNullableRectangles
                        .equals(other.nullableListOfNullableRectangles)))
            return false;
        if (!(this.calculatedNullableListOfNullableRectangles == other.calculatedNullableListOfNullableRectangles || this.calculatedNullableListOfNullableRectangles != null
                && this.calculatedNullableListOfNullableRectangles
                        .equals(other.calculatedNullableListOfNullableRectangles)))
            return false;
        if (!(this.persistedNullableListOfNullableRectangles == other.persistedNullableListOfNullableRectangles || this.persistedNullableListOfNullableRectangles != null
                && this.persistedNullableListOfNullableRectangles
                        .equals(other.persistedNullableListOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableRectangles_4("
                + nullableListOfNullableRectangles + ','
                + calculatedNullableListOfNullableRectangles + ','
                + persistedNullableListOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> nullableListOfNullableRectangles;

    @JsonProperty("nullableListOfNullableRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getNullableListOfNullableRectangles() {
        return nullableListOfNullableRectangles;
    }

    public NullableListOfNullableRectangles_4 setNullableListOfNullableRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        this.nullableListOfNullableRectangles = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> calculatedNullableListOfNullableRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getCalculatedNullableListOfNullableRectangles() {
        return this.calculatedNullableListOfNullableRectangles;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> persistedNullableListOfNullableRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getPersistedNullableListOfNullableRectangles() {
        return this.persistedNullableListOfNullableRectangles;
    }
}
