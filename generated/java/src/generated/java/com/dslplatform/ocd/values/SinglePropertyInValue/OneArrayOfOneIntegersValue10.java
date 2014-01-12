package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneIntegersValue10 implements java.io.Serializable {
    public OneArrayOfOneIntegersValue10(
            final int[] oneArrayOfOneIntegers) {
        setOneArrayOfOneIntegers(oneArrayOfOneIntegers);
    }

    public OneArrayOfOneIntegersValue10() {
        this.oneArrayOfOneIntegers = new int[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1205143961;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneIntegersValue10)) return false;
        final OneArrayOfOneIntegersValue10 other = (OneArrayOfOneIntegersValue10) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneIntegers,
                other.oneArrayOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneIntegersValue10(" + oneArrayOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] oneArrayOfOneIntegers;

    @JsonProperty("oneArrayOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int[] getOneArrayOfOneIntegers() {
        return oneArrayOfOneIntegers;
    }

    public OneArrayOfOneIntegersValue10 setOneArrayOfOneIntegers(
            final int[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneIntegers\" cannot be null!");
        this.oneArrayOfOneIntegers = value;

        return this;
    }
}
