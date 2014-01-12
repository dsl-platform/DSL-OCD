package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDecimalsValue2 implements
        java.io.Serializable {
    public NullableListOfOneDecimalsValue2(
            final java.util.List<java.math.BigDecimal> nullableListOfOneDecimals) {
        setNullableListOfOneDecimals(nullableListOfOneDecimals);
    }

    public NullableListOfOneDecimalsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 361189;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDecimalsValue2)) return false;
        final NullableListOfOneDecimalsValue2 other = (NullableListOfOneDecimalsValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBigDecimal(this.nullableListOfOneDecimals,
                        other.nullableListOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDecimalsValue2(" + nullableListOfOneDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfOneDecimals;

    @JsonProperty("nullableListOfOneDecimals")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneDecimals() {
        return nullableListOfOneDecimals;
    }

    public NullableListOfOneDecimalsValue2 setNullableListOfOneDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDecimals = value;

        return this;
    }
}
