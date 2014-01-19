package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneRectangles_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneRectangles_5 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneRectangles_5("+ URI +")"

   def copy(oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D] = this._oneArrayOfOneRectangles): OneArrayOfOneRectangles_5 = {

  require(oneArrayOfOneRectangles ne null, "Null value was provided for property \"oneArrayOfOneRectangles\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneRectangles)
    new OneArrayOfOneRectangles_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneRectangles = oneArrayOfOneRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneRectangles_5): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneRectangles = result._oneArrayOfOneRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneRectangles_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneRectangles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneRectangles = {
    _oneArrayOfOneRectangles
  }

  def oneArrayOfOneRectangles_= (value: Array[java.awt.geom.Rectangle2D]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneRectangles") oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneRectangles = if (oneArrayOfOneRectangles == null) Array.empty else oneArrayOfOneRectangles)

}

object OneArrayOfOneRectangles_5 extends AggregateRootCompanion[OneArrayOfOneRectangles_5]{

  def apply(
    oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneRectangles)
    require(oneArrayOfOneRectangles ne null, "Null value was provided for property \"oneArrayOfOneRectangles\"")
    new OneArrayOfOneRectangles_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneRectangles = oneArrayOfOneRectangles)
  }

}
