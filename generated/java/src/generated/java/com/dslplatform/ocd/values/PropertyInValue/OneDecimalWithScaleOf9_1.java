package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneDecimalWithScaleOf9_1 implements java.io.Serializable {
    public OneDecimalWithScaleOf9_1(
            final java.math.BigDecimal oneDecimalWithScaleOf9) {
        setOneDecimalWithScaleOf9(oneDecimalWithScaleOf9);
    }

    public OneDecimalWithScaleOf9_1() {
        this.oneDecimalWithScaleOf9 = java.math.BigDecimal.ZERO.setScale(9);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 725987229;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDecimalWithScaleOf9_1)) return false;
        final OneDecimalWithScaleOf9_1 other = (OneDecimalWithScaleOf9_1) obj;

        if (!(this.oneDecimalWithScaleOf9 == other.oneDecimalWithScaleOf9 || this.oneDecimalWithScaleOf9 != null
                && this.oneDecimalWithScaleOf9
                        .compareTo(other.oneDecimalWithScaleOf9) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDecimalWithScaleOf9_1(" + oneDecimalWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal oneDecimalWithScaleOf9;

    @JsonProperty("oneDecimalWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneDecimalWithScaleOf9() {
        return oneDecimalWithScaleOf9;
    }

    public OneDecimalWithScaleOf9_1 setOneDecimalWithScaleOf9(
            final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDecimalWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.oneDecimalWithScaleOf9 = value;

        return this;
    }
}
