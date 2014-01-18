package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneIps_4 implements java.io.Serializable, AggregateRoot {
    public OneSetOfOneIps_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneIps = new java.util.HashSet<java.net.InetAddress>();
        this.calculatedOneSetOfOneIps = new java.util.HashSet<java.net.InetAddress>();
        this.persistedOneSetOfOneIps = new java.util.HashSet<java.net.InetAddress>();
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
        final OneSetOfOneIps_4 other = (OneSetOfOneIps_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneSetOfOneIps_4(" + URI + ')'
                : "new OneSetOfOneIps_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneIps_4(
            final java.util.Set<java.net.InetAddress> oneSetOfOneIps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneIps(oneSetOfOneIps);
    }

    @JsonCreator
    private OneSetOfOneIps_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneIps") final java.util.Set<java.net.InetAddress> oneSetOfOneIps,
            @JsonProperty("calculatedOneSetOfOneIps") final java.util.Set<java.net.InetAddress> calculatedOneSetOfOneIps,
            @JsonProperty("persistedOneSetOfOneIps") final java.util.Set<java.net.InetAddress> persistedOneSetOfOneIps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneIps = oneSetOfOneIps == null
                ? new java.util.HashSet<java.net.InetAddress>()
                : oneSetOfOneIps;
        this.calculatedOneSetOfOneIps = calculatedOneSetOfOneIps;
        this.persistedOneSetOfOneIps = persistedOneSetOfOneIps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneIps_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneIps_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneIps_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(OneSetOfOneIps_4.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneIps_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneIps_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneIps_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneIps_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneIps_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneIps_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneIps_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneIps_4.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneIps_4> search(
            final Specification<OneSetOfOneIps_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneIps_4> search(
            final Specification<OneSetOfOneIps_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneIps_4> search(
            final Specification<OneSetOfOneIps_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneIps_4> search(
            final Specification<OneSetOfOneIps_4> specification,
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
                    .resolve(DomainProxy.class).count(OneSetOfOneIps_4.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<OneSetOfOneIps_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneIps_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneIps_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneIps = result.oneSetOfOneIps;
        this.calculatedOneSetOfOneIps = result.calculatedOneSetOfOneIps;
        this.persistedOneSetOfOneIps = result.persistedOneSetOfOneIps;
        this.ID = result.ID;
    }

    public OneSetOfOneIps_4 persist() throws java.io.IOException {
        final OneSetOfOneIps_4 result;
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

    public OneSetOfOneIps_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneSetOfOneIps_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.net.InetAddress> oneSetOfOneIps;

    @JsonProperty("oneSetOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.InetAddress> getOneSetOfOneIps() {
        return oneSetOfOneIps;
    }

    public OneSetOfOneIps_4 setOneSetOfOneIps(
            final java.util.Set<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneIps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneIps = value;

        return this;
    }

    private java.util.Set<java.net.InetAddress> calculatedOneSetOfOneIps;

    @JsonProperty("calculatedOneSetOfOneIps")
    public java.util.Set<java.net.InetAddress> getCalculatedOneSetOfOneIps() {
        return this.calculatedOneSetOfOneIps;
    }

    private java.util.Set<java.net.InetAddress> persistedOneSetOfOneIps;

    @JsonProperty("persistedOneSetOfOneIps")
    public java.util.Set<java.net.InetAddress> getPersistedOneSetOfOneIps() {
        return this.persistedOneSetOfOneIps;
    }
}
