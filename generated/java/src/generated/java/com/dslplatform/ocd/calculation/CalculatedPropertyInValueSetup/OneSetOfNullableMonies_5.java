package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableMonies_5 implements java.io.Serializable {
    public OneSetOfNullableMonies_5(
            final java.util.Set<java.math.BigDecimal> oneSetOfNullableMonies,
            final java.util.Set<java.math.BigDecimal> calculatedOneSetOfNullableMonies,
            final java.util.Set<java.math.BigDecimal> persistedOneSetOfNullableMonies) {
        setOneSetOfNullableMonies(oneSetOfNullableMonies);
        this.calculatedOneSetOfNullableMonies = calculatedOneSetOfNullableMonies;
        this.persistedOneSetOfNullableMonies = persistedOneSetOfNullableMonies;
    }

    public OneSetOfNullableMonies_5() {
        this.oneSetOfNullableMonies = new java.util.HashSet<java.math.BigDecimal>();
        this.calculatedOneSetOfNullableMonies = new java.util.HashSet<java.math.BigDecimal>();
        this.persistedOneSetOfNullableMonies = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1163894409;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableMonies_5)) return false;
        final OneSetOfNullableMonies_5 other = (OneSetOfNullableMonies_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneSetOfNullableMonies, other.oneSetOfNullableMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneSetOfNullableMonies,
                other.calculatedOneSetOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneSetOfNullableMonies,
                other.persistedOneSetOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableMonies_5(" + oneSetOfNullableMonies + ','
                + calculatedOneSetOfNullableMonies + ','
                + persistedOneSetOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfNullableMonies;

    @JsonProperty("oneSetOfNullableMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfNullableMonies() {
        return oneSetOfNullableMonies;
    }

    public OneSetOfNullableMonies_5 setOneSetOfNullableMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableMonies\" cannot be null!");
        this.oneSetOfNullableMonies = value;

        this.oneSetOfNullableMonies = com.dslplatform.ocd.calculation.Guards
                .setScale(this.oneSetOfNullableMonies, 2);
        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedOneSetOfNullableMonies;

    public java.util.Set<java.math.BigDecimal> getCalculatedOneSetOfNullableMonies() {
        return this.calculatedOneSetOfNullableMonies;
    }

    private final java.util.Set<java.math.BigDecimal> persistedOneSetOfNullableMonies;

    public java.util.Set<java.math.BigDecimal> getPersistedOneSetOfNullableMonies() {
        return this.persistedOneSetOfNullableMonies;
    }
}
