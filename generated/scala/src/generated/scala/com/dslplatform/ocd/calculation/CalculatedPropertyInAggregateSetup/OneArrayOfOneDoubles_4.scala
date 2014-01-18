package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneDoubles: Array[Double],
    private var _calculatedOneArrayOfOneDoubles: Array[Double],
    private var _persistedOneArrayOfOneDoubles: Array[Double]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneDoubles_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneDoubles_4("+ URI +")"

   def copy(oneArrayOfOneDoubles: Array[Double] = this._oneArrayOfOneDoubles): OneArrayOfOneDoubles_4 = {

  require(oneArrayOfOneDoubles ne null, "Null value was provided for property \"oneArrayOfOneDoubles\"")
    new OneArrayOfOneDoubles_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneDoubles = oneArrayOfOneDoubles, _calculatedOneArrayOfOneDoubles = _calculatedOneArrayOfOneDoubles, _persistedOneArrayOfOneDoubles = _persistedOneArrayOfOneDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDoubles_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneDoubles = result._oneArrayOfOneDoubles
    this._calculatedOneArrayOfOneDoubles = result._calculatedOneArrayOfOneDoubles
    this._persistedOneArrayOfOneDoubles = result._persistedOneArrayOfOneDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDoubles_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneDoubles = {
    _oneArrayOfOneDoubles
  }

  def oneArrayOfOneDoubles_= (value: Array[Double]) {
    _oneArrayOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneDoubles")
  def calculatedOneArrayOfOneDoubles = {
    _calculatedOneArrayOfOneDoubles
  }

  def calculatedOneArrayOfOneDoubles_= (value: Array[Double]) {
    _calculatedOneArrayOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneDoubles")
  def persistedOneArrayOfOneDoubles = {
    _persistedOneArrayOfOneDoubles
  }

  def persistedOneArrayOfOneDoubles_= (value: Array[Double]) {
    _persistedOneArrayOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDoubles") oneArrayOfOneDoubles: Array[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneDoubles") calculatedOneArrayOfOneDoubles: Array[Double]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneDoubles") persistedOneArrayOfOneDoubles: Array[Double]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneDoubles = if (oneArrayOfOneDoubles == null) Array.empty else oneArrayOfOneDoubles, _calculatedOneArrayOfOneDoubles = calculatedOneArrayOfOneDoubles, _persistedOneArrayOfOneDoubles = persistedOneArrayOfOneDoubles)

}

object OneArrayOfOneDoubles_4 extends AggregateRootCompanion[OneArrayOfOneDoubles_4]{

  def apply(
    oneArrayOfOneDoubles: Array[Double] = Array.empty
  ) = {
    require(oneArrayOfOneDoubles ne null, "Null value was provided for property \"oneArrayOfOneDoubles\"")
    new OneArrayOfOneDoubles_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneDoubles = oneArrayOfOneDoubles
    , _calculatedOneArrayOfOneDoubles = Array.empty
    , _persistedOneArrayOfOneDoubles = Array.empty)
  }

}
