package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableStringsWithMaxLengthOf9_1 implements
        java.io.Serializable {
    public NullableListOfNullableStringsWithMaxLengthOf9_1(
            final java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9) {
        setNullableListOfNullableStringsWithMaxLengthOf9(nullableListOfNullableStringsWithMaxLengthOf9);
    }

    public NullableListOfNullableStringsWithMaxLengthOf9_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 231488707;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableStringsWithMaxLengthOf9_1))
            return false;
        final NullableListOfNullableStringsWithMaxLengthOf9_1 other = (NullableListOfNullableStringsWithMaxLengthOf9_1) obj;

        if (!(this.nullableListOfNullableStringsWithMaxLengthOf9 == other.nullableListOfNullableStringsWithMaxLengthOf9 || this.nullableListOfNullableStringsWithMaxLengthOf9 != null
                && this.nullableListOfNullableStringsWithMaxLengthOf9
                        .equals(other.nullableListOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableStringsWithMaxLengthOf9_1("
                + nullableListOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableListOfNullableStringsWithMaxLengthOf9")
    public java.util.List<String> getNullableListOfNullableStringsWithMaxLengthOf9() {
        return nullableListOfNullableStringsWithMaxLengthOf9;
    }

    public NullableListOfNullableStringsWithMaxLengthOf9_1 setNullableListOfNullableStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableListOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}
