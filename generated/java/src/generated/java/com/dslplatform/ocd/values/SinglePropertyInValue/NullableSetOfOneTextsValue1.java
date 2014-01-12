package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneTextsValue1 implements java.io.Serializable {
    public NullableSetOfOneTextsValue1(
            final java.util.Set<String> nullableSetOfOneTexts) {
        setNullableSetOfOneTexts(nullableSetOfOneTexts);
    }

    public NullableSetOfOneTextsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 243398008;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneTextsValue1)) return false;
        final NullableSetOfOneTextsValue1 other = (NullableSetOfOneTextsValue1) obj;

        if (!(this.nullableSetOfOneTexts == other.nullableSetOfOneTexts || this.nullableSetOfOneTexts != null
                && this.nullableSetOfOneTexts
                        .equals(other.nullableSetOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneTextsValue1(" + nullableSetOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneTexts;

    @JsonProperty("nullableSetOfOneTexts")
    public java.util.Set<String> getNullableSetOfOneTexts() {
        return nullableSetOfOneTexts;
    }

    public NullableSetOfOneTextsValue1 setNullableSetOfOneTexts(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneTexts = value;

        return this;
    }
}
