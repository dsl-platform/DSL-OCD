package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableS3sValue1 implements
        java.io.Serializable {
    public NullableListOfNullableS3sValue1(
            final java.util.List<com.dslplatform.storage.S3> nullableListOfNullableS3s) {
        setNullableListOfNullableS3s(nullableListOfNullableS3s);
    }

    public NullableListOfNullableS3sValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 616998346;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableS3sValue1)) return false;
        final NullableListOfNullableS3sValue1 other = (NullableListOfNullableS3sValue1) obj;

        if (!(this.nullableListOfNullableS3s == other.nullableListOfNullableS3s || this.nullableListOfNullableS3s != null
                && this.nullableListOfNullableS3s
                        .equals(other.nullableListOfNullableS3s)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableS3sValue1(" + nullableListOfNullableS3s
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<com.dslplatform.storage.S3> nullableListOfNullableS3s;

    @JsonProperty("nullableListOfNullableS3s")
    public java.util.List<com.dslplatform.storage.S3> getNullableListOfNullableS3s() {
        return nullableListOfNullableS3s;
    }

    public NullableListOfNullableS3sValue1 setNullableListOfNullableS3s(
            final java.util.List<com.dslplatform.storage.S3> value) {
        this.nullableListOfNullableS3s = value;

        return this;
    }
}
