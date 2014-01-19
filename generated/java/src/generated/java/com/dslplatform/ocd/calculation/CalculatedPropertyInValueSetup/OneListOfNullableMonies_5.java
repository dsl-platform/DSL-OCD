package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableMonies_5 implements java.io.Serializable {
    public OneListOfNullableMonies_5(
            final java.util.List<java.math.BigDecimal> oneListOfNullableMonies,
            final java.util.List<java.math.BigDecimal> calculatedOneListOfNullableMonies,
            final java.util.List<java.math.BigDecimal> persistedOneListOfNullableMonies) {
        setOneListOfNullableMonies(oneListOfNullableMonies);
        this.calculatedOneListOfNullableMonies = calculatedOneListOfNullableMonies;
        this.persistedOneListOfNullableMonies = persistedOneListOfNullableMonies;
    }

    public OneListOfNullableMonies_5() {
        this.oneListOfNullableMonies = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfNullableMonies = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfNullableMonies = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1314636779;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableMonies_5)) return false;
        final OneListOfNullableMonies_5 other = (OneListOfNullableMonies_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneListOfNullableMonies, other.oneListOfNullableMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneListOfNullableMonies,
                other.calculatedOneListOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneListOfNullableMonies,
                other.persistedOneListOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableMonies_5(" + oneListOfNullableMonies + ','
                + calculatedOneListOfNullableMonies + ','
                + persistedOneListOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfNullableMonies;

    @JsonProperty("oneListOfNullableMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfNullableMonies() {
        return oneListOfNullableMonies;
    }

    public OneListOfNullableMonies_5 setOneListOfNullableMonies(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableMonies\" cannot be null!");
        this.oneListOfNullableMonies = value;

        this.oneListOfNullableMonies = com.dslplatform.ocd.calculation.Guards
                .setScale(this.oneListOfNullableMonies, 2);
        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedOneListOfNullableMonies;

    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfNullableMonies() {
        return this.calculatedOneListOfNullableMonies;
    }

    private final java.util.List<java.math.BigDecimal> persistedOneListOfNullableMonies;

    public java.util.List<java.math.BigDecimal> getPersistedOneListOfNullableMonies() {
        return this.persistedOneListOfNullableMonies;
    }
}
