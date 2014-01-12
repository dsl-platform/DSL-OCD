package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDecimalsValue2 implements java.io.Serializable {
    public OneArrayOfOneDecimalsValue2(
            final java.math.BigDecimal[] oneArrayOfOneDecimals) {
        setOneArrayOfOneDecimals(oneArrayOfOneDecimals);
    }

    public OneArrayOfOneDecimalsValue2() {
        this.oneArrayOfOneDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1131161009;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDecimalsValue2)) return false;
        final OneArrayOfOneDecimalsValue2 other = (OneArrayOfOneDecimalsValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfOneDecimals, other.oneArrayOfOneDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDecimalsValue2(" + oneArrayOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfOneDecimals;

    @JsonProperty("oneArrayOfOneDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneDecimals() {
        return oneArrayOfOneDecimals;
    }

    public OneArrayOfOneDecimalsValue2 setOneArrayOfOneDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDecimals\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneDecimals = value;

        return this;
    }
}
