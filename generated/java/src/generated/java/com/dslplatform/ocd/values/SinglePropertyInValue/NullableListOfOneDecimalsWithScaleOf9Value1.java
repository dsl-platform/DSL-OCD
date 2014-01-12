package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDecimalsWithScaleOf9Value1 implements
        java.io.Serializable {
    public NullableListOfOneDecimalsWithScaleOf9Value1(
            final java.util.List<java.math.BigDecimal> nullableListOfOneDecimalsWithScaleOf9) {
        setNullableListOfOneDecimalsWithScaleOf9(nullableListOfOneDecimalsWithScaleOf9);
    }

    public NullableListOfOneDecimalsWithScaleOf9Value1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 10862508;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDecimalsWithScaleOf9Value1))
            return false;
        final NullableListOfOneDecimalsWithScaleOf9Value1 other = (NullableListOfOneDecimalsWithScaleOf9Value1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableListOfOneDecimalsWithScaleOf9,
                other.nullableListOfOneDecimalsWithScaleOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDecimalsWithScaleOf9Value1("
                + nullableListOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfOneDecimalsWithScaleOf9;

    @JsonProperty("nullableListOfOneDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneDecimalsWithScaleOf9() {
        return nullableListOfOneDecimalsWithScaleOf9;
    }

    public NullableListOfOneDecimalsWithScaleOf9Value1 setNullableListOfOneDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.nullableListOfOneDecimalsWithScaleOf9 = value;

        return this;
    }
}
