package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDecimalsValue3 implements
        java.io.Serializable {
    public OneListOfNullableDecimalsValue3(
            final java.util.List<java.math.BigDecimal> oneListOfNullableDecimals) {
        setOneListOfNullableDecimals(oneListOfNullableDecimals);
    }

    public OneListOfNullableDecimalsValue3() {
        this.oneListOfNullableDecimals = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 835180212;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDecimalsValue3)) return false;
        final OneListOfNullableDecimalsValue3 other = (OneListOfNullableDecimalsValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBigDecimal(this.oneListOfNullableDecimals,
                        other.oneListOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDecimalsValue3(" + oneListOfNullableDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfNullableDecimals;

    @JsonProperty("oneListOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfNullableDecimals() {
        return oneListOfNullableDecimals;
    }

    public OneListOfNullableDecimalsValue3 setOneListOfNullableDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDecimals\" cannot be null!");
        this.oneListOfNullableDecimals = value;

        return this;
    }
}
