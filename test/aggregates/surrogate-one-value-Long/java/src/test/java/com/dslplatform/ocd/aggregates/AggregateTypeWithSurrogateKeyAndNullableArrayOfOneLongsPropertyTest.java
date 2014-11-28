package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneLongsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate0A1Lo> aggregate0A1LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneLongsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate0A1LoRepository.class);
    }

    /* Testing the "p0A1Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo();
        final long[] testValue = aggregate.getP0A1Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0A1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Lo());
    }

    /* Testing the "p0A1Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo();
        final long[] testValue = aggregate.getP0A1Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo().getP0A1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long[] testValue = new long[] { 0L };
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo()
                .setP0A1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0A1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Lo());
    }

    /* Testing the "p0A1Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long[] testValue = new long[] { 0L };
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo()
                .setP0A1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo().getP0A1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long[] testValue = new long[] { Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo()
                .setP0A1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0A1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Lo());
    }

    /* Testing the "p0A1Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long[] testValue = new long[] { Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo()
                .setP0A1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo().getP0A1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long[] testValue = new long[] { 0L, 1L, 1000000000000000000L, -1000000000000000000L, Long.MIN_VALUE, Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo()
                .setP0A1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0A1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Lo());
    }

    /* Testing the "p0A1Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A1LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long[] testValue = new long[] { 0L, 1L, 1000000000000000000L, -1000000000000000000L, Long.MIN_VALUE, Long.MAX_VALUE };
        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0A1Lo()
                .setP0A1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Lo().getP0A1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0A1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0A1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}