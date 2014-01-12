package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableMoniesValue3 implements
        java.io.Serializable {
    public OneArrayOfNullableMoniesValue3(
            final java.math.BigDecimal[] oneArrayOfNullableMonies) {
        setOneArrayOfNullableMonies(oneArrayOfNullableMonies);
    }

    public OneArrayOfNullableMoniesValue3() {
        this.oneArrayOfNullableMonies = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1637450492;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableMoniesValue3)) return false;
        final OneArrayOfNullableMoniesValue3 other = (OneArrayOfNullableMoniesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfNullableMonies, other.oneArrayOfNullableMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableMoniesValue3(" + oneArrayOfNullableMonies
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableMonies;

    @JsonProperty("oneArrayOfNullableMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableMonies() {
        return oneArrayOfNullableMonies;
    }

    public OneArrayOfNullableMoniesValue3 setOneArrayOfNullableMonies(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableMonies\" cannot be null!");
        this.oneArrayOfNullableMonies = value;

        this.oneArrayOfNullableMonies = com.dslplatform.ocd.values.Guards
                .setScale(this.oneArrayOfNullableMonies, 2);
        return this;
    }
}
