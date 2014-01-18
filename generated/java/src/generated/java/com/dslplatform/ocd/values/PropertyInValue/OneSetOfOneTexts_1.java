package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneTexts_1 implements java.io.Serializable {
    public OneSetOfOneTexts_1(
            final java.util.Set<String> oneSetOfOneTexts) {
        setOneSetOfOneTexts(oneSetOfOneTexts);
    }

    public OneSetOfOneTexts_1() {
        this.oneSetOfOneTexts = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 217255635;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneTexts_1)) return false;
        final OneSetOfOneTexts_1 other = (OneSetOfOneTexts_1) obj;

        if (!(this.oneSetOfOneTexts.equals(other.oneSetOfOneTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneTexts_1(" + oneSetOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfOneTexts;

    @JsonProperty("oneSetOfOneTexts")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneTexts() {
        return oneSetOfOneTexts;
    }

    public OneSetOfOneTexts_1 setOneSetOfOneTexts(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneTexts\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneTexts = value;

        return this;
    }
}
