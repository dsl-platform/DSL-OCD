package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDecimals_4 implements
        java.io.Serializable {
    public NullableListOfNullableDecimals_4(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimals,
            final java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableDecimals,
            final java.util.List<java.math.BigDecimal> persistedNullableListOfNullableDecimals) {
        setNullableListOfNullableDecimals(nullableListOfNullableDecimals);
        this.calculatedNullableListOfNullableDecimals = calculatedNullableListOfNullableDecimals;
        this.persistedNullableListOfNullableDecimals = persistedNullableListOfNullableDecimals;
    }

    public NullableListOfNullableDecimals_4() {
        this.calculatedNullableListOfNullableDecimals = null;
        this.persistedNullableListOfNullableDecimals = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1342092528;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDecimals_4)) return false;
        final NullableListOfNullableDecimals_4 other = (NullableListOfNullableDecimals_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableListOfNullableDecimals,
                other.nullableListOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableListOfNullableDecimals,
                other.calculatedNullableListOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableListOfNullableDecimals,
                other.persistedNullableListOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDecimals_4("
                + nullableListOfNullableDecimals + ','
                + calculatedNullableListOfNullableDecimals + ','
                + persistedNullableListOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableDecimals;

    @JsonProperty("nullableListOfNullableDecimals")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableDecimals() {
        return nullableListOfNullableDecimals;
    }

    public NullableListOfNullableDecimals_4 setNullableListOfNullableDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        this.nullableListOfNullableDecimals = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableDecimals;

    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfNullableDecimals() {
        return this.calculatedNullableListOfNullableDecimals;
    }

    private final java.util.List<java.math.BigDecimal> persistedNullableListOfNullableDecimals;

    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfNullableDecimals() {
        return this.persistedNullableListOfNullableDecimals;
    }
}
