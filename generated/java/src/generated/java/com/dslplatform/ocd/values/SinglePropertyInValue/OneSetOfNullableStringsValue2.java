package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableStringsValue2 implements
        java.io.Serializable {
    public OneSetOfNullableStringsValue2(
            final java.util.Set<String> oneSetOfNullableStrings) {
        setOneSetOfNullableStrings(oneSetOfNullableStrings);
    }

    public OneSetOfNullableStringsValue2() {
        this.oneSetOfNullableStrings = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2010515333;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableStringsValue2)) return false;
        final OneSetOfNullableStringsValue2 other = (OneSetOfNullableStringsValue2) obj;

        if (!(this.oneSetOfNullableStrings
                .equals(other.oneSetOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableStringsValue2(" + oneSetOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableStrings;

    @JsonProperty("oneSetOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableStrings() {
        return oneSetOfNullableStrings;
    }

    public OneSetOfNullableStringsValue2 setOneSetOfNullableStrings(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableStrings\" cannot be null!");
        this.oneSetOfNullableStrings = value;

        return this;
    }
}
