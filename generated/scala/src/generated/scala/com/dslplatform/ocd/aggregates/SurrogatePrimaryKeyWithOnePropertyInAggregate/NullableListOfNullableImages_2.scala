package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableImages_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableImages_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableImages_2("+ URI +")"

   def copy(nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]] = this._nullableListOfNullableImages): NullableListOfNullableImages_2 = {

  require(nullableListOfNullableImages ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
  if(nullableListOfNullableImages.isDefined) require(nullableListOfNullableImages.get ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableImages)
    new NullableListOfNullableImages_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableImages = nullableListOfNullableImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableImages_2): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableImages = result._nullableListOfNullableImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableImages_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableImages")
  def nullableListOfNullableImages = {
    _nullableListOfNullableImages
  }

  def nullableListOfNullableImages_= (value: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableImages") nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableImages = nullableListOfNullableImages)

}

object NullableListOfNullableImages_2 extends AggregateRootCompanion[NullableListOfNullableImages_2]{

  def apply(
    nullableListOfNullableImages: Option[IndexedSeq[Option[java.awt.image.BufferedImage]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableImages)
    require(nullableListOfNullableImages ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
    if (nullableListOfNullableImages.isDefined) require(nullableListOfNullableImages.get ne null, "Null value was provided for property \"nullableListOfNullableImages\"")
    new NullableListOfNullableImages_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableImages = nullableListOfNullableImages)
  }

}
