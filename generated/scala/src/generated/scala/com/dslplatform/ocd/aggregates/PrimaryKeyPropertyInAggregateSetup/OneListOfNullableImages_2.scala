package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableImages_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableImages_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableImages_2("+ URI +")"

   def copy(oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = this._oneListOfNullableImages): OneListOfNullableImages_2 = {

  require(oneListOfNullableImages ne null, "Null value was provided for property \"oneListOfNullableImages\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableImages)
    new OneListOfNullableImages_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableImages = oneListOfNullableImages)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableImages_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableImages = result._oneListOfNullableImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableImages_2](URI), duration)
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

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableImages") oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableImages = if (oneListOfNullableImages == null) IndexedSeq.empty else oneListOfNullableImages)

}

object OneListOfNullableImages_2 extends AggregateRootCompanion[OneListOfNullableImages_2]{

  def apply(
    oneListOfNullableImages: IndexedSeq[Option[java.awt.image.BufferedImage]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableImages)
    require(oneListOfNullableImages ne null, "Null value was provided for property \"oneListOfNullableImages\"")
    new OneListOfNullableImages_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableImages = oneListOfNullableImages)
  }

}
