package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableBoolean_4 implements java.io.Serializable {
    public NullableBoolean_4(
            final Boolean nullableBoolean,
            final Boolean calculatedNullableBoolean,
            final Boolean persistedNullableBoolean) {
        setNullableBoolean(nullableBoolean);
        this.calculatedNullableBoolean = calculatedNullableBoolean;
        this.persistedNullableBoolean = persistedNullableBoolean;
    }

    public NullableBoolean_4() {
        this.calculatedNullableBoolean = null;
        this.persistedNullableBoolean = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1248820822;
        result = prime
                * result
                + (this.nullableBoolean != null ? this.nullableBoolean
                        .hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableBoolean != null
                        ? this.calculatedNullableBoolean.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableBoolean != null
                        ? this.persistedNullableBoolean.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableBoolean_4)) return false;
        final NullableBoolean_4 other = (NullableBoolean_4) obj;

        if (!(this.nullableBoolean == other.nullableBoolean || this.nullableBoolean != null
                && this.nullableBoolean.equals(other.nullableBoolean)))
            return false;
        if (!(this.calculatedNullableBoolean == other.calculatedNullableBoolean || this.calculatedNullableBoolean != null
                && this.calculatedNullableBoolean
                        .equals(other.calculatedNullableBoolean)))
            return false;
        if (!(this.persistedNullableBoolean == other.persistedNullableBoolean || this.persistedNullableBoolean != null
                && this.persistedNullableBoolean
                        .equals(other.persistedNullableBoolean))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableBoolean_4(" + nullableBoolean + ','
                + calculatedNullableBoolean + ',' + persistedNullableBoolean
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean nullableBoolean;

    @JsonProperty("nullableBoolean")
    public Boolean getNullableBoolean() {
        return nullableBoolean;
    }

    public NullableBoolean_4 setNullableBoolean(final Boolean value) {
        this.nullableBoolean = value;

        return this;
    }

    private final Boolean calculatedNullableBoolean;

    public Boolean getCalculatedNullableBoolean() {
        return this.calculatedNullableBoolean;
    }

    private final Boolean persistedNullableBoolean;

    public Boolean getPersistedNullableBoolean() {
        return this.persistedNullableBoolean;
    }
}
