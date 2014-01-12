package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDecimalsWithScaleOf9Value2 implements
        java.io.Serializable {
    public NullableSetOfOneDecimalsWithScaleOf9Value2(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimalsWithScaleOf9) {
        setNullableSetOfOneDecimalsWithScaleOf9(nullableSetOfOneDecimalsWithScaleOf9);
    }

    public NullableSetOfOneDecimalsWithScaleOf9Value2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1627411851;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDecimalsWithScaleOf9Value2))
            return false;
        final NullableSetOfOneDecimalsWithScaleOf9Value2 other = (NullableSetOfOneDecimalsWithScaleOf9Value2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfOneDecimalsWithScaleOf9,
                other.nullableSetOfOneDecimalsWithScaleOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDecimalsWithScaleOf9Value2("
                + nullableSetOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimalsWithScaleOf9;

    @JsonProperty("nullableSetOfOneDecimalsWithScaleOf9")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneDecimalsWithScaleOf9() {
        return nullableSetOfOneDecimalsWithScaleOf9;
    }

    public NullableSetOfOneDecimalsWithScaleOf9Value2 setNullableSetOfOneDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.nullableSetOfOneDecimalsWithScaleOf9 = value;

        return this;
    }
}
