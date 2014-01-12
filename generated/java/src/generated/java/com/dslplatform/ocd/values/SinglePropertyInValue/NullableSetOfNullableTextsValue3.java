package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableTextsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableTextsValue3(
            final java.util.Set<String> nullableSetOfNullableTexts) {
        setNullableSetOfNullableTexts(nullableSetOfNullableTexts);
    }

    public NullableSetOfNullableTextsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 514019399;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableTextsValue3)) return false;
        final NullableSetOfNullableTextsValue3 other = (NullableSetOfNullableTextsValue3) obj;

        if (!(this.nullableSetOfNullableTexts == other.nullableSetOfNullableTexts || this.nullableSetOfNullableTexts != null
                && this.nullableSetOfNullableTexts
                        .equals(other.nullableSetOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableTextsValue3(" + nullableSetOfNullableTexts
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableTexts;

    @JsonProperty("nullableSetOfNullableTexts")
    public java.util.Set<String> getNullableSetOfNullableTexts() {
        return nullableSetOfNullableTexts;
    }

    public NullableSetOfNullableTextsValue3 setNullableSetOfNullableTexts(
            final java.util.Set<String> value) {
        this.nullableSetOfNullableTexts = value;

        return this;
    }
}
