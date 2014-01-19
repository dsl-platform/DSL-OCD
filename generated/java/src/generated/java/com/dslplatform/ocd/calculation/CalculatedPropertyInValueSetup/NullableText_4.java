package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableText_4 implements java.io.Serializable {
    public NullableText_4(
            final String nullableText,
            final String calculatedNullableText,
            final String persistedNullableText) {
        setNullableText(nullableText);
        this.calculatedNullableText = calculatedNullableText;
        this.persistedNullableText = persistedNullableText;
    }

    public NullableText_4() {
        this.calculatedNullableText = null;
        this.persistedNullableText = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 780290735;
        result = prime
                * result
                + (this.nullableText != null ? this.nullableText.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableText != null
                        ? this.calculatedNullableText.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableText != null
                        ? this.persistedNullableText.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableText_4)) return false;
        final NullableText_4 other = (NullableText_4) obj;

        if (!(this.nullableText == other.nullableText || this.nullableText != null
                && this.nullableText.equals(other.nullableText))) return false;
        if (!(this.calculatedNullableText == other.calculatedNullableText || this.calculatedNullableText != null
                && this.calculatedNullableText
                        .equals(other.calculatedNullableText))) return false;
        if (!(this.persistedNullableText == other.persistedNullableText || this.persistedNullableText != null
                && this.persistedNullableText
                        .equals(other.persistedNullableText))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableText_4(" + nullableText + ',' + calculatedNullableText
                + ',' + persistedNullableText + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String nullableText;

    @JsonProperty("nullableText")
    public String getNullableText() {
        return nullableText;
    }

    public NullableText_4 setNullableText(final String value) {
        this.nullableText = value;

        return this;
    }

    private final String calculatedNullableText;

    public String getCalculatedNullableText() {
        return this.calculatedNullableText;
    }

    private final String persistedNullableText;

    public String getPersistedNullableText() {
        return this.persistedNullableText;
    }
}
