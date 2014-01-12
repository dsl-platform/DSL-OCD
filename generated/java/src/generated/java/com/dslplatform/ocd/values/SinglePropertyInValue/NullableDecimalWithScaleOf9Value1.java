package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDecimalWithScaleOf9Value1 implements
        java.io.Serializable {
    public NullableDecimalWithScaleOf9Value1(
            final java.math.BigDecimal nullableDecimalWithScaleOf9) {
        setNullableDecimalWithScaleOf9(nullableDecimalWithScaleOf9);
    }

    public NullableDecimalWithScaleOf9Value1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1439916312;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDecimalWithScaleOf9Value1)) return false;
        final NullableDecimalWithScaleOf9Value1 other = (NullableDecimalWithScaleOf9Value1) obj;

        if (!(this.nullableDecimalWithScaleOf9 == other.nullableDecimalWithScaleOf9 || this.nullableDecimalWithScaleOf9 != null
                && this.nullableDecimalWithScaleOf9
                        .compareTo(other.nullableDecimalWithScaleOf9) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDecimalWithScaleOf9Value1("
                + nullableDecimalWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal nullableDecimalWithScaleOf9;

    @JsonProperty("nullableDecimalWithScaleOf9")
    public java.math.BigDecimal getNullableDecimalWithScaleOf9() {
        return nullableDecimalWithScaleOf9;
    }

    public NullableDecimalWithScaleOf9Value1 setNullableDecimalWithScaleOf9(
            final java.math.BigDecimal value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.nullableDecimalWithScaleOf9 = value;

        return this;
    }
}
