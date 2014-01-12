package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableTextsValue6 implements
        java.io.Serializable {
    public NullableArrayOfNullableTextsValue6(
            final String[] nullableArrayOfNullableTexts) {
        setNullableArrayOfNullableTexts(nullableArrayOfNullableTexts);
    }

    public NullableArrayOfNullableTextsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1229847649;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableTextsValue6)) return false;
        final NullableArrayOfNullableTextsValue6 other = (NullableArrayOfNullableTextsValue6) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableTexts,
                other.nullableArrayOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableTextsValue6("
                + nullableArrayOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableTexts;

    @JsonProperty("nullableArrayOfNullableTexts")
    public String[] getNullableArrayOfNullableTexts() {
        return nullableArrayOfNullableTexts;
    }

    public NullableArrayOfNullableTextsValue6 setNullableArrayOfNullableTexts(
            final String[] value) {
        this.nullableArrayOfNullableTexts = value;

        return this;
    }
}
