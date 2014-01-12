package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableS3Value1 implements java.io.Serializable {
    public NullableS3Value1(
            final com.dslplatform.storage.S3 nullableS3) {
        setNullableS3(nullableS3);
    }

    public NullableS3Value1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 887902759;
        result = prime * result
                + (this.nullableS3 != null ? this.nullableS3.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableS3Value1)) return false;
        final NullableS3Value1 other = (NullableS3Value1) obj;

        if (!(this.nullableS3 == other.nullableS3 || this.nullableS3 != null
                && this.nullableS3.equals(other.nullableS3))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableS3Value1(" + nullableS3 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private com.dslplatform.storage.S3 nullableS3;

    @JsonProperty("nullableS3")
    public com.dslplatform.storage.S3 getNullableS3() {
        return nullableS3;
    }

    public NullableS3Value1 setNullableS3(final com.dslplatform.storage.S3 value) {
        this.nullableS3 = value;

        return this;
    }
}
