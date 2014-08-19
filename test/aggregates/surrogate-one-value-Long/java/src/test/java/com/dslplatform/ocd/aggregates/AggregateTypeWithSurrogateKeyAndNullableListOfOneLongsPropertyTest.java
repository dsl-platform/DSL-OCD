package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfOneLongsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate0L1Lo> aggregate0L1LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfOneLongsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L1LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate0L1LoRepository.class);
    }

    /* Testing the "p0L1Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo();
        final java.util.List<Long> testValue = aggregate.getP0L1Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Lo());
    }

    /* Testing the "p0L1Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP0L1LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo();
        final java.util.List<Long> testValue = aggregate.getP0L1Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo().getP0L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo()
                .setP0L1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Lo());
    }

    /* Testing the "p0L1Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L1LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo()
                .setP0L1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo().getP0L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo()
                .setP0L1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Lo());
    }

    /* Testing the "p0L1Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L1LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo()
                .setP0L1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo().getP0L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo()
                .setP0L1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Lo());
    }

    /* Testing the "p0L1Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L1LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0L1Lo()
                .setP0L1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Lo().getP0L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
