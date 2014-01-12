package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneTextsValue1 implements
        java.io.Serializable {
    public NullableArrayOfOneTextsValue1(
            final String[] nullableArrayOfOneTexts) {
        setNullableArrayOfOneTexts(nullableArrayOfOneTexts);
    }

    public NullableArrayOfOneTextsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 627637153;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneTextsValue1)) return false;
        final NullableArrayOfOneTextsValue1 other = (NullableArrayOfOneTextsValue1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneTexts,
                other.nullableArrayOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneTextsValue1(" + nullableArrayOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfOneTexts;

    @JsonProperty("nullableArrayOfOneTexts")
    public String[] getNullableArrayOfOneTexts() {
        return nullableArrayOfOneTexts;
    }

    public NullableArrayOfOneTextsValue1 setNullableArrayOfOneTexts(
            final String[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneTexts = value;

        return this;
    }
}
