package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDecimalsValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableDecimalsValue1(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals) {
        setNullableSetOfNullableDecimals(nullableSetOfNullableDecimals);
    }

    public NullableSetOfNullableDecimalsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 784577649;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDecimalsValue1))
            return false;
        final NullableSetOfNullableDecimalsValue1 other = (NullableSetOfNullableDecimalsValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfNullableDecimals,
                other.nullableSetOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDecimalsValue1("
                + nullableSetOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals;

    @JsonProperty("nullableSetOfNullableDecimals")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableDecimals() {
        return nullableSetOfNullableDecimals;
    }

    public NullableSetOfNullableDecimalsValue1 setNullableSetOfNullableDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableDecimals = value;

        return this;
    }
}
