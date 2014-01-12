package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDecimalsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableDecimalsValue3(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals) {
        setNullableSetOfNullableDecimals(nullableSetOfNullableDecimals);
    }

    public NullableSetOfNullableDecimalsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 784577647;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDecimalsValue3))
            return false;
        final NullableSetOfNullableDecimalsValue3 other = (NullableSetOfNullableDecimalsValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfNullableDecimals,
                other.nullableSetOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDecimalsValue3("
                + nullableSetOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals;

    @JsonProperty("nullableSetOfNullableDecimals")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableDecimals() {
        return nullableSetOfNullableDecimals;
    }

    public NullableSetOfNullableDecimalsValue3 setNullableSetOfNullableDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableDecimals = value;

        return this;
    }
}
