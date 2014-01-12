package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableTextsValue3 implements
        java.io.Serializable {
    public NullableArrayOfNullableTextsValue3(
            final String[] nullableArrayOfNullableTexts) {
        setNullableArrayOfNullableTexts(nullableArrayOfNullableTexts);
    }

    public NullableArrayOfNullableTextsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 470332762;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableTextsValue3)) return false;
        final NullableArrayOfNullableTextsValue3 other = (NullableArrayOfNullableTextsValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableTexts,
                other.nullableArrayOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableTextsValue3("
                + nullableArrayOfNullableTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableTexts;

    @JsonProperty("nullableArrayOfNullableTexts")
    public String[] getNullableArrayOfNullableTexts() {
        return nullableArrayOfNullableTexts;
    }

    public NullableArrayOfNullableTextsValue3 setNullableArrayOfNullableTexts(
            final String[] value) {
        this.nullableArrayOfNullableTexts = value;

        return this;
    }
}
