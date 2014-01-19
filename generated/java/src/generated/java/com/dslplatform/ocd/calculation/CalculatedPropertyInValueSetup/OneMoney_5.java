package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneMoney_5 implements java.io.Serializable {
    public OneMoney_5(
            final java.math.BigDecimal oneMoney,
            final java.math.BigDecimal calculatedOneMoney,
            final java.math.BigDecimal persistedOneMoney) {
        setOneMoney(oneMoney);
        this.calculatedOneMoney = calculatedOneMoney;
        this.persistedOneMoney = persistedOneMoney;
    }

    public OneMoney_5() {
        this.oneMoney = java.math.BigDecimal.ZERO.setScale(2);
        this.calculatedOneMoney = java.math.BigDecimal.ZERO.setScale(2);
        this.persistedOneMoney = java.math.BigDecimal.ZERO.setScale(2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1072002062;
        result = prime * result + (0);
        result = prime * result + (0);
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneMoney_5)) return false;
        final OneMoney_5 other = (OneMoney_5) obj;

        if (!(this.oneMoney == other.oneMoney || this.oneMoney != null
                && this.oneMoney.compareTo(other.oneMoney) == 0)) return false;
        if (!(this.calculatedOneMoney == other.calculatedOneMoney || this.calculatedOneMoney != null
                && this.calculatedOneMoney.compareTo(other.calculatedOneMoney) == 0))
            return false;
        if (!(this.persistedOneMoney == other.persistedOneMoney || this.persistedOneMoney != null
                && this.persistedOneMoney.compareTo(other.persistedOneMoney) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneMoney_5(" + oneMoney + ',' + calculatedOneMoney + ','
                + persistedOneMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal oneMoney;

    @JsonProperty("oneMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOneMoney() {
        return oneMoney;
    }

    public OneMoney_5 setOneMoney(final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneMoney\" cannot be null!");
        this.oneMoney = value;

        this.oneMoney = com.dslplatform.ocd.calculation.Guards.setScale(
                this.oneMoney, 2);
        return this;
    }

    private final java.math.BigDecimal calculatedOneMoney;

    public java.math.BigDecimal getCalculatedOneMoney() {
        return this.calculatedOneMoney;
    }

    private final java.math.BigDecimal persistedOneMoney;

    public java.math.BigDecimal getPersistedOneMoney() {
        return this.persistedOneMoney;
    }
}
