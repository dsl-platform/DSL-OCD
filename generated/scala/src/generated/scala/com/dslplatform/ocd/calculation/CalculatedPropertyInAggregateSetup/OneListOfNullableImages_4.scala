package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableImages_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]],
    private var _calculatedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]],
    private var _persistedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableImages_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableImages_4("+ URI +")"

   def copy(oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = this._oneListOfNullableImages): OneListOfNullableImages_4 = {

  require(oneListOfNullableImages ne null, "Null value was provided for property \"oneListOfNullableImages\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableImages)
    new OneListOfNullableImages_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableImages = oneListOfNullableImages, _calculatedOneListOfNullableImages = _calculatedOneListOfNullableImages, _persistedOneListOfNullableImages = _persistedOneListOfNullableImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableImages_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableImages = result._oneListOfNullableImages
    this._calculatedOneListOfNullableImages = result._calculatedOneListOfNullableImages
    this._persistedOneListOfNullableImages = result._persistedOneListOfNullableImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableImages_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableImages = {
    _oneListOfNullableImages
  }

  def oneListOfNullableImages_= (value: IndexedSeq[Option[java.awt.image.BufferedImage]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableImages")
  def calculatedOneListOfNullableImages = {
    _calculatedOneListOfNullableImages
  }

  def calculatedOneListOfNullableImages_= (value: IndexedSeq[Option[java.awt.image.BufferedImage]]) {
    _calculatedOneListOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableImages")
  def persistedOneListOfNullableImages = {
    _persistedOneListOfNullableImages
  }

  def persistedOneListOfNullableImages_= (value: IndexedSeq[Option[java.awt.image.BufferedImage]]) {
    _persistedOneListOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableImages") oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableImages") calculatedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableImages") persistedOneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableImages = if (oneListOfNullableImages == null) IndexedSeq.empty else oneListOfNullableImages, _calculatedOneListOfNullableImages = calculatedOneListOfNullableImages, _persistedOneListOfNullableImages = persistedOneListOfNullableImages)

}

object OneListOfNullableImages_4 extends AggregateRootCompanion[OneListOfNullableImages_4]{

  def apply(
    oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableImages)
    require(oneListOfNullableImages ne null, "Null value was provided for property \"oneListOfNullableImages\"")
    new OneListOfNullableImages_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableImages = oneListOfNullableImages
    , _calculatedOneListOfNullableImages = IndexedSeq.empty
    , _persistedOneListOfNullableImages = IndexedSeq.empty)
  }

}
