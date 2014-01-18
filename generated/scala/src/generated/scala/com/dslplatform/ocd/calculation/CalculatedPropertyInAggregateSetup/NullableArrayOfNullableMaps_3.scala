package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableMaps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]],
    private var _calculatedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]],
    private var _persistedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableMaps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableMaps_3("+ URI +")"

   def copy(nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]] = this._nullableArrayOfNullableMaps): NullableArrayOfNullableMaps_3 = {

  require(nullableArrayOfNullableMaps ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
  if(nullableArrayOfNullableMaps.isDefined) require(nullableArrayOfNullableMaps.get ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMaps)
    new NullableArrayOfNullableMaps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableMaps = nullableArrayOfNullableMaps, _calculatedNullableArrayOfNullableMaps = _calculatedNullableArrayOfNullableMaps, _persistedNullableArrayOfNullableMaps = _persistedNullableArrayOfNullableMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableMaps_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableMaps = result._nullableArrayOfNullableMaps
    this._calculatedNullableArrayOfNullableMaps = result._calculatedNullableArrayOfNullableMaps
    this._persistedNullableArrayOfNullableMaps = result._persistedNullableArrayOfNullableMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableMaps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMaps")
  def nullableArrayOfNullableMaps = {
    _nullableArrayOfNullableMaps
  }

  def nullableArrayOfNullableMaps_= (value: Option[Array[Option[Map[String, String]]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableMaps")
  def calculatedNullableArrayOfNullableMaps = {
    _calculatedNullableArrayOfNullableMaps
  }

  def calculatedNullableArrayOfNullableMaps_= (value: Option[Array[Option[Map[String, String]]]]) {
    _calculatedNullableArrayOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableMaps")
  def persistedNullableArrayOfNullableMaps = {
    _persistedNullableArrayOfNullableMaps
  }

  def persistedNullableArrayOfNullableMaps_= (value: Option[Array[Option[Map[String, String]]]]) {
    _persistedNullableArrayOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMaps") nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableMaps") calculatedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableMaps") persistedNullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableMaps = nullableArrayOfNullableMaps, _calculatedNullableArrayOfNullableMaps = calculatedNullableArrayOfNullableMaps, _persistedNullableArrayOfNullableMaps = persistedNullableArrayOfNullableMaps)

}

object NullableArrayOfNullableMaps_3 extends AggregateRootCompanion[NullableArrayOfNullableMaps_3]{

  def apply(
    nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMaps)
    require(nullableArrayOfNullableMaps ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
    if (nullableArrayOfNullableMaps.isDefined) require(nullableArrayOfNullableMaps.get ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
    new NullableArrayOfNullableMaps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableMaps = nullableArrayOfNullableMaps
    , _calculatedNullableArrayOfNullableMaps = None
    , _persistedNullableArrayOfNullableMaps = None)
  }

}
