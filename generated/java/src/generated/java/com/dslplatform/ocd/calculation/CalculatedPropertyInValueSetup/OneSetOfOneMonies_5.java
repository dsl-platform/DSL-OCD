package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneMonies_5 implements java.io.Serializable {
    public OneSetOfOneMonies_5(
            final java.util.Set<java.math.BigDecimal> oneSetOfOneMonies,
            final java.util.Set<java.math.BigDecimal> calculatedOneSetOfOneMonies,
            final java.util.Set<java.math.BigDecimal> persistedOneSetOfOneMonies) {
        setOneSetOfOneMonies(oneSetOfOneMonies);
        this.calculatedOneSetOfOneMonies = calculatedOneSetOfOneMonies;
        this.persistedOneSetOfOneMonies = persistedOneSetOfOneMonies;
    }

    public OneSetOfOneMonies_5() {
        this.oneSetOfOneMonies = new java.util.HashSet<java.math.BigDecimal>();
        this.calculatedOneSetOfOneMonies = new java.util.HashSet<java.math.BigDecimal>();
        this.persistedOneSetOfOneMonies = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 716287552;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneMonies_5)) return false;
        final OneSetOfOneMonies_5 other = (OneSetOfOneMonies_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneSetOfOneMonies, other.oneSetOfOneMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneSetOfOneMonies,
                other.calculatedOneSetOfOneMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneSetOfOneMonies,
                other.persistedOneSetOfOneMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneMonies_5(" + oneSetOfOneMonies + ','
                + calculatedOneSetOfOneMonies + ','
                + persistedOneSetOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfOneMonies;

    @JsonProperty("oneSetOfOneMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfOneMonies() {
        return oneSetOfOneMonies;
    }

    public OneSetOfOneMonies_5 setOneSetOfOneMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneMonies\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneMonies = value;

        this.oneSetOfOneMonies = com.dslplatform.ocd.calculation.Guards
                .setScale(this.oneSetOfOneMonies, 2);
        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedOneSetOfOneMonies;

    public java.util.Set<java.math.BigDecimal> getCalculatedOneSetOfOneMonies() {
        return this.calculatedOneSetOfOneMonies;
    }

    private final java.util.Set<java.math.BigDecimal> persistedOneSetOfOneMonies;

    public java.util.Set<java.math.BigDecimal> getPersistedOneSetOfOneMonies() {
        return this.persistedOneSetOfOneMonies;
    }
}
