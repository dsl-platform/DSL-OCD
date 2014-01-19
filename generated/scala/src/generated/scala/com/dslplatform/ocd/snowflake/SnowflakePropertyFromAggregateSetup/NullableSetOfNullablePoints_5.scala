package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullablePoints_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullablePoints_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullablePoints_5("+ URI +")"

   def copy(nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]] = this._nullableSetOfNullablePoints): NullableSetOfNullablePoints_5 = {

  require(nullableSetOfNullablePoints ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
  if(nullableSetOfNullablePoints.isDefined) require(nullableSetOfNullablePoints.get ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullablePoints)
    new NullableSetOfNullablePoints_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullablePoints = nullableSetOfNullablePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullablePoints_5): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullablePoints = result._nullableSetOfNullablePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullablePoints_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullablePoints")
  def nullableSetOfNullablePoints = {
    _nullableSetOfNullablePoints
  }

  def nullableSetOfNullablePoints_= (value: Option[Set[Option[java.awt.geom.Point2D]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullablePoints") nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullablePoints = nullableSetOfNullablePoints)

}

object NullableSetOfNullablePoints_5 extends AggregateRootCompanion[NullableSetOfNullablePoints_5]{

  def apply(
    nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullablePoints)
    require(nullableSetOfNullablePoints ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
    if (nullableSetOfNullablePoints.isDefined) require(nullableSetOfNullablePoints.get ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
    new NullableSetOfNullablePoints_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullablePoints = nullableSetOfNullablePoints)
  }

}
