package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDecimalsWithScaleOf9_1 implements
        java.io.Serializable {
    public OneListOfNullableDecimalsWithScaleOf9_1(
            final java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9) {
        setOneListOfNullableDecimalsWithScaleOf9(oneListOfNullableDecimalsWithScaleOf9);
    }

    public OneListOfNullableDecimalsWithScaleOf9_1() {
        this.oneListOfNullableDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1152504040;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDecimalsWithScaleOf9_1))
            return false;
        final OneListOfNullableDecimalsWithScaleOf9_1 other = (OneListOfNullableDecimalsWithScaleOf9_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneListOfNullableDecimalsWithScaleOf9,
                other.oneListOfNullableDecimalsWithScaleOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDecimalsWithScaleOf9_1("
                + oneListOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("oneListOfNullableDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfNullableDecimalsWithScaleOf9() {
        return oneListOfNullableDecimalsWithScaleOf9;
    }

    public OneListOfNullableDecimalsWithScaleOf9_1 setOneListOfNullableDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.oneListOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }
}
