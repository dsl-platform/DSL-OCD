package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfOneTimestampsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts> aggregate1A1TsRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfOneTimestampsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A1TsRepository = locator.resolve(ocd.AggregateSurrogateTimestamp.repositories.Aggregate1A1TsRepository.class);
    }

    /* Testing the "p1A1Ts" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1TsDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts();
        final org.joda.time.DateTime[] testValue = aggregate.getP1A1Ts();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Ts());
    }

    /* Testing the "p1A1Ts" Default property value after active record persist */
    @org.junit.Test
    public void testP1A1TsDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts();
        final org.joda.time.DateTime[] testValue = aggregate.getP1A1Ts();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts().getP1A1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Ts" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1TsNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.DateTime[] testValue = new org.joda.time.DateTime[] { org.joda.time.DateTime.now() };
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts()
                .setP1A1Ts(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Ts());
    }

    /* Testing the "p1A1Ts" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A1TsNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.DateTime[] testValue = new org.joda.time.DateTime[] { org.joda.time.DateTime.now() };
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts()
                .setP1A1Ts(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts().getP1A1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Ts" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1TsNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.DateTime[] testValue = new org.joda.time.DateTime[] { new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L) };
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts()
                .setP1A1Ts(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Ts());
    }

    /* Testing the "p1A1Ts" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A1TsNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.DateTime[] testValue = new org.joda.time.DateTime[] { new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L) };
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts()
                .setP1A1Ts(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts().getP1A1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Ts" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1TsNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.DateTime[] testValue = new org.joda.time.DateTime[] { org.joda.time.DateTime.now(), new org.joda.time.DateTime(0), new org.joda.time.DateTime(1, 1, 1, 0, 0), new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L) };
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts()
                .setP1A1Ts(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Ts());
    }

    /* Testing the "p1A1Ts" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A1TsNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.DateTime[] testValue = new org.joda.time.DateTime[] { org.joda.time.DateTime.now(), new org.joda.time.DateTime(0), new org.joda.time.DateTime(1, 1, 1, 0, 0), new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L) };
        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts()
                .setP1A1Ts(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Ts().getP1A1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate1A1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
