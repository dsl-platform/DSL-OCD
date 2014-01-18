package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableStringsWithMaxLengthOf9_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableStringsWithMaxLengthOf9_1(
            final String[] nullableArrayOfNullableStringsWithMaxLengthOf9) {
        setNullableArrayOfNullableStringsWithMaxLengthOf9(nullableArrayOfNullableStringsWithMaxLengthOf9);
    }

    public NullableArrayOfNullableStringsWithMaxLengthOf9_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 549260672;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableStringsWithMaxLengthOf9_1))
            return false;
        final NullableArrayOfNullableStringsWithMaxLengthOf9_1 other = (NullableArrayOfNullableStringsWithMaxLengthOf9_1) obj;

        if (!(java.util.Arrays.equals(
                this.nullableArrayOfNullableStringsWithMaxLengthOf9,
                other.nullableArrayOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableStringsWithMaxLengthOf9_1("
                + nullableArrayOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableArrayOfNullableStringsWithMaxLengthOf9")
    public String[] getNullableArrayOfNullableStringsWithMaxLengthOf9() {
        return nullableArrayOfNullableStringsWithMaxLengthOf9;
    }

    public NullableArrayOfNullableStringsWithMaxLengthOf9_1 setNullableArrayOfNullableStringsWithMaxLengthOf9(
            final String[] value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableArrayOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}
