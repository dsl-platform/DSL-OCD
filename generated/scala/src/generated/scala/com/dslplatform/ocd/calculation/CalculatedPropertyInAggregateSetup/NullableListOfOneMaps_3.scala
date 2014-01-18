package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneMaps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]],
    private var _calculatedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]],
    private var _persistedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneMaps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneMaps_3("+ URI +")"

   def copy(nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = this._nullableListOfOneMaps): NullableListOfOneMaps_3 = {

  require(nullableListOfOneMaps ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
  if(nullableListOfOneMaps.isDefined) require(nullableListOfOneMaps.get ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMaps)
    new NullableListOfOneMaps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneMaps = nullableListOfOneMaps, _calculatedNullableListOfOneMaps = _calculatedNullableListOfOneMaps, _persistedNullableListOfOneMaps = _persistedNullableListOfOneMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneMaps_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneMaps = result._nullableListOfOneMaps
    this._calculatedNullableListOfOneMaps = result._calculatedNullableListOfOneMaps
    this._persistedNullableListOfOneMaps = result._persistedNullableListOfOneMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneMaps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMaps")
  def nullableListOfOneMaps = {
    _nullableListOfOneMaps
  }

  def nullableListOfOneMaps_= (value: Option[IndexedSeq[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneMaps")
  def calculatedNullableListOfOneMaps = {
    _calculatedNullableListOfOneMaps
  }

  def calculatedNullableListOfOneMaps_= (value: Option[IndexedSeq[Map[String, String]]]) {
    _calculatedNullableListOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneMaps")
  def persistedNullableListOfOneMaps = {
    _persistedNullableListOfOneMaps
  }

  def persistedNullableListOfOneMaps_= (value: Option[IndexedSeq[Map[String, String]]]) {
    _persistedNullableListOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMaps") nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneMaps") calculatedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneMaps") persistedNullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneMaps = nullableListOfOneMaps, _calculatedNullableListOfOneMaps = calculatedNullableListOfOneMaps, _persistedNullableListOfOneMaps = persistedNullableListOfOneMaps)

}

object NullableListOfOneMaps_3 extends AggregateRootCompanion[NullableListOfOneMaps_3]{

  def apply(
    nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMaps)
    require(nullableListOfOneMaps ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    if (nullableListOfOneMaps.isDefined) require(nullableListOfOneMaps.get ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    new NullableListOfOneMaps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneMaps = nullableListOfOneMaps
    , _calculatedNullableListOfOneMaps = None
    , _persistedNullableListOfOneMaps = None)
  }

}
