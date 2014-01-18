package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableBooleans_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableBooleans: Set[Option[Boolean]],
    private var _calculatedOneSetOfNullableBooleans: Set[Option[Boolean]],
    private var _persistedOneSetOfNullableBooleans: Set[Option[Boolean]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableBooleans_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableBooleans_4("+ URI +")"

   def copy(oneSetOfNullableBooleans: Set[Option[Boolean]] = this._oneSetOfNullableBooleans): OneSetOfNullableBooleans_4 = {

  require(oneSetOfNullableBooleans ne null, "Null value was provided for property \"oneSetOfNullableBooleans\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableBooleans)
    new OneSetOfNullableBooleans_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableBooleans = oneSetOfNullableBooleans, _calculatedOneSetOfNullableBooleans = _calculatedOneSetOfNullableBooleans, _persistedOneSetOfNullableBooleans = _persistedOneSetOfNullableBooleans)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableBooleans_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableBooleans = result._oneSetOfNullableBooleans
    this._calculatedOneSetOfNullableBooleans = result._calculatedOneSetOfNullableBooleans
    this._persistedOneSetOfNullableBooleans = result._persistedOneSetOfNullableBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableBooleans_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBooleans")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableBooleans = {
    _oneSetOfNullableBooleans
  }

  def oneSetOfNullableBooleans_= (value: Set[Option[Boolean]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableBooleans")
  def calculatedOneSetOfNullableBooleans = {
    _calculatedOneSetOfNullableBooleans
  }

  def calculatedOneSetOfNullableBooleans_= (value: Set[Option[Boolean]]) {
    _calculatedOneSetOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableBooleans")
  def persistedOneSetOfNullableBooleans = {
    _persistedOneSetOfNullableBooleans
  }

  def persistedOneSetOfNullableBooleans_= (value: Set[Option[Boolean]]) {
    _persistedOneSetOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBooleans") oneSetOfNullableBooleans: Set[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableBooleans") calculatedOneSetOfNullableBooleans: Set[Option[Boolean]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableBooleans") persistedOneSetOfNullableBooleans: Set[Option[Boolean]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableBooleans = if (oneSetOfNullableBooleans == null) Set.empty else oneSetOfNullableBooleans, _calculatedOneSetOfNullableBooleans = calculatedOneSetOfNullableBooleans, _persistedOneSetOfNullableBooleans = persistedOneSetOfNullableBooleans)

}

object OneSetOfNullableBooleans_4 extends AggregateRootCompanion[OneSetOfNullableBooleans_4]{

  def apply(
    oneSetOfNullableBooleans: Set[Option[Boolean]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableBooleans)
    require(oneSetOfNullableBooleans ne null, "Null value was provided for property \"oneSetOfNullableBooleans\"")
    new OneSetOfNullableBooleans_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableBooleans = oneSetOfNullableBooleans
    , _calculatedOneSetOfNullableBooleans = Set.empty
    , _persistedOneSetOfNullableBooleans = Set.empty)
  }

}
