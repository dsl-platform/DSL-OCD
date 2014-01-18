package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDecimalsWithScaleOf9_1 implements
        java.io.Serializable {
    public OneSetOfOneDecimalsWithScaleOf9_1(
            final java.util.Set<java.math.BigDecimal> oneSetOfOneDecimalsWithScaleOf9) {
        setOneSetOfOneDecimalsWithScaleOf9(oneSetOfOneDecimalsWithScaleOf9);
    }

    public OneSetOfOneDecimalsWithScaleOf9_1() {
        this.oneSetOfOneDecimalsWithScaleOf9 = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1808063587;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDecimalsWithScaleOf9_1)) return false;
        final OneSetOfOneDecimalsWithScaleOf9_1 other = (OneSetOfOneDecimalsWithScaleOf9_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneSetOfOneDecimalsWithScaleOf9,
                other.oneSetOfOneDecimalsWithScaleOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDecimalsWithScaleOf9_1("
                + oneSetOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfOneDecimalsWithScaleOf9;

    @JsonProperty("oneSetOfOneDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfOneDecimalsWithScaleOf9() {
        return oneSetOfOneDecimalsWithScaleOf9;
    }

    public OneSetOfOneDecimalsWithScaleOf9_1 setOneSetOfOneDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.oneSetOfOneDecimalsWithScaleOf9 = value;

        return this;
    }
}
