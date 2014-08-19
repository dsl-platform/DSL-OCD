package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfNullableIntegersPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateInteger.Aggregate1L0In> aggregate1L0InRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfNullableIntegersPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L0InRepository = locator.resolve(ocd.AggregateSurrogateInteger.repositories.Aggregate1L0InRepository.class);
    }

    /* Testing the "p1L0In" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0InDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In();
        final java.util.List<Integer> testValue = aggregate.getP1L0In();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1L0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0In());
    }

    /* Testing the "p1L0In" Default property value after active record persist */
    @org.junit.Test
    public void testP1L0InDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In();
        final java.util.List<Integer> testValue = aggregate.getP1L0In();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In().getP1L0In());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0In" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0InNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(null); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1L0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0In());
    }

    /* Testing the "p1L0In" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L0InNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(null); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In().getP1L0In());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0In" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0InNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(0); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1L0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0In());
    }

    /* Testing the "p1L0In" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L0InNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(0); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In().getP1L0In());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0In" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0InNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1L0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0In());
    }

    /* Testing the "p1L0In" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L0InNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In().getP1L0In());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0In" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0InNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(0); add(Integer.MIN_VALUE); add(Integer.MAX_VALUE); add(-1000000000); add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1L0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0In());
    }

    /* Testing the "p1L0In" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1L0InNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(0); add(Integer.MIN_VALUE); add(Integer.MAX_VALUE); add(-1000000000); add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In().getP1L0In());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0In" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0InNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(null); add(0); add(Integer.MIN_VALUE); add(Integer.MAX_VALUE); add(-1000000000); add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1L0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0In());
    }

    /* Testing the "p1L0In" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1L0InNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Integer> testValue = new java.util.ArrayList<Integer>() {{ add(null); add(0); add(Integer.MIN_VALUE); add(Integer.MAX_VALUE); add(-1000000000); add(1000000000); }};
        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1L0In()
                .setP1L0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0In().getP1L0In());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1L0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1L0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
