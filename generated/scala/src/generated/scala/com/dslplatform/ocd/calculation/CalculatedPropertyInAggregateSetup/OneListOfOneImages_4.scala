package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage],
    private var _calculatedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage],
    private var _persistedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneImages_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneImages_4("+ URI +")"

   def copy(oneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage] = this._oneListOfOneImages): OneListOfOneImages_4 = {

  require(oneListOfOneImages ne null, "Null value was provided for property \"oneListOfOneImages\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneImages)
    new OneListOfOneImages_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneImages = oneListOfOneImages, _calculatedOneListOfOneImages = _calculatedOneListOfOneImages, _persistedOneListOfOneImages = _persistedOneListOfOneImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneImages_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneImages = result._oneListOfOneImages
    this._calculatedOneListOfOneImages = result._calculatedOneListOfOneImages
    this._persistedOneListOfOneImages = result._persistedOneListOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneImages_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneImages = {
    _oneListOfOneImages
  }

  def oneListOfOneImages_= (value: IndexedSeq[java.awt.image.BufferedImage]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneImages")
  def calculatedOneListOfOneImages = {
    _calculatedOneListOfOneImages
  }

  def calculatedOneListOfOneImages_= (value: IndexedSeq[java.awt.image.BufferedImage]) {
    _calculatedOneListOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneImages")
  def persistedOneListOfOneImages = {
    _persistedOneListOfOneImages
  }

  def persistedOneListOfOneImages_= (value: IndexedSeq[java.awt.image.BufferedImage]) {
    _persistedOneListOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneImages") oneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneImages") calculatedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneImages") persistedOneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneImages = if (oneListOfOneImages == null) IndexedSeq.empty else oneListOfOneImages, _calculatedOneListOfOneImages = calculatedOneListOfOneImages, _persistedOneListOfOneImages = persistedOneListOfOneImages)

}

object OneListOfOneImages_4 extends AggregateRootCompanion[OneListOfOneImages_4]{

  def apply(
    oneListOfOneImages: IndexedSeq[java.awt.image.BufferedImage] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneImages)
    require(oneListOfOneImages ne null, "Null value was provided for property \"oneListOfOneImages\"")
    new OneListOfOneImages_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneImages = oneListOfOneImages
    , _calculatedOneListOfOneImages = IndexedSeq.empty
    , _persistedOneListOfOneImages = IndexedSeq.empty)
  }

}
