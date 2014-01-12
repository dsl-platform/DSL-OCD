package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDecimalValue1 implements java.io.Serializable {
    public NullableDecimalValue1(
            final java.math.BigDecimal nullableDecimal) {
        setNullableDecimal(nullableDecimal);
    }

    public NullableDecimalValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 978081366;
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDecimalValue1)) return false;
        final NullableDecimalValue1 other = (NullableDecimalValue1) obj;

        if (!(this.nullableDecimal == other.nullableDecimal || this.nullableDecimal != null
                && this.nullableDecimal.compareTo(other.nullableDecimal) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDecimalValue1(" + nullableDecimal + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal nullableDecimal;

    @JsonProperty("nullableDecimal")
    public java.math.BigDecimal getNullableDecimal() {
        return nullableDecimal;
    }

    public NullableDecimalValue1 setNullableDecimal(
            final java.math.BigDecimal value) {
        this.nullableDecimal = value;

        return this;
    }
}
