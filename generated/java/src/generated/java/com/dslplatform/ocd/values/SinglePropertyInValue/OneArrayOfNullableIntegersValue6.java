package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableIntegersValue6 implements
        java.io.Serializable {
    public OneArrayOfNullableIntegersValue6(
            final Integer[] oneArrayOfNullableIntegers) {
        setOneArrayOfNullableIntegers(oneArrayOfNullableIntegers);
    }

    public OneArrayOfNullableIntegersValue6() {
        this.oneArrayOfNullableIntegers = new Integer[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 923161641;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableIntegersValue6)) return false;
        final OneArrayOfNullableIntegersValue6 other = (OneArrayOfNullableIntegersValue6) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableIntegers,
                other.oneArrayOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableIntegersValue6(" + oneArrayOfNullableIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] oneArrayOfNullableIntegers;

    @JsonProperty("oneArrayOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer[] getOneArrayOfNullableIntegers() {
        return oneArrayOfNullableIntegers;
    }

    public OneArrayOfNullableIntegersValue6 setOneArrayOfNullableIntegers(
            final Integer[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableIntegers\" cannot be null!");
        this.oneArrayOfNullableIntegers = value;

        return this;
    }
}
