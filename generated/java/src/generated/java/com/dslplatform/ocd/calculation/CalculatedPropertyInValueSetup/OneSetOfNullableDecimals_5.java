package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDecimals_5 implements java.io.Serializable {
    public OneSetOfNullableDecimals_5(
            final java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimals,
            final java.util.Set<java.math.BigDecimal> calculatedOneSetOfNullableDecimals,
            final java.util.Set<java.math.BigDecimal> persistedOneSetOfNullableDecimals) {
        setOneSetOfNullableDecimals(oneSetOfNullableDecimals);
        this.calculatedOneSetOfNullableDecimals = calculatedOneSetOfNullableDecimals;
        this.persistedOneSetOfNullableDecimals = persistedOneSetOfNullableDecimals;
    }

    public OneSetOfNullableDecimals_5() {
        this.oneSetOfNullableDecimals = new java.util.HashSet<java.math.BigDecimal>();
        this.calculatedOneSetOfNullableDecimals = new java.util.HashSet<java.math.BigDecimal>();
        this.persistedOneSetOfNullableDecimals = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1886180498;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDecimals_5)) return false;
        final OneSetOfNullableDecimals_5 other = (OneSetOfNullableDecimals_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneSetOfNullableDecimals, other.oneSetOfNullableDecimals)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneSetOfNullableDecimals,
                other.calculatedOneSetOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneSetOfNullableDecimals,
                other.persistedOneSetOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDecimals_5(" + oneSetOfNullableDecimals + ','
                + calculatedOneSetOfNullableDecimals + ','
                + persistedOneSetOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimals;

    @JsonProperty("oneSetOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfNullableDecimals() {
        return oneSetOfNullableDecimals;
    }

    public OneSetOfNullableDecimals_5 setOneSetOfNullableDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDecimals\" cannot be null!");
        this.oneSetOfNullableDecimals = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedOneSetOfNullableDecimals;

    public java.util.Set<java.math.BigDecimal> getCalculatedOneSetOfNullableDecimals() {
        return this.calculatedOneSetOfNullableDecimals;
    }

    private final java.util.Set<java.math.BigDecimal> persistedOneSetOfNullableDecimals;

    public java.util.Set<java.math.BigDecimal> getPersistedOneSetOfNullableDecimals() {
        return this.persistedOneSetOfNullableDecimals;
    }
}
