package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDecimalsValue2 implements
        java.io.Serializable {
    public NullableSetOfOneDecimalsValue2(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals) {
        setNullableSetOfOneDecimals(nullableSetOfOneDecimals);
    }

    public NullableSetOfOneDecimalsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1390355691;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDecimalsValue2)) return false;
        final NullableSetOfOneDecimalsValue2 other = (NullableSetOfOneDecimalsValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableSetOfOneDecimals, other.nullableSetOfOneDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDecimalsValue2(" + nullableSetOfOneDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals;

    @JsonProperty("nullableSetOfOneDecimals")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneDecimals() {
        return nullableSetOfOneDecimals;
    }

    public NullableSetOfOneDecimalsValue2 setNullableSetOfOneDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneDecimals = value;

        return this;
    }
}
