package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableImages_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableImages_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableImages_2("+ URI +")"

   def copy(oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]] = this._oneArrayOfNullableImages): OneArrayOfNullableImages_2 = {

  require(oneArrayOfNullableImages ne null, "Null value was provided for property \"oneArrayOfNullableImages\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableImages)
    new OneArrayOfNullableImages_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableImages = oneArrayOfNullableImages)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableImages_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableImages = result._oneArrayOfNullableImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableImages_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfNullableImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableImages = {
    _oneArrayOfNullableImages
  }

  def oneArrayOfNullableImages_= (value: Array[Option[java.awt.image.BufferedImage]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableImages") oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableImages = if (oneArrayOfNullableImages == null) Array.empty else oneArrayOfNullableImages)

}

object OneArrayOfNullableImages_2 extends AggregateRootCompanion[OneArrayOfNullableImages_2]{

  def apply(
    oneArrayOfNullableImages: Array[Option[java.awt.image.BufferedImage]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableImages)
    require(oneArrayOfNullableImages ne null, "Null value was provided for property \"oneArrayOfNullableImages\"")
    new OneArrayOfNullableImages_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableImages = oneArrayOfNullableImages)
  }

}
