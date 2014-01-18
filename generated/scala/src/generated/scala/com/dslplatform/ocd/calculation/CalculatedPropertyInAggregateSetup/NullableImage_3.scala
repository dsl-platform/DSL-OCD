package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableImage_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableImage: Option[java.awt.image.BufferedImage],
    private var _calculatedNullableImage: Option[java.awt.image.BufferedImage],
    private var _persistedNullableImage: Option[java.awt.image.BufferedImage]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableImage_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableImage_3("+ URI +")"

   def copy(nullableImage: Option[java.awt.image.BufferedImage] = this._nullableImage): NullableImage_3 = {

  require(nullableImage ne null, "Null value was provided for property \"nullableImage\"")
  if(nullableImage.isDefined) require(nullableImage.get ne null, "Null value was provided for property \"nullableImage\"")
    new NullableImage_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableImage = nullableImage, _calculatedNullableImage = _calculatedNullableImage, _persistedNullableImage = _persistedNullableImage)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableImage_3): this.type = {
    this._URI = result._URI
    this._nullableImage = result._nullableImage
    this._calculatedNullableImage = result._calculatedNullableImage
    this._persistedNullableImage = result._persistedNullableImage
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableImage_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableImage")
  def nullableImage = {
    _nullableImage
  }

  def nullableImage_= (value: Option[java.awt.image.BufferedImage]) {
    _nullableImage = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableImage")
  def calculatedNullableImage = {
    _calculatedNullableImage
  }

  def calculatedNullableImage_= (value: Option[java.awt.image.BufferedImage]) {
    _calculatedNullableImage = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableImage")
  def persistedNullableImage = {
    _persistedNullableImage
  }

  def persistedNullableImage_= (value: Option[java.awt.image.BufferedImage]) {
    _persistedNullableImage = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableImage") nullableImage: Option[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableImage") calculatedNullableImage: Option[java.awt.image.BufferedImage]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableImage") persistedNullableImage: Option[java.awt.image.BufferedImage]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableImage = nullableImage, _calculatedNullableImage = calculatedNullableImage, _persistedNullableImage = persistedNullableImage)

}

object NullableImage_3 extends AggregateRootCompanion[NullableImage_3]{

  def apply(
    nullableImage: Option[java.awt.image.BufferedImage] = None
  ) = {
    require(nullableImage ne null, "Null value was provided for property \"nullableImage\"")
    if (nullableImage.isDefined) require(nullableImage.get ne null, "Null value was provided for property \"nullableImage\"")
    new NullableImage_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableImage = nullableImage
    , _calculatedNullableImage = None
    , _persistedNullableImage = None)
  }

}
