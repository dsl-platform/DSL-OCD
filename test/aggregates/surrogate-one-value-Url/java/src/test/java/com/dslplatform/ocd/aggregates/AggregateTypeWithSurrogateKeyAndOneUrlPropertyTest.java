package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneUrlPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateUrl.Aggregate1Ur> aggregate1UrRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneUrlPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1UrRepository = locator.resolve(ocd.AggregateSurrogateUrl.repositories.Aggregate1UrRepository.class);
    }

    /* Testing the "p1Ur" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur();
        final java.net.URI testValue = aggregate.getP1Ur();

        // check that the property was properly assigned
        // special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        // special null check for dissalowed null value in a non-nullable property
        org.junit.Assert.assertNull(aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault7 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault7PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault7 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault7PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault8 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault8PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault8 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault8PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Ur" NonDefault9 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1UrNonDefault9PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Ur());
    }

    /* Testing the "p1Ur" NonDefault9 property value after active record persist */
    @org.junit.Test
    public void testP1UrNonDefault9PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)");
        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1Ur()
                .setP1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Ur().getP1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
