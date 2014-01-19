package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneDecimals_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneDecimals_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneDecimals_5("+ URI +")"

   def copy(nullableArrayOfOneDecimals: Option[Array[BigDecimal]] = this._nullableArrayOfOneDecimals): NullableArrayOfOneDecimals_5 = {

  require(nullableArrayOfOneDecimals ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
  if(nullableArrayOfOneDecimals.isDefined) require(nullableArrayOfOneDecimals.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimals)
    new NullableArrayOfOneDecimals_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneDecimals = nullableArrayOfOneDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneDecimals_5): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneDecimals = result._nullableArrayOfOneDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneDecimals_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimals")
  def nullableArrayOfOneDecimals = {
    _nullableArrayOfOneDecimals
  }

  def nullableArrayOfOneDecimals_= (value: Option[Array[BigDecimal]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDecimals") nullableArrayOfOneDecimals: Option[Array[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneDecimals = nullableArrayOfOneDecimals)

}

object NullableArrayOfOneDecimals_5 extends AggregateRootCompanion[NullableArrayOfOneDecimals_5]{

  def apply(
    nullableArrayOfOneDecimals: Option[Array[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDecimals)
    require(nullableArrayOfOneDecimals ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
    if (nullableArrayOfOneDecimals.isDefined) require(nullableArrayOfOneDecimals.get ne null, "Null value was provided for property \"nullableArrayOfOneDecimals\"")
    new NullableArrayOfOneDecimals_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneDecimals = nullableArrayOfOneDecimals)
  }

}