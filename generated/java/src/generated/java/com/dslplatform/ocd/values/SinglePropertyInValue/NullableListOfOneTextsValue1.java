package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneTextsValue1 implements java.io.Serializable {
    public NullableListOfOneTextsValue1(
            final java.util.List<String> nullableListOfOneTexts) {
        setNullableListOfOneTexts(nullableListOfOneTexts);
    }

    public NullableListOfOneTextsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 141584030;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneTextsValue1)) return false;
        final NullableListOfOneTextsValue1 other = (NullableListOfOneTextsValue1) obj;

        if (!(this.nullableListOfOneTexts == other.nullableListOfOneTexts || this.nullableListOfOneTexts != null
                && this.nullableListOfOneTexts
                        .equals(other.nullableListOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneTextsValue1(" + nullableListOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneTexts;

    @JsonProperty("nullableListOfOneTexts")
    public java.util.List<String> getNullableListOfOneTexts() {
        return nullableListOfOneTexts;
    }

    public NullableListOfOneTextsValue1 setNullableListOfOneTexts(
            final java.util.List<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneTexts = value;

        return this;
    }
}
