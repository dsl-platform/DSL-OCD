package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableXmlPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateXml.Aggregate0Xm> aggregate0XmRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableXmlPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0XmRepository = locator.resolve(ocd.AggregateSurrogateXml.repositories.Aggregate0XmRepository.class);
    }

    /* Testing the "p0Xm" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0XmDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm();
        final org.w3c.dom.Element testValue = aggregate.getP0Xm();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Xm());
    }

    /* Testing the "p0Xm" Default property value after active record persist */
    @org.junit.Test
    public void testP0XmDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm();
        final org.w3c.dom.Element testValue = aggregate.getP0Xm();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm().getP0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Xm" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0XmNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<document/>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Xm());
    }

    /* Testing the "p0Xm" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0XmNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<document/>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm().getP0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Xm" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0XmNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Xm());
    }

    /* Testing the "p0Xm" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0XmNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm().getP0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Xm" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0XmNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Xm());
    }

    /* Testing the "p0Xm" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0XmNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm().getP0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Xm" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0XmNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Xm());
    }

    /* Testing the "p0Xm" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0XmNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm().getP0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Xm" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0XmNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Xm());
    }

    /* Testing the "p0Xm" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0XmNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm().getP0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Xm" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0XmNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Xm());
    }

    /* Testing the "p0Xm" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP0XmNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final org.w3c.dom.Element testValue = com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>");
        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0Xm()
                .setP0Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Xm().getP0Xm());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
