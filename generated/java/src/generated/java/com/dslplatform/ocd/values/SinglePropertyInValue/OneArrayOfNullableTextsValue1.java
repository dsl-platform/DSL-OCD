package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableTextsValue1 implements
        java.io.Serializable {
    public OneArrayOfNullableTextsValue1(
            final String[] oneArrayOfNullableTexts) {
        setOneArrayOfNullableTexts(oneArrayOfNullableTexts);
    }

    public OneArrayOfNullableTextsValue1() {
        this.oneArrayOfNullableTexts = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 160689241;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableTextsValue1)) return false;
        final OneArrayOfNullableTextsValue1 other = (OneArrayOfNullableTextsValue1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableTexts,
                other.oneArrayOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableTextsValue1(" + oneArrayOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfNullableTexts;

    @JsonProperty("oneArrayOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfNullableTexts() {
        return oneArrayOfNullableTexts;
    }

    public OneArrayOfNullableTextsValue1 setOneArrayOfNullableTexts(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableTexts\" cannot be null!");
        this.oneArrayOfNullableTexts = value;

        return this;
    }
}
