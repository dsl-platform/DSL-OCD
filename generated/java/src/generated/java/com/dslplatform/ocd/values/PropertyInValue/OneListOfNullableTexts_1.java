package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableTexts_1 implements java.io.Serializable {
    public OneListOfNullableTexts_1(
            final java.util.List<String> oneListOfNullableTexts) {
        setOneListOfNullableTexts(oneListOfNullableTexts);
    }

    public OneListOfNullableTexts_1() {
        this.oneListOfNullableTexts = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1187052986;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableTexts_1)) return false;
        final OneListOfNullableTexts_1 other = (OneListOfNullableTexts_1) obj;

        if (!(this.oneListOfNullableTexts.equals(other.oneListOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableTexts_1(" + oneListOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfNullableTexts;

    @JsonProperty("oneListOfNullableTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableTexts() {
        return oneListOfNullableTexts;
    }

    public OneListOfNullableTexts_1 setOneListOfNullableTexts(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableTexts\" cannot be null!");
        this.oneListOfNullableTexts = value;

        return this;
    }
}
