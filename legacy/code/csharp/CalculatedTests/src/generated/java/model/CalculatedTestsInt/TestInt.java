package model.CalculatedTestsInt;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestInt implements java.io.Serializable, AggregateRoot {
    public TestInt() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalInt = 0;
        this.calculatedStringFromInt = "";
        this.calculatedLongFromInt = 0L;
        this.calculatedDoubleFromInt = 0.0;
        this.calculatedDecimalFromInt = java.math.BigDecimal.ZERO;
        this.calculatedMoneyFromInt = java.math.BigDecimal.ZERO.setScale(2);
        this.calculatedFloatFromInt = 0.0f;
    }

    private transient final ServiceLocator _serviceLocator;
    private transient final DomainProxy _domainProxy;
    private transient final CrudProxy _crudProxy;

    private String URI;

    @JsonProperty("URI")
    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI != null ? URI.hashCode() : super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final TestInt other = (TestInt) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "TestInt(" + URI + ')' : "new TestInt("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestInt(
            final int originalInt) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalInt(originalInt);
    }

    @JsonCreator
    private TestInt(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalInt") final int originalInt,
            @JsonProperty("calculatedStringFromInt") final String calculatedStringFromInt,
            @JsonProperty("calculatedLongFromInt") final long calculatedLongFromInt,
            @JsonProperty("calculatedDoubleFromInt") final double calculatedDoubleFromInt,
            @JsonProperty("calculatedDecimalFromInt") final java.math.BigDecimal calculatedDecimalFromInt,
            @JsonProperty("calculatedMoneyFromInt") final java.math.BigDecimal calculatedMoneyFromInt,
            @JsonProperty("calculatedFloatFromInt") final float calculatedFloatFromInt,
            @JsonProperty("calculatedBooleanFromInt") final Boolean calculatedBooleanFromInt) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalInt = originalInt;
        this.calculatedStringFromInt = calculatedStringFromInt;
        this.calculatedLongFromInt = calculatedLongFromInt;
        this.calculatedDoubleFromInt = calculatedDoubleFromInt;
        this.calculatedDecimalFromInt = calculatedDecimalFromInt;
        this.calculatedMoneyFromInt = calculatedMoneyFromInt;
        this.calculatedFloatFromInt = calculatedFloatFromInt;
        this.calculatedBooleanFromInt = calculatedBooleanFromInt == null
                ? Boolean.FALSE
                : calculatedBooleanFromInt;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestInt setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestInt find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestInt find(final String uri, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestInt.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestInt> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestInt> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(TestInt.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestInt> findAll() throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestInt> findAll(final ServiceLocator locator)
            throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestInt> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestInt> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestInt.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestInt> search(
            final Specification<TestInt> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestInt> search(
            final Specification<TestInt> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestInt> search(
            final Specification<TestInt> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestInt> search(
            final Specification<TestInt> specification,
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .search(specification, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count() throws java.io.IOException {
        return count(Bootstrap.getLocator());
    }

    public static long count(final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(TestInt.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestInt> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestInt> specification,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(specification).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private void updateWithAnother(final model.CalculatedTestsInt.TestInt result) {
        this.URI = result.URI;

        this.originalInt = result.originalInt;
        this.calculatedStringFromInt = result.calculatedStringFromInt;
        this.calculatedLongFromInt = result.calculatedLongFromInt;
        this.calculatedDoubleFromInt = result.calculatedDoubleFromInt;
        this.calculatedDecimalFromInt = result.calculatedDecimalFromInt;
        this.calculatedMoneyFromInt = result.calculatedMoneyFromInt;
        this.calculatedFloatFromInt = result.calculatedFloatFromInt;
        this.calculatedBooleanFromInt = result.calculatedBooleanFromInt;
        this.ID = result.ID;
    }

    public TestInt persist() throws java.io.IOException {
        final TestInt result;
        try {
            result = this.URI == null
                    ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public TestInt delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestInt.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private int originalInt;

    @JsonProperty("originalInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getOriginalInt() {
        return originalInt;
    }

    public TestInt setOriginalInt(final int value) {
        this.originalInt = value;

        return this;
    }

    private String calculatedStringFromInt;

    @JsonProperty("calculatedStringFromInt")
    public String getCalculatedStringFromInt() {
        return this.calculatedStringFromInt;
    }

    private long calculatedLongFromInt;

    @JsonProperty("calculatedLongFromInt")
    public long getCalculatedLongFromInt() {
        return this.calculatedLongFromInt;
    }

    private double calculatedDoubleFromInt;

    @JsonProperty("calculatedDoubleFromInt")
    public double getCalculatedDoubleFromInt() {
        return this.calculatedDoubleFromInt;
    }

    private java.math.BigDecimal calculatedDecimalFromInt;

    @JsonProperty("calculatedDecimalFromInt")
    public java.math.BigDecimal getCalculatedDecimalFromInt() {
        return this.calculatedDecimalFromInt;
    }

    private java.math.BigDecimal calculatedMoneyFromInt;

    @JsonProperty("calculatedMoneyFromInt")
    public java.math.BigDecimal getCalculatedMoneyFromInt() {
        return this.calculatedMoneyFromInt;
    }

    private float calculatedFloatFromInt;

    @JsonProperty("calculatedFloatFromInt")
    public float getCalculatedFloatFromInt() {
        return this.calculatedFloatFromInt;
    }

    private Boolean calculatedBooleanFromInt;

    @JsonProperty("calculatedBooleanFromInt")
    public Boolean getCalculatedBooleanFromInt() {
        return this.calculatedBooleanFromInt;
    }
}
