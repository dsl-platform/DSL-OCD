package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDecimals_4 implements java.io.Serializable {
    public NullableListOfOneDecimals_4(
            final java.util.List<java.math.BigDecimal> nullableListOfOneDecimals,
            final java.util.List<java.math.BigDecimal> calculatedNullableListOfOneDecimals,
            final java.util.List<java.math.BigDecimal> persistedNullableListOfOneDecimals) {
        setNullableListOfOneDecimals(nullableListOfOneDecimals);
        this.calculatedNullableListOfOneDecimals = calculatedNullableListOfOneDecimals;
        this.persistedNullableListOfOneDecimals = persistedNullableListOfOneDecimals;
    }

    public NullableListOfOneDecimals_4() {
        this.calculatedNullableListOfOneDecimals = null;
        this.persistedNullableListOfOneDecimals = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1821494387;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDecimals_4)) return false;
        final NullableListOfOneDecimals_4 other = (NullableListOfOneDecimals_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards
                .compareBigDecimal(this.nullableListOfOneDecimals,
                        other.nullableListOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableListOfOneDecimals,
                other.calculatedNullableListOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableListOfOneDecimals,
                other.persistedNullableListOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDecimals_4(" + nullableListOfOneDecimals + ','
                + calculatedNullableListOfOneDecimals + ','
                + persistedNullableListOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfOneDecimals;

    @JsonProperty("nullableListOfOneDecimals")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneDecimals() {
        return nullableListOfOneDecimals;
    }

    public NullableListOfOneDecimals_4 setNullableListOfOneDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneDecimals = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedNullableListOfOneDecimals;

    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfOneDecimals() {
        return this.calculatedNullableListOfOneDecimals;
    }

    private final java.util.List<java.math.BigDecimal> persistedNullableListOfOneDecimals;

    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfOneDecimals() {
        return this.persistedNullableListOfOneDecimals;
    }
}
