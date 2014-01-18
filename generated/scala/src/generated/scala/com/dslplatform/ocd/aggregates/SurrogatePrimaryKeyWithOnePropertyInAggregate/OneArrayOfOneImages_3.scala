package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneImages_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneImages_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneImages_3("+ URI +")"

   def copy(oneArrayOfOneImages: Array[java.awt.image.BufferedImage] = this._oneArrayOfOneImages): OneArrayOfOneImages_3 = {

  require(oneArrayOfOneImages ne null, "Null value was provided for property \"oneArrayOfOneImages\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneImages)
    new OneArrayOfOneImages_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneImages = oneArrayOfOneImages)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneImages_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneImages = result._oneArrayOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneImages_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfOneImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneImages = {
    _oneArrayOfOneImages
  }

  def oneArrayOfOneImages_= (value: Array[java.awt.image.BufferedImage]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneImages") oneArrayOfOneImages: Array[java.awt.image.BufferedImage]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneImages = if (oneArrayOfOneImages == null) Array.empty else oneArrayOfOneImages)

}

object OneArrayOfOneImages_3 extends AggregateRootCompanion[OneArrayOfOneImages_3]{

  def apply(
    oneArrayOfOneImages: Array[java.awt.image.BufferedImage] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneImages)
    require(oneArrayOfOneImages ne null, "Null value was provided for property \"oneArrayOfOneImages\"")
    new OneArrayOfOneImages_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneImages = oneArrayOfOneImages)
  }

}
