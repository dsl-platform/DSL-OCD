package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableLocations_4 implements java.io.Serializable {
    public OneListOfNullableLocations_4(
            final java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations,
            final java.util.List<java.awt.geom.Point2D> calculatedOneListOfNullableLocations,
            final java.util.List<java.awt.geom.Point2D> persistedOneListOfNullableLocations) {
        setOneListOfNullableLocations(oneListOfNullableLocations);
        this.calculatedOneListOfNullableLocations = calculatedOneListOfNullableLocations;
        this.persistedOneListOfNullableLocations = persistedOneListOfNullableLocations;
    }

    public OneListOfNullableLocations_4() {
        this.oneListOfNullableLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.calculatedOneListOfNullableLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.persistedOneListOfNullableLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1660037121;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableLocations_4)) return false;
        final OneListOfNullableLocations_4 other = (OneListOfNullableLocations_4) obj;

        if (!(this.oneListOfNullableLocations
                .equals(other.oneListOfNullableLocations))) return false;
        if (!(this.calculatedOneListOfNullableLocations
                .equals(other.calculatedOneListOfNullableLocations)))
            return false;
        if (!(this.persistedOneListOfNullableLocations
                .equals(other.persistedOneListOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableLocations_4(" + oneListOfNullableLocations
                + ',' + calculatedOneListOfNullableLocations + ','
                + persistedOneListOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations;

    @JsonProperty("oneListOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfNullableLocations() {
        return oneListOfNullableLocations;
    }

    public OneListOfNullableLocations_4 setOneListOfNullableLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableLocations\" cannot be null!");
        this.oneListOfNullableLocations = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedOneListOfNullableLocations;

    public java.util.List<java.awt.geom.Point2D> getCalculatedOneListOfNullableLocations() {
        return this.calculatedOneListOfNullableLocations;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedOneListOfNullableLocations;

    public java.util.List<java.awt.geom.Point2D> getPersistedOneListOfNullableLocations() {
        return this.persistedOneListOfNullableLocations;
    }
}
