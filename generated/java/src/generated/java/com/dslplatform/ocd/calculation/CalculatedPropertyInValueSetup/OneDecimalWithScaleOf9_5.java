package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneDecimalWithScaleOf9_5 implements java.io.Serializable {
    public OneDecimalWithScaleOf9_5(
            final java.math.BigDecimal oneDecimalWithScaleOf9,
            final java.math.BigDecimal calculatedOneDecimalWithScaleOf9,
            final java.math.BigDecimal persistedOneDecimalWithScaleOf9) {
        setOneDecimalWithScaleOf9(oneDecimalWithScaleOf9);
        this.calculatedOneDecimalWithScaleOf9 = calculatedOneDecimalWithScaleOf9;
        this.persistedOneDecimalWithScaleOf9 = persistedOneDecimalWithScaleOf9;
    }

    public OneDecimalWithScaleOf9_5() {
        this.oneDecimalWithScaleOf9 = java.math.BigDecimal.ZERO.setScale(9);
        this.calculatedOneDecimalWithScaleOf9 = java.math.BigDecimal.ZERO
                .setScale(9);
        this.persistedOneDecimalWithScaleOf9 = java.math.BigDecimal.ZERO
                .setScale(9);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1599611599;
        result = prime * result + (0);
        result = prime * result + (0);
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDecimalWithScaleOf9_5)) return false;
        final OneDecimalWithScaleOf9_5 other = (OneDecimalWithScaleOf9_5) obj;

        if (!(this.oneDecimalWithScaleOf9 == other.oneDecimalWithScaleOf9 || this.oneDecimalWithScaleOf9 != null
                && this.oneDecimalWithScaleOf9
                        .compareTo(other.oneDecimalWithScaleOf9) == 0))
            return false;
        if (!(this.calculatedOneDecimalWithScaleOf9 == other.calculatedOneDecimalWithScaleOf9 || this.calculatedOneDecimalWithScaleOf9 != null
                && this.calculatedOneDecimalWithScaleOf9
                        .compareTo(other.calculatedOneDecimalWithScaleOf9) == 0))
            return false;
        if (!(this.persistedOneDecimalWithScaleOf9 == other.persistedOneDecimalWithScaleOf9 || this.persistedOneDecimalWithScaleOf9 != null
                && this.persistedOneDecimalWithScaleOf9
                        .compareTo(other.persistedOneDecimalWithScaleOf9) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDecimalWithScaleOf9_5(" + oneDecimalWithScaleOf9 + ','
                + calculatedOneDecimalWithScaleOf9 + ','
                + persistedOneDecimalWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal oneDecimalWithScaleOf9;

    @JsonProperty("oneDecimalWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneDecimalWithScaleOf9() {
        return oneDecimalWithScaleOf9;
    }

    public OneDecimalWithScaleOf9_5 setOneDecimalWithScaleOf9(
            final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDecimalWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneDecimalWithScaleOf9 = value;

        return this;
    }

    private final java.math.BigDecimal calculatedOneDecimalWithScaleOf9;

    public java.math.BigDecimal getCalculatedOneDecimalWithScaleOf9() {
        return this.calculatedOneDecimalWithScaleOf9;
    }

    private final java.math.BigDecimal persistedOneDecimalWithScaleOf9;

    public java.math.BigDecimal getPersistedOneDecimalWithScaleOf9() {
        return this.persistedOneDecimalWithScaleOf9;
    }
}
