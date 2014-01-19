package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableIntegers_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableIntegers: Option[Set[Option[Int]]],
    private var _calculatedNullableSetOfNullableIntegers: Option[Set[Option[Int]]],
    private var _persistedNullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableIntegers_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableIntegers_3("+ URI +")"

   def copy(nullableSetOfNullableIntegers: Option[Set[Option[Int]]] = this._nullableSetOfNullableIntegers): NullableSetOfNullableIntegers_3 = {

  require(nullableSetOfNullableIntegers ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
  if(nullableSetOfNullableIntegers.isDefined) require(nullableSetOfNullableIntegers.get ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableIntegers)
    new NullableSetOfNullableIntegers_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableIntegers = nullableSetOfNullableIntegers, _calculatedNullableSetOfNullableIntegers = _calculatedNullableSetOfNullableIntegers, _persistedNullableSetOfNullableIntegers = _persistedNullableSetOfNullableIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableIntegers_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableIntegers = result._nullableSetOfNullableIntegers
    this._calculatedNullableSetOfNullableIntegers = result._calculatedNullableSetOfNullableIntegers
    this._persistedNullableSetOfNullableIntegers = result._persistedNullableSetOfNullableIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableIntegers_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIntegers")
  def nullableSetOfNullableIntegers = {
    _nullableSetOfNullableIntegers
  }

  def nullableSetOfNullableIntegers_= (value: Option[Set[Option[Int]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _nullableSetOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableIntegers")
  def calculatedNullableSetOfNullableIntegers = {
    _calculatedNullableSetOfNullableIntegers
  }

  def calculatedNullableSetOfNullableIntegers_= (value: Option[Set[Option[Int]]]) {
    _calculatedNullableSetOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableIntegers")
  def persistedNullableSetOfNullableIntegers = {
    _persistedNullableSetOfNullableIntegers
  }

  def persistedNullableSetOfNullableIntegers_= (value: Option[Set[Option[Int]]]) {
    _persistedNullableSetOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIntegers") nullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableIntegers") calculatedNullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableIntegers") persistedNullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableIntegers = nullableSetOfNullableIntegers, _calculatedNullableSetOfNullableIntegers = calculatedNullableSetOfNullableIntegers, _persistedNullableSetOfNullableIntegers = persistedNullableSetOfNullableIntegers)

}

object NullableSetOfNullableIntegers_3 extends AggregateRootCompanion[NullableSetOfNullableIntegers_3]{

  def apply(
    nullableSetOfNullableIntegers: Option[Set[Option[Int]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableIntegers)
    require(nullableSetOfNullableIntegers ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
    if (nullableSetOfNullableIntegers.isDefined) require(nullableSetOfNullableIntegers.get ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
    new NullableSetOfNullableIntegers_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableIntegers = nullableSetOfNullableIntegers
    , _calculatedNullableSetOfNullableIntegers = None
    , _persistedNullableSetOfNullableIntegers = None)
  }

}