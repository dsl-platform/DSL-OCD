package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDecimals_5 implements java.io.Serializable {
    public OneListOfNullableDecimals_5(
            final java.util.List<java.math.BigDecimal> oneListOfNullableDecimals,
            final java.util.List<java.math.BigDecimal> calculatedOneListOfNullableDecimals,
            final java.util.List<java.math.BigDecimal> persistedOneListOfNullableDecimals) {
        setOneListOfNullableDecimals(oneListOfNullableDecimals);
        this.calculatedOneListOfNullableDecimals = calculatedOneListOfNullableDecimals;
        this.persistedOneListOfNullableDecimals = persistedOneListOfNullableDecimals;
    }

    public OneListOfNullableDecimals_5() {
        this.oneListOfNullableDecimals = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfNullableDecimals = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfNullableDecimals = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 961726334;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDecimals_5)) return false;
        final OneListOfNullableDecimals_5 other = (OneListOfNullableDecimals_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards
                .compareBigDecimal(this.oneListOfNullableDecimals,
                        other.oneListOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneListOfNullableDecimals,
                other.calculatedOneListOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneListOfNullableDecimals,
                other.persistedOneListOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDecimals_5(" + oneListOfNullableDecimals + ','
                + calculatedOneListOfNullableDecimals + ','
                + persistedOneListOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfNullableDecimals;

    @JsonProperty("oneListOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfNullableDecimals() {
        return oneListOfNullableDecimals;
    }

    public OneListOfNullableDecimals_5 setOneListOfNullableDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDecimals\" cannot be null!");
        this.oneListOfNullableDecimals = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedOneListOfNullableDecimals;

    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfNullableDecimals() {
        return this.calculatedOneListOfNullableDecimals;
    }

    private final java.util.List<java.math.BigDecimal> persistedOneListOfNullableDecimals;

    public java.util.List<java.math.BigDecimal> getPersistedOneListOfNullableDecimals() {
        return this.persistedOneListOfNullableDecimals;
    }
}
