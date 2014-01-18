package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableStrings_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableStrings: Array[Option[String]],
    private var _calculatedOneArrayOfNullableStrings: Array[Option[String]],
    private var _persistedOneArrayOfNullableStrings: Array[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableStrings_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableStrings_4("+ URI +")"

   def copy(oneArrayOfNullableStrings: Array[Option[String]] = this._oneArrayOfNullableStrings): OneArrayOfNullableStrings_4 = {

  require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)
    new OneArrayOfNullableStrings_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableStrings = oneArrayOfNullableStrings, _calculatedOneArrayOfNullableStrings = _calculatedOneArrayOfNullableStrings, _persistedOneArrayOfNullableStrings = _persistedOneArrayOfNullableStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableStrings_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableStrings = result._oneArrayOfNullableStrings
    this._calculatedOneArrayOfNullableStrings = result._calculatedOneArrayOfNullableStrings
    this._persistedOneArrayOfNullableStrings = result._persistedOneArrayOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableStrings_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableStrings = {
    _oneArrayOfNullableStrings
  }

  def oneArrayOfNullableStrings_= (value: Array[Option[String]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableStrings")
  def calculatedOneArrayOfNullableStrings = {
    _calculatedOneArrayOfNullableStrings
  }

  def calculatedOneArrayOfNullableStrings_= (value: Array[Option[String]]) {
    _calculatedOneArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableStrings")
  def persistedOneArrayOfNullableStrings = {
    _persistedOneArrayOfNullableStrings
  }

  def persistedOneArrayOfNullableStrings_= (value: Array[Option[String]]) {
    _persistedOneArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStrings") oneArrayOfNullableStrings: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableStrings") calculatedOneArrayOfNullableStrings: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableStrings") persistedOneArrayOfNullableStrings: Array[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableStrings = if (oneArrayOfNullableStrings == null) Array.empty else oneArrayOfNullableStrings, _calculatedOneArrayOfNullableStrings = calculatedOneArrayOfNullableStrings, _persistedOneArrayOfNullableStrings = persistedOneArrayOfNullableStrings)

}

object OneArrayOfNullableStrings_4 extends AggregateRootCompanion[OneArrayOfNullableStrings_4]{

  def apply(
    oneArrayOfNullableStrings: Array[Option[String]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)
    require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
    new OneArrayOfNullableStrings_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableStrings = oneArrayOfNullableStrings
    , _calculatedOneArrayOfNullableStrings = Array.empty
    , _persistedOneArrayOfNullableStrings = Array.empty)
  }

}
