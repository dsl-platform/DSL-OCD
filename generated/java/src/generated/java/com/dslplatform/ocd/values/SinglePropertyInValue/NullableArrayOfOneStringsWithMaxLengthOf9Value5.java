package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneStringsWithMaxLengthOf9Value5 implements
        java.io.Serializable {
    public NullableArrayOfOneStringsWithMaxLengthOf9Value5(
            final String[] nullableArrayOfOneStringsWithMaxLengthOf9) {
        setNullableArrayOfOneStringsWithMaxLengthOf9(nullableArrayOfOneStringsWithMaxLengthOf9);
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9Value5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1378079537;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneStringsWithMaxLengthOf9Value5))
            return false;
        final NullableArrayOfOneStringsWithMaxLengthOf9Value5 other = (NullableArrayOfOneStringsWithMaxLengthOf9Value5) obj;

        if (!(java.util.Arrays.equals(
                this.nullableArrayOfOneStringsWithMaxLengthOf9,
                other.nullableArrayOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneStringsWithMaxLengthOf9Value5("
                + nullableArrayOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9")
    public String[] getNullableArrayOfOneStringsWithMaxLengthOf9() {
        return nullableArrayOfOneStringsWithMaxLengthOf9;
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9Value5 setNullableArrayOfOneStringsWithMaxLengthOf9(
            final String[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableArrayOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }
}
