package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDecimalsValue3 implements
        java.io.Serializable {
    public NullableListOfNullableDecimalsValue3(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimals) {
        setNullableListOfNullableDecimals(nullableListOfNullableDecimals);
    }

    public NullableListOfNullableDecimalsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2017279727;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDecimalsValue3))
            return false;
        final NullableListOfNullableDecimalsValue3 other = (NullableListOfNullableDecimalsValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.nullableListOfNullableDecimals,
                other.nullableListOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDecimalsValue3("
                + nullableListOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableDecimals;

    @JsonProperty("nullableListOfNullableDecimals")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableDecimals() {
        return nullableListOfNullableDecimals;
    }

    public NullableListOfNullableDecimalsValue3 setNullableListOfNullableDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        this.nullableListOfNullableDecimals = value;

        return this;
    }
}
