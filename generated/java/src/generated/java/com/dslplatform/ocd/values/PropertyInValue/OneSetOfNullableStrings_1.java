package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableStrings_1 implements java.io.Serializable {
    public OneSetOfNullableStrings_1(
            final java.util.Set<String> oneSetOfNullableStrings) {
        setOneSetOfNullableStrings(oneSetOfNullableStrings);
    }

    public OneSetOfNullableStrings_1() {
        this.oneSetOfNullableStrings = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1212706012;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableStrings_1)) return false;
        final OneSetOfNullableStrings_1 other = (OneSetOfNullableStrings_1) obj;

        if (!(this.oneSetOfNullableStrings
                .equals(other.oneSetOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableStrings_1(" + oneSetOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableStrings;

    @JsonProperty("oneSetOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableStrings() {
        return oneSetOfNullableStrings;
    }

    public OneSetOfNullableStrings_1 setOneSetOfNullableStrings(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableStrings\" cannot be null!");
        this.oneSetOfNullableStrings = value;

        return this;
    }
}
