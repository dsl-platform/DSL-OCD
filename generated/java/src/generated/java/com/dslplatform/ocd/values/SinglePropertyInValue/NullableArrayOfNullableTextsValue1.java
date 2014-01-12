package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableTextsValue1 implements
        java.io.Serializable {
    public NullableArrayOfNullableTextsValue1(
            final String[] nullableArrayOfNullableTexts) {
        setNullableArrayOfNullableTexts(nullableArrayOfNullableTexts);
    }

    public NullableArrayOfNullableTextsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1633132176;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableTextsValue1)) return false;
        final NullableArrayOfNullableTextsValue1 other = (NullableArrayOfNullableTextsValue1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableTexts,
                other.nullableArrayOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableTextsValue1("
                + nullableArrayOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableTexts;

    @JsonProperty("nullableArrayOfNullableTexts")
    public String[] getNullableArrayOfNullableTexts() {
        return nullableArrayOfNullableTexts;
    }

    public NullableArrayOfNullableTextsValue1 setNullableArrayOfNullableTexts(
            final String[] value) {
        this.nullableArrayOfNullableTexts = value;

        return this;
    }
}
