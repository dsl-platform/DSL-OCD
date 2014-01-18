package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneBooleans_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneBooleans: Array[Boolean],
    private var _calculatedOneArrayOfOneBooleans: Array[Boolean],
    private var _persistedOneArrayOfOneBooleans: Array[Boolean]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneBooleans_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneBooleans_4("+ URI +")"

   def copy(oneArrayOfOneBooleans: Array[Boolean] = this._oneArrayOfOneBooleans): OneArrayOfOneBooleans_4 = {

  require(oneArrayOfOneBooleans ne null, "Null value was provided for property \"oneArrayOfOneBooleans\"")
    new OneArrayOfOneBooleans_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneBooleans = oneArrayOfOneBooleans, _calculatedOneArrayOfOneBooleans = _calculatedOneArrayOfOneBooleans, _persistedOneArrayOfOneBooleans = _persistedOneArrayOfOneBooleans)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneBooleans_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneBooleans = result._oneArrayOfOneBooleans
    this._calculatedOneArrayOfOneBooleans = result._calculatedOneArrayOfOneBooleans
    this._persistedOneArrayOfOneBooleans = result._persistedOneArrayOfOneBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneBooleans_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneBooleans")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneBooleans = {
    _oneArrayOfOneBooleans
  }

  def oneArrayOfOneBooleans_= (value: Array[Boolean]) {
    _oneArrayOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneBooleans")
  def calculatedOneArrayOfOneBooleans = {
    _calculatedOneArrayOfOneBooleans
  }

  def calculatedOneArrayOfOneBooleans_= (value: Array[Boolean]) {
    _calculatedOneArrayOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneBooleans")
  def persistedOneArrayOfOneBooleans = {
    _persistedOneArrayOfOneBooleans
  }

  def persistedOneArrayOfOneBooleans_= (value: Array[Boolean]) {
    _persistedOneArrayOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneBooleans") oneArrayOfOneBooleans: Array[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneBooleans") calculatedOneArrayOfOneBooleans: Array[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneBooleans") persistedOneArrayOfOneBooleans: Array[Boolean]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneBooleans = if (oneArrayOfOneBooleans == null) Array.empty else oneArrayOfOneBooleans, _calculatedOneArrayOfOneBooleans = calculatedOneArrayOfOneBooleans, _persistedOneArrayOfOneBooleans = persistedOneArrayOfOneBooleans)

}

object OneArrayOfOneBooleans_4 extends AggregateRootCompanion[OneArrayOfOneBooleans_4]{

  def apply(
    oneArrayOfOneBooleans: Array[Boolean] = Array.empty
  ) = {
    require(oneArrayOfOneBooleans ne null, "Null value was provided for property \"oneArrayOfOneBooleans\"")
    new OneArrayOfOneBooleans_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneBooleans = oneArrayOfOneBooleans
    , _calculatedOneArrayOfOneBooleans = Array.empty
    , _persistedOneArrayOfOneBooleans = Array.empty)
  }

}
