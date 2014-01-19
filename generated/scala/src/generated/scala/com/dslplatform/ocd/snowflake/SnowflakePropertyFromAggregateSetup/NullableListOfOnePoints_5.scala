package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOnePoints_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOnePoints_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOnePoints_5("+ URI +")"

   def copy(nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]] = this._nullableListOfOnePoints): NullableListOfOnePoints_5 = {

  require(nullableListOfOnePoints ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
  if(nullableListOfOnePoints.isDefined) require(nullableListOfOnePoints.get ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOnePoints)
    new NullableListOfOnePoints_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOnePoints = nullableListOfOnePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOnePoints_5): this.type = {
    this._URI = result._URI
    this._nullableListOfOnePoints = result._nullableListOfOnePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOnePoints_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOnePoints")
  def nullableListOfOnePoints = {
    _nullableListOfOnePoints
  }

  def nullableListOfOnePoints_= (value: Option[IndexedSeq[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOnePoints") nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOnePoints = nullableListOfOnePoints)

}

object NullableListOfOnePoints_5 extends AggregateRootCompanion[NullableListOfOnePoints_5]{

  def apply(
    nullableListOfOnePoints: Option[IndexedSeq[java.awt.geom.Point2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOnePoints)
    require(nullableListOfOnePoints ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
    if (nullableListOfOnePoints.isDefined) require(nullableListOfOnePoints.get ne null, "Null value was provided for property \"nullableListOfOnePoints\"")
    new NullableListOfOnePoints_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOnePoints = nullableListOfOnePoints)
  }

}
