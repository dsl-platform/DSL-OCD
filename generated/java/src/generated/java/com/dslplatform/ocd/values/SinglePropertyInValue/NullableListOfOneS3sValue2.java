package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneS3sValue2 implements java.io.Serializable {
    public NullableListOfOneS3sValue2(
            final java.util.List<com.dslplatform.storage.S3> nullableListOfOneS3s) {
        setNullableListOfOneS3s(nullableListOfOneS3s);
    }

    public NullableListOfOneS3sValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1938969724;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneS3sValue2)) return false;
        final NullableListOfOneS3sValue2 other = (NullableListOfOneS3sValue2) obj;

        if (!(this.nullableListOfOneS3s == other.nullableListOfOneS3s || this.nullableListOfOneS3s != null
                && this.nullableListOfOneS3s.equals(other.nullableListOfOneS3s)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneS3sValue2(" + nullableListOfOneS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<com.dslplatform.storage.S3> nullableListOfOneS3s;

    @JsonProperty("nullableListOfOneS3s")
    public java.util.List<com.dslplatform.storage.S3> getNullableListOfOneS3s() {
        return nullableListOfOneS3s;
    }

    public NullableListOfOneS3sValue2 setNullableListOfOneS3s(
            final java.util.List<com.dslplatform.storage.S3> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneS3s = value;

        return this;
    }
}
