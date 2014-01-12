package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneTextsValue5 implements java.io.Serializable {
    public OneArrayOfOneTextsValue5(
            final String[] oneArrayOfOneTexts) {
        setOneArrayOfOneTexts(oneArrayOfOneTexts);
    }

    public OneArrayOfOneTextsValue5() {
        this.oneArrayOfOneTexts = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1581464522;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneTextsValue5)) return false;
        final OneArrayOfOneTextsValue5 other = (OneArrayOfOneTextsValue5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneTexts,
                other.oneArrayOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneTextsValue5(" + oneArrayOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneTexts;

    @JsonProperty("oneArrayOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneTexts() {
        return oneArrayOfOneTexts;
    }

    public OneArrayOfOneTextsValue5 setOneArrayOfOneTexts(final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneTexts = value;

        return this;
    }
}
