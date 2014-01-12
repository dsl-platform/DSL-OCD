package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableStringWithMaxLengthOf9Value2 implements
        java.io.Serializable {
    public NullableStringWithMaxLengthOf9Value2(
            final String nullableStringWithMaxLengthOf9) {
        setNullableStringWithMaxLengthOf9(nullableStringWithMaxLengthOf9);
    }

    public NullableStringWithMaxLengthOf9Value2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1127918909;
        result = prime
                * result
                + (this.nullableStringWithMaxLengthOf9 != null
                        ? this.nullableStringWithMaxLengthOf9.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableStringWithMaxLengthOf9Value2))
            return false;
        final NullableStringWithMaxLengthOf9Value2 other = (NullableStringWithMaxLengthOf9Value2) obj;

        if (!(this.nullableStringWithMaxLengthOf9 == other.nullableStringWithMaxLengthOf9 || this.nullableStringWithMaxLengthOf9 != null
                && this.nullableStringWithMaxLengthOf9
                        .equals(other.nullableStringWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableStringWithMaxLengthOf9Value2("
                + nullableStringWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableStringWithMaxLengthOf9;

    @JsonProperty("nullableStringWithMaxLengthOf9")
    public String getNullableStringWithMaxLengthOf9() {
        return nullableStringWithMaxLengthOf9;
    }

    public NullableStringWithMaxLengthOf9Value2 setNullableStringWithMaxLengthOf9(
            final String value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableStringWithMaxLengthOf9 = value;

        return this;
    }
}
