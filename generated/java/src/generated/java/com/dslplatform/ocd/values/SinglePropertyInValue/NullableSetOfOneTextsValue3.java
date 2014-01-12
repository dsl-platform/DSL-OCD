package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneTextsValue3 implements java.io.Serializable {
    public NullableSetOfOneTextsValue3(
            final java.util.Set<String> nullableSetOfOneTexts) {
        setNullableSetOfOneTexts(nullableSetOfOneTexts);
    }

    public NullableSetOfOneTextsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 243398010;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneTextsValue3)) return false;
        final NullableSetOfOneTextsValue3 other = (NullableSetOfOneTextsValue3) obj;

        if (!(this.nullableSetOfOneTexts == other.nullableSetOfOneTexts || this.nullableSetOfOneTexts != null
                && this.nullableSetOfOneTexts
                        .equals(other.nullableSetOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneTextsValue3(" + nullableSetOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneTexts;

    @JsonProperty("nullableSetOfOneTexts")
    public java.util.Set<String> getNullableSetOfOneTexts() {
        return nullableSetOfOneTexts;
    }

    public NullableSetOfOneTextsValue3 setNullableSetOfOneTexts(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneTexts = value;

        return this;
    }
}
