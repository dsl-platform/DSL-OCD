package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableDatePropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDate.Aggregate0Da> aggregate0DaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableDatePropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0DaRepository = locator.resolve(ocd.AggregateSurrogateDate.repositories.Aggregate0DaRepository.class);
    }

    /* Testing the "p0Da" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da();
        final org.joda.time.LocalDate testValue = aggregate.getP0Da();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Da());
    }

    /* Testing the "p0Da" Default property value after active record persist */
    @org.junit.Test
    public void testP0DaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da();
        final org.joda.time.LocalDate testValue = aggregate.getP0Da();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da().getP0Da());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Da" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = org.joda.time.LocalDate.now();
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Da());
    }

    /* Testing the "p0Da" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0DaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = org.joda.time.LocalDate.now();
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da().getP0Da());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Da" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 2, 3);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Da());
    }

    /* Testing the "p0Da" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0DaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 2, 3);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da().getP0Da());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Da" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 1, 1);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Da());
    }

    /* Testing the "p0Da" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0DaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(1, 1, 1);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da().getP0Da());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Da" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DaNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(0);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Da());
    }

    /* Testing the "p0Da" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0DaNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(0);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da().getP0Da());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Da" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DaNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Da());
    }

    /* Testing the "p0Da" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0DaNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da().getP0Da());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Da" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DaNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(9999, 12, 31);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate0Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Da());
    }

    /* Testing the "p0Da" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP0DaNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.joda.time.LocalDate testValue = new org.joda.time.LocalDate(9999, 12, 31);
        final ocd.AggregateSurrogateDate.Aggregate0Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate0Da()
                .setP0Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Da().getP0Da());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate0Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate0Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
