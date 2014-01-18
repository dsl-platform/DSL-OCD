package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneBooleans_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneBooleans: Set[Boolean],
    private var _calculatedOneSetOfOneBooleans: Set[Boolean],
    private var _persistedOneSetOfOneBooleans: Set[Boolean]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneBooleans_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneBooleans_4("+ URI +")"

   def copy(oneSetOfOneBooleans: Set[Boolean] = this._oneSetOfOneBooleans): OneSetOfOneBooleans_4 = {

  require(oneSetOfOneBooleans ne null, "Null value was provided for property \"oneSetOfOneBooleans\"")
    new OneSetOfOneBooleans_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneBooleans = oneSetOfOneBooleans, _calculatedOneSetOfOneBooleans = _calculatedOneSetOfOneBooleans, _persistedOneSetOfOneBooleans = _persistedOneSetOfOneBooleans)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneBooleans_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneBooleans = result._oneSetOfOneBooleans
    this._calculatedOneSetOfOneBooleans = result._calculatedOneSetOfOneBooleans
    this._persistedOneSetOfOneBooleans = result._persistedOneSetOfOneBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneBooleans_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBooleans")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneBooleans = {
    _oneSetOfOneBooleans
  }

  def oneSetOfOneBooleans_= (value: Set[Boolean]) {
    _oneSetOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneBooleans")
  def calculatedOneSetOfOneBooleans = {
    _calculatedOneSetOfOneBooleans
  }

  def calculatedOneSetOfOneBooleans_= (value: Set[Boolean]) {
    _calculatedOneSetOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneBooleans")
  def persistedOneSetOfOneBooleans = {
    _persistedOneSetOfOneBooleans
  }

  def persistedOneSetOfOneBooleans_= (value: Set[Boolean]) {
    _persistedOneSetOfOneBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBooleans") oneSetOfOneBooleans: Set[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneBooleans") calculatedOneSetOfOneBooleans: Set[Boolean]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneBooleans") persistedOneSetOfOneBooleans: Set[Boolean]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneBooleans = if (oneSetOfOneBooleans == null) Set.empty else oneSetOfOneBooleans, _calculatedOneSetOfOneBooleans = calculatedOneSetOfOneBooleans, _persistedOneSetOfOneBooleans = persistedOneSetOfOneBooleans)

}

object OneSetOfOneBooleans_4 extends AggregateRootCompanion[OneSetOfOneBooleans_4]{

  def apply(
    oneSetOfOneBooleans: Set[Boolean] = Set.empty
  ) = {
    require(oneSetOfOneBooleans ne null, "Null value was provided for property \"oneSetOfOneBooleans\"")
    new OneSetOfOneBooleans_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneBooleans = oneSetOfOneBooleans
    , _calculatedOneSetOfOneBooleans = Set.empty
    , _persistedOneSetOfOneBooleans = Set.empty)
  }

}
