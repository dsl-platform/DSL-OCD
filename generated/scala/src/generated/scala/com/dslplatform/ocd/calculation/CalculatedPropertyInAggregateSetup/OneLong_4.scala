package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneLong_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneLong: Long,
    private var _calculatedOneLong: Long,
    private var _persistedOneLong: Long
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneLong_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneLong_4("+ URI +")"

   def copy(oneLong: Long = this._oneLong): OneLong_4 = {

    new OneLong_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneLong = oneLong, _calculatedOneLong = _calculatedOneLong, _persistedOneLong = _persistedOneLong)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneLong_4): this.type = {
    this._URI = result._URI
    this._oneLong = result._oneLong
    this._calculatedOneLong = result._calculatedOneLong
    this._persistedOneLong = result._persistedOneLong
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneLong_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneLong")
  def oneLong = {
    _oneLong
  }

  def oneLong_= (value: Long) {
    _oneLong = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneLong")
  def calculatedOneLong = {
    _calculatedOneLong
  }

  def calculatedOneLong_= (value: Long) {
    _calculatedOneLong = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneLong")
  def persistedOneLong = {
    _persistedOneLong
  }

  def persistedOneLong_= (value: Long) {
    _persistedOneLong = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLong") oneLong: Long
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneLong") calculatedOneLong: Long
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneLong") persistedOneLong: Long
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneLong = oneLong, _calculatedOneLong = calculatedOneLong, _persistedOneLong = persistedOneLong)

}

object OneLong_4 extends AggregateRootCompanion[OneLong_4]{

  def apply(
    oneLong: Long = 0
  ) = {
    new OneLong_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneLong = oneLong
    , _calculatedOneLong = 0
    , _persistedOneLong = 0)
  }

}
