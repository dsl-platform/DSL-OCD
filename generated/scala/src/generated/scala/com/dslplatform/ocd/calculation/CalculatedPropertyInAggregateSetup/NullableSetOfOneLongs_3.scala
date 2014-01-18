package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneLongs_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneLongs: Option[Set[Long]],
    private var _calculatedNullableSetOfOneLongs: Option[Set[Long]],
    private var _persistedNullableSetOfOneLongs: Option[Set[Long]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneLongs_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneLongs_3("+ URI +")"

   def copy(nullableSetOfOneLongs: Option[Set[Long]] = this._nullableSetOfOneLongs): NullableSetOfOneLongs_3 = {

  require(nullableSetOfOneLongs ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")
  if(nullableSetOfOneLongs.isDefined) require(nullableSetOfOneLongs.get ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")
    new NullableSetOfOneLongs_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneLongs = nullableSetOfOneLongs, _calculatedNullableSetOfOneLongs = _calculatedNullableSetOfOneLongs, _persistedNullableSetOfOneLongs = _persistedNullableSetOfOneLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneLongs_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneLongs = result._nullableSetOfOneLongs
    this._calculatedNullableSetOfOneLongs = result._calculatedNullableSetOfOneLongs
    this._persistedNullableSetOfOneLongs = result._persistedNullableSetOfOneLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneLongs_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLongs")
  def nullableSetOfOneLongs = {
    _nullableSetOfOneLongs
  }

  def nullableSetOfOneLongs_= (value: Option[Set[Long]]) {
    _nullableSetOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneLongs")
  def calculatedNullableSetOfOneLongs = {
    _calculatedNullableSetOfOneLongs
  }

  def calculatedNullableSetOfOneLongs_= (value: Option[Set[Long]]) {
    _calculatedNullableSetOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneLongs")
  def persistedNullableSetOfOneLongs = {
    _persistedNullableSetOfOneLongs
  }

  def persistedNullableSetOfOneLongs_= (value: Option[Set[Long]]) {
    _persistedNullableSetOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLongs") nullableSetOfOneLongs: Option[Set[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneLongs") calculatedNullableSetOfOneLongs: Option[Set[Long]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneLongs") persistedNullableSetOfOneLongs: Option[Set[Long]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneLongs = nullableSetOfOneLongs, _calculatedNullableSetOfOneLongs = calculatedNullableSetOfOneLongs, _persistedNullableSetOfOneLongs = persistedNullableSetOfOneLongs)

}

object NullableSetOfOneLongs_3 extends AggregateRootCompanion[NullableSetOfOneLongs_3]{

  def apply(
    nullableSetOfOneLongs: Option[Set[Long]] = None
  ) = {
    require(nullableSetOfOneLongs ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")
    if (nullableSetOfOneLongs.isDefined) require(nullableSetOfOneLongs.get ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")
    new NullableSetOfOneLongs_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneLongs = nullableSetOfOneLongs
    , _calculatedNullableSetOfOneLongs = None
    , _persistedNullableSetOfOneLongs = None)
  }

}
