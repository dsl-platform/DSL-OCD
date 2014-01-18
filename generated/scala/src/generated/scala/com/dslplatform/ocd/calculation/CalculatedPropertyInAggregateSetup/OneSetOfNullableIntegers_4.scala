package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableIntegers_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableIntegers: Set[Option[Int]],
    private var _calculatedOneSetOfNullableIntegers: Set[Option[Int]],
    private var _persistedOneSetOfNullableIntegers: Set[Option[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableIntegers_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableIntegers_4("+ URI +")"

   def copy(oneSetOfNullableIntegers: Set[Option[Int]] = this._oneSetOfNullableIntegers): OneSetOfNullableIntegers_4 = {

  require(oneSetOfNullableIntegers ne null, "Null value was provided for property \"oneSetOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableIntegers)
    new OneSetOfNullableIntegers_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableIntegers = oneSetOfNullableIntegers, _calculatedOneSetOfNullableIntegers = _calculatedOneSetOfNullableIntegers, _persistedOneSetOfNullableIntegers = _persistedOneSetOfNullableIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableIntegers_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableIntegers = result._oneSetOfNullableIntegers
    this._calculatedOneSetOfNullableIntegers = result._calculatedOneSetOfNullableIntegers
    this._persistedOneSetOfNullableIntegers = result._persistedOneSetOfNullableIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableIntegers_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIntegers")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableIntegers = {
    _oneSetOfNullableIntegers
  }

  def oneSetOfNullableIntegers_= (value: Set[Option[Int]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableIntegers")
  def calculatedOneSetOfNullableIntegers = {
    _calculatedOneSetOfNullableIntegers
  }

  def calculatedOneSetOfNullableIntegers_= (value: Set[Option[Int]]) {
    _calculatedOneSetOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableIntegers")
  def persistedOneSetOfNullableIntegers = {
    _persistedOneSetOfNullableIntegers
  }

  def persistedOneSetOfNullableIntegers_= (value: Set[Option[Int]]) {
    _persistedOneSetOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIntegers") oneSetOfNullableIntegers: Set[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableIntegers") calculatedOneSetOfNullableIntegers: Set[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableIntegers") persistedOneSetOfNullableIntegers: Set[Option[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableIntegers = if (oneSetOfNullableIntegers == null) Set.empty else oneSetOfNullableIntegers, _calculatedOneSetOfNullableIntegers = calculatedOneSetOfNullableIntegers, _persistedOneSetOfNullableIntegers = persistedOneSetOfNullableIntegers)

}

object OneSetOfNullableIntegers_4 extends AggregateRootCompanion[OneSetOfNullableIntegers_4]{

  def apply(
    oneSetOfNullableIntegers: Set[Option[Int]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableIntegers)
    require(oneSetOfNullableIntegers ne null, "Null value was provided for property \"oneSetOfNullableIntegers\"")
    new OneSetOfNullableIntegers_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableIntegers = oneSetOfNullableIntegers
    , _calculatedOneSetOfNullableIntegers = Set.empty
    , _persistedOneSetOfNullableIntegers = Set.empty)
  }

}
