package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneMonies_5 implements java.io.Serializable {
    public OneListOfOneMonies_5(
            final java.util.List<java.math.BigDecimal> oneListOfOneMonies,
            final java.util.List<java.math.BigDecimal> calculatedOneListOfOneMonies,
            final java.util.List<java.math.BigDecimal> persistedOneListOfOneMonies) {
        setOneListOfOneMonies(oneListOfOneMonies);
        this.calculatedOneListOfOneMonies = calculatedOneListOfOneMonies;
        this.persistedOneListOfOneMonies = persistedOneListOfOneMonies;
    }

    public OneListOfOneMonies_5() {
        this.oneListOfOneMonies = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfOneMonies = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfOneMonies = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1688845256;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneMonies_5)) return false;
        final OneListOfOneMonies_5 other = (OneListOfOneMonies_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneListOfOneMonies, other.oneListOfOneMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneListOfOneMonies,
                other.calculatedOneListOfOneMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneListOfOneMonies,
                other.persistedOneListOfOneMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneMonies_5(" + oneListOfOneMonies + ','
                + calculatedOneListOfOneMonies + ','
                + persistedOneListOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfOneMonies;

    @JsonProperty("oneListOfOneMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfOneMonies() {
        return oneListOfOneMonies;
    }

    public OneListOfOneMonies_5 setOneListOfOneMonies(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneMonies\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneMonies = value;

        this.oneListOfOneMonies = com.dslplatform.ocd.calculation.Guards
                .setScale(this.oneListOfOneMonies, 2);
        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedOneListOfOneMonies;

    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfOneMonies() {
        return this.calculatedOneListOfOneMonies;
    }

    private final java.util.List<java.math.BigDecimal> persistedOneListOfOneMonies;

    public java.util.List<java.math.BigDecimal> getPersistedOneListOfOneMonies() {
        return this.persistedOneListOfOneMonies;
    }
}
