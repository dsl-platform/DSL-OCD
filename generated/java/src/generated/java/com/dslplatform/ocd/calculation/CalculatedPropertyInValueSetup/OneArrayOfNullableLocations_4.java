package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableLocations_4 implements
        java.io.Serializable {
    public OneArrayOfNullableLocations_4(
            final java.awt.geom.Point2D[] oneArrayOfNullableLocations,
            final java.awt.geom.Point2D[] calculatedOneArrayOfNullableLocations,
            final java.awt.geom.Point2D[] persistedOneArrayOfNullableLocations) {
        setOneArrayOfNullableLocations(oneArrayOfNullableLocations);
        this.calculatedOneArrayOfNullableLocations = calculatedOneArrayOfNullableLocations;
        this.persistedOneArrayOfNullableLocations = persistedOneArrayOfNullableLocations;
    }

    public OneArrayOfNullableLocations_4() {
        this.oneArrayOfNullableLocations = new java.awt.geom.Point2D[] {};
        this.calculatedOneArrayOfNullableLocations = new java.awt.geom.Point2D[] {};
        this.persistedOneArrayOfNullableLocations = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 964538950;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableLocations_4)) return false;
        final OneArrayOfNullableLocations_4 other = (OneArrayOfNullableLocations_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableLocations,
                other.oneArrayOfNullableLocations))) return false;
        if (!(java.util.Arrays.equals(
                this.calculatedOneArrayOfNullableLocations,
                other.calculatedOneArrayOfNullableLocations))) return false;
        if (!(java.util.Arrays.equals(
                this.persistedOneArrayOfNullableLocations,
                other.persistedOneArrayOfNullableLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableLocations_4(" + oneArrayOfNullableLocations
                + ',' + calculatedOneArrayOfNullableLocations + ','
                + persistedOneArrayOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfNullableLocations;

    @JsonProperty("oneArrayOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfNullableLocations() {
        return oneArrayOfNullableLocations;
    }

    public OneArrayOfNullableLocations_4 setOneArrayOfNullableLocations(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableLocations\" cannot be null!");
        this.oneArrayOfNullableLocations = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedOneArrayOfNullableLocations;

    public java.awt.geom.Point2D[] getCalculatedOneArrayOfNullableLocations() {
        return this.calculatedOneArrayOfNullableLocations;
    }

    private final java.awt.geom.Point2D[] persistedOneArrayOfNullableLocations;

    public java.awt.geom.Point2D[] getPersistedOneArrayOfNullableLocations() {
        return this.persistedOneArrayOfNullableLocations;
    }
}
