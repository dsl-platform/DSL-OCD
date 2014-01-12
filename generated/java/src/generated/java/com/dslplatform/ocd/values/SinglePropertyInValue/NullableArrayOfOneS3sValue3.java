package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneS3sValue3 implements java.io.Serializable {
    public NullableArrayOfOneS3sValue3(
            final com.dslplatform.storage.S3[] nullableArrayOfOneS3s) {
        setNullableArrayOfOneS3s(nullableArrayOfOneS3s);
    }

    public NullableArrayOfOneS3sValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2085385684;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneS3sValue3)) return false;
        final NullableArrayOfOneS3sValue3 other = (NullableArrayOfOneS3sValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneS3s,
                other.nullableArrayOfOneS3s))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneS3sValue3(" + nullableArrayOfOneS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private com.dslplatform.storage.S3[] nullableArrayOfOneS3s;

    @JsonProperty("nullableArrayOfOneS3s")
    public com.dslplatform.storage.S3[] getNullableArrayOfOneS3s() {
        return nullableArrayOfOneS3s;
    }

    public NullableArrayOfOneS3sValue3 setNullableArrayOfOneS3s(
            final com.dslplatform.storage.S3[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneS3s = value;

        return this;
    }
}
