package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneLocations_4 implements java.io.Serializable {
    public OneSetOfOneLocations_4(
            final java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations,
            final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfOneLocations,
            final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfOneLocations) {
        setOneSetOfOneLocations(oneSetOfOneLocations);
        this.calculatedOneSetOfOneLocations = calculatedOneSetOfOneLocations;
        this.persistedOneSetOfOneLocations = persistedOneSetOfOneLocations;
    }

    public OneSetOfOneLocations_4() {
        this.oneSetOfOneLocations = new java.util.HashSet<java.awt.geom.Point2D>();
        this.calculatedOneSetOfOneLocations = new java.util.HashSet<java.awt.geom.Point2D>();
        this.persistedOneSetOfOneLocations = new java.util.HashSet<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1048039660;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneLocations_4)) return false;
        final OneSetOfOneLocations_4 other = (OneSetOfOneLocations_4) obj;

        if (!(this.oneSetOfOneLocations.equals(other.oneSetOfOneLocations)))
            return false;
        if (!(this.calculatedOneSetOfOneLocations
                .equals(other.calculatedOneSetOfOneLocations))) return false;
        if (!(this.persistedOneSetOfOneLocations
                .equals(other.persistedOneSetOfOneLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneLocations_4(" + oneSetOfOneLocations + ','
                + calculatedOneSetOfOneLocations + ','
                + persistedOneSetOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations;

    @JsonProperty("oneSetOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.geom.Point2D> getOneSetOfOneLocations() {
        return oneSetOfOneLocations;
    }

    public OneSetOfOneLocations_4 setOneSetOfOneLocations(
            final java.util.Set<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneLocations = value;

        return this;
    }

    private final java.util.Set<java.awt.geom.Point2D> calculatedOneSetOfOneLocations;

    public java.util.Set<java.awt.geom.Point2D> getCalculatedOneSetOfOneLocations() {
        return this.calculatedOneSetOfOneLocations;
    }

    private final java.util.Set<java.awt.geom.Point2D> persistedOneSetOfOneLocations;

    public java.util.Set<java.awt.geom.Point2D> getPersistedOneSetOfOneLocations() {
        return this.persistedOneSetOfOneLocations;
    }
}
