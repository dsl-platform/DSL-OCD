package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneLongsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate0S1Lo> aggregate0S1LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneLongsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate0S1LoRepository.class);
    }

    /* Testing the "p0S1Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo();
        final java.util.Set<Long> testValue = aggregate.getP0S1Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0S1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lo());
    }

    /* Testing the "p0S1Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo();
        final java.util.Set<Long> testValue = aggregate.getP0S1Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo().getP0S1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo()
                .setP0S1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0S1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lo());
    }

    /* Testing the "p0S1Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo()
                .setP0S1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo().getP0S1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo()
                .setP0S1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0S1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lo());
    }

    /* Testing the "p0S1Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo()
                .setP0S1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo().getP0S1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo()
                .setP0S1Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0S1Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Lo());
    }

    /* Testing the "p0S1Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0S1Lo()
                .setP0S1Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Lo().getP0S1Lo());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0S1Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0S1Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
