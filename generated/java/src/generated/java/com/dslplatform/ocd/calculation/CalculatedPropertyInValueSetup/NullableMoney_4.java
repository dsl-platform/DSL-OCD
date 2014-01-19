package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableMoney_4 implements java.io.Serializable {
    public NullableMoney_4(
            final java.math.BigDecimal nullableMoney,
            final java.math.BigDecimal calculatedNullableMoney,
            final java.math.BigDecimal persistedNullableMoney) {
        setNullableMoney(nullableMoney);
        this.calculatedNullableMoney = calculatedNullableMoney;
        this.persistedNullableMoney = persistedNullableMoney;
    }

    public NullableMoney_4() {
        this.calculatedNullableMoney = null;
        this.persistedNullableMoney = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 361819594;
        result = prime * result + (0);
        result = prime * result + (0);
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableMoney_4)) return false;
        final NullableMoney_4 other = (NullableMoney_4) obj;

        if (!(this.nullableMoney == other.nullableMoney || this.nullableMoney != null
                && this.nullableMoney.compareTo(other.nullableMoney) == 0))
            return false;
        if (!(this.calculatedNullableMoney == other.calculatedNullableMoney || this.calculatedNullableMoney != null
                && this.calculatedNullableMoney
                        .compareTo(other.calculatedNullableMoney) == 0))
            return false;
        if (!(this.persistedNullableMoney == other.persistedNullableMoney || this.persistedNullableMoney != null
                && this.persistedNullableMoney
                        .compareTo(other.persistedNullableMoney) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableMoney_4(" + nullableMoney + ','
                + calculatedNullableMoney + ',' + persistedNullableMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal nullableMoney;

    @JsonProperty("nullableMoney")
    public java.math.BigDecimal getNullableMoney() {
        return nullableMoney;
    }

    public NullableMoney_4 setNullableMoney(final java.math.BigDecimal value) {
        this.nullableMoney = value;

        this.nullableMoney = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableMoney, 2);
        return this;
    }

    private final java.math.BigDecimal calculatedNullableMoney;

    public java.math.BigDecimal getCalculatedNullableMoney() {
        return this.calculatedNullableMoney;
    }

    private final java.math.BigDecimal persistedNullableMoney;

    public java.math.BigDecimal getPersistedNullableMoney() {
        return this.persistedNullableMoney;
    }
}
