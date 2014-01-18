package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableBinaries_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]],
    private var _calculatedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]],
    private var _persistedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableBinaries_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableBinaries_3("+ URI +")"

   def copy(nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]] = this._nullableArrayOfNullableBinaries): NullableArrayOfNullableBinaries_3 = {

  require(nullableArrayOfNullableBinaries ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
  if(nullableArrayOfNullableBinaries.isDefined) require(nullableArrayOfNullableBinaries.get ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableBinaries)
    new NullableArrayOfNullableBinaries_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableBinaries = nullableArrayOfNullableBinaries, _calculatedNullableArrayOfNullableBinaries = _calculatedNullableArrayOfNullableBinaries, _persistedNullableArrayOfNullableBinaries = _persistedNullableArrayOfNullableBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableBinaries_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableBinaries = result._nullableArrayOfNullableBinaries
    this._calculatedNullableArrayOfNullableBinaries = result._calculatedNullableArrayOfNullableBinaries
    this._persistedNullableArrayOfNullableBinaries = result._persistedNullableArrayOfNullableBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableBinaries_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBinaries")
  def nullableArrayOfNullableBinaries = {
    _nullableArrayOfNullableBinaries
  }

  def nullableArrayOfNullableBinaries_= (value: Option[Array[Option[Array[Byte]]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableBinaries")
  def calculatedNullableArrayOfNullableBinaries = {
    _calculatedNullableArrayOfNullableBinaries
  }

  def calculatedNullableArrayOfNullableBinaries_= (value: Option[Array[Option[Array[Byte]]]]) {
    _calculatedNullableArrayOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableBinaries")
  def persistedNullableArrayOfNullableBinaries = {
    _persistedNullableArrayOfNullableBinaries
  }

  def persistedNullableArrayOfNullableBinaries_= (value: Option[Array[Option[Array[Byte]]]]) {
    _persistedNullableArrayOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBinaries") nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableBinaries") calculatedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableBinaries") persistedNullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableBinaries = nullableArrayOfNullableBinaries, _calculatedNullableArrayOfNullableBinaries = calculatedNullableArrayOfNullableBinaries, _persistedNullableArrayOfNullableBinaries = persistedNullableArrayOfNullableBinaries)

}

object NullableArrayOfNullableBinaries_3 extends AggregateRootCompanion[NullableArrayOfNullableBinaries_3]{

  def apply(
    nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableBinaries)
    require(nullableArrayOfNullableBinaries ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
    if (nullableArrayOfNullableBinaries.isDefined) require(nullableArrayOfNullableBinaries.get ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
    new NullableArrayOfNullableBinaries_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableBinaries = nullableArrayOfNullableBinaries
    , _calculatedNullableArrayOfNullableBinaries = None
    , _persistedNullableArrayOfNullableBinaries = None)
  }

}
