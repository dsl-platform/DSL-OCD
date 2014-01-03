package model.CalculatedTestsFloat;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestFloat implements java.io.Serializable, AggregateRoot {
    public TestFloat() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalFloat = 0.0f;
        this.calculatedStringFromFloat = "";
        this.calculatedIntFromFloat = 0;
        this.calculatedDoubleFromFloat = 0.0;
        this.calculatedLongFromFloat = 0L;
        this.calculatedDecimalFromFloat = java.math.BigDecimal.ZERO;
        this.calculatedMoneyFromFloat = java.math.BigDecimal.ZERO.setScale(2);
        this.calculatedBooleanFromFloat = false;
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
        final TestFloat other = (TestFloat) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "TestFloat(" + URI + ')' : "new TestFloat("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestFloat(
            final float originalFloat) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalFloat(originalFloat);
    }

    @JsonCreator
    private TestFloat(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalFloat") final float originalFloat,
            @JsonProperty("calculatedStringFromFloat") final String calculatedStringFromFloat,
            @JsonProperty("calculatedIntFromFloat") final int calculatedIntFromFloat,
            @JsonProperty("calculatedDoubleFromFloat") final double calculatedDoubleFromFloat,
            @JsonProperty("calculatedLongFromFloat") final long calculatedLongFromFloat,
            @JsonProperty("calculatedDecimalFromFloat") final java.math.BigDecimal calculatedDecimalFromFloat,
            @JsonProperty("calculatedMoneyFromFloat") final java.math.BigDecimal calculatedMoneyFromFloat,
            @JsonProperty("calculatedBooleanFromFloat") final boolean calculatedBooleanFromFloat) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalFloat = originalFloat;
        this.calculatedStringFromFloat = calculatedStringFromFloat;
        this.calculatedIntFromFloat = calculatedIntFromFloat;
        this.calculatedDoubleFromFloat = calculatedDoubleFromFloat;
        this.calculatedLongFromFloat = calculatedLongFromFloat;
        this.calculatedDecimalFromFloat = calculatedDecimalFromFloat;
        this.calculatedMoneyFromFloat = calculatedMoneyFromFloat;
        this.calculatedBooleanFromFloat = calculatedBooleanFromFloat;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestFloat setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestFloat find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestFloat find(final String uri, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestFloat.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestFloat> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestFloat> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(TestFloat.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestFloat> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestFloat> findAll(final ServiceLocator locator)
            throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestFloat> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestFloat> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestFloat.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestFloat> search(
            final Specification<TestFloat> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestFloat> search(
            final Specification<TestFloat> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestFloat> search(
            final Specification<TestFloat> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestFloat> search(
            final Specification<TestFloat> specification,
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
                    .resolve(DomainProxy.class).count(TestFloat.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestFloat> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestFloat> specification,
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

    private void updateWithAnother(
            final model.CalculatedTestsFloat.TestFloat result) {
        this.URI = result.URI;

        this.originalFloat = result.originalFloat;
        this.calculatedStringFromFloat = result.calculatedStringFromFloat;
        this.calculatedIntFromFloat = result.calculatedIntFromFloat;
        this.calculatedDoubleFromFloat = result.calculatedDoubleFromFloat;
        this.calculatedLongFromFloat = result.calculatedLongFromFloat;
        this.calculatedDecimalFromFloat = result.calculatedDecimalFromFloat;
        this.calculatedMoneyFromFloat = result.calculatedMoneyFromFloat;
        this.calculatedBooleanFromFloat = result.calculatedBooleanFromFloat;
        this.ID = result.ID;
    }

    public TestFloat persist() throws java.io.IOException {
        final TestFloat result;
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

    public TestFloat delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestFloat.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private float originalFloat;

    @JsonProperty("originalFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public float getOriginalFloat() {
        return originalFloat;
    }

    public TestFloat setOriginalFloat(final float value) {
        this.originalFloat = value;

        return this;
    }

    private String calculatedStringFromFloat;

    @JsonProperty("calculatedStringFromFloat")
    public String getCalculatedStringFromFloat() {
        return this.calculatedStringFromFloat;
    }

    private int calculatedIntFromFloat;

    @JsonProperty("calculatedIntFromFloat")
    public int getCalculatedIntFromFloat() {
        return this.calculatedIntFromFloat;
    }

    private double calculatedDoubleFromFloat;

    @JsonProperty("calculatedDoubleFromFloat")
    public double getCalculatedDoubleFromFloat() {
        return this.calculatedDoubleFromFloat;
    }

    private long calculatedLongFromFloat;

    @JsonProperty("calculatedLongFromFloat")
    public long getCalculatedLongFromFloat() {
        return this.calculatedLongFromFloat;
    }

    private java.math.BigDecimal calculatedDecimalFromFloat;

    @JsonProperty("calculatedDecimalFromFloat")
    public java.math.BigDecimal getCalculatedDecimalFromFloat() {
        return this.calculatedDecimalFromFloat;
    }

    private java.math.BigDecimal calculatedMoneyFromFloat;

    @JsonProperty("calculatedMoneyFromFloat")
    public java.math.BigDecimal getCalculatedMoneyFromFloat() {
        return this.calculatedMoneyFromFloat;
    }

    private boolean calculatedBooleanFromFloat;

    @JsonProperty("calculatedBooleanFromFloat")
    public boolean getCalculatedBooleanFromFloat() {
        return this.calculatedBooleanFromFloat;
    }
}
