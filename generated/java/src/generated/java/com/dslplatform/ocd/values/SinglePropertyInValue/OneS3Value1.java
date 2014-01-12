package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneS3Value1 implements java.io.Serializable {
    public OneS3Value1(
            final com.dslplatform.storage.S3 oneS3) {
        setOneS3(oneS3);
    }

    public OneS3Value1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1812507580;
        result = prime * result
                + (this.oneS3 != null ? this.oneS3.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneS3Value1)) return false;
        final OneS3Value1 other = (OneS3Value1) obj;

        if (!(this.oneS3.equals(other.oneS3))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneS3Value1(" + oneS3 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private com.dslplatform.storage.S3 oneS3;

    @JsonProperty("oneS3")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public com.dslplatform.storage.S3 getOneS3() {
        return oneS3;
    }

    public OneS3Value1 setOneS3(final com.dslplatform.storage.S3 value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneS3\" cannot be null!");
        this.oneS3 = value;

        return this;
    }
}
