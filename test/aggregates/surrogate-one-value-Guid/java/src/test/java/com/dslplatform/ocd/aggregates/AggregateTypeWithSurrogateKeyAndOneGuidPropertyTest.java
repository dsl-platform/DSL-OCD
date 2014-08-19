package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneGuidPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateGuid.Aggregate1Gu> aggregate1GuRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneGuidPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1GuRepository = locator.resolve(ocd.AggregateSurrogateGuid.repositories.Aggregate1GuRepository.class);
    }

    /* Testing the "p1Gu" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1GuDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1Gu();
        final java.util.UUID testValue = aggregate.getP1Gu();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Gu());
    }

    /* Testing the "p1Gu" Default property value after active record persist */
    @org.junit.Test
    public void testP1GuDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1Gu();
        final java.util.UUID testValue = aggregate.getP1Gu();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Gu().getP1Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Gu" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1GuNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.UUID testValue = java.util.UUID.fromString("1-2-3-4-5");
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1Gu()
                .setP1Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Gu());
    }

    /* Testing the "p1Gu" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1GuNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.UUID testValue = java.util.UUID.fromString("1-2-3-4-5");
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1Gu()
                .setP1Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Gu().getP1Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Gu" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1GuNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.UUID testValue = new java.util.UUID(0L, 0L);
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1Gu()
                .setP1Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Gu());
    }

    /* Testing the "p1Gu" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1GuNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.UUID testValue = new java.util.UUID(0L, 0L);
        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1Gu()
                .setP1Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Gu().getP1Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
