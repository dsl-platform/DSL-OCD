package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneStringsValue3 implements java.io.Serializable {
    public OneArrayOfOneStringsValue3(
            final String[] oneArrayOfOneStrings) {
        setOneArrayOfOneStrings(oneArrayOfOneStrings);
    }

    public OneArrayOfOneStringsValue3() {
        this.oneArrayOfOneStrings = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 534282378;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneStringsValue3)) return false;
        final OneArrayOfOneStringsValue3 other = (OneArrayOfOneStringsValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneStrings,
                other.oneArrayOfOneStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneStringsValue3(" + oneArrayOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneStrings;

    @JsonProperty("oneArrayOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneStrings() {
        return oneArrayOfOneStrings;
    }

    public OneArrayOfOneStringsValue3 setOneArrayOfOneStrings(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneStrings = value;

        return this;
    }
}
