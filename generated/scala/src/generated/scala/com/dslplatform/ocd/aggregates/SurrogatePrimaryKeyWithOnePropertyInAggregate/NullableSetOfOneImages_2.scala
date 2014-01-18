package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneImages_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneImages_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneImages_2("+ URI +")"

   def copy(nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]] = this._nullableSetOfOneImages): NullableSetOfOneImages_2 = {

  require(nullableSetOfOneImages ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
  if(nullableSetOfOneImages.isDefined) require(nullableSetOfOneImages.get ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneImages)
    new NullableSetOfOneImages_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneImages = nullableSetOfOneImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneImages_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneImages = result._nullableSetOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneImages_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneImages")
  def nullableSetOfOneImages = {
    _nullableSetOfOneImages
  }

  def nullableSetOfOneImages_= (value: Option[Set[java.awt.image.BufferedImage]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneImages") nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneImages = nullableSetOfOneImages)

}

object NullableSetOfOneImages_2 extends AggregateRootCompanion[NullableSetOfOneImages_2]{

  def apply(
    nullableSetOfOneImages: Option[Set[java.awt.image.BufferedImage]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneImages)
    require(nullableSetOfOneImages ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
    if (nullableSetOfOneImages.isDefined) require(nullableSetOfOneImages.get ne null, "Null value was provided for property \"nullableSetOfOneImages\"")
    new NullableSetOfOneImages_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneImages = nullableSetOfOneImages)
  }

}
