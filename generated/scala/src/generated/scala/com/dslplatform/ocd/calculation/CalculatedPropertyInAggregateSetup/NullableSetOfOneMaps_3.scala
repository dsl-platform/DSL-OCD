package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneMaps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneMaps: Option[Set[Map[String, String]]],
    private var _calculatedNullableSetOfOneMaps: Option[Set[Map[String, String]]],
    private var _persistedNullableSetOfOneMaps: Option[Set[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneMaps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneMaps_3("+ URI +")"

   def copy(nullableSetOfOneMaps: Option[Set[Map[String, String]]] = this._nullableSetOfOneMaps): NullableSetOfOneMaps_3 = {

  require(nullableSetOfOneMaps ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
  if(nullableSetOfOneMaps.isDefined) require(nullableSetOfOneMaps.get ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMaps)
    new NullableSetOfOneMaps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneMaps = nullableSetOfOneMaps, _calculatedNullableSetOfOneMaps = _calculatedNullableSetOfOneMaps, _persistedNullableSetOfOneMaps = _persistedNullableSetOfOneMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneMaps_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneMaps = result._nullableSetOfOneMaps
    this._calculatedNullableSetOfOneMaps = result._calculatedNullableSetOfOneMaps
    this._persistedNullableSetOfOneMaps = result._persistedNullableSetOfOneMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneMaps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMaps")
  def nullableSetOfOneMaps = {
    _nullableSetOfOneMaps
  }

  def nullableSetOfOneMaps_= (value: Option[Set[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneMaps")
  def calculatedNullableSetOfOneMaps = {
    _calculatedNullableSetOfOneMaps
  }

  def calculatedNullableSetOfOneMaps_= (value: Option[Set[Map[String, String]]]) {
    _calculatedNullableSetOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneMaps")
  def persistedNullableSetOfOneMaps = {
    _persistedNullableSetOfOneMaps
  }

  def persistedNullableSetOfOneMaps_= (value: Option[Set[Map[String, String]]]) {
    _persistedNullableSetOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMaps") nullableSetOfOneMaps: Option[Set[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneMaps") calculatedNullableSetOfOneMaps: Option[Set[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneMaps") persistedNullableSetOfOneMaps: Option[Set[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneMaps = nullableSetOfOneMaps, _calculatedNullableSetOfOneMaps = calculatedNullableSetOfOneMaps, _persistedNullableSetOfOneMaps = persistedNullableSetOfOneMaps)

}

object NullableSetOfOneMaps_3 extends AggregateRootCompanion[NullableSetOfOneMaps_3]{

  def apply(
    nullableSetOfOneMaps: Option[Set[Map[String, String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMaps)
    require(nullableSetOfOneMaps ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
    if (nullableSetOfOneMaps.isDefined) require(nullableSetOfOneMaps.get ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
    new NullableSetOfOneMaps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneMaps = nullableSetOfOneMaps
    , _calculatedNullableSetOfOneMaps = None
    , _persistedNullableSetOfOneMaps = None)
  }

}
