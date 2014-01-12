package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableMoneyValue3 implements java.io.Serializable {
    public NullableMoneyValue3(
            final java.math.BigDecimal nullableMoney) {
        setNullableMoney(nullableMoney);
    }

    public NullableMoneyValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 599579267;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableMoneyValue3)) return false;
        final NullableMoneyValue3 other = (NullableMoneyValue3) obj;

        if (!(this.nullableMoney == other.nullableMoney || this.nullableMoney != null
                && this.nullableMoney.compareTo(other.nullableMoney) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableMoneyValue3(" + nullableMoney + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal nullableMoney;

    @JsonProperty("nullableMoney")
    public java.math.BigDecimal getNullableMoney() {
        return nullableMoney;
    }

    public NullableMoneyValue3 setNullableMoney(final java.math.BigDecimal value) {
        this.nullableMoney = value;

        this.nullableMoney = value == null
                ? null
                : com.dslplatform.ocd.values.Guards.setScale(
                        this.nullableMoney, 2);
        return this;
    }
}
