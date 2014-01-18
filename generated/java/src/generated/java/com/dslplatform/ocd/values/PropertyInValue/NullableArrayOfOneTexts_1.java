package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneTexts_1 implements java.io.Serializable {
    public NullableArrayOfOneTexts_1(
            final String[] nullableArrayOfOneTexts) {
        setNullableArrayOfOneTexts(nullableArrayOfOneTexts);
    }

    public NullableArrayOfOneTexts_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1076874187;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneTexts_1)) return false;
        final NullableArrayOfOneTexts_1 other = (NullableArrayOfOneTexts_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneTexts,
                other.nullableArrayOfOneTexts))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneTexts_1(" + nullableArrayOfOneTexts + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfOneTexts;

    @JsonProperty("nullableArrayOfOneTexts")
    public String[] getNullableArrayOfOneTexts() {
        return nullableArrayOfOneTexts;
    }

    public NullableArrayOfOneTexts_1 setNullableArrayOfOneTexts(
            final String[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneTexts = value;

        return this;
    }
}
