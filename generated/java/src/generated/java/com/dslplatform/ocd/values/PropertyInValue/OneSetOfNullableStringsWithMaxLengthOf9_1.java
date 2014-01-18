package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableStringsWithMaxLengthOf9_1 implements
        java.io.Serializable {
    public OneSetOfNullableStringsWithMaxLengthOf9_1(
            final java.util.Set<String> oneSetOfNullableStringsWithMaxLengthOf9) {
        setOneSetOfNullableStringsWithMaxLengthOf9(oneSetOfNullableStringsWithMaxLengthOf9);
    }

    public OneSetOfNullableStringsWithMaxLengthOf9_1() {
        this.oneSetOfNullableStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1894240062;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableStringsWithMaxLengthOf9_1))
            return false;
        final OneSetOfNullableStringsWithMaxLengthOf9_1 other = (OneSetOfNullableStringsWithMaxLengthOf9_1) obj;

        if (!(this.oneSetOfNullableStringsWithMaxLengthOf9
                .equals(other.oneSetOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableStringsWithMaxLengthOf9_1("
                + oneSetOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("oneSetOfNullableStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableStringsWithMaxLengthOf9() {
        return oneSetOfNullableStringsWithMaxLengthOf9;
    }

    public OneSetOfNullableStringsWithMaxLengthOf9_1 setOneSetOfNullableStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.oneSetOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}
