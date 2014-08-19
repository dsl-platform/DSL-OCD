package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneTimestampsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts> aggregate0S1TsRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneTimestampsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1TsRepository = locator.resolve(ocd.AggregateSurrogateTimestamp.repositories.Aggregate0S1TsRepository.class);
    }

    /* Testing the "p0S1Ts" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TsDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts();
        final java.util.Set<org.joda.time.DateTime> testValue = aggregate.getP0S1Ts();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Ts());
    }

    /* Testing the "p0S1Ts" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1TsDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts();
        final java.util.Set<org.joda.time.DateTime> testValue = aggregate.getP0S1Ts();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts().getP0S1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Ts" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TsNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.DateTime> testValue = new java.util.HashSet<org.joda.time.DateTime>() {{ add(org.joda.time.DateTime.now()); }};
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts()
                .setP0S1Ts(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Ts());
    }

    /* Testing the "p0S1Ts" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1TsNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.DateTime> testValue = new java.util.HashSet<org.joda.time.DateTime>() {{ add(org.joda.time.DateTime.now()); }};
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts()
                .setP0S1Ts(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts().getP0S1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Ts" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TsNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.DateTime> testValue = new java.util.HashSet<org.joda.time.DateTime>() {{ add(new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)); }};
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts()
                .setP0S1Ts(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Ts());
    }

    /* Testing the "p0S1Ts" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1TsNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.DateTime> testValue = new java.util.HashSet<org.joda.time.DateTime>() {{ add(new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)); }};
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts()
                .setP0S1Ts(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts().getP0S1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Ts" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TsNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.DateTime> testValue = new java.util.HashSet<org.joda.time.DateTime>() {{ add(org.joda.time.DateTime.now()); add(new org.joda.time.DateTime(0)); add(new org.joda.time.DateTime(1, 1, 1, 0, 0)); add(new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)); }};
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts()
                .setP0S1Ts(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Ts());
    }

    /* Testing the "p0S1Ts" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1TsNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.DateTime> testValue = new java.util.HashSet<org.joda.time.DateTime>() {{ add(org.joda.time.DateTime.now()); add(new org.joda.time.DateTime(0)); add(new org.joda.time.DateTime(1, 1, 1, 0, 0)); add(new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)); }};
        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregate =
                new ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts()
                .setP0S1Ts(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Ts().getP0S1Ts());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        final ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts aggregateFound =
                ocd.AggregateSurrogateTimestamp.Aggregate0S1Ts.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TimestampAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Ts());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
