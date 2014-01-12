package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDecimalsWithScaleOf9Value1 implements
        java.io.Serializable {
    public NullableSetOfNullableDecimalsWithScaleOf9Value1(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9) {
        setNullableSetOfNullableDecimalsWithScaleOf9(nullableSetOfNullableDecimalsWithScaleOf9);
    }

    public NullableSetOfNullableDecimalsWithScaleOf9Value1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 247793953;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDecimalsWithScaleOf9Value1))
            return false;
        final NullableSetOfNullableDecimalsWithScaleOf9Value1 other = (NullableSetOfNullableDecimalsWithScaleOf9Value1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfNullableDecimalsWithScaleOf9,
                other.nullableSetOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDecimalsWithScaleOf9Value1("
                + nullableSetOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableDecimalsWithScaleOf9() {
        return nullableSetOfNullableDecimalsWithScaleOf9;
    }

    public NullableSetOfNullableDecimalsWithScaleOf9Value1 setNullableSetOfNullableDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.nullableSetOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }
}
