package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDecimals_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableDecimals_1(
            final java.math.BigDecimal[] nullableArrayOfNullableDecimals) {
        setNullableArrayOfNullableDecimals(nullableArrayOfNullableDecimals);
    }

    public NullableArrayOfNullableDecimals_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 6244172;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDecimals_1)) return false;
        final NullableArrayOfNullableDecimals_1 other = (NullableArrayOfNullableDecimals_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableArrayOfNullableDecimals,
                other.nullableArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDecimals_1("
                + nullableArrayOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfNullableDecimals;

    @JsonProperty("nullableArrayOfNullableDecimals")
    public java.math.BigDecimal[] getNullableArrayOfNullableDecimals() {
        return nullableArrayOfNullableDecimals;
    }

    public NullableArrayOfNullableDecimals_1 setNullableArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        this.nullableArrayOfNullableDecimals = value;

        return this;
    }
}
