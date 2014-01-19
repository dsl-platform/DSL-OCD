package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableStringsWithMaxLengthOf9_1 implements
        java.io.Serializable {
    public OneArrayOfNullableStringsWithMaxLengthOf9_1(
            final String[] oneArrayOfNullableStringsWithMaxLengthOf9) {
        setOneArrayOfNullableStringsWithMaxLengthOf9(oneArrayOfNullableStringsWithMaxLengthOf9);
    }

    public OneArrayOfNullableStringsWithMaxLengthOf9_1() {
        this.oneArrayOfNullableStringsWithMaxLengthOf9 = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 831490545;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableStringsWithMaxLengthOf9_1))
            return false;
        final OneArrayOfNullableStringsWithMaxLengthOf9_1 other = (OneArrayOfNullableStringsWithMaxLengthOf9_1) obj;

        if (!(java.util.Arrays.equals(
                this.oneArrayOfNullableStringsWithMaxLengthOf9,
                other.oneArrayOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableStringsWithMaxLengthOf9_1("
                + oneArrayOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("oneArrayOfNullableStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfNullableStringsWithMaxLengthOf9() {
        return oneArrayOfNullableStringsWithMaxLengthOf9;
    }

    public OneArrayOfNullableStringsWithMaxLengthOf9_1 setOneArrayOfNullableStringsWithMaxLengthOf9(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.oneArrayOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}