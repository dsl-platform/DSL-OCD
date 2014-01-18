package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableImages_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableImages_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableImages_2("+ URI +")"

   def copy(oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]] = this._oneSetOfNullableImages): OneSetOfNullableImages_2 = {

  require(oneSetOfNullableImages ne null, "Null value was provided for property \"oneSetOfNullableImages\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableImages)
    new OneSetOfNullableImages_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableImages = oneSetOfNullableImages)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableImages_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableImages = result._oneSetOfNullableImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableImages_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableImages = {
    _oneSetOfNullableImages
  }

  def oneSetOfNullableImages_= (value: Set[Option[java.awt.image.BufferedImage]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableImages") oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableImages = if (oneSetOfNullableImages == null) Set.empty else oneSetOfNullableImages)

}

object OneSetOfNullableImages_2 extends AggregateRootCompanion[OneSetOfNullableImages_2]{

  def apply(
    oneSetOfNullableImages: Set[Option[java.awt.image.BufferedImage]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableImages)
    require(oneSetOfNullableImages ne null, "Null value was provided for property \"oneSetOfNullableImages\"")
    new OneSetOfNullableImages_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableImages = oneSetOfNullableImages)
  }

}
