package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneLocations_4 implements java.io.Serializable {
    public OneArrayOfOneLocations_4(
            final java.awt.geom.Point2D[] oneArrayOfOneLocations,
            final java.awt.geom.Point2D[] calculatedOneArrayOfOneLocations,
            final java.awt.geom.Point2D[] persistedOneArrayOfOneLocations) {
        setOneArrayOfOneLocations(oneArrayOfOneLocations);
        this.calculatedOneArrayOfOneLocations = calculatedOneArrayOfOneLocations;
        this.persistedOneArrayOfOneLocations = persistedOneArrayOfOneLocations;
    }

    public OneArrayOfOneLocations_4() {
        this.oneArrayOfOneLocations = new java.awt.geom.Point2D[] {};
        this.calculatedOneArrayOfOneLocations = new java.awt.geom.Point2D[] {};
        this.persistedOneArrayOfOneLocations = new java.awt.geom.Point2D[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1908532785;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneLocations_4)) return false;
        final OneArrayOfOneLocations_4 other = (OneArrayOfOneLocations_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneLocations,
                other.oneArrayOfOneLocations))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneLocations,
                other.calculatedOneArrayOfOneLocations))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneLocations,
                other.persistedOneArrayOfOneLocations))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneLocations_4(" + oneArrayOfOneLocations + ','
                + calculatedOneArrayOfOneLocations + ','
                + persistedOneArrayOfOneLocations + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.geom.Point2D[] oneArrayOfOneLocations;

    @JsonProperty("oneArrayOfOneLocations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.geom.Point2D[] getOneArrayOfOneLocations() {
        return oneArrayOfOneLocations;
    }

    public OneArrayOfOneLocations_4 setOneArrayOfOneLocations(
            final java.awt.geom.Point2D[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneLocations\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneLocations = value;

        return this;
    }

    private final java.awt.geom.Point2D[] calculatedOneArrayOfOneLocations;

    public java.awt.geom.Point2D[] getCalculatedOneArrayOfOneLocations() {
        return this.calculatedOneArrayOfOneLocations;
    }

    private final java.awt.geom.Point2D[] persistedOneArrayOfOneLocations;

    public java.awt.geom.Point2D[] getPersistedOneArrayOfOneLocations() {
        return this.persistedOneArrayOfOneLocations;
    }
}
