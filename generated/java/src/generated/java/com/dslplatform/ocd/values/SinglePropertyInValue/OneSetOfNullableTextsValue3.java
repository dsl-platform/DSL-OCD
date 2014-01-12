package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableTextsValue3 implements java.io.Serializable {
    public OneSetOfNullableTextsValue3(
            final java.util.Set<String> oneSetOfNullableTexts) {
        setOneSetOfNullableTexts(oneSetOfNullableTexts);
    }

    public OneSetOfNullableTextsValue3() {
        this.oneSetOfNullableTexts = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1166865420;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableTextsValue3)) return false;
        final OneSetOfNullableTextsValue3 other = (OneSetOfNullableTextsValue3) obj;

        if (!(this.oneSetOfNullableTexts.equals(other.oneSetOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableTextsValue3(" + oneSetOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableTexts;

    @JsonProperty("oneSetOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableTexts() {
        return oneSetOfNullableTexts;
    }

    public OneSetOfNullableTextsValue3 setOneSetOfNullableTexts(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableTexts\" cannot be null!");
        this.oneSetOfNullableTexts = value;

        return this;
    }
}
