package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneStringsWithMaxLengthOf9Value3 implements
        java.io.Serializable {
    public OneArrayOfOneStringsWithMaxLengthOf9Value3(
            final String[] oneArrayOfOneStringsWithMaxLengthOf9) {
        setOneArrayOfOneStringsWithMaxLengthOf9(oneArrayOfOneStringsWithMaxLengthOf9);
    }

    public OneArrayOfOneStringsWithMaxLengthOf9Value3() {
        this.oneArrayOfOneStringsWithMaxLengthOf9 = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 804032544;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneStringsWithMaxLengthOf9Value3))
            return false;
        final OneArrayOfOneStringsWithMaxLengthOf9Value3 other = (OneArrayOfOneStringsWithMaxLengthOf9Value3) obj;

        if (!(java.util.Arrays.equals(
                this.oneArrayOfOneStringsWithMaxLengthOf9,
                other.oneArrayOfOneStringsWithMaxLengthOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneStringsWithMaxLengthOf9Value3("
                + oneArrayOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneStringsWithMaxLengthOf9() {
        return oneArrayOfOneStringsWithMaxLengthOf9;
    }

    public OneArrayOfOneStringsWithMaxLengthOf9Value3 setOneArrayOfOneStringsWithMaxLengthOf9(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.oneArrayOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }
}
