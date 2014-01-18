package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableBooleans_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableBooleans: Array[Option[Boolean]],
    private var _calculatedOneArrayOfNullableBooleans: Array[Option[Boolean]],
    private var _persistedOneArrayOfNullableBooleans: Array[Option[Boolean]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableBooleans_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableBooleans_4("+ URI +")"

   def copy(oneArrayOfNullableBooleans: Array[Option[Boolean]] = this._oneArrayOfNullableBooleans): OneArrayOfNullableBooleans_4 = {

  require(oneArrayOfNullableBooleans ne null, "Null value was provided for property \"oneArrayOfNullableBooleans\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableBooleans)
    new OneArrayOfNullableBooleans_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableBooleans = oneArrayOfNullableBooleans, _calculatedOneArrayOfNullableBooleans = _calculatedOneArrayOfNullableBooleans, _persistedOneArrayOfNullableBooleans = _persistedOneArrayOfNullableBooleans)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableBooleans_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableBooleans = result._oneArrayOfNullableBooleans
    this._calculatedOneArrayOfNullableBooleans = result._calculatedOneArrayOfNullableBooleans
    this._persistedOneArrayOfNullableBooleans = result._persistedOneArrayOfNullableBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableBooleans_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBooleans")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableBooleans = {
    _oneArrayOfNullableBooleans
  }

  def oneArrayOfNullableBooleans_= (value: Array[Option[Boolean]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _oneArrayOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableBooleans")
  def calculatedOneArrayOfNullableBooleans = {
    _calculatedOneArrayOfNullableBooleans
  }

  def calculatedOneArrayOfNullableBooleans_= (value: Array[Option[Boolean]]) {
    _calculatedOneArrayOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableBooleans")
  def persistedOneArrayOfNullableBooleans = {
    _persistedOneArrayOfNullableBooleans
  }

  def persistedOneArrayOfNullableBooleans_= (value: Array[Option[Boolean]]) {
    _persistedOneArrayOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBooleans") oneArrayOfNullableBooleans: Array[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableBooleans") calculatedOneArrayOfNullableBooleans: Array[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableBooleans") persistedOneArrayOfNullableBooleans: Array[Option[Boolean]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableBooleans = if (oneArrayOfNullableBooleans == null) Array.empty else oneArrayOfNullableBooleans, _calculatedOneArrayOfNullableBooleans = calculatedOneArrayOfNullableBooleans, _persistedOneArrayOfNullableBooleans = persistedOneArrayOfNullableBooleans)

}

object OneArrayOfNullableBooleans_4 extends AggregateRootCompanion[OneArrayOfNullableBooleans_4]{

  def apply(
    oneArrayOfNullableBooleans: Array[Option[Boolean]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableBooleans)
    require(oneArrayOfNullableBooleans ne null, "Null value was provided for property \"oneArrayOfNullableBooleans\"")
    new OneArrayOfNullableBooleans_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableBooleans = oneArrayOfNullableBooleans
    , _calculatedOneArrayOfNullableBooleans = Array.empty
    , _persistedOneArrayOfNullableBooleans = Array.empty)
  }

}
