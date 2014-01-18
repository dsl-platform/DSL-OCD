package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableLongs_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableLongs: Option[Array[Option[Long]]],
    private var _calculatedNullableArrayOfNullableLongs: Option[Array[Option[Long]]],
    private var _persistedNullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableLongs_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableLongs_3("+ URI +")"

   def copy(nullableArrayOfNullableLongs: Option[Array[Option[Long]]] = this._nullableArrayOfNullableLongs): NullableArrayOfNullableLongs_3 = {

  require(nullableArrayOfNullableLongs ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
  if(nullableArrayOfNullableLongs.isDefined) require(nullableArrayOfNullableLongs.get ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableLongs)
    new NullableArrayOfNullableLongs_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableLongs = nullableArrayOfNullableLongs, _calculatedNullableArrayOfNullableLongs = _calculatedNullableArrayOfNullableLongs, _persistedNullableArrayOfNullableLongs = _persistedNullableArrayOfNullableLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableLongs_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableLongs = result._nullableArrayOfNullableLongs
    this._calculatedNullableArrayOfNullableLongs = result._calculatedNullableArrayOfNullableLongs
    this._persistedNullableArrayOfNullableLongs = result._persistedNullableArrayOfNullableLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableLongs_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableLongs")
  def nullableArrayOfNullableLongs = {
    _nullableArrayOfNullableLongs
  }

  def nullableArrayOfNullableLongs_= (value: Option[Array[Option[Long]]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _nullableArrayOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableLongs")
  def calculatedNullableArrayOfNullableLongs = {
    _calculatedNullableArrayOfNullableLongs
  }

  def calculatedNullableArrayOfNullableLongs_= (value: Option[Array[Option[Long]]]) {
    _calculatedNullableArrayOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableLongs")
  def persistedNullableArrayOfNullableLongs = {
    _persistedNullableArrayOfNullableLongs
  }

  def persistedNullableArrayOfNullableLongs_= (value: Option[Array[Option[Long]]]) {
    _persistedNullableArrayOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableLongs") nullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableLongs") calculatedNullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableLongs") persistedNullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableLongs = nullableArrayOfNullableLongs, _calculatedNullableArrayOfNullableLongs = calculatedNullableArrayOfNullableLongs, _persistedNullableArrayOfNullableLongs = persistedNullableArrayOfNullableLongs)

}

object NullableArrayOfNullableLongs_3 extends AggregateRootCompanion[NullableArrayOfNullableLongs_3]{

  def apply(
    nullableArrayOfNullableLongs: Option[Array[Option[Long]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableLongs)
    require(nullableArrayOfNullableLongs ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    if (nullableArrayOfNullableLongs.isDefined) require(nullableArrayOfNullableLongs.get ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    new NullableArrayOfNullableLongs_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableLongs = nullableArrayOfNullableLongs
    , _calculatedNullableArrayOfNullableLongs = None
    , _persistedNullableArrayOfNullableLongs = None)
  }

}
