package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneImages: Array[java.awt.image.BufferedImage],
    private var _calculatedOneArrayOfOneImages: Array[java.awt.image.BufferedImage],
    private var _persistedOneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneImages_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneImages_4("+ URI +")"

   def copy(oneArrayOfOneImages: Array[java.awt.image.BufferedImage] = this._oneArrayOfOneImages): OneArrayOfOneImages_4 = {

  require(oneArrayOfOneImages ne null, "Null value was provided for property \"oneArrayOfOneImages\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneImages)
    new OneArrayOfOneImages_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneImages = oneArrayOfOneImages, _calculatedOneArrayOfOneImages = _calculatedOneArrayOfOneImages, _persistedOneArrayOfOneImages = _persistedOneArrayOfOneImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneImages_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneImages = result._oneArrayOfOneImages
    this._calculatedOneArrayOfOneImages = result._calculatedOneArrayOfOneImages
    this._persistedOneArrayOfOneImages = result._persistedOneArrayOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneImages_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneImages = {
    _oneArrayOfOneImages
  }

  def oneArrayOfOneImages_= (value: Array[java.awt.image.BufferedImage]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneImages")
  def calculatedOneArrayOfOneImages = {
    _calculatedOneArrayOfOneImages
  }

  def calculatedOneArrayOfOneImages_= (value: Array[java.awt.image.BufferedImage]) {
    _calculatedOneArrayOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneImages")
  def persistedOneArrayOfOneImages = {
    _persistedOneArrayOfOneImages
  }

  def persistedOneArrayOfOneImages_= (value: Array[java.awt.image.BufferedImage]) {
    _persistedOneArrayOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneImages") oneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneImages") calculatedOneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneImages") persistedOneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneImages = if (oneArrayOfOneImages == null) Array.empty else oneArrayOfOneImages, _calculatedOneArrayOfOneImages = calculatedOneArrayOfOneImages, _persistedOneArrayOfOneImages = persistedOneArrayOfOneImages)

}

object OneArrayOfOneImages_4 extends AggregateRootCompanion[OneArrayOfOneImages_4]{

  def apply(
    oneArrayOfOneImages: Array[java.awt.image.BufferedImage] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneImages)
    require(oneArrayOfOneImages ne null, "Null value was provided for property \"oneArrayOfOneImages\"")
    new OneArrayOfOneImages_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneImages = oneArrayOfOneImages
    , _calculatedOneArrayOfOneImages = Array.empty
    , _persistedOneArrayOfOneImages = Array.empty)
  }

}
