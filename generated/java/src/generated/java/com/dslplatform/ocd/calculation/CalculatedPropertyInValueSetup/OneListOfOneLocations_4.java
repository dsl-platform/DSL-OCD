package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneLocations_4 implements java.io.Serializable {
    public OneListOfOneLocations_4(
            final java.util.List<java.awt.geom.Point2D> oneListOfOneLocations,
            final java.util.List<java.awt.geom.Point2D> calculatedOneListOfOneLocations,
            final java.util.List<java.awt.geom.Point2D> persistedOneListOfOneLocations) {
        setOneListOfOneLocations(oneListOfOneLocations);
        this.calculatedOneListOfOneLocations = calculatedOneListOfOneLocations;
        this.persistedOneListOfOneLocations = persistedOneListOfOneLocations;
    }

    public OneListOfOneLocations_4() {
        this.oneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.calculatedOneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
        this.persistedOneListOfOneLocations = new java.util.ArrayList<java.awt.geom.Point2D>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 400935372;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneLocations_4)) return false;
        final OneListOfOneLocations_4 other = (OneListOfOneLocations_4) obj;

        if (!(this.oneListOfOneLocations.equals(other.oneListOfOneLocations)))
            return false;
        if (!(this.calculatedOneListOfOneLocations
                .equals(other.calculatedOneListOfOneLocations))) return false;
        if (!(this.persistedOneListOfOneLocations
                .equals(other.persistedOneListOfOneLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneLocations_4(" + oneListOfOneLocations + ','
                + calculatedOneListOfOneLocations + ','
                + persistedOneListOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.geom.Point2D> oneListOfOneLocations;

    @JsonProperty("oneListOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.geom.Point2D> getOneListOfOneLocations() {
        return oneListOfOneLocations;
    }

    public OneListOfOneLocations_4 setOneListOfOneLocations(
            final java.util.List<java.awt.geom.Point2D> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneLocations = value;

        return this;
    }

    private final java.util.List<java.awt.geom.Point2D> calculatedOneListOfOneLocations;

    public java.util.List<java.awt.geom.Point2D> getCalculatedOneListOfOneLocations() {
        return this.calculatedOneListOfOneLocations;
    }

    private final java.util.List<java.awt.geom.Point2D> persistedOneListOfOneLocations;

    public java.util.List<java.awt.geom.Point2D> getPersistedOneListOfOneLocations() {
        return this.persistedOneListOfOneLocations;
    }
}
