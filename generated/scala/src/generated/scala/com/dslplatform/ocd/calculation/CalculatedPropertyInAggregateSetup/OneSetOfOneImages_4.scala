package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneImages: Set[java.awt.image.BufferedImage],
    private var _calculatedOneSetOfOneImages: Set[java.awt.image.BufferedImage],
    private var _persistedOneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneImages_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneImages_4("+ URI +")"

   def copy(oneSetOfOneImages: Set[java.awt.image.BufferedImage] = this._oneSetOfOneImages): OneSetOfOneImages_4 = {

  require(oneSetOfOneImages ne null, "Null value was provided for property \"oneSetOfOneImages\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneImages)
    new OneSetOfOneImages_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneImages = oneSetOfOneImages, _calculatedOneSetOfOneImages = _calculatedOneSetOfOneImages, _persistedOneSetOfOneImages = _persistedOneSetOfOneImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneImages_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneImages = result._oneSetOfOneImages
    this._calculatedOneSetOfOneImages = result._calculatedOneSetOfOneImages
    this._persistedOneSetOfOneImages = result._persistedOneSetOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneImages_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneImages = {
    _oneSetOfOneImages
  }

  def oneSetOfOneImages_= (value: Set[java.awt.image.BufferedImage]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneImages")
  def calculatedOneSetOfOneImages = {
    _calculatedOneSetOfOneImages
  }

  def calculatedOneSetOfOneImages_= (value: Set[java.awt.image.BufferedImage]) {
    _calculatedOneSetOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneImages")
  def persistedOneSetOfOneImages = {
    _persistedOneSetOfOneImages
  }

  def persistedOneSetOfOneImages_= (value: Set[java.awt.image.BufferedImage]) {
    _persistedOneSetOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneImages") oneSetOfOneImages: Set[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneImages") calculatedOneSetOfOneImages: Set[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneImages") persistedOneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneImages = if (oneSetOfOneImages == null) Set.empty else oneSetOfOneImages, _calculatedOneSetOfOneImages = calculatedOneSetOfOneImages, _persistedOneSetOfOneImages = persistedOneSetOfOneImages)

}

object OneSetOfOneImages_4 extends AggregateRootCompanion[OneSetOfOneImages_4]{

  def apply(
    oneSetOfOneImages: Set[java.awt.image.BufferedImage] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneImages)
    require(oneSetOfOneImages ne null, "Null value was provided for property \"oneSetOfOneImages\"")
    new OneSetOfOneImages_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneImages = oneSetOfOneImages
    , _calculatedOneSetOfOneImages = Set.empty
    , _persistedOneSetOfOneImages = Set.empty)
  }

}
