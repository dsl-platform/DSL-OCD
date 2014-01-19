package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDecimalsWithScaleOf9_5 implements
        java.io.Serializable {
    public OneListOfOneDecimalsWithScaleOf9_5(
            final java.util.List<java.math.BigDecimal> oneListOfOneDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> calculatedOneListOfOneDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> persistedOneListOfOneDecimalsWithScaleOf9) {
        setOneListOfOneDecimalsWithScaleOf9(oneListOfOneDecimalsWithScaleOf9);
        this.calculatedOneListOfOneDecimalsWithScaleOf9 = calculatedOneListOfOneDecimalsWithScaleOf9;
        this.persistedOneListOfOneDecimalsWithScaleOf9 = persistedOneListOfOneDecimalsWithScaleOf9;
    }

    public OneListOfOneDecimalsWithScaleOf9_5() {
        this.oneListOfOneDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfOneDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfOneDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1899567429;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDecimalsWithScaleOf9_5)) return false;
        final OneListOfOneDecimalsWithScaleOf9_5 other = (OneListOfOneDecimalsWithScaleOf9_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneListOfOneDecimalsWithScaleOf9,
                other.oneListOfOneDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneListOfOneDecimalsWithScaleOf9,
                other.calculatedOneListOfOneDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneListOfOneDecimalsWithScaleOf9,
                other.persistedOneListOfOneDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDecimalsWithScaleOf9_5("
                + oneListOfOneDecimalsWithScaleOf9 + ','
                + calculatedOneListOfOneDecimalsWithScaleOf9 + ','
                + persistedOneListOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfOneDecimalsWithScaleOf9;

    @JsonProperty("oneListOfOneDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfOneDecimalsWithScaleOf9() {
        return oneListOfOneDecimalsWithScaleOf9;
    }

    public OneListOfOneDecimalsWithScaleOf9_5 setOneListOfOneDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneListOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedOneListOfOneDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfOneDecimalsWithScaleOf9() {
        return this.calculatedOneListOfOneDecimalsWithScaleOf9;
    }

    private final java.util.List<java.math.BigDecimal> persistedOneListOfOneDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getPersistedOneListOfOneDecimalsWithScaleOf9() {
        return this.persistedOneListOfOneDecimalsWithScaleOf9;
    }
}
