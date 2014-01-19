package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneStringsWithMaxLengthOf9_1 implements
        java.io.Serializable {
    public OneListOfOneStringsWithMaxLengthOf9_1(
            final java.util.List<String> oneListOfOneStringsWithMaxLengthOf9) {
        setOneListOfOneStringsWithMaxLengthOf9(oneListOfOneStringsWithMaxLengthOf9);
    }

    public OneListOfOneStringsWithMaxLengthOf9_1() {
        this.oneListOfOneStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1322550851;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneStringsWithMaxLengthOf9_1))
            return false;
        final OneListOfOneStringsWithMaxLengthOf9_1 other = (OneListOfOneStringsWithMaxLengthOf9_1) obj;

        if (!(this.oneListOfOneStringsWithMaxLengthOf9
                .equals(other.oneListOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneStringsWithMaxLengthOf9_1("
                + oneListOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneListOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneStringsWithMaxLengthOf9() {
        return oneListOfOneStringsWithMaxLengthOf9;
    }

    public OneListOfOneStringsWithMaxLengthOf9_1 setOneListOfOneStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.oneListOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }
}