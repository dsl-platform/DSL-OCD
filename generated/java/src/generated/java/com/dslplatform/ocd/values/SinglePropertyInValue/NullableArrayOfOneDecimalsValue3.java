package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDecimalsValue3 implements
        java.io.Serializable {
    public NullableArrayOfOneDecimalsValue3(
            final java.math.BigDecimal[] nullableArrayOfOneDecimals) {
        setNullableArrayOfOneDecimals(nullableArrayOfOneDecimals);
    }

    public NullableArrayOfOneDecimalsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 396043019;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDecimalsValue3)) return false;
        final NullableArrayOfOneDecimalsValue3 other = (NullableArrayOfOneDecimalsValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableArrayOfOneDecimals,
                other.nullableArrayOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDecimalsValue3(" + nullableArrayOfOneDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfOneDecimals;

    @JsonProperty("nullableArrayOfOneDecimals")
    public java.math.BigDecimal[] getNullableArrayOfOneDecimals() {
        return nullableArrayOfOneDecimals;
    }

    public NullableArrayOfOneDecimalsValue3 setNullableArrayOfOneDecimals(
            final java.math.BigDecimal[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneDecimals = value;

        return this;
    }
}
