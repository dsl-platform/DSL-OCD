package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDecimalsWithScaleOf9_1 implements
        java.io.Serializable {
    public OneArrayOfOneDecimalsWithScaleOf9_1(
            final java.math.BigDecimal[] oneArrayOfOneDecimalsWithScaleOf9) {
        setOneArrayOfOneDecimalsWithScaleOf9(oneArrayOfOneDecimalsWithScaleOf9);
    }

    public OneArrayOfOneDecimalsWithScaleOf9_1() {
        this.oneArrayOfOneDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1904875976;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDecimalsWithScaleOf9_1))
            return false;
        final OneArrayOfOneDecimalsWithScaleOf9_1 other = (OneArrayOfOneDecimalsWithScaleOf9_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfOneDecimalsWithScaleOf9,
                other.oneArrayOfOneDecimalsWithScaleOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDecimalsWithScaleOf9_1("
                + oneArrayOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfOneDecimalsWithScaleOf9;

    @JsonProperty("oneArrayOfOneDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneDecimalsWithScaleOf9() {
        return oneArrayOfOneDecimalsWithScaleOf9;
    }

    public OneArrayOfOneDecimalsWithScaleOf9_1 setOneArrayOfOneDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.oneArrayOfOneDecimalsWithScaleOf9 = value;

        return this;
    }
}
