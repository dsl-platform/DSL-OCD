package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneIntegers_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneIntegers: Option[Set[Int]],
    private var _calculatedNullableSetOfOneIntegers: Option[Set[Int]],
    private var _persistedNullableSetOfOneIntegers: Option[Set[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneIntegers_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneIntegers_3("+ URI +")"

   def copy(nullableSetOfOneIntegers: Option[Set[Int]] = this._nullableSetOfOneIntegers): NullableSetOfOneIntegers_3 = {

  require(nullableSetOfOneIntegers ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")
  if(nullableSetOfOneIntegers.isDefined) require(nullableSetOfOneIntegers.get ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")
    new NullableSetOfOneIntegers_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneIntegers = nullableSetOfOneIntegers, _calculatedNullableSetOfOneIntegers = _calculatedNullableSetOfOneIntegers, _persistedNullableSetOfOneIntegers = _persistedNullableSetOfOneIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneIntegers_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneIntegers = result._nullableSetOfOneIntegers
    this._calculatedNullableSetOfOneIntegers = result._calculatedNullableSetOfOneIntegers
    this._persistedNullableSetOfOneIntegers = result._persistedNullableSetOfOneIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneIntegers_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneIntegers")
  def nullableSetOfOneIntegers = {
    _nullableSetOfOneIntegers
  }

  def nullableSetOfOneIntegers_= (value: Option[Set[Int]]) {
    _nullableSetOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneIntegers")
  def calculatedNullableSetOfOneIntegers = {
    _calculatedNullableSetOfOneIntegers
  }

  def calculatedNullableSetOfOneIntegers_= (value: Option[Set[Int]]) {
    _calculatedNullableSetOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneIntegers")
  def persistedNullableSetOfOneIntegers = {
    _persistedNullableSetOfOneIntegers
  }

  def persistedNullableSetOfOneIntegers_= (value: Option[Set[Int]]) {
    _persistedNullableSetOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneIntegers") nullableSetOfOneIntegers: Option[Set[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneIntegers") calculatedNullableSetOfOneIntegers: Option[Set[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneIntegers") persistedNullableSetOfOneIntegers: Option[Set[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneIntegers = nullableSetOfOneIntegers, _calculatedNullableSetOfOneIntegers = calculatedNullableSetOfOneIntegers, _persistedNullableSetOfOneIntegers = persistedNullableSetOfOneIntegers)

}

object NullableSetOfOneIntegers_3 extends AggregateRootCompanion[NullableSetOfOneIntegers_3]{

  def apply(
    nullableSetOfOneIntegers: Option[Set[Int]] = None
  ) = {
    require(nullableSetOfOneIntegers ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")
    if (nullableSetOfOneIntegers.isDefined) require(nullableSetOfOneIntegers.get ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")
    new NullableSetOfOneIntegers_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneIntegers = nullableSetOfOneIntegers
    , _calculatedNullableSetOfOneIntegers = None
    , _persistedNullableSetOfOneIntegers = None)
  }

}
