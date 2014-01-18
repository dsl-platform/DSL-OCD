package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableBinaries_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]],
    private var _calculatedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]],
    private var _persistedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableBinaries_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableBinaries_3("+ URI +")"

   def copy(nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]] = this._nullableSetOfNullableBinaries): NullableSetOfNullableBinaries_3 = {

  require(nullableSetOfNullableBinaries ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
  if(nullableSetOfNullableBinaries.isDefined) require(nullableSetOfNullableBinaries.get ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableBinaries)
    new NullableSetOfNullableBinaries_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableBinaries = nullableSetOfNullableBinaries, _calculatedNullableSetOfNullableBinaries = _calculatedNullableSetOfNullableBinaries, _persistedNullableSetOfNullableBinaries = _persistedNullableSetOfNullableBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableBinaries_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableBinaries = result._nullableSetOfNullableBinaries
    this._calculatedNullableSetOfNullableBinaries = result._calculatedNullableSetOfNullableBinaries
    this._persistedNullableSetOfNullableBinaries = result._persistedNullableSetOfNullableBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableBinaries_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableBinaries")
  def nullableSetOfNullableBinaries = {
    _nullableSetOfNullableBinaries
  }

  def nullableSetOfNullableBinaries_= (value: Option[Set[Option[Array[Byte]]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableBinaries")
  def calculatedNullableSetOfNullableBinaries = {
    _calculatedNullableSetOfNullableBinaries
  }

  def calculatedNullableSetOfNullableBinaries_= (value: Option[Set[Option[Array[Byte]]]]) {
    _calculatedNullableSetOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableBinaries")
  def persistedNullableSetOfNullableBinaries = {
    _persistedNullableSetOfNullableBinaries
  }

  def persistedNullableSetOfNullableBinaries_= (value: Option[Set[Option[Array[Byte]]]]) {
    _persistedNullableSetOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableBinaries") nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableBinaries") calculatedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableBinaries") persistedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableBinaries = nullableSetOfNullableBinaries, _calculatedNullableSetOfNullableBinaries = calculatedNullableSetOfNullableBinaries, _persistedNullableSetOfNullableBinaries = persistedNullableSetOfNullableBinaries)

}

object NullableSetOfNullableBinaries_3 extends AggregateRootCompanion[NullableSetOfNullableBinaries_3]{

  def apply(
    nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableBinaries)
    require(nullableSetOfNullableBinaries ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
    if (nullableSetOfNullableBinaries.isDefined) require(nullableSetOfNullableBinaries.get ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
    new NullableSetOfNullableBinaries_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableBinaries = nullableSetOfNullableBinaries
    , _calculatedNullableSetOfNullableBinaries = None
    , _persistedNullableSetOfNullableBinaries = None)
  }

}
