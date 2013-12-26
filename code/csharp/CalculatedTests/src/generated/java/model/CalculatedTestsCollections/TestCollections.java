package model.CalculatedTestsCollections;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestCollections implements java.io.Serializable, AggregateRoot {
    public TestCollections() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalListDouble = new java.util.ArrayList<Double>();
        this.originalMap = new java.util.HashMap<String, String>();
        this.filteredFromListDouble1 = new java.util.ArrayList<Double>();
        this.transformedFromListDouble1 = new java.util.ArrayList<Double>();
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
        final TestCollections other = (TestCollections) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "TestCollections(" + URI + ')'
                : "new TestCollections(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestCollections(
            final java.util.List<Double> originalListDouble,
            final java.util.Map<String, String> originalMap) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalListDouble(originalListDouble);
        setOriginalMap(originalMap);
    }

    @JsonCreator
    private TestCollections(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalListDouble") final java.util.List<Double> originalListDouble,
            @JsonProperty("originalMap") final java.util.Map<String, String> originalMap,
            @JsonProperty("filteredFromListDouble1") final java.util.List<Double> filteredFromListDouble1,
            @JsonProperty("transformedFromListDouble1") final java.util.List<Double> transformedFromListDouble1,
            @JsonProperty("filteredStringFromDictionary") final String filteredStringFromDictionary) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalListDouble = originalListDouble == null
                ? new java.util.ArrayList<Double>()
                : originalListDouble;
        this.originalMap = originalMap == null
                ? new java.util.HashMap<String, String>()
                : originalMap;
        this.filteredFromListDouble1 = filteredFromListDouble1;
        this.transformedFromListDouble1 = transformedFromListDouble1;
        this.filteredStringFromDictionary = filteredStringFromDictionary == null
                ? ""
                : filteredStringFromDictionary;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestCollections setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestCollections find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestCollections find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestCollections.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestCollections> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestCollections> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(TestCollections.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestCollections> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestCollections> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestCollections> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestCollections> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestCollections.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestCollections> search(
            final Specification<TestCollections> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestCollections> search(
            final Specification<TestCollections> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestCollections> search(
            final Specification<TestCollections> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestCollections> search(
            final Specification<TestCollections> specification,
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
                    .resolve(DomainProxy.class).count(TestCollections.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestCollections> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestCollections> specification,
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
            final model.CalculatedTestsCollections.TestCollections result) {
        this.URI = result.URI;

        this.originalListDouble = result.originalListDouble;
        this.originalMap = result.originalMap;
        this.filteredFromListDouble1 = result.filteredFromListDouble1;
        this.transformedFromListDouble1 = result.transformedFromListDouble1;
        this.filteredStringFromDictionary = result.filteredStringFromDictionary;
        this.ID = result.ID;
    }

    public TestCollections persist() throws java.io.IOException {
        final TestCollections result;
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

    public TestCollections delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestCollections.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<Double> originalListDouble;

    @JsonProperty("originalListDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getOriginalListDouble() {
        return originalListDouble;
    }

    public TestCollections setOriginalListDouble(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"originalListDouble\" cannot be null!");
        model.Guards.checkNulls(value);
        this.originalListDouble = value;

        return this;
    }

    private java.util.Map<String, String> originalMap;

    @JsonProperty("originalMap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String> getOriginalMap() {
        return originalMap;
    }

    public TestCollections setOriginalMap(
            final java.util.Map<String, String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"originalMap\" cannot be null!");
        this.originalMap = value;

        return this;
    }

    private java.util.List<Double> filteredFromListDouble1;

    @JsonProperty("filteredFromListDouble1")
    public java.util.List<Double> getFilteredFromListDouble1() {
        return this.filteredFromListDouble1;
    }

    private java.util.List<Double> transformedFromListDouble1;

    @JsonProperty("transformedFromListDouble1")
    public java.util.List<Double> getTransformedFromListDouble1() {
        return this.transformedFromListDouble1;
    }

    private String filteredStringFromDictionary;

    @JsonProperty("filteredStringFromDictionary")
    public String getFilteredStringFromDictionary() {
        return this.filteredStringFromDictionary;
    }
}
