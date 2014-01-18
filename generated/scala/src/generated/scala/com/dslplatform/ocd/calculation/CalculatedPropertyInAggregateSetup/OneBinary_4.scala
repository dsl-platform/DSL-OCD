package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneBinary_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneBinary: Array[Byte],
    private var _calculatedOneBinary: Array[Byte],
    private var _persistedOneBinary: Array[Byte]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneBinary_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneBinary_4("+ URI +")"

   def copy(oneBinary: Array[Byte] = this._oneBinary): OneBinary_4 = {

  require(oneBinary ne null, "Null value was provided for property \"oneBinary\"")
    new OneBinary_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneBinary = oneBinary, _calculatedOneBinary = _calculatedOneBinary, _persistedOneBinary = _persistedOneBinary)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneBinary_4): this.type = {
    this._URI = result._URI
    this._oneBinary = result._oneBinary
    this._calculatedOneBinary = result._calculatedOneBinary
    this._persistedOneBinary = result._persistedOneBinary
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneBinary_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneBinary")
  def oneBinary = {
    _oneBinary
  }

  def oneBinary_= (value: Array[Byte]) {
    _oneBinary = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneBinary")
  def calculatedOneBinary = {
    _calculatedOneBinary
  }

  def calculatedOneBinary_= (value: Array[Byte]) {
    _calculatedOneBinary = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneBinary")
  def persistedOneBinary = {
    _persistedOneBinary
  }

  def persistedOneBinary_= (value: Array[Byte]) {
    _persistedOneBinary = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBinary") oneBinary: Array[Byte]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneBinary") calculatedOneBinary: Array[Byte]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneBinary") persistedOneBinary: Array[Byte]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary, _calculatedOneBinary = if (calculatedOneBinary == null) Array[Byte]() else calculatedOneBinary, _persistedOneBinary = if (persistedOneBinary == null) Array[Byte]() else persistedOneBinary)

}

object OneBinary_4 extends AggregateRootCompanion[OneBinary_4]{

  def apply(
    oneBinary: Array[Byte] = Array[Byte]()
  ) = {
    require(oneBinary ne null, "Null value was provided for property \"oneBinary\"")
    new OneBinary_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneBinary = oneBinary
    , _calculatedOneBinary = Array[Byte]()
    , _persistedOneBinary = Array[Byte]())
  }

}
