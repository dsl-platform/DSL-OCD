package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDecimals_5 implements java.io.Serializable {
    public OneSetOfOneDecimals_5(
            final java.util.Set<java.math.BigDecimal> oneSetOfOneDecimals,
            final java.util.Set<java.math.BigDecimal> calculatedOneSetOfOneDecimals,
            final java.util.Set<java.math.BigDecimal> persistedOneSetOfOneDecimals) {
        setOneSetOfOneDecimals(oneSetOfOneDecimals);
        this.calculatedOneSetOfOneDecimals = calculatedOneSetOfOneDecimals;
        this.persistedOneSetOfOneDecimals = persistedOneSetOfOneDecimals;
    }

    public OneSetOfOneDecimals_5() {
        this.oneSetOfOneDecimals = new java.util.HashSet<java.math.BigDecimal>();
        this.calculatedOneSetOfOneDecimals = new java.util.HashSet<java.math.BigDecimal>();
        this.persistedOneSetOfOneDecimals = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 817442379;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDecimals_5)) return false;
        final OneSetOfOneDecimals_5 other = (OneSetOfOneDecimals_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneSetOfOneDecimals, other.oneSetOfOneDecimals)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneSetOfOneDecimals,
                other.calculatedOneSetOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneSetOfOneDecimals,
                other.persistedOneSetOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDecimals_5(" + oneSetOfOneDecimals + ','
                + calculatedOneSetOfOneDecimals + ','
                + persistedOneSetOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfOneDecimals;

    @JsonProperty("oneSetOfOneDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfOneDecimals() {
        return oneSetOfOneDecimals;
    }

    public OneSetOfOneDecimals_5 setOneSetOfOneDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDecimals\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneDecimals = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedOneSetOfOneDecimals;

    public java.util.Set<java.math.BigDecimal> getCalculatedOneSetOfOneDecimals() {
        return this.calculatedOneSetOfOneDecimals;
    }

    private final java.util.Set<java.math.BigDecimal> persistedOneSetOfOneDecimals;

    public java.util.Set<java.math.BigDecimal> getPersistedOneSetOfOneDecimals() {
        return this.persistedOneSetOfOneDecimals;
    }
}
