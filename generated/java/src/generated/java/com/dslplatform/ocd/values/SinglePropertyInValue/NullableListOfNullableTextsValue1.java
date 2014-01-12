package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableTextsValue1 implements
        java.io.Serializable {
    public NullableListOfNullableTextsValue1(
            final java.util.List<String> nullableListOfNullableTexts) {
        setNullableListOfNullableTexts(nullableListOfNullableTexts);
    }

    public NullableListOfNullableTextsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 113583937;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableTextsValue1)) return false;
        final NullableListOfNullableTextsValue1 other = (NullableListOfNullableTextsValue1) obj;

        if (!(this.nullableListOfNullableTexts == other.nullableListOfNullableTexts || this.nullableListOfNullableTexts != null
                && this.nullableListOfNullableTexts
                        .equals(other.nullableListOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableTextsValue1("
                + nullableListOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableTexts;

    @JsonProperty("nullableListOfNullableTexts")
    public java.util.List<String> getNullableListOfNullableTexts() {
        return nullableListOfNullableTexts;
    }

    public NullableListOfNullableTextsValue1 setNullableListOfNullableTexts(
            final java.util.List<String> value) {
        this.nullableListOfNullableTexts = value;

        return this;
    }
}
