package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableLong_4 implements java.io.Serializable {
    public NullableLong_4(
            final Long nullableLong,
            final Long calculatedNullableLong,
            final Long persistedNullableLong) {
        setNullableLong(nullableLong);
        this.calculatedNullableLong = calculatedNullableLong;
        this.persistedNullableLong = persistedNullableLong;
    }

    public NullableLong_4() {
        this.calculatedNullableLong = null;
        this.persistedNullableLong = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 697128442;
        result = prime
                * result
                + (this.nullableLong != null ? this.nullableLong.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableLong != null
                        ? this.calculatedNullableLong.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableLong != null
                        ? this.persistedNullableLong.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableLong_4)) return false;
        final NullableLong_4 other = (NullableLong_4) obj;

        if (!(this.nullableLong == other.nullableLong || this.nullableLong != null
                && this.nullableLong.equals(other.nullableLong))) return false;
        if (!(this.calculatedNullableLong == other.calculatedNullableLong || this.calculatedNullableLong != null
                && this.calculatedNullableLong
                        .equals(other.calculatedNullableLong))) return false;
        if (!(this.persistedNullableLong == other.persistedNullableLong || this.persistedNullableLong != null
                && this.persistedNullableLong
                        .equals(other.persistedNullableLong))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableLong_4(" + nullableLong + ',' + calculatedNullableLong
                + ',' + persistedNullableLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long nullableLong;

    @JsonProperty("nullableLong")
    public Long getNullableLong() {
        return nullableLong;
    }

    public NullableLong_4 setNullableLong(final Long value) {
        this.nullableLong = value;

        return this;
    }

    private final Long calculatedNullableLong;

    public Long getCalculatedNullableLong() {
        return this.calculatedNullableLong;
    }

    private final Long persistedNullableLong;

    public Long getPersistedNullableLong() {
        return this.persistedNullableLong;
    }
}
