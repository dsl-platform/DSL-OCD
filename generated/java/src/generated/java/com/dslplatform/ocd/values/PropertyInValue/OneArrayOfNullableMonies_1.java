package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableMonies_1 implements java.io.Serializable {
    public OneArrayOfNullableMonies_1(
            final java.math.BigDecimal[] oneArrayOfNullableMonies) {
        setOneArrayOfNullableMonies(oneArrayOfNullableMonies);
    }

    public OneArrayOfNullableMonies_1() {
        this.oneArrayOfNullableMonies = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 896010102;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableMonies_1)) return false;
        final OneArrayOfNullableMonies_1 other = (OneArrayOfNullableMonies_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfNullableMonies, other.oneArrayOfNullableMonies)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableMonies_1(" + oneArrayOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableMonies;

    @JsonProperty("oneArrayOfNullableMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableMonies() {
        return oneArrayOfNullableMonies;
    }

    public OneArrayOfNullableMonies_1 setOneArrayOfNullableMonies(
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
