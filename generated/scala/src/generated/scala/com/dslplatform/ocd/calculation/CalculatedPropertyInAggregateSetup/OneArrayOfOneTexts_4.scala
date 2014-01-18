package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneTexts_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneTexts: Array[String],
    private var _calculatedOneArrayOfOneTexts: Array[String],
    private var _persistedOneArrayOfOneTexts: Array[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneTexts_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneTexts_4("+ URI +")"

   def copy(oneArrayOfOneTexts: Array[String] = this._oneArrayOfOneTexts): OneArrayOfOneTexts_4 = {

  require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)
    new OneArrayOfOneTexts_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneTexts = oneArrayOfOneTexts, _calculatedOneArrayOfOneTexts = _calculatedOneArrayOfOneTexts, _persistedOneArrayOfOneTexts = _persistedOneArrayOfOneTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneTexts_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneTexts = result._oneArrayOfOneTexts
    this._calculatedOneArrayOfOneTexts = result._calculatedOneArrayOfOneTexts
    this._persistedOneArrayOfOneTexts = result._persistedOneArrayOfOneTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneTexts_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneTexts = {
    _oneArrayOfOneTexts
  }

  def oneArrayOfOneTexts_= (value: Array[String]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneTexts")
  def calculatedOneArrayOfOneTexts = {
    _calculatedOneArrayOfOneTexts
  }

  def calculatedOneArrayOfOneTexts_= (value: Array[String]) {
    _calculatedOneArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneTexts")
  def persistedOneArrayOfOneTexts = {
    _persistedOneArrayOfOneTexts
  }

  def persistedOneArrayOfOneTexts_= (value: Array[String]) {
    _persistedOneArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts") oneArrayOfOneTexts: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneTexts") calculatedOneArrayOfOneTexts: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneTexts") persistedOneArrayOfOneTexts: Array[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneTexts = if (oneArrayOfOneTexts == null) Array.empty else oneArrayOfOneTexts, _calculatedOneArrayOfOneTexts = calculatedOneArrayOfOneTexts, _persistedOneArrayOfOneTexts = persistedOneArrayOfOneTexts)

}

object OneArrayOfOneTexts_4 extends AggregateRootCompanion[OneArrayOfOneTexts_4]{

  def apply(
    oneArrayOfOneTexts: Array[String] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)
    require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
    new OneArrayOfOneTexts_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneTexts = oneArrayOfOneTexts
    , _calculatedOneArrayOfOneTexts = Array.empty
    , _persistedOneArrayOfOneTexts = Array.empty)
  }

}
