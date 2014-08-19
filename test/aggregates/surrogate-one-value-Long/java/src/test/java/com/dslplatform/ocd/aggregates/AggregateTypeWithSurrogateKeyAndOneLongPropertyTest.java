package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneLongPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate1Lo> aggregate1LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneLongPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate1LoRepository.class);
    }

    /* Testing the "p1Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo();
        final long testValue = aggregate.getP1Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lo());
    }

    /* Testing the "p1Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP1LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo();
        final long testValue = aggregate.getP1Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo().getP1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long testValue = 1L;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lo());
    }

    /* Testing the "p1Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long testValue = 1L;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo().getP1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long testValue = 1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lo());
    }

    /* Testing the "p1Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long testValue = 1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo().getP1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long testValue = -1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lo());
    }

    /* Testing the "p1Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long testValue = -1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo().getP1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long testValue = Long.MIN_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lo());
    }

    /* Testing the "p1Lo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1LoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long testValue = Long.MIN_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo().getP1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Lo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1LoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final long testValue = Long.MAX_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Lo());
    }

    /* Testing the "p1Lo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1LoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final long testValue = Long.MAX_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1Lo()
                .setP1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Lo().getP1Lo());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
