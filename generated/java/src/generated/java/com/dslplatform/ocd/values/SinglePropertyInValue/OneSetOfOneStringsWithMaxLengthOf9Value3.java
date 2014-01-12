package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneStringsWithMaxLengthOf9Value3 implements
        java.io.Serializable {
    public OneSetOfOneStringsWithMaxLengthOf9Value3(
            final java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9) {
        setOneSetOfOneStringsWithMaxLengthOf9(oneSetOfOneStringsWithMaxLengthOf9);
    }

    public OneSetOfOneStringsWithMaxLengthOf9Value3() {
        this.oneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1253919541;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneStringsWithMaxLengthOf9Value3))
            return false;
        final OneSetOfOneStringsWithMaxLengthOf9Value3 other = (OneSetOfOneStringsWithMaxLengthOf9Value3) obj;

        if (!(this.oneSetOfOneStringsWithMaxLengthOf9
                .equals(other.oneSetOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneStringsWithMaxLengthOf9Value3("
                + oneSetOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneSetOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneStringsWithMaxLengthOf9() {
        return oneSetOfOneStringsWithMaxLengthOf9;
    }

    public OneSetOfOneStringsWithMaxLengthOf9Value3 setOneSetOfOneStringsWithMaxLengthOf9(
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
