package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneStringsValue6 implements java.io.Serializable {
    public OneArrayOfOneStringsValue6(
            final String[] oneArrayOfOneStrings) {
        setOneArrayOfOneStrings(oneArrayOfOneStrings);
    }

    public OneArrayOfOneStringsValue6() {
        this.oneArrayOfOneStrings = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1293797265;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneStringsValue6)) return false;
        final OneArrayOfOneStringsValue6 other = (OneArrayOfOneStringsValue6) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneStrings,
                other.oneArrayOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneStringsValue6(" + oneArrayOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneStrings;

    @JsonProperty("oneArrayOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneStrings() {
        return oneArrayOfOneStrings;
    }

    public OneArrayOfOneStringsValue6 setOneArrayOfOneStrings(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneStrings = value;

        return this;
    }
}
