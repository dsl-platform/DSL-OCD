package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneTextsValue2 implements java.io.Serializable {
    public OneListOfOneTextsValue2(
            final java.util.List<String> oneListOfOneTexts) {
        setOneListOfOneTexts(oneListOfOneTexts);
    }

    public OneListOfOneTextsValue2() {
        this.oneListOfOneTexts = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 94853054;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneTextsValue2)) return false;
        final OneListOfOneTextsValue2 other = (OneListOfOneTextsValue2) obj;

        if (!(this.oneListOfOneTexts.equals(other.oneListOfOneTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneTextsValue2(" + oneListOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneTexts;

    @JsonProperty("oneListOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneTexts() {
        return oneListOfOneTexts;
    }

    public OneListOfOneTextsValue2 setOneListOfOneTexts(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneTexts = value;

        return this;
    }
}
