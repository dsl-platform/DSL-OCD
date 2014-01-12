package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableTextsValue1 implements java.io.Serializable {
    public OneListOfNullableTextsValue1(
            final java.util.List<String> oneListOfNullableTexts) {
        setOneListOfNullableTexts(oneListOfNullableTexts);
    }

    public OneListOfNullableTextsValue1() {
        this.oneListOfNullableTexts = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 189454614;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableTextsValue1)) return false;
        final OneListOfNullableTextsValue1 other = (OneListOfNullableTextsValue1) obj;

        if (!(this.oneListOfNullableTexts.equals(other.oneListOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableTextsValue1(" + oneListOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfNullableTexts;

    @JsonProperty("oneListOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableTexts() {
        return oneListOfNullableTexts;
    }

    public OneListOfNullableTextsValue1 setOneListOfNullableTexts(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableTexts\" cannot be null!");
        this.oneListOfNullableTexts = value;

        return this;
    }
}
