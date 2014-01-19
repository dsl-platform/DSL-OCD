package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableLong_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableLong: Option[Long]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableLong_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableLong_5("+ URI +")"

   def copy(nullableLong: Option[Long] = this._nullableLong): NullableLong_5 = {

  require(nullableLong ne null, "Null value was provided for property \"nullableLong\"")
    new NullableLong_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableLong = nullableLong)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableLong_5): this.type = {
    this._URI = result._URI
    this._nullableLong = result._nullableLong
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableLong_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableLong")
  def nullableLong = {
    _nullableLong
  }

  def nullableLong_= (value: Option[Long]) {
    _nullableLong = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableLong") nullableLong: Option[Long]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableLong = nullableLong)

}

object NullableLong_5 extends AggregateRootCompanion[NullableLong_5]{

  def apply(
    nullableLong: Option[Long] = None
  ) = {
    require(nullableLong ne null, "Null value was provided for property \"nullableLong\"")
    new NullableLong_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableLong = nullableLong)
  }

}
