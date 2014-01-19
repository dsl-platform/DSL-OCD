package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDecimalsWithScaleOf9_5 implements
        java.io.Serializable {
    public OneSetOfOneDecimalsWithScaleOf9_5(
            final java.util.Set<java.math.BigDecimal> oneSetOfOneDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> calculatedOneSetOfOneDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> persistedOneSetOfOneDecimalsWithScaleOf9) {
        setOneSetOfOneDecimalsWithScaleOf9(oneSetOfOneDecimalsWithScaleOf9);
        this.calculatedOneSetOfOneDecimalsWithScaleOf9 = calculatedOneSetOfOneDecimalsWithScaleOf9;
        this.persistedOneSetOfOneDecimalsWithScaleOf9 = persistedOneSetOfOneDecimalsWithScaleOf9;
    }

    public OneSetOfOneDecimalsWithScaleOf9_5() {
        this.oneSetOfOneDecimalsWithScaleOf9 = new java.util.HashSet<java.math.BigDecimal>();
        this.calculatedOneSetOfOneDecimalsWithScaleOf9 = new java.util.HashSet<java.math.BigDecimal>();
        this.persistedOneSetOfOneDecimalsWithScaleOf9 = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1808063591;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDecimalsWithScaleOf9_5)) return false;
        final OneSetOfOneDecimalsWithScaleOf9_5 other = (OneSetOfOneDecimalsWithScaleOf9_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneSetOfOneDecimalsWithScaleOf9,
                other.oneSetOfOneDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneSetOfOneDecimalsWithScaleOf9,
                other.calculatedOneSetOfOneDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneSetOfOneDecimalsWithScaleOf9,
                other.persistedOneSetOfOneDecimalsWithScaleOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDecimalsWithScaleOf9_5("
                + oneSetOfOneDecimalsWithScaleOf9 + ','
                + calculatedOneSetOfOneDecimalsWithScaleOf9 + ','
                + persistedOneSetOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfOneDecimalsWithScaleOf9;

    @JsonProperty("oneSetOfOneDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfOneDecimalsWithScaleOf9() {
        return oneSetOfOneDecimalsWithScaleOf9;
    }

    public OneSetOfOneDecimalsWithScaleOf9_5 setOneSetOfOneDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneSetOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedOneSetOfOneDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getCalculatedOneSetOfOneDecimalsWithScaleOf9() {
        return this.calculatedOneSetOfOneDecimalsWithScaleOf9;
    }

    private final java.util.Set<java.math.BigDecimal> persistedOneSetOfOneDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getPersistedOneSetOfOneDecimalsWithScaleOf9() {
        return this.persistedOneSetOfOneDecimalsWithScaleOf9;
    }
}
