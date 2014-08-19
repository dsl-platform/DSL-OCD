package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneUrlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateUrl.Aggregate0S1Ur> aggregate0S1UrRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneUrlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1UrRepository = locator.resolve(ocd.AggregateSurrogateUrl.repositories.Aggregate0S1UrRepository.class);
    }

    /* Testing the "p0S1Ur" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1UrDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0S1Ur();
        final java.util.Set<java.net.URI> testValue = aggregate.getP0S1Ur();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0S1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Ur());
    }

    /* Testing the "p0S1Ur" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1UrDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0S1Ur();
        final java.util.Set<java.net.URI> testValue = aggregate.getP0S1Ur();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ur().getP0S1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0S1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0S1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Ur" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1UrNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.URI> testValue = new java.util.HashSet<java.net.URI>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)")); }};
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0S1Ur()
                .setP0S1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0S1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Ur());
    }

    /* Testing the "p0S1Ur" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1UrNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.URI> testValue = new java.util.HashSet<java.net.URI>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)")); }};
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0S1Ur()
                .setP0S1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ur().getP0S1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0S1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0S1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Ur" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1UrNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.net.URI> testValue = new java.util.HashSet<java.net.URI>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)")); }};
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0S1Ur()
                .setP0S1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0S1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Ur());
    }

    /* Testing the "p0S1Ur" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1UrNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.net.URI> testValue = new java.util.HashSet<java.net.URI>() {{ add(com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/")); add(com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)")); }};
        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0S1Ur()
                .setP0S1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ur().getP0S1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0S1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0S1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0S1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
