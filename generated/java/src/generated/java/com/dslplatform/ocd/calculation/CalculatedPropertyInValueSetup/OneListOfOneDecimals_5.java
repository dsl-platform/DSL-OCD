package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDecimals_5 implements java.io.Serializable {
    public OneListOfOneDecimals_5(
            final java.util.List<java.math.BigDecimal> oneListOfOneDecimals,
            final java.util.List<java.math.BigDecimal> calculatedOneListOfOneDecimals,
            final java.util.List<java.math.BigDecimal> persistedOneListOfOneDecimals) {
        setOneListOfOneDecimals(oneListOfOneDecimals);
        this.calculatedOneListOfOneDecimals = calculatedOneListOfOneDecimals;
        this.persistedOneListOfOneDecimals = persistedOneListOfOneDecimals;
    }

    public OneListOfOneDecimals_5() {
        this.oneListOfOneDecimals = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfOneDecimals = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfOneDecimals = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 659163205;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDecimals_5)) return false;
        final OneListOfOneDecimals_5 other = (OneListOfOneDecimals_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneListOfOneDecimals, other.oneListOfOneDecimals)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneListOfOneDecimals,
                other.calculatedOneListOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneListOfOneDecimals,
                other.persistedOneListOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDecimals_5(" + oneListOfOneDecimals + ','
                + calculatedOneListOfOneDecimals + ','
                + persistedOneListOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfOneDecimals;

    @JsonProperty("oneListOfOneDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfOneDecimals() {
        return oneListOfOneDecimals;
    }

    public OneListOfOneDecimals_5 setOneListOfOneDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDecimals\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneDecimals = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedOneListOfOneDecimals;

    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfOneDecimals() {
        return this.calculatedOneListOfOneDecimals;
    }

    private final java.util.List<java.math.BigDecimal> persistedOneListOfOneDecimals;

    public java.util.List<java.math.BigDecimal> getPersistedOneListOfOneDecimals() {
        return this.persistedOneListOfOneDecimals;
    }
}
