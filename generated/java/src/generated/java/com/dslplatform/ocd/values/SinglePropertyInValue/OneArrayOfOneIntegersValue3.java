package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneIntegersValue3 implements java.io.Serializable {
    public OneArrayOfOneIntegersValue3(
            final int[] oneArrayOfOneIntegers) {
        setOneArrayOfOneIntegers(oneArrayOfOneIntegers);
    }

    public OneArrayOfOneIntegersValue3() {
        this.oneArrayOfOneIntegers = new int[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1196467559;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneIntegersValue3)) return false;
        final OneArrayOfOneIntegersValue3 other = (OneArrayOfOneIntegersValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneIntegers,
                other.oneArrayOfOneIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneIntegersValue3(" + oneArrayOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] oneArrayOfOneIntegers;

    @JsonProperty("oneArrayOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int[] getOneArrayOfOneIntegers() {
        return oneArrayOfOneIntegers;
    }

    public OneArrayOfOneIntegersValue3 setOneArrayOfOneIntegers(
            final int[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneIntegers\" cannot be null!");
        this.oneArrayOfOneIntegers = value;

        return this;
    }
}
