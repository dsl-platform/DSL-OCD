package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOneLongsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate1L1Lo> aggregate1L1LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOneLongsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate1L1LoRepository.class);
    }

    /* Testing the "p1L1Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo();
        final java.util.List<Long> testValue = aggregate.getP1L1Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lo());
    }

    /* Testing the "p1L1Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo();
        final java.util.List<Long> testValue = aggregate.getP1L1Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo().getP1L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo()
                .setP1L1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lo());
    }

    /* Testing the "p1L1Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo()
                .setP1L1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo().getP1L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo()
                .setP1L1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lo());
    }

    /* Testing the "p1L1Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo()
                .setP1L1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo().getP1L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo()
                .setP1L1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1L1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Lo());
    }

    /* Testing the "p1L1Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Long> testValue = new java.util.ArrayList<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1L1Lo()
                .setP1L1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Lo().getP1L1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1L1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1L1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
