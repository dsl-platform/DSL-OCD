package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneStringsWithMaxLengthOf9_1 implements
        java.io.Serializable {
    public OneSetOfOneStringsWithMaxLengthOf9_1(
            final java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9) {
        setOneSetOfOneStringsWithMaxLengthOf9(oneSetOfOneStringsWithMaxLengthOf9);
    }

    public OneSetOfOneStringsWithMaxLengthOf9_1() {
        this.oneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 104706429;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneStringsWithMaxLengthOf9_1))
            return false;
        final OneSetOfOneStringsWithMaxLengthOf9_1 other = (OneSetOfOneStringsWithMaxLengthOf9_1) obj;

        if (!(this.oneSetOfOneStringsWithMaxLengthOf9
                .equals(other.oneSetOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneStringsWithMaxLengthOf9_1("
                + oneSetOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneSetOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneStringsWithMaxLengthOf9() {
        return oneSetOfOneStringsWithMaxLengthOf9;
    }

    public OneSetOfOneStringsWithMaxLengthOf9_1 setOneSetOfOneStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.oneSetOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }
}
