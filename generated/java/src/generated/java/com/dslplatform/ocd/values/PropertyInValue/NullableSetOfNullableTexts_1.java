package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableTexts_1 implements java.io.Serializable {
    public NullableSetOfNullableTexts_1(
            final java.util.Set<String> nullableSetOfNullableTexts) {
        setNullableSetOfNullableTexts(nullableSetOfNullableTexts);
    }

    public NullableSetOfNullableTexts_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1821930421;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableTexts_1)) return false;
        final NullableSetOfNullableTexts_1 other = (NullableSetOfNullableTexts_1) obj;

        if (!(this.nullableSetOfNullableTexts == other.nullableSetOfNullableTexts || this.nullableSetOfNullableTexts != null
                && this.nullableSetOfNullableTexts
                        .equals(other.nullableSetOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableTexts_1(" + nullableSetOfNullableTexts
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableTexts;

    @JsonProperty("nullableSetOfNullableTexts")
    public java.util.Set<String> getNullableSetOfNullableTexts() {
        return nullableSetOfNullableTexts;
    }

    public NullableSetOfNullableTexts_1 setNullableSetOfNullableTexts(
            final java.util.Set<String> value) {
        this.nullableSetOfNullableTexts = value;

        return this;
    }
}
