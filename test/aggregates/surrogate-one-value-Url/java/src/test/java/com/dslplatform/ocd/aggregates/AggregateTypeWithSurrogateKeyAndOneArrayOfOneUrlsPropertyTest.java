package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfOneUrlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateUrl.Aggregate1A1Ur> aggregate1A1UrRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfOneUrlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A1UrRepository = locator.resolve(ocd.AggregateSurrogateUrl.repositories.Aggregate1A1UrRepository.class);
    }

    /* Testing the "p1A1Ur" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1UrDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A1Ur();
        final java.net.URI[] testValue = aggregate.getP1A1Ur();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Ur());
    }

    /* Testing the "p1A1Ur" Default property value after active record persist */
    @org.junit.Test
    public void testP1A1UrDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A1Ur();
        final java.net.URI[] testValue = aggregate.getP1A1Ur();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ur().getP1A1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Ur" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1UrNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A1Ur()
                .setP1A1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Ur());
    }

    /* Testing the "p1A1Ur" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A1UrNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A1Ur()
                .setP1A1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ur().getP1A1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Ur" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1UrNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A1Ur()
                .setP1A1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Ur());
    }

    /* Testing the "p1A1Ur" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A1UrNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A1Ur()
                .setP1A1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ur().getP1A1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
