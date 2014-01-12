package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDecimalsValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullableDecimalsValue5(
            final java.math.BigDecimal[] nullableArrayOfNullableDecimals) {
        setNullableArrayOfNullableDecimals(nullableArrayOfNullableDecimals);
    }

    public NullableArrayOfNullableDecimalsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 860642852;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDecimalsValue5))
            return false;
        final NullableArrayOfNullableDecimalsValue5 other = (NullableArrayOfNullableDecimalsValue5) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableArrayOfNullableDecimals,
                other.nullableArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDecimalsValue5("
                + nullableArrayOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfNullableDecimals;

    @JsonProperty("nullableArrayOfNullableDecimals")
    public java.math.BigDecimal[] getNullableArrayOfNullableDecimals() {
        return nullableArrayOfNullableDecimals;
    }

    public NullableArrayOfNullableDecimalsValue5 setNullableArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        this.nullableArrayOfNullableDecimals = value;

        return this;
    }
}
