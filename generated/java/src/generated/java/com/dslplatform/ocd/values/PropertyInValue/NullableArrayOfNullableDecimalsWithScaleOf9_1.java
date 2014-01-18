package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDecimalsWithScaleOf9_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableDecimalsWithScaleOf9_1(
            final java.math.BigDecimal[] nullableArrayOfNullableDecimalsWithScaleOf9) {
        setNullableArrayOfNullableDecimalsWithScaleOf9(nullableArrayOfNullableDecimalsWithScaleOf9);
    }

    public NullableArrayOfNullableDecimalsWithScaleOf9_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 503940002;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDecimalsWithScaleOf9_1))
            return false;
        final NullableArrayOfNullableDecimalsWithScaleOf9_1 other = (NullableArrayOfNullableDecimalsWithScaleOf9_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableArrayOfNullableDecimalsWithScaleOf9,
                other.nullableArrayOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDecimalsWithScaleOf9_1("
                + nullableArrayOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableArrayOfNullableDecimalsWithScaleOf9")
    public java.math.BigDecimal[] getNullableArrayOfNullableDecimalsWithScaleOf9() {
        return nullableArrayOfNullableDecimalsWithScaleOf9;
    }

    public NullableArrayOfNullableDecimalsWithScaleOf9_1 setNullableArrayOfNullableDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.nullableArrayOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }
}
