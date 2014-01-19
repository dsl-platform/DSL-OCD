package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableRectangles_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableRectangles_4(
            final java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles,
            final java.awt.geom.Rectangle2D[] calculatedNullableArrayOfNullableRectangles,
            final java.awt.geom.Rectangle2D[] persistedNullableArrayOfNullableRectangles) {
        setNullableArrayOfNullableRectangles(nullableArrayOfNullableRectangles);
        this.calculatedNullableArrayOfNullableRectangles = calculatedNullableArrayOfNullableRectangles;
        this.persistedNullableArrayOfNullableRectangles = persistedNullableArrayOfNullableRectangles;
    }

    public NullableArrayOfNullableRectangles_4() {
        this.calculatedNullableArrayOfNullableRectangles = null;
        this.persistedNullableArrayOfNullableRectangles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 430791643;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableRectangles_4))
            return false;
        final NullableArrayOfNullableRectangles_4 other = (NullableArrayOfNullableRectangles_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableRectangles,
                other.nullableArrayOfNullableRectangles))) return false;
        if (!(this.calculatedNullableArrayOfNullableRectangles == other.calculatedNullableArrayOfNullableRectangles || this.calculatedNullableArrayOfNullableRectangles != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableRectangles,
                        other.calculatedNullableArrayOfNullableRectangles)))
            return false;
        if (!(this.persistedNullableArrayOfNullableRectangles == other.persistedNullableArrayOfNullableRectangles || this.persistedNullableArrayOfNullableRectangles != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableRectangles,
                        other.persistedNullableArrayOfNullableRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableRectangles_4("
                + nullableArrayOfNullableRectangles + ','
                + calculatedNullableArrayOfNullableRectangles + ','
                + persistedNullableArrayOfNullableRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] nullableArrayOfNullableRectangles;

    @JsonProperty("nullableArrayOfNullableRectangles")
    public java.awt.geom.Rectangle2D[] getNullableArrayOfNullableRectangles() {
        return nullableArrayOfNullableRectangles;
    }

    public NullableArrayOfNullableRectangles_4 setNullableArrayOfNullableRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        this.nullableArrayOfNullableRectangles = value;

        return this;
    }

    private final java.awt.geom.Rectangle2D[] calculatedNullableArrayOfNullableRectangles;

    public java.awt.geom.Rectangle2D[] getCalculatedNullableArrayOfNullableRectangles() {
        return this.calculatedNullableArrayOfNullableRectangles;
    }

    private final java.awt.geom.Rectangle2D[] persistedNullableArrayOfNullableRectangles;

    public java.awt.geom.Rectangle2D[] getPersistedNullableArrayOfNullableRectangles() {
        return this.persistedNullableArrayOfNullableRectangles;
    }
}
