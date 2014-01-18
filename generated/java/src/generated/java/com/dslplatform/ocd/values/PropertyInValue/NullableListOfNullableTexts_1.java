package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableTexts_1 implements
        java.io.Serializable {
    public NullableListOfNullableTexts_1(
            final java.util.List<String> nullableListOfNullableTexts) {
        setNullableListOfNullableTexts(nullableListOfNullableTexts);
    }

    public NullableListOfNullableTexts_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1000398763;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableTexts_1)) return false;
        final NullableListOfNullableTexts_1 other = (NullableListOfNullableTexts_1) obj;

        if (!(this.nullableListOfNullableTexts == other.nullableListOfNullableTexts || this.nullableListOfNullableTexts != null
                && this.nullableListOfNullableTexts
                        .equals(other.nullableListOfNullableTexts)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableTexts_1(" + nullableListOfNullableTexts
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableTexts;

    @JsonProperty("nullableListOfNullableTexts")
    public java.util.List<String> getNullableListOfNullableTexts() {
        return nullableListOfNullableTexts;
    }

    public NullableListOfNullableTexts_1 setNullableListOfNullableTexts(
            final java.util.List<String> value) {
        this.nullableListOfNullableTexts = value;

        return this;
    }
}
