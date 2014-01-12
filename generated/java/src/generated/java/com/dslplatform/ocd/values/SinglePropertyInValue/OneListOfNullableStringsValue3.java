package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableStringsValue3 implements
        java.io.Serializable {
    public OneListOfNullableStringsValue3(
            final java.util.List<String> oneListOfNullableStrings) {
        setOneListOfNullableStrings(oneListOfNullableStrings);
    }

    public OneListOfNullableStringsValue3() {
        this.oneListOfNullableStrings = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1302886022;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableStringsValue3)) return false;
        final OneListOfNullableStringsValue3 other = (OneListOfNullableStringsValue3) obj;

        if (!(this.oneListOfNullableStrings
                .equals(other.oneListOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableStringsValue3(" + oneListOfNullableStrings
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfNullableStrings;

    @JsonProperty("oneListOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableStrings() {
        return oneListOfNullableStrings;
    }

    public OneListOfNullableStringsValue3 setOneListOfNullableStrings(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableStrings\" cannot be null!");
        this.oneListOfNullableStrings = value;

        return this;
    }
}
