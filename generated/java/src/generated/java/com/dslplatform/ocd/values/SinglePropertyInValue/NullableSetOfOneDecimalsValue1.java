package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDecimalsValue1 implements
        java.io.Serializable {
    public NullableSetOfOneDecimalsValue1(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals) {
        setNullableSetOfOneDecimals(nullableSetOfOneDecimals);
    }

    public NullableSetOfOneDecimalsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 987071164;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDecimalsValue1)) return false;
        final NullableSetOfOneDecimalsValue1 other = (NullableSetOfOneDecimalsValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfOneDecimals, other.nullableSetOfOneDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDecimalsValue1(" + nullableSetOfOneDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals;

    @JsonProperty("nullableSetOfOneDecimals")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneDecimals() {
        return nullableSetOfOneDecimals;
    }

    public NullableSetOfOneDecimalsValue1 setNullableSetOfOneDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneDecimals = value;

        return this;
    }
}
