package model.CalculatedTestsMoney;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestMoney implements java.io.Serializable, AggregateRoot {
    public TestMoney() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalMoney = java.math.BigDecimal.ZERO.setScale(2);
        this.calculatedStringFromMoney = "";
        this.calculatedIntFromMoney = 0;
        this.calculatedFloatFromMoney = 0.0f;
        this.calculatedLongFromMoney = 0L;
        this.calculatedDoubleFromMoney = 0.0;
        this.calculatedDecimalFromMoney = java.math.BigDecimal.ZERO;
        this.calculatedBooleanFromMoney = false;
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
        final TestMoney other = (TestMoney) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "TestMoney(" + URI + ')' : "new TestMoney("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestMoney(
            final java.math.BigDecimal originalMoney) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalMoney(originalMoney);
    }

    @JsonCreator
    private TestMoney(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalMoney") final java.math.BigDecimal originalMoney,
            @JsonProperty("calculatedStringFromMoney") final String calculatedStringFromMoney,
            @JsonProperty("calculatedIntFromMoney") final int calculatedIntFromMoney,
            @JsonProperty("calculatedFloatFromMoney") final float calculatedFloatFromMoney,
            @JsonProperty("calculatedLongFromMoney") final long calculatedLongFromMoney,
            @JsonProperty("calculatedDoubleFromMoney") final double calculatedDoubleFromMoney,
            @JsonProperty("calculatedDecimalFromMoney") final java.math.BigDecimal calculatedDecimalFromMoney,
            @JsonProperty("calculatedBooleanFromMoney") final boolean calculatedBooleanFromMoney) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalMoney = originalMoney == null ? java.math.BigDecimal.ZERO
                .setScale(2) : originalMoney;
        this.calculatedStringFromMoney = calculatedStringFromMoney;
        this.calculatedIntFromMoney = calculatedIntFromMoney;
        this.calculatedFloatFromMoney = calculatedFloatFromMoney;
        this.calculatedLongFromMoney = calculatedLongFromMoney;
        this.calculatedDoubleFromMoney = calculatedDoubleFromMoney;
        this.calculatedDecimalFromMoney = calculatedDecimalFromMoney;
        this.calculatedBooleanFromMoney = calculatedBooleanFromMoney;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestMoney setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestMoney find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestMoney find(final String uri, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestMoney.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestMoney> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestMoney> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(TestMoney.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestMoney> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestMoney> findAll(final ServiceLocator locator)
            throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestMoney> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestMoney> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestMoney.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestMoney> search(
            final Specification<TestMoney> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestMoney> search(
            final Specification<TestMoney> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestMoney> search(
            final Specification<TestMoney> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestMoney> search(
            final Specification<TestMoney> specification,
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
                    .resolve(DomainProxy.class).count(TestMoney.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestMoney> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestMoney> specification,
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
            final model.CalculatedTestsMoney.TestMoney result) {
        this.URI = result.URI;

        this.originalMoney = result.originalMoney;
        this.calculatedStringFromMoney = result.calculatedStringFromMoney;
        this.calculatedIntFromMoney = result.calculatedIntFromMoney;
        this.calculatedFloatFromMoney = result.calculatedFloatFromMoney;
        this.calculatedLongFromMoney = result.calculatedLongFromMoney;
        this.calculatedDoubleFromMoney = result.calculatedDoubleFromMoney;
        this.calculatedDecimalFromMoney = result.calculatedDecimalFromMoney;
        this.calculatedBooleanFromMoney = result.calculatedBooleanFromMoney;
        this.ID = result.ID;
    }

    public TestMoney persist() throws java.io.IOException {
        final TestMoney result;
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

    public TestMoney delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestMoney.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.math.BigDecimal originalMoney;

    @JsonProperty("originalMoney")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal getOriginalMoney() {
        return originalMoney;
    }

    public TestMoney setOriginalMoney(final java.math.BigDecimal value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"originalMoney\" cannot be null!");
        this.originalMoney = value;

        this.originalMoney = model.Guards.setScale(this.originalMoney, 2);
        return this;
    }

    private String calculatedStringFromMoney;

    @JsonProperty("calculatedStringFromMoney")
    public String getCalculatedStringFromMoney() {
        return this.calculatedStringFromMoney;
    }

    private int calculatedIntFromMoney;

    @JsonProperty("calculatedIntFromMoney")
    public int getCalculatedIntFromMoney() {
        return this.calculatedIntFromMoney;
    }

    private float calculatedFloatFromMoney;

    @JsonProperty("calculatedFloatFromMoney")
    public float getCalculatedFloatFromMoney() {
        return this.calculatedFloatFromMoney;
    }

    private long calculatedLongFromMoney;

    @JsonProperty("calculatedLongFromMoney")
    public long getCalculatedLongFromMoney() {
        return this.calculatedLongFromMoney;
    }

    private double calculatedDoubleFromMoney;

    @JsonProperty("calculatedDoubleFromMoney")
    public double getCalculatedDoubleFromMoney() {
        return this.calculatedDoubleFromMoney;
    }

    private java.math.BigDecimal calculatedDecimalFromMoney;

    @JsonProperty("calculatedDecimalFromMoney")
    public java.math.BigDecimal getCalculatedDecimalFromMoney() {
        return this.calculatedDecimalFromMoney;
    }

    private boolean calculatedBooleanFromMoney;

    @JsonProperty("calculatedBooleanFromMoney")
    public boolean getCalculatedBooleanFromMoney() {
        return this.calculatedBooleanFromMoney;
    }
}
