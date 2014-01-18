package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneMaps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneMaps: Option[Array[Map[String, String]]],
    private var _calculatedNullableArrayOfOneMaps: Option[Array[Map[String, String]]],
    private var _persistedNullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneMaps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneMaps_3("+ URI +")"

   def copy(nullableArrayOfOneMaps: Option[Array[Map[String, String]]] = this._nullableArrayOfOneMaps): NullableArrayOfOneMaps_3 = {

  require(nullableArrayOfOneMaps ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
  if(nullableArrayOfOneMaps.isDefined) require(nullableArrayOfOneMaps.get ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMaps)
    new NullableArrayOfOneMaps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneMaps = nullableArrayOfOneMaps, _calculatedNullableArrayOfOneMaps = _calculatedNullableArrayOfOneMaps, _persistedNullableArrayOfOneMaps = _persistedNullableArrayOfOneMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneMaps_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneMaps = result._nullableArrayOfOneMaps
    this._calculatedNullableArrayOfOneMaps = result._calculatedNullableArrayOfOneMaps
    this._persistedNullableArrayOfOneMaps = result._persistedNullableArrayOfOneMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneMaps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMaps")
  def nullableArrayOfOneMaps = {
    _nullableArrayOfOneMaps
  }

  def nullableArrayOfOneMaps_= (value: Option[Array[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneMaps")
  def calculatedNullableArrayOfOneMaps = {
    _calculatedNullableArrayOfOneMaps
  }

  def calculatedNullableArrayOfOneMaps_= (value: Option[Array[Map[String, String]]]) {
    _calculatedNullableArrayOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneMaps")
  def persistedNullableArrayOfOneMaps = {
    _persistedNullableArrayOfOneMaps
  }

  def persistedNullableArrayOfOneMaps_= (value: Option[Array[Map[String, String]]]) {
    _persistedNullableArrayOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMaps") nullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneMaps") calculatedNullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneMaps") persistedNullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneMaps = nullableArrayOfOneMaps, _calculatedNullableArrayOfOneMaps = calculatedNullableArrayOfOneMaps, _persistedNullableArrayOfOneMaps = persistedNullableArrayOfOneMaps)

}

object NullableArrayOfOneMaps_3 extends AggregateRootCompanion[NullableArrayOfOneMaps_3]{

  def apply(
    nullableArrayOfOneMaps: Option[Array[Map[String, String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMaps)
    require(nullableArrayOfOneMaps ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
    if (nullableArrayOfOneMaps.isDefined) require(nullableArrayOfOneMaps.get ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
    new NullableArrayOfOneMaps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneMaps = nullableArrayOfOneMaps
    , _calculatedNullableArrayOfOneMaps = None
    , _persistedNullableArrayOfOneMaps = None)
  }

}
