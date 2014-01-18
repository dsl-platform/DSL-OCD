package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableIntegers_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]],
    private var _calculatedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]],
    private var _persistedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableIntegers_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableIntegers_3("+ URI +")"

   def copy(nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]] = this._nullableListOfNullableIntegers): NullableListOfNullableIntegers_3 = {

  require(nullableListOfNullableIntegers ne null, "Null value was provided for property \"nullableListOfNullableIntegers\"")
  if(nullableListOfNullableIntegers.isDefined) require(nullableListOfNullableIntegers.get ne null, "Null value was provided for property \"nullableListOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableIntegers)
    new NullableListOfNullableIntegers_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableIntegers = nullableListOfNullableIntegers, _calculatedNullableListOfNullableIntegers = _calculatedNullableListOfNullableIntegers, _persistedNullableListOfNullableIntegers = _persistedNullableListOfNullableIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableIntegers_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableIntegers = result._nullableListOfNullableIntegers
    this._calculatedNullableListOfNullableIntegers = result._calculatedNullableListOfNullableIntegers
    this._persistedNullableListOfNullableIntegers = result._persistedNullableListOfNullableIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableIntegers_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIntegers")
  def nullableListOfNullableIntegers = {
    _nullableListOfNullableIntegers
  }

  def nullableListOfNullableIntegers_= (value: Option[IndexedSeq[Option[Int]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _nullableListOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableIntegers")
  def calculatedNullableListOfNullableIntegers = {
    _calculatedNullableListOfNullableIntegers
  }

  def calculatedNullableListOfNullableIntegers_= (value: Option[IndexedSeq[Option[Int]]]) {
    _calculatedNullableListOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableIntegers")
  def persistedNullableListOfNullableIntegers = {
    _persistedNullableListOfNullableIntegers
  }

  def persistedNullableListOfNullableIntegers_= (value: Option[IndexedSeq[Option[Int]]]) {
    _persistedNullableListOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIntegers") nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableIntegers") calculatedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableIntegers") persistedNullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableIntegers = nullableListOfNullableIntegers, _calculatedNullableListOfNullableIntegers = calculatedNullableListOfNullableIntegers, _persistedNullableListOfNullableIntegers = persistedNullableListOfNullableIntegers)

}

object NullableListOfNullableIntegers_3 extends AggregateRootCompanion[NullableListOfNullableIntegers_3]{

  def apply(
    nullableListOfNullableIntegers: Option[IndexedSeq[Option[Int]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableIntegers)
    require(nullableListOfNullableIntegers ne null, "Null value was provided for property \"nullableListOfNullableIntegers\"")
    if (nullableListOfNullableIntegers.isDefined) require(nullableListOfNullableIntegers.get ne null, "Null value was provided for property \"nullableListOfNullableIntegers\"")
    new NullableListOfNullableIntegers_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableIntegers = nullableListOfNullableIntegers
    , _calculatedNullableListOfNullableIntegers = None
    , _persistedNullableListOfNullableIntegers = None)
  }

}
