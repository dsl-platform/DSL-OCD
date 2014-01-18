package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableTexts_1 implements java.io.Serializable {
    public OneSetOfNullableTexts_1(
            final java.util.Set<String> oneSetOfNullableTexts) {
        setOneSetOfNullableTexts(oneSetOfNullableTexts);
    }

    public OneSetOfNullableTexts_1() {
        this.oneSetOfNullableTexts = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 82707322;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableTexts_1)) return false;
        final OneSetOfNullableTexts_1 other = (OneSetOfNullableTexts_1) obj;

        if (!(this.oneSetOfNullableTexts.equals(other.oneSetOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableTexts_1(" + oneSetOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableTexts;

    @JsonProperty("oneSetOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableTexts() {
        return oneSetOfNullableTexts;
    }

    public OneSetOfNullableTexts_1 setOneSetOfNullableTexts(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableTexts\" cannot be null!");
        this.oneSetOfNullableTexts = value;

        return this;
    }
}
