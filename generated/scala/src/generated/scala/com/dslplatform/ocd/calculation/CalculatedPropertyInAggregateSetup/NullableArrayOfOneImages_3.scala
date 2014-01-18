package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneImages_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]],
    private var _calculatedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]],
    private var _persistedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneImages_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneImages_3("+ URI +")"

   def copy(nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]] = this._nullableArrayOfOneImages): NullableArrayOfOneImages_3 = {

  require(nullableArrayOfOneImages ne null, "Null value was provided for property \"nullableArrayOfOneImages\"")
  if(nullableArrayOfOneImages.isDefined) require(nullableArrayOfOneImages.get ne null, "Null value was provided for property \"nullableArrayOfOneImages\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneImages)
    new NullableArrayOfOneImages_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneImages = nullableArrayOfOneImages, _calculatedNullableArrayOfOneImages = _calculatedNullableArrayOfOneImages, _persistedNullableArrayOfOneImages = _persistedNullableArrayOfOneImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneImages_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneImages = result._nullableArrayOfOneImages
    this._calculatedNullableArrayOfOneImages = result._calculatedNullableArrayOfOneImages
    this._persistedNullableArrayOfOneImages = result._persistedNullableArrayOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneImages_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneImages")
  def nullableArrayOfOneImages = {
    _nullableArrayOfOneImages
  }

  def nullableArrayOfOneImages_= (value: Option[Array[java.awt.image.BufferedImage]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneImages")
  def calculatedNullableArrayOfOneImages = {
    _calculatedNullableArrayOfOneImages
  }

  def calculatedNullableArrayOfOneImages_= (value: Option[Array[java.awt.image.BufferedImage]]) {
    _calculatedNullableArrayOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneImages")
  def persistedNullableArrayOfOneImages = {
    _persistedNullableArrayOfOneImages
  }

  def persistedNullableArrayOfOneImages_= (value: Option[Array[java.awt.image.BufferedImage]]) {
    _persistedNullableArrayOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneImages") nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneImages") calculatedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneImages") persistedNullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneImages = nullableArrayOfOneImages, _calculatedNullableArrayOfOneImages = calculatedNullableArrayOfOneImages, _persistedNullableArrayOfOneImages = persistedNullableArrayOfOneImages)

}

object NullableArrayOfOneImages_3 extends AggregateRootCompanion[NullableArrayOfOneImages_3]{

  def apply(
    nullableArrayOfOneImages: Option[Array[java.awt.image.BufferedImage]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneImages)
    require(nullableArrayOfOneImages ne null, "Null value was provided for property \"nullableArrayOfOneImages\"")
    if (nullableArrayOfOneImages.isDefined) require(nullableArrayOfOneImages.get ne null, "Null value was provided for property \"nullableArrayOfOneImages\"")
    new NullableArrayOfOneImages_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneImages = nullableArrayOfOneImages
    , _calculatedNullableArrayOfOneImages = None
    , _persistedNullableArrayOfOneImages = None)
  }

}
