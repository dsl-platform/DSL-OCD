package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableTexts_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableTexts_1(
            final String[] nullableArrayOfNullableTexts) {
        setNullableArrayOfNullableTexts(nullableArrayOfNullableTexts);
    }

    public NullableArrayOfNullableTexts_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 814909780;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableTexts_1)) return false;
        final NullableArrayOfNullableTexts_1 other = (NullableArrayOfNullableTexts_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableTexts,
                other.nullableArrayOfNullableTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableTexts_1(" + nullableArrayOfNullableTexts
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableTexts;

    @JsonProperty("nullableArrayOfNullableTexts")
    public String[] getNullableArrayOfNullableTexts() {
        return nullableArrayOfNullableTexts;
    }

    public NullableArrayOfNullableTexts_1 setNullableArrayOfNullableTexts(
            final String[] value) {
        this.nullableArrayOfNullableTexts = value;

        return this;
    }
}
