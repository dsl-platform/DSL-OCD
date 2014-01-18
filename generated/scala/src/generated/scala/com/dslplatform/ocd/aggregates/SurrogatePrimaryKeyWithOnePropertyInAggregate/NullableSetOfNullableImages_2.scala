package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableImages_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableImages_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableImages_2("+ URI +")"

   def copy(nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]] = this._nullableSetOfNullableImages): NullableSetOfNullableImages_2 = {

  require(nullableSetOfNullableImages ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
  if(nullableSetOfNullableImages.isDefined) require(nullableSetOfNullableImages.get ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableImages)
    new NullableSetOfNullableImages_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableImages = nullableSetOfNullableImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableImages_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableImages = result._nullableSetOfNullableImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableImages_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableSetOfNullableImages")
  def nullableSetOfNullableImages = {
    _nullableSetOfNullableImages
  }

  def nullableSetOfNullableImages_= (value: Option[Set[Option[java.awt.image.BufferedImage]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableImages") nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableImages = nullableSetOfNullableImages)

}

object NullableSetOfNullableImages_2 extends AggregateRootCompanion[NullableSetOfNullableImages_2]{

  def apply(
    nullableSetOfNullableImages: Option[Set[Option[java.awt.image.BufferedImage]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableImages)
    require(nullableSetOfNullableImages ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
    if (nullableSetOfNullableImages.isDefined) require(nullableSetOfNullableImages.get ne null, "Null value was provided for property \"nullableSetOfNullableImages\"")
    new NullableSetOfNullableImages_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableImages = nullableSetOfNullableImages)
  }

}
