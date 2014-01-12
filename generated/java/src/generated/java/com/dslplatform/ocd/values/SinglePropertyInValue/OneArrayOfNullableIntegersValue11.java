package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableIntegersValue11 implements
        java.io.Serializable {
    public OneArrayOfNullableIntegersValue11(
            final Integer[] oneArrayOfNullableIntegers) {
        setOneArrayOfNullableIntegers(oneArrayOfNullableIntegers);
    }

    public OneArrayOfNullableIntegersValue11() {
        this.oneArrayOfNullableIntegers = new Integer[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 114122943;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableIntegersValue11)) return false;
        final OneArrayOfNullableIntegersValue11 other = (OneArrayOfNullableIntegersValue11) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableIntegers,
                other.oneArrayOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableIntegersValue11("
                + oneArrayOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] oneArrayOfNullableIntegers;

    @JsonProperty("oneArrayOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer[] getOneArrayOfNullableIntegers() {
        return oneArrayOfNullableIntegers;
    }

    public OneArrayOfNullableIntegersValue11 setOneArrayOfNullableIntegers(
            final Integer[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableIntegers\" cannot be null!");
        this.oneArrayOfNullableIntegers = value;

        return this;
    }
}
