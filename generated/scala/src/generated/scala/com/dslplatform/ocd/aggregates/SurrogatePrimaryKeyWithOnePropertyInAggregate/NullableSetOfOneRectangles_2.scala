package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneRectangles_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneRectangles_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneRectangles_2("+ URI +")"

   def copy(nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]] = this._nullableSetOfOneRectangles): NullableSetOfOneRectangles_2 = {

  require(nullableSetOfOneRectangles ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
  if(nullableSetOfOneRectangles.isDefined) require(nullableSetOfOneRectangles.get ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneRectangles)
    new NullableSetOfOneRectangles_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneRectangles = nullableSetOfOneRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneRectangles_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneRectangles = result._nullableSetOfOneRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneRectangles_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneRectangles")
  def nullableSetOfOneRectangles = {
    _nullableSetOfOneRectangles
  }

  def nullableSetOfOneRectangles_= (value: Option[Set[java.awt.geom.Rectangle2D]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneRectangles") nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneRectangles = nullableSetOfOneRectangles)

}

object NullableSetOfOneRectangles_2 extends AggregateRootCompanion[NullableSetOfOneRectangles_2]{

  def apply(
    nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneRectangles)
    require(nullableSetOfOneRectangles ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
    if (nullableSetOfOneRectangles.isDefined) require(nullableSetOfOneRectangles.get ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
    new NullableSetOfOneRectangles_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneRectangles = nullableSetOfOneRectangles)
  }

}
