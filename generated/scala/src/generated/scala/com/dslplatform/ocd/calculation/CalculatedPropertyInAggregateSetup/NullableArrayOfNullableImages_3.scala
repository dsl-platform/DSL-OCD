package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableImages_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]],
    private var _calculatedNullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]],
    private var _persistedNullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableImages_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableImages_3("+ URI +")"

   def copy(nullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]] = this._nullableArrayOfNullableImages): NullableArrayOfNullableImages_3 = {

  require(nullableArrayOfNullableImages ne null, "Null value was provided for property \"nullableArrayOfNullableImages\"")
  if(nullableArrayOfNullableImages.isDefined) require(nullableArrayOfNullableImages.get ne null, "Null value was provided for property \"nullableArrayOfNullableImages\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableImages)
    new NullableArrayOfNullableImages_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableImages = nullableArrayOfNullableImages, _calculatedNullableArrayOfNullableImages = _calculatedNullableArrayOfNullableImages, _persistedNullableArrayOfNullableImages = _persistedNullableArrayOfNullableImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableImages_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableImages = result._nullableArrayOfNullableImages
    this._calculatedNullableArrayOfNullableImages = result._calculatedNullableArrayOfNullableImages
    this._persistedNullableArrayOfNullableImages = result._persistedNullableArrayOfNullableImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableImages_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableImages")
  def nullableArrayOfNullableImages = {
    _nullableArrayOfNullableImages
  }

  def nullableArrayOfNullableImages_= (value: Option[Array[Option[java.awt.image.BufferedImage]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableImages")
  def calculatedNullableArrayOfNullableImages = {
    _calculatedNullableArrayOfNullableImages
  }

  def calculatedNullableArrayOfNullableImages_= (value: Option[Array[Option[java.awt.image.BufferedImage]]]) {
    _calculatedNullableArrayOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableImages")
  def persistedNullableArrayOfNullableImages = {
    _persistedNullableArrayOfNullableImages
  }

  def persistedNullableArrayOfNullableImages_= (value: Option[Array[Option[java.awt.image.BufferedImage]]]) {
    _persistedNullableArrayOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableImages") nullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableImages") calculatedNullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableImages") persistedNullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableImages = nullableArrayOfNullableImages, _calculatedNullableArrayOfNullableImages = calculatedNullableArrayOfNullableImages, _persistedNullableArrayOfNullableImages = persistedNullableArrayOfNullableImages)

}

object NullableArrayOfNullableImages_3 extends AggregateRootCompanion[NullableArrayOfNullableImages_3]{

  def apply(
    nullableArrayOfNullableImages: Option[Array[Option[java.awt.image.BufferedImage]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableImages)
    require(nullableArrayOfNullableImages ne null, "Null value was provided for property \"nullableArrayOfNullableImages\"")
    if (nullableArrayOfNullableImages.isDefined) require(nullableArrayOfNullableImages.get ne null, "Null value was provided for property \"nullableArrayOfNullableImages\"")
    new NullableArrayOfNullableImages_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableImages = nullableArrayOfNullableImages
    , _calculatedNullableArrayOfNullableImages = None
    , _persistedNullableArrayOfNullableImages = None)
  }

}
