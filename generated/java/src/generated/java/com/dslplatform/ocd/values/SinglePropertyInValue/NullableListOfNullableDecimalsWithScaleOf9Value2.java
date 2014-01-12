package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDecimalsWithScaleOf9Value2 implements
        java.io.Serializable {
    public NullableListOfNullableDecimalsWithScaleOf9Value2(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9) {
        setNullableListOfNullableDecimalsWithScaleOf9(nullableListOfNullableDecimalsWithScaleOf9);
    }

    public NullableListOfNullableDecimalsWithScaleOf9Value2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 141807604;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDecimalsWithScaleOf9Value2))
            return false;
        final NullableListOfNullableDecimalsWithScaleOf9Value2 other = (NullableListOfNullableDecimalsWithScaleOf9Value2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableListOfNullableDecimalsWithScaleOf9,
                other.nullableListOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDecimalsWithScaleOf9Value2("
                + nullableListOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableListOfNullableDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableDecimalsWithScaleOf9() {
        return nullableListOfNullableDecimalsWithScaleOf9;
    }

    public NullableListOfNullableDecimalsWithScaleOf9Value2 setNullableListOfNullableDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.nullableListOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }
}
