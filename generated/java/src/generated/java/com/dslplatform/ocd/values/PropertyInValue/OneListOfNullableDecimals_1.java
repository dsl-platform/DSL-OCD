package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDecimals_1 implements java.io.Serializable {
    public OneListOfNullableDecimals_1(
            final java.util.List<java.math.BigDecimal> oneListOfNullableDecimals) {
        setOneListOfNullableDecimals(oneListOfNullableDecimals);
    }

    public OneListOfNullableDecimals_1() {
        this.oneListOfNullableDecimals = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 961726330;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDecimals_1)) return false;
        final OneListOfNullableDecimals_1 other = (OneListOfNullableDecimals_1) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBigDecimal(this.oneListOfNullableDecimals,
                        other.oneListOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDecimals_1(" + oneListOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfNullableDecimals;

    @JsonProperty("oneListOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfNullableDecimals() {
        return oneListOfNullableDecimals;
    }

    public OneListOfNullableDecimals_1 setOneListOfNullableDecimals(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDecimals\" cannot be null!");
        this.oneListOfNullableDecimals = value;

        return this;
    }
}
