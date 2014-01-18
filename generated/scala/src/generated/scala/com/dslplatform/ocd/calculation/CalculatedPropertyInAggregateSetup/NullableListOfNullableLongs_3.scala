package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableLongs_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]],
    private var _calculatedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]],
    private var _persistedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableLongs_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableLongs_3("+ URI +")"

   def copy(nullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]] = this._nullableListOfNullableLongs): NullableListOfNullableLongs_3 = {

  require(nullableListOfNullableLongs ne null, "Null value was provided for property \"nullableListOfNullableLongs\"")
  if(nullableListOfNullableLongs.isDefined) require(nullableListOfNullableLongs.get ne null, "Null value was provided for property \"nullableListOfNullableLongs\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableLongs)
    new NullableListOfNullableLongs_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableLongs = nullableListOfNullableLongs, _calculatedNullableListOfNullableLongs = _calculatedNullableListOfNullableLongs, _persistedNullableListOfNullableLongs = _persistedNullableListOfNullableLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableLongs_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableLongs = result._nullableListOfNullableLongs
    this._calculatedNullableListOfNullableLongs = result._calculatedNullableListOfNullableLongs
    this._persistedNullableListOfNullableLongs = result._persistedNullableListOfNullableLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableLongs_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableLongs")
  def nullableListOfNullableLongs = {
    _nullableListOfNullableLongs
  }

  def nullableListOfNullableLongs_= (value: Option[IndexedSeq[Option[Long]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _nullableListOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableLongs")
  def calculatedNullableListOfNullableLongs = {
    _calculatedNullableListOfNullableLongs
  }

  def calculatedNullableListOfNullableLongs_= (value: Option[IndexedSeq[Option[Long]]]) {
    _calculatedNullableListOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableLongs")
  def persistedNullableListOfNullableLongs = {
    _persistedNullableListOfNullableLongs
  }

  def persistedNullableListOfNullableLongs_= (value: Option[IndexedSeq[Option[Long]]]) {
    _persistedNullableListOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableLongs") nullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableLongs") calculatedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableLongs") persistedNullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableLongs = nullableListOfNullableLongs, _calculatedNullableListOfNullableLongs = calculatedNullableListOfNullableLongs, _persistedNullableListOfNullableLongs = persistedNullableListOfNullableLongs)

}

object NullableListOfNullableLongs_3 extends AggregateRootCompanion[NullableListOfNullableLongs_3]{

  def apply(
    nullableListOfNullableLongs: Option[IndexedSeq[Option[Long]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableLongs)
    require(nullableListOfNullableLongs ne null, "Null value was provided for property \"nullableListOfNullableLongs\"")
    if (nullableListOfNullableLongs.isDefined) require(nullableListOfNullableLongs.get ne null, "Null value was provided for property \"nullableListOfNullableLongs\"")
    new NullableListOfNullableLongs_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableLongs = nullableListOfNullableLongs
    , _calculatedNullableListOfNullableLongs = None
    , _persistedNullableListOfNullableLongs = None)
  }

}
