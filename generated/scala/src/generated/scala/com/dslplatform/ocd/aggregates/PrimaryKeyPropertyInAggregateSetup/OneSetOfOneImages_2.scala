package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneImages_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneImages_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneImages_2("+ URI +")"

   def copy(oneSetOfOneImages: Set[java.awt.image.BufferedImage] = this._oneSetOfOneImages): OneSetOfOneImages_2 = {

  require(oneSetOfOneImages ne null, "Null value was provided for property \"oneSetOfOneImages\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneImages)
    new OneSetOfOneImages_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneImages = oneSetOfOneImages)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneImages_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneImages = result._oneSetOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneImages_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneImages")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneImages = {
    _oneSetOfOneImages
  }

  def oneSetOfOneImages_= (value: Set[java.awt.image.BufferedImage]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneImages") oneSetOfOneImages: Set[java.awt.image.BufferedImage]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneImages = if (oneSetOfOneImages == null) Set.empty else oneSetOfOneImages)

}

object OneSetOfOneImages_2 extends AggregateRootCompanion[OneSetOfOneImages_2]{

  def apply(
    oneSetOfOneImages: Set[java.awt.image.BufferedImage] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneImages)
    require(oneSetOfOneImages ne null, "Null value was provided for property \"oneSetOfOneImages\"")
    new OneSetOfOneImages_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneImages = oneSetOfOneImages)
  }

}
