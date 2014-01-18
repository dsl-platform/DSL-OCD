package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableIntegers_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableIntegers: Array[Option[Int]],
    private var _calculatedOneArrayOfNullableIntegers: Array[Option[Int]],
    private var _persistedOneArrayOfNullableIntegers: Array[Option[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableIntegers_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableIntegers_4("+ URI +")"

   def copy(oneArrayOfNullableIntegers: Array[Option[Int]] = this._oneArrayOfNullableIntegers): OneArrayOfNullableIntegers_4 = {

  require(oneArrayOfNullableIntegers ne null, "Null value was provided for property \"oneArrayOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableIntegers)
    new OneArrayOfNullableIntegers_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableIntegers = oneArrayOfNullableIntegers, _calculatedOneArrayOfNullableIntegers = _calculatedOneArrayOfNullableIntegers, _persistedOneArrayOfNullableIntegers = _persistedOneArrayOfNullableIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableIntegers_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableIntegers = result._oneArrayOfNullableIntegers
    this._calculatedOneArrayOfNullableIntegers = result._calculatedOneArrayOfNullableIntegers
    this._persistedOneArrayOfNullableIntegers = result._persistedOneArrayOfNullableIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableIntegers_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIntegers")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableIntegers = {
    _oneArrayOfNullableIntegers
  }

  def oneArrayOfNullableIntegers_= (value: Array[Option[Int]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _oneArrayOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableIntegers")
  def calculatedOneArrayOfNullableIntegers = {
    _calculatedOneArrayOfNullableIntegers
  }

  def calculatedOneArrayOfNullableIntegers_= (value: Array[Option[Int]]) {
    _calculatedOneArrayOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableIntegers")
  def persistedOneArrayOfNullableIntegers = {
    _persistedOneArrayOfNullableIntegers
  }

  def persistedOneArrayOfNullableIntegers_= (value: Array[Option[Int]]) {
    _persistedOneArrayOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIntegers") oneArrayOfNullableIntegers: Array[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableIntegers") calculatedOneArrayOfNullableIntegers: Array[Option[Int]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableIntegers") persistedOneArrayOfNullableIntegers: Array[Option[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableIntegers = if (oneArrayOfNullableIntegers == null) Array.empty else oneArrayOfNullableIntegers, _calculatedOneArrayOfNullableIntegers = calculatedOneArrayOfNullableIntegers, _persistedOneArrayOfNullableIntegers = persistedOneArrayOfNullableIntegers)

}

object OneArrayOfNullableIntegers_4 extends AggregateRootCompanion[OneArrayOfNullableIntegers_4]{

  def apply(
    oneArrayOfNullableIntegers: Array[Option[Int]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableIntegers)
    require(oneArrayOfNullableIntegers ne null, "Null value was provided for property \"oneArrayOfNullableIntegers\"")
    new OneArrayOfNullableIntegers_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableIntegers = oneArrayOfNullableIntegers
    , _calculatedOneArrayOfNullableIntegers = Array.empty
    , _persistedOneArrayOfNullableIntegers = Array.empty)
  }

}
