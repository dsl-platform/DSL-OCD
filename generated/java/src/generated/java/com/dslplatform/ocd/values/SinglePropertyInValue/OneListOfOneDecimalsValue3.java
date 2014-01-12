package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDecimalsValue3 implements java.io.Serializable {
    public OneListOfOneDecimalsValue3(
            final java.util.List<java.math.BigDecimal> oneListOfOneDecimals) {
        setOneListOfOneDecimals(oneListOfOneDecimals);
    }

    public OneListOfOneDecimalsValue3() {
        this.oneListOfOneDecimals = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1782359179;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDecimalsValue3)) return false;
        final OneListOfOneDecimalsValue3 other = (OneListOfOneDecimalsValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneListOfOneDecimals, other.oneListOfOneDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDecimalsValue3(" + oneListOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfOneDecimals;

    @JsonProperty("oneListOfOneDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfOneDecimals() {
        return oneListOfOneDecimals;
    }

    public OneListOfOneDecimalsValue3 setOneListOfOneDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDecimals\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneDecimals = value;

        return this;
    }
}
