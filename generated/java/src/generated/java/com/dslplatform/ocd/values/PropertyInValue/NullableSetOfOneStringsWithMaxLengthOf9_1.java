package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneStringsWithMaxLengthOf9_1 implements
        java.io.Serializable {
    public NullableSetOfOneStringsWithMaxLengthOf9_1(
            final java.util.Set<String> nullableSetOfOneStringsWithMaxLengthOf9) {
        setNullableSetOfOneStringsWithMaxLengthOf9(nullableSetOfOneStringsWithMaxLengthOf9);
    }

    public NullableSetOfOneStringsWithMaxLengthOf9_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 906163908;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneStringsWithMaxLengthOf9_1))
            return false;
        final NullableSetOfOneStringsWithMaxLengthOf9_1 other = (NullableSetOfOneStringsWithMaxLengthOf9_1) obj;

        if (!(this.nullableSetOfOneStringsWithMaxLengthOf9 == other.nullableSetOfOneStringsWithMaxLengthOf9 || this.nullableSetOfOneStringsWithMaxLengthOf9 != null
                && this.nullableSetOfOneStringsWithMaxLengthOf9
                        .equals(other.nullableSetOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneStringsWithMaxLengthOf9_1("
                + nullableSetOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableSetOfOneStringsWithMaxLengthOf9")
    public java.util.Set<String> getNullableSetOfOneStringsWithMaxLengthOf9() {
        return nullableSetOfOneStringsWithMaxLengthOf9;
    }

    public NullableSetOfOneStringsWithMaxLengthOf9_1 setNullableSetOfOneStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableSetOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }
}
