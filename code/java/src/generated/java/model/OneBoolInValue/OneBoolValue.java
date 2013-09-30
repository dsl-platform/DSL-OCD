package model.OneBoolInValue;

public final class OneBoolValue implements java.io.Serializable {
    public OneBoolValue(
            final boolean oneBool) {
        setOneBool(oneBool);
    }

    public OneBoolValue() {
        this.oneBool = false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 530210261;
        result = prime * result + (this.oneBool ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneBoolValue)) return false;
        final OneBoolValue other = (OneBoolValue) obj;

        if (!(this.oneBool == other.oneBool)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneBoolValue(" + oneBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean oneBool;

    public boolean getOneBool() {
        return oneBool;
    }

    public OneBoolValue setOneBool(final boolean value) {
        this.oneBool = value;

        return this;
    }
}
