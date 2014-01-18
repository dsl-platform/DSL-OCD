package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneFloats_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneFloats: Array[Float],
    private var _calculatedOneArrayOfOneFloats: Array[Float],
    private var _persistedOneArrayOfOneFloats: Array[Float]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneFloats_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneFloats_4("+ URI +")"

   def copy(oneArrayOfOneFloats: Array[Float] = this._oneArrayOfOneFloats): OneArrayOfOneFloats_4 = {

  require(oneArrayOfOneFloats ne null, "Null value was provided for property \"oneArrayOfOneFloats\"")
    new OneArrayOfOneFloats_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneFloats = oneArrayOfOneFloats, _calculatedOneArrayOfOneFloats = _calculatedOneArrayOfOneFloats, _persistedOneArrayOfOneFloats = _persistedOneArrayOfOneFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneFloats_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneFloats = result._oneArrayOfOneFloats
    this._calculatedOneArrayOfOneFloats = result._calculatedOneArrayOfOneFloats
    this._persistedOneArrayOfOneFloats = result._persistedOneArrayOfOneFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneFloats_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneFloats")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneFloats = {
    _oneArrayOfOneFloats
  }

  def oneArrayOfOneFloats_= (value: Array[Float]) {
    _oneArrayOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneFloats")
  def calculatedOneArrayOfOneFloats = {
    _calculatedOneArrayOfOneFloats
  }

  def calculatedOneArrayOfOneFloats_= (value: Array[Float]) {
    _calculatedOneArrayOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneFloats")
  def persistedOneArrayOfOneFloats = {
    _persistedOneArrayOfOneFloats
  }

  def persistedOneArrayOfOneFloats_= (value: Array[Float]) {
    _persistedOneArrayOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneFloats") oneArrayOfOneFloats: Array[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneFloats") calculatedOneArrayOfOneFloats: Array[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneFloats") persistedOneArrayOfOneFloats: Array[Float]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneFloats = if (oneArrayOfOneFloats == null) Array.empty else oneArrayOfOneFloats, _calculatedOneArrayOfOneFloats = calculatedOneArrayOfOneFloats, _persistedOneArrayOfOneFloats = persistedOneArrayOfOneFloats)

}

object OneArrayOfOneFloats_4 extends AggregateRootCompanion[OneArrayOfOneFloats_4]{

  def apply(
    oneArrayOfOneFloats: Array[Float] = Array.empty
  ) = {
    require(oneArrayOfOneFloats ne null, "Null value was provided for property \"oneArrayOfOneFloats\"")
    new OneArrayOfOneFloats_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneFloats = oneArrayOfOneFloats
    , _calculatedOneArrayOfOneFloats = Array.empty
    , _persistedOneArrayOfOneFloats = Array.empty)
  }

}
