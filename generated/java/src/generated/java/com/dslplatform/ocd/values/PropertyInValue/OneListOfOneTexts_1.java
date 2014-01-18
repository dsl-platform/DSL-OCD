package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneTexts_1 implements java.io.Serializable {
    public OneListOfOneTexts_1(
            final java.util.List<String> oneListOfOneTexts) {
        setOneListOfOneTexts(oneListOfOneTexts);
    }

    public OneListOfOneTexts_1() {
        this.oneListOfOneTexts = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 721722129;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneTexts_1)) return false;
        final OneListOfOneTexts_1 other = (OneListOfOneTexts_1) obj;

        if (!(this.oneListOfOneTexts.equals(other.oneListOfOneTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneTexts_1(" + oneListOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneTexts;

    @JsonProperty("oneListOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneTexts() {
        return oneListOfOneTexts;
    }

    public OneListOfOneTexts_1 setOneListOfOneTexts(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneTexts = value;

        return this;
    }
}
