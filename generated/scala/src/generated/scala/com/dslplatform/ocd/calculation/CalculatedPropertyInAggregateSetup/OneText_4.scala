package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneText_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneText: String,
    private var _calculatedOneText: String,
    private var _persistedOneText: String
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneText_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneText_4("+ URI +")"

   def copy(oneText: String = this._oneText): OneText_4 = {

  require(oneText ne null, "Null value was provided for property \"oneText\"")
    new OneText_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneText = oneText, _calculatedOneText = _calculatedOneText, _persistedOneText = _persistedOneText)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneText_4): this.type = {
    this._URI = result._URI
    this._oneText = result._oneText
    this._calculatedOneText = result._calculatedOneText
    this._persistedOneText = result._persistedOneText
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneText_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneText")
  def oneText = {
    _oneText
  }

  def oneText_= (value: String) {
    _oneText = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneText")
  def calculatedOneText = {
    _calculatedOneText
  }

  def calculatedOneText_= (value: String) {
    _calculatedOneText = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneText")
  def persistedOneText = {
    _persistedOneText
  }

  def persistedOneText_= (value: String) {
    _persistedOneText = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneText") oneText: String
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneText") calculatedOneText: String
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneText") persistedOneText: String
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneText = if (oneText == null) "" else oneText, _calculatedOneText = if (calculatedOneText == null) "" else calculatedOneText, _persistedOneText = if (persistedOneText == null) "" else persistedOneText)

}

object OneText_4 extends AggregateRootCompanion[OneText_4]{

  def apply(
    oneText: String = ""
  ) = {
    require(oneText ne null, "Null value was provided for property \"oneText\"")
    new OneText_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneText = oneText
    , _calculatedOneText = ""
    , _persistedOneText = "")
  }

}
