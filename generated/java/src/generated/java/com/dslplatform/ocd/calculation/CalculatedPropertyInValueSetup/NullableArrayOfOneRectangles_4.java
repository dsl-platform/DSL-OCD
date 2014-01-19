package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneRectangles_4 implements
        java.io.Serializable {
    public NullableArrayOfOneRectangles_4(
            final java.awt.geom.Rectangle2D[] nullableArrayOfOneRectangles,
            final java.awt.geom.Rectangle2D[] calculatedNullableArrayOfOneRectangles,
            final java.awt.geom.Rectangle2D[] persistedNullableArrayOfOneRectangles) {
        setNullableArrayOfOneRectangles(nullableArrayOfOneRectangles);
        this.calculatedNullableArrayOfOneRectangles = calculatedNullableArrayOfOneRectangles;
        this.persistedNullableArrayOfOneRectangles = persistedNullableArrayOfOneRectangles;
    }

    public NullableArrayOfOneRectangles_4() {
        this.calculatedNullableArrayOfOneRectangles = null;
        this.persistedNullableArrayOfOneRectangles = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 436337982;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneRectangles_4)) return false;
        final NullableArrayOfOneRectangles_4 other = (NullableArrayOfOneRectangles_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneRectangles,
                other.nullableArrayOfOneRectangles))) return false;
        if (!(this.calculatedNullableArrayOfOneRectangles == other.calculatedNullableArrayOfOneRectangles || this.calculatedNullableArrayOfOneRectangles != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneRectangles,
                        other.calculatedNullableArrayOfOneRectangles)))
            return false;
        if (!(this.persistedNullableArrayOfOneRectangles == other.persistedNullableArrayOfOneRectangles || this.persistedNullableArrayOfOneRectangles != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneRectangles,
                        other.persistedNullableArrayOfOneRectangles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneRectangles_4(" + nullableArrayOfOneRectangles
                + ',' + calculatedNullableArrayOfOneRectangles + ','
                + persistedNullableArrayOfOneRectangles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Rectangle2D[] nullableArrayOfOneRectangles;

    @JsonProperty("nullableArrayOfOneRectangles")
    public java.awt.geom.Rectangle2D[] getNullableArrayOfOneRectangles() {
        return nullableArrayOfOneRectangles;
    }

    public NullableArrayOfOneRectangles_4 setNullableArrayOfOneRectangles(
            final java.awt.geom.Rectangle2D[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneRectangles = value;

        return this;
    }

    private final java.awt.geom.Rectangle2D[] calculatedNullableArrayOfOneRectangles;

    public java.awt.geom.Rectangle2D[] getCalculatedNullableArrayOfOneRectangles() {
        return this.calculatedNullableArrayOfOneRectangles;
    }

    private final java.awt.geom.Rectangle2D[] persistedNullableArrayOfOneRectangles;

    public java.awt.geom.Rectangle2D[] getPersistedNullableArrayOfOneRectangles() {
        return this.persistedNullableArrayOfOneRectangles;
    }
}
