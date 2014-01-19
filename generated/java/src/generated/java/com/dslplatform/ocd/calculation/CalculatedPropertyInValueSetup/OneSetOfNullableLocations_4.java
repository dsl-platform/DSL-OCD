package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableLocations_4 implements java.io.Serializable {
    public OneSetOfNullableLocations_4(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations,
            final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullableLocations,
            final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullableLocations) {
        setOneSetOfNullableLocations(oneSetOfNullableLocations);
        this.calculatedOneSetOfNullableLocations = calculatedOneSetOfNullableLocations;
        this.persistedOneSetOfNullableLocations = persistedOneSetOfNullableLocations;
    }

    public OneSetOfNullableLocations_4() {
        this.oneSetOfNullableLocations = new java.util.HashSet<java.awt.geom.Point2D>();
        this.calculatedOneSetOfNullableLocations = new java.util.HashSet<java.awt.geom.Point2D>();
        this.persistedOneSetOfNullableLocations = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1272497091;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableLocations_4)) return false;
        final OneSetOfNullableLocations_4 other = (OneSetOfNullableLocations_4) obj;

        if (!(this.oneSetOfNullableLocations
                .equals(other.oneSetOfNullableLocations))) return false;
        if (!(this.calculatedOneSetOfNullableLocations
                .equals(other.calculatedOneSetOfNullableLocations)))
            return false;
        if (!(this.persistedOneSetOfNullableLocations
                .equals(other.persistedOneSetOfNullableLocations)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableLocations_4(" + oneSetOfNullableLocations + ','
                + calculatedOneSetOfNullableLocations + ','
                + persistedOneSetOfNullableLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations;

    @JsonProperty("oneSetOfNullableLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfNullableLocations() {
        return oneSetOfNullableLocations;
    }

    public OneSetOfNullableLocations_4 setOneSetOfNullableLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableLocations\" cannot be null!");
        this.oneSetOfNullableLocations = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfNullableLocations;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedOneSetOfNullableLocations() {
        return this.calculatedOneSetOfNullableLocations;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfNullableLocations;

    public java.util.Set<java.awt.geom.Point2D> getPersistedOneSetOfNullableLocations() {
        return this.persistedOneSetOfNullableLocations;
    }
}
