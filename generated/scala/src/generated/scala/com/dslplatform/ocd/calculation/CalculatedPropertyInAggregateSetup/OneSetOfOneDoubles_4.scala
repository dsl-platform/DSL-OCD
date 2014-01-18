package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneDoubles: Set[Double],
    private var _calculatedOneSetOfOneDoubles: Set[Double],
    private var _persistedOneSetOfOneDoubles: Set[Double]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneDoubles_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneDoubles_4("+ URI +")"

   def copy(oneSetOfOneDoubles: Set[Double] = this._oneSetOfOneDoubles): OneSetOfOneDoubles_4 = {

  require(oneSetOfOneDoubles ne null, "Null value was provided for property \"oneSetOfOneDoubles\"")
    new OneSetOfOneDoubles_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneDoubles = oneSetOfOneDoubles, _calculatedOneSetOfOneDoubles = _calculatedOneSetOfOneDoubles, _persistedOneSetOfOneDoubles = _persistedOneSetOfOneDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneDoubles_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneDoubles = result._oneSetOfOneDoubles
    this._calculatedOneSetOfOneDoubles = result._calculatedOneSetOfOneDoubles
    this._persistedOneSetOfOneDoubles = result._persistedOneSetOfOneDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneDoubles_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneDoubles = {
    _oneSetOfOneDoubles
  }

  def oneSetOfOneDoubles_= (value: Set[Double]) {
    _oneSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneDoubles")
  def calculatedOneSetOfOneDoubles = {
    _calculatedOneSetOfOneDoubles
  }

  def calculatedOneSetOfOneDoubles_= (value: Set[Double]) {
    _calculatedOneSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneDoubles")
  def persistedOneSetOfOneDoubles = {
    _persistedOneSetOfOneDoubles
  }

  def persistedOneSetOfOneDoubles_= (value: Set[Double]) {
    _persistedOneSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDoubles") oneSetOfOneDoubles: Set[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneDoubles") calculatedOneSetOfOneDoubles: Set[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneDoubles") persistedOneSetOfOneDoubles: Set[Double]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneDoubles = if (oneSetOfOneDoubles == null) Set.empty else oneSetOfOneDoubles, _calculatedOneSetOfOneDoubles = calculatedOneSetOfOneDoubles, _persistedOneSetOfOneDoubles = persistedOneSetOfOneDoubles)

}

object OneSetOfOneDoubles_4 extends AggregateRootCompanion[OneSetOfOneDoubles_4]{

  def apply(
    oneSetOfOneDoubles: Set[Double] = Set.empty
  ) = {
    require(oneSetOfOneDoubles ne null, "Null value was provided for property \"oneSetOfOneDoubles\"")
    new OneSetOfOneDoubles_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneDoubles = oneSetOfOneDoubles
    , _calculatedOneSetOfOneDoubles = Set.empty
    , _persistedOneSetOfOneDoubles = Set.empty)
  }

}
