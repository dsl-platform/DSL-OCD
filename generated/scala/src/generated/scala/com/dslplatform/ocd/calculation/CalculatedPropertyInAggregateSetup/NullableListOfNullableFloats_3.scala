package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableFloats_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]],
    private var _calculatedNullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]],
    private var _persistedNullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableFloats_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableFloats_3("+ URI +")"

   def copy(nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]] = this._nullableListOfNullableFloats): NullableListOfNullableFloats_3 = {

  require(nullableListOfNullableFloats ne null, "Null value was provided for property \"nullableListOfNullableFloats\"")
  if(nullableListOfNullableFloats.isDefined) require(nullableListOfNullableFloats.get ne null, "Null value was provided for property \"nullableListOfNullableFloats\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableFloats)
    new NullableListOfNullableFloats_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableFloats = nullableListOfNullableFloats, _calculatedNullableListOfNullableFloats = _calculatedNullableListOfNullableFloats, _persistedNullableListOfNullableFloats = _persistedNullableListOfNullableFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableFloats_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableFloats = result._nullableListOfNullableFloats
    this._calculatedNullableListOfNullableFloats = result._calculatedNullableListOfNullableFloats
    this._persistedNullableListOfNullableFloats = result._persistedNullableListOfNullableFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableFloats_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableFloats")
  def nullableListOfNullableFloats = {
    _nullableListOfNullableFloats
  }

  def nullableListOfNullableFloats_= (value: Option[IndexedSeq[Option[Float]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _nullableListOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableFloats")
  def calculatedNullableListOfNullableFloats = {
    _calculatedNullableListOfNullableFloats
  }

  def calculatedNullableListOfNullableFloats_= (value: Option[IndexedSeq[Option[Float]]]) {
    _calculatedNullableListOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableFloats")
  def persistedNullableListOfNullableFloats = {
    _persistedNullableListOfNullableFloats
  }

  def persistedNullableListOfNullableFloats_= (value: Option[IndexedSeq[Option[Float]]]) {
    _persistedNullableListOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableFloats") nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableFloats") calculatedNullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableFloats") persistedNullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableFloats = nullableListOfNullableFloats, _calculatedNullableListOfNullableFloats = calculatedNullableListOfNullableFloats, _persistedNullableListOfNullableFloats = persistedNullableListOfNullableFloats)

}

object NullableListOfNullableFloats_3 extends AggregateRootCompanion[NullableListOfNullableFloats_3]{

  def apply(
    nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableFloats)
    require(nullableListOfNullableFloats ne null, "Null value was provided for property \"nullableListOfNullableFloats\"")
    if (nullableListOfNullableFloats.isDefined) require(nullableListOfNullableFloats.get ne null, "Null value was provided for property \"nullableListOfNullableFloats\"")
    new NullableListOfNullableFloats_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableFloats = nullableListOfNullableFloats
    , _calculatedNullableListOfNullableFloats = None
    , _persistedNullableListOfNullableFloats = None)
  }

}
