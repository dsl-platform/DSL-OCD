package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfNullableXmls_3 implements java.io.Serializable,
        AggregateRoot {
    public OneSetOfNullableXmls_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfNullableXmls = new java.util.HashSet<org.w3c.dom.Element>();
        this.calculatedOneSetOfNullableXmls = new java.util.HashSet<org.w3c.dom.Element>();
        this.persistedOneSetOfNullableXmls = new java.util.HashSet<org.w3c.dom.Element>();
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
        final OneSetOfNullableXmls_3 other = (OneSetOfNullableXmls_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfNullableXmls_3(" + URI + ')'
                : "new OneSetOfNullableXmls_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfNullableXmls_3(
            final java.util.Set<org.w3c.dom.Element> oneSetOfNullableXmls) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfNullableXmls(oneSetOfNullableXmls);
    }

    @JsonCreator
    private OneSetOfNullableXmls_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfNullableXmls") final java.util.Set<org.w3c.dom.Element> oneSetOfNullableXmls,
            @JsonProperty("calculatedOneSetOfNullableXmls") final java.util.Set<org.w3c.dom.Element> calculatedOneSetOfNullableXmls,
            @JsonProperty("persistedOneSetOfNullableXmls") final java.util.Set<org.w3c.dom.Element> persistedOneSetOfNullableXmls) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfNullableXmls = oneSetOfNullableXmls == null
                ? new java.util.HashSet<org.w3c.dom.Element>()
                : oneSetOfNullableXmls;
        this.calculatedOneSetOfNullableXmls = calculatedOneSetOfNullableXmls;
        this.persistedOneSetOfNullableXmls = persistedOneSetOfNullableXmls;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfNullableXmls_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfNullableXmls_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfNullableXmls_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfNullableXmls_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableXmls_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableXmls_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfNullableXmls_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableXmls_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableXmls_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfNullableXmls_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableXmls_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfNullableXmls_3.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfNullableXmls_3> search(
            final Specification<OneSetOfNullableXmls_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableXmls_3> search(
            final Specification<OneSetOfNullableXmls_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfNullableXmls_3> search(
            final Specification<OneSetOfNullableXmls_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfNullableXmls_3> search(
            final Specification<OneSetOfNullableXmls_3> specification,
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
                    .resolve(DomainProxy.class)
                    .count(OneSetOfNullableXmls_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfNullableXmls_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfNullableXmls_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableXmls_3 result) {
        this.URI = result.URI;

        this.oneSetOfNullableXmls = result.oneSetOfNullableXmls;
        this.calculatedOneSetOfNullableXmls = result.calculatedOneSetOfNullableXmls;
        this.persistedOneSetOfNullableXmls = result.persistedOneSetOfNullableXmls;
        this.ID = result.ID;
    }

    public OneSetOfNullableXmls_3 persist() throws java.io.IOException {
        final OneSetOfNullableXmls_3 result;
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

    public OneSetOfNullableXmls_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfNullableXmls_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<org.w3c.dom.Element> oneSetOfNullableXmls;

    @JsonProperty("oneSetOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getOneSetOfNullableXmls() {
        return oneSetOfNullableXmls;
    }

    public OneSetOfNullableXmls_3 setOneSetOfNullableXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableXmls\" cannot be null!");
        this.oneSetOfNullableXmls = value;

        return this;
    }

    private java.util.Set<org.w3c.dom.Element> calculatedOneSetOfNullableXmls;

    @JsonProperty("calculatedOneSetOfNullableXmls")
    public java.util.Set<org.w3c.dom.Element> getCalculatedOneSetOfNullableXmls() {
        return this.calculatedOneSetOfNullableXmls;
    }

    private java.util.Set<org.w3c.dom.Element> persistedOneSetOfNullableXmls;

    @JsonProperty("persistedOneSetOfNullableXmls")
    public java.util.Set<org.w3c.dom.Element> getPersistedOneSetOfNullableXmls() {
        return this.persistedOneSetOfNullableXmls;
    }
}
