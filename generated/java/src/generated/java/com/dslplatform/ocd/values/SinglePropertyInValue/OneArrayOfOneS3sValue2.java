package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneS3sValue2 implements java.io.Serializable {
    public OneArrayOfOneS3sValue2(
            final com.dslplatform.storage.S3[] oneArrayOfOneS3s) {
        setOneArrayOfOneS3s(oneArrayOfOneS3s);
    }

    public OneArrayOfOneS3sValue2() {
        this.oneArrayOfOneS3s = new com.dslplatform.storage.S3[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 71484416;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneS3sValue2)) return false;
        final OneArrayOfOneS3sValue2 other = (OneArrayOfOneS3sValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneS3s,
                other.oneArrayOfOneS3s))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneS3sValue2(" + oneArrayOfOneS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private com.dslplatform.storage.S3[] oneArrayOfOneS3s;

    @JsonProperty("oneArrayOfOneS3s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public com.dslplatform.storage.S3[] getOneArrayOfOneS3s() {
        return oneArrayOfOneS3s;
    }

    public OneArrayOfOneS3sValue2 setOneArrayOfOneS3s(
            final com.dslplatform.storage.S3[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneS3s\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneS3s = value;

        return this;
    }
}
