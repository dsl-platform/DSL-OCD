package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableXml_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableXml: Option[scala.xml.Elem],
    private var _calculatedNullableXml: Option[scala.xml.Elem],
    private var _persistedNullableXml: Option[scala.xml.Elem]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableXml_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableXml_3("+ URI +")"

   def copy(nullableXml: Option[scala.xml.Elem] = this._nullableXml): NullableXml_3 = {

  require(nullableXml ne null, "Null value was provided for property \"nullableXml\"")
  if(nullableXml.isDefined) require(nullableXml.get ne null, "Null value was provided for property \"nullableXml\"")
    new NullableXml_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableXml = nullableXml, _calculatedNullableXml = _calculatedNullableXml, _persistedNullableXml = _persistedNullableXml)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableXml_3): this.type = {
    this._URI = result._URI
    this._nullableXml = result._nullableXml
    this._calculatedNullableXml = result._calculatedNullableXml
    this._persistedNullableXml = result._persistedNullableXml
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableXml_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableXml")
  def nullableXml = {
    _nullableXml
  }

  def nullableXml_= (value: Option[scala.xml.Elem]) {
    _nullableXml = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableXml")
  def calculatedNullableXml = {
    _calculatedNullableXml
  }

  def calculatedNullableXml_= (value: Option[scala.xml.Elem]) {
    _calculatedNullableXml = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableXml")
  def persistedNullableXml = {
    _persistedNullableXml
  }

  def persistedNullableXml_= (value: Option[scala.xml.Elem]) {
    _persistedNullableXml = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableXml") nullableXml: Option[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableXml") calculatedNullableXml: Option[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableXml") persistedNullableXml: Option[scala.xml.Elem]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableXml = nullableXml, _calculatedNullableXml = calculatedNullableXml, _persistedNullableXml = persistedNullableXml)

}

object NullableXml_3 extends AggregateRootCompanion[NullableXml_3]{

  def apply(
    nullableXml: Option[scala.xml.Elem] = None
  ) = {
    require(nullableXml ne null, "Null value was provided for property \"nullableXml\"")
    if (nullableXml.isDefined) require(nullableXml.get ne null, "Null value was provided for property \"nullableXml\"")
    new NullableXml_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableXml = nullableXml
    , _calculatedNullableXml = None
    , _persistedNullableXml = None)
  }

}
