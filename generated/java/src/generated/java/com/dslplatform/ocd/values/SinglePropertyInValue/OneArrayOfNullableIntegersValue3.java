package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableIntegersValue3 implements
        java.io.Serializable {
    public OneArrayOfNullableIntegersValue3(
            final Integer[] oneArrayOfNullableIntegers) {
        setOneArrayOfNullableIntegers(oneArrayOfNullableIntegers);
    }

    public OneArrayOfNullableIntegersValue3() {
        this.oneArrayOfNullableIntegers = new Integer[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 519877114;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableIntegersValue3)) return false;
        final OneArrayOfNullableIntegersValue3 other = (OneArrayOfNullableIntegersValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableIntegers,
                other.oneArrayOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableIntegersValue3(" + oneArrayOfNullableIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] oneArrayOfNullableIntegers;

    @JsonProperty("oneArrayOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer[] getOneArrayOfNullableIntegers() {
        return oneArrayOfNullableIntegers;
    }

    public OneArrayOfNullableIntegersValue3 setOneArrayOfNullableIntegers(
            final Integer[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableIntegers\" cannot be null!");
        this.oneArrayOfNullableIntegers = value;

        return this;
    }
}
