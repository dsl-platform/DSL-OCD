package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneBoolean_5 implements java.io.Serializable {
    public OneBoolean_5(
            final boolean oneBoolean,
            final boolean calculatedOneBoolean,
            final boolean persistedOneBoolean) {
        setOneBoolean(oneBoolean);
        this.calculatedOneBoolean = calculatedOneBoolean;
        this.persistedOneBoolean = persistedOneBoolean;
    }

    public OneBoolean_5() {
        this.oneBoolean = false;
        this.calculatedOneBoolean = false;
        this.persistedOneBoolean = false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 476010390;
        result = prime * result + (this.oneBoolean ? 1231 : 1237);
        result = prime * result + (this.calculatedOneBoolean ? 1231 : 1237);
        result = prime * result + (this.persistedOneBoolean ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneBoolean_5)) return false;
        final OneBoolean_5 other = (OneBoolean_5) obj;

        if (!(this.oneBoolean == other.oneBoolean)) return false;
        if (!(this.calculatedOneBoolean == other.calculatedOneBoolean))
            return false;
        if (!(this.persistedOneBoolean == other.persistedOneBoolean))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneBoolean_5(" + oneBoolean + ',' + calculatedOneBoolean + ','
                + persistedOneBoolean + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean oneBoolean;

    @JsonProperty("oneBoolean")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean getOneBoolean() {
        return oneBoolean;
    }

    public OneBoolean_5 setOneBoolean(final boolean value) {
        this.oneBoolean = value;

        return this;
    }

    private final boolean calculatedOneBoolean;

    public boolean getCalculatedOneBoolean() {
        return this.calculatedOneBoolean;
    }

    private final boolean persistedOneBoolean;

    public boolean getPersistedOneBoolean() {
        return this.persistedOneBoolean;
    }
}
