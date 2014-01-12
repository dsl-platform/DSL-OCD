package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneTextsValue2 implements java.io.Serializable {
    public OneArrayOfOneTextsValue2(
            final String[] oneArrayOfOneTexts) {
        setOneArrayOfOneTexts(oneArrayOfOneTexts);
    }

    public OneArrayOfOneTextsValue2() {
        this.oneArrayOfOneTexts = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 791188473;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneTextsValue2)) return false;
        final OneArrayOfOneTextsValue2 other = (OneArrayOfOneTextsValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneTexts,
                other.oneArrayOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneTextsValue2(" + oneArrayOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneTexts;

    @JsonProperty("oneArrayOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneTexts() {
        return oneArrayOfOneTexts;
    }

    public OneArrayOfOneTextsValue2 setOneArrayOfOneTexts(final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneTexts = value;

        return this;
    }
}
