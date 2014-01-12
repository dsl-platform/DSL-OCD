package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableS3sValue2 implements
        java.io.Serializable {
    public NullableArrayOfNullableS3sValue2(
            final com.dslplatform.storage.S3[] nullableArrayOfNullableS3s) {
        setNullableArrayOfNullableS3s(nullableArrayOfNullableS3s);
    }

    public NullableArrayOfNullableS3sValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1780898502;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableS3sValue2)) return false;
        final NullableArrayOfNullableS3sValue2 other = (NullableArrayOfNullableS3sValue2) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableS3s,
                other.nullableArrayOfNullableS3s))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableS3sValue2(" + nullableArrayOfNullableS3s
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private com.dslplatform.storage.S3[] nullableArrayOfNullableS3s;

    @JsonProperty("nullableArrayOfNullableS3s")
    public com.dslplatform.storage.S3[] getNullableArrayOfNullableS3s() {
        return nullableArrayOfNullableS3s;
    }

    public NullableArrayOfNullableS3sValue2 setNullableArrayOfNullableS3s(
            final com.dslplatform.storage.S3[] value) {
        this.nullableArrayOfNullableS3s = value;

        return this;
    }
}
