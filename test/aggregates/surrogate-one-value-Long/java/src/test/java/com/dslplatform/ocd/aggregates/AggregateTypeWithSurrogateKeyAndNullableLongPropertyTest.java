package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableLongPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate0Lo> aggregate0LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableLongPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate0LoRepository.class);
    }

    /* Testing the "p0Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo();
        final Long testValue = aggregate.getP0Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Lo());
    }

    /* Testing the "p0Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP0LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo();
        final Long testValue = aggregate.getP0Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo().getP0Lo());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long testValue = 0L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Lo());
    }

    /* Testing the "p0Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long testValue = 0L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo().getP0Lo());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long testValue = 1L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Lo());
    }

    /* Testing the "p0Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long testValue = 1L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo().getP0Lo());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long testValue = 1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Lo());
    }

    /* Testing the "p0Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long testValue = 1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo().getP0Lo());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Lo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0LoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long testValue = -1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Lo());
    }

    /* Testing the "p0Lo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0LoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long testValue = -1000000000000000000L;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo().getP0Lo());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Lo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0LoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long testValue = Long.MIN_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Lo());
    }

    /* Testing the "p0Lo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0LoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long testValue = Long.MIN_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo().getP0Lo());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Lo" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0LoNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Long testValue = Long.MAX_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Lo());
    }

    /* Testing the "p0Lo" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP0LoNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Long testValue = Long.MAX_VALUE;
        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate0Lo()
                .setP0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Lo().getP0Lo());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
