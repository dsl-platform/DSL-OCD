package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneRectangles_4 implements
        java.io.Serializable {
    public NullableListOfOneRectangles_4(
            final java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> calculatedNullableListOfOneRectangles,
            final java.util.List<java.awt.geom.Rectangle2D> persistedNullableListOfOneRectangles) {
        setNullableListOfOneRectangles(nullableListOfOneRectangles);
        this.calculatedNullableListOfOneRectangles = calculatedNullableListOfOneRectangles;
        this.persistedNullableListOfOneRectangles = persistedNullableListOfOneRectangles;
    }

    public NullableListOfOneRectangles_4() {
        this.calculatedNullableListOfOneRectangles = null;
        this.persistedNullableListOfOneRectangles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2113547469;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneRectangles_4)) return false;
        final NullableListOfOneRectangles_4 other = (NullableListOfOneRectangles_4) obj;

        if (!(this.nullableListOfOneRectangles == other.nullableListOfOneRectangles || this.nullableListOfOneRectangles != null
                && this.nullableListOfOneRectangles
                        .equals(other.nullableListOfOneRectangles)))
            return false;
        if (!(this.calculatedNullableListOfOneRectangles == other.calculatedNullableListOfOneRectangles || this.calculatedNullableListOfOneRectangles != null
                && this.calculatedNullableListOfOneRectangles
                        .equals(other.calculatedNullableListOfOneRectangles)))
            return false;
        if (!(this.persistedNullableListOfOneRectangles == other.persistedNullableListOfOneRectangles || this.persistedNullableListOfOneRectangles != null
                && this.persistedNullableListOfOneRectangles
                        .equals(other.persistedNullableListOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneRectangles_4(" + nullableListOfOneRectangles
                + ',' + calculatedNullableListOfOneRectangles + ','
                + persistedNullableListOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles;

    @JsonProperty("nullableListOfOneRectangles")
    public java.util.List<java.awt.geom.Rectangle2D> getNullableListOfOneRectangles() {
        return nullableListOfOneRectangles;
    }

    public NullableListOfOneRectangles_4 setNullableListOfOneRectangles(
            final java.util.List<java.awt.geom.Rectangle2D> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneRectangles = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> calculatedNullableListOfOneRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getCalculatedNullableListOfOneRectangles() {
        return this.calculatedNullableListOfOneRectangles;
    }

    private final java.util.List<java.awt.geom.Rectangle2D> persistedNullableListOfOneRectangles;

    public java.util.List<java.awt.geom.Rectangle2D> getPersistedNullableListOfOneRectangles() {
        return this.persistedNullableListOfOneRectangles;
    }
}
