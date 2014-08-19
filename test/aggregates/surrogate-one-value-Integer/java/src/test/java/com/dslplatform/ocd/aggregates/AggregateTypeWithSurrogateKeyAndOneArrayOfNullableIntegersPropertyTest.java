package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfNullableIntegersPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateInteger.Aggregate1A0In> aggregate1A0InRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfNullableIntegersPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A0InRepository = locator.resolve(ocd.AggregateSurrogateInteger.repositories.Aggregate1A0InRepository.class);
    }

    /* Testing the "p1A0In" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0InDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In();
        final Integer[] testValue = aggregate.getP1A0In();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1A0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0In());
    }

    /* Testing the "p1A0In" Default property value after active record persist */
    @org.junit.Test
    public void testP1A0InDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In();
        final Integer[] testValue = aggregate.getP1A0In();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In().getP1A0In());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0In" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0InNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { null };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1A0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0In());
    }

    /* Testing the "p1A0In" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A0InNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { null };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In().getP1A0In());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0In" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0InNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { 0 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1A0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0In());
    }

    /* Testing the "p1A0In" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A0InNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { 0 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In().getP1A0In());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0In" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0InNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { 1000000000 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1A0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0In());
    }

    /* Testing the "p1A0In" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A0InNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { 1000000000 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In().getP1A0In());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0In" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0InNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { 0, Integer.MIN_VALUE, Integer.MAX_VALUE, -1000000000, 1000000000 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1A0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0In());
    }

    /* Testing the "p1A0In" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1A0InNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { 0, Integer.MIN_VALUE, Integer.MAX_VALUE, -1000000000, 1000000000 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In().getP1A0In());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0In" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0InNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { null, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, -1000000000, 1000000000 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1A0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0In());
    }

    /* Testing the "p1A0In" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1A0InNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer[] testValue = new Integer[] { null, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, -1000000000, 1000000000 };
        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1A0In()
                .setP1A0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0In().getP1A0In());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1A0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1A0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
