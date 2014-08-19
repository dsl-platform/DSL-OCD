package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfNullableDatesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDate.Aggregate0S0Da> aggregate0S0DaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfNullableDatesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S0DaRepository = locator.resolve(ocd.AggregateSurrogateDate.repositories.Aggregate0S0DaRepository.class);
    }

    /* Testing the "p0S0Da" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da();
        final java.util.Set<org.joda.time.LocalDate> testValue = aggregate.getP0S0Da();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0S0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Da());
    }

    /* Testing the "p0S0Da" Default property value after active record persist */
    @org.junit.Test
    public void testP0S0DaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da();
        final java.util.Set<org.joda.time.LocalDate> testValue = aggregate.getP0S0Da();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da().getP0S0Da());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Da" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(null); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0S0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Da());
    }

    /* Testing the "p0S0Da" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S0DaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(null); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da().getP0S0Da());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Da" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0S0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Da());
    }

    /* Testing the "p0S0Da" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S0DaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da().getP0S0Da());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Da" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0S0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Da());
    }

    /* Testing the "p0S0Da" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S0DaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da().getP0S0Da());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Da" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DaNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); add(new org.joda.time.LocalDate(1, 2, 3)); add(new org.joda.time.LocalDate(1, 1, 1)); add(new org.joda.time.LocalDate(0)); add(new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)); add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0S0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Da());
    }

    /* Testing the "p0S0Da" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0S0DaNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); add(new org.joda.time.LocalDate(1, 2, 3)); add(new org.joda.time.LocalDate(1, 1, 1)); add(new org.joda.time.LocalDate(0)); add(new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)); add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da().getP0S0Da());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S0Da" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S0DaNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(null); add(org.joda.time.LocalDate.now()); add(new org.joda.time.LocalDate(1, 2, 3)); add(new org.joda.time.LocalDate(1, 1, 1)); add(new org.joda.time.LocalDate(0)); add(new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)); add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0S0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0S0Da());
    }

    /* Testing the "p0S0Da" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0S0DaNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.joda.time.LocalDate> testValue = new java.util.HashSet<org.joda.time.LocalDate>() {{ add(null); add(org.joda.time.LocalDate.now()); add(new org.joda.time.LocalDate(1, 2, 3)); add(new org.joda.time.LocalDate(1, 1, 1)); add(new org.joda.time.LocalDate(0)); add(new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)); add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0S0Da()
                .setP0S0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregate.getP0S0Da().getP0S0Da());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0S0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0S0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableSetOfNullableEquals(
                testValue,
                aggregateFound.getP0S0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
