package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableStringsValue1 implements
        java.io.Serializable {
    public OneArrayOfNullableStringsValue1(
            final String[] oneArrayOfNullableStrings) {
        setOneArrayOfNullableStrings(oneArrayOfNullableStrings);
    }

    public OneArrayOfNullableStringsValue1() {
        this.oneArrayOfNullableStrings = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 727167023;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableStringsValue1)) return false;
        final OneArrayOfNullableStringsValue1 other = (OneArrayOfNullableStringsValue1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableStrings,
                other.oneArrayOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableStringsValue1(" + oneArrayOfNullableStrings
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfNullableStrings;

    @JsonProperty("oneArrayOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfNullableStrings() {
        return oneArrayOfNullableStrings;
    }

    public OneArrayOfNullableStringsValue1 setOneArrayOfNullableStrings(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableStrings\" cannot be null!");
        this.oneArrayOfNullableStrings = value;

        return this;
    }
}
