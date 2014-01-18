package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneDecimals_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneDecimals: Array[BigDecimal],
    private var _calculatedOneArrayOfOneDecimals: Array[BigDecimal],
    private var _persistedOneArrayOfOneDecimals: Array[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneDecimals_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneDecimals_4("+ URI +")"

   def copy(oneArrayOfOneDecimals: Array[BigDecimal] = this._oneArrayOfOneDecimals): OneArrayOfOneDecimals_4 = {

  require(oneArrayOfOneDecimals ne null, "Null value was provided for property \"oneArrayOfOneDecimals\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDecimals)
    new OneArrayOfOneDecimals_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneDecimals = oneArrayOfOneDecimals, _calculatedOneArrayOfOneDecimals = _calculatedOneArrayOfOneDecimals, _persistedOneArrayOfOneDecimals = _persistedOneArrayOfOneDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDecimals_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneDecimals = result._oneArrayOfOneDecimals
    this._calculatedOneArrayOfOneDecimals = result._calculatedOneArrayOfOneDecimals
    this._persistedOneArrayOfOneDecimals = result._persistedOneArrayOfOneDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDecimals_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDecimals")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneDecimals = {
    _oneArrayOfOneDecimals
  }

  def oneArrayOfOneDecimals_= (value: Array[BigDecimal]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneDecimals")
  def calculatedOneArrayOfOneDecimals = {
    _calculatedOneArrayOfOneDecimals
  }

  def calculatedOneArrayOfOneDecimals_= (value: Array[BigDecimal]) {
    _calculatedOneArrayOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneDecimals")
  def persistedOneArrayOfOneDecimals = {
    _persistedOneArrayOfOneDecimals
  }

  def persistedOneArrayOfOneDecimals_= (value: Array[BigDecimal]) {
    _persistedOneArrayOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDecimals") oneArrayOfOneDecimals: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneDecimals") calculatedOneArrayOfOneDecimals: Array[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneDecimals") persistedOneArrayOfOneDecimals: Array[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneDecimals = if (oneArrayOfOneDecimals == null) Array.empty else oneArrayOfOneDecimals, _calculatedOneArrayOfOneDecimals = calculatedOneArrayOfOneDecimals, _persistedOneArrayOfOneDecimals = persistedOneArrayOfOneDecimals)

}

object OneArrayOfOneDecimals_4 extends AggregateRootCompanion[OneArrayOfOneDecimals_4]{

  def apply(
    oneArrayOfOneDecimals: Array[BigDecimal] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDecimals)
    require(oneArrayOfOneDecimals ne null, "Null value was provided for property \"oneArrayOfOneDecimals\"")
    new OneArrayOfOneDecimals_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneDecimals = oneArrayOfOneDecimals
    , _calculatedOneArrayOfOneDecimals = Array.empty
    , _persistedOneArrayOfOneDecimals = Array.empty)
  }

}
