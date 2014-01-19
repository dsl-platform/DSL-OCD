package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneFloats_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneFloats: Option[Array[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneFloats_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneFloats_5("+ URI +")"

   def copy(nullableArrayOfOneFloats: Option[Array[Float]] = this._nullableArrayOfOneFloats): NullableArrayOfOneFloats_5 = {

  require(nullableArrayOfOneFloats ne null, "Null value was provided for property \"nullableArrayOfOneFloats\"")
  if(nullableArrayOfOneFloats.isDefined) require(nullableArrayOfOneFloats.get ne null, "Null value was provided for property \"nullableArrayOfOneFloats\"")
    new NullableArrayOfOneFloats_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneFloats = nullableArrayOfOneFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneFloats_5): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneFloats = result._nullableArrayOfOneFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneFloats_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneFloats")
  def nullableArrayOfOneFloats = {
    _nullableArrayOfOneFloats
  }

  def nullableArrayOfOneFloats_= (value: Option[Array[Float]]) {
    _nullableArrayOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneFloats") nullableArrayOfOneFloats: Option[Array[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneFloats = nullableArrayOfOneFloats)

}

object NullableArrayOfOneFloats_5 extends AggregateRootCompanion[NullableArrayOfOneFloats_5]{

  def apply(
    nullableArrayOfOneFloats: Option[Array[Float]] = None
  ) = {
    require(nullableArrayOfOneFloats ne null, "Null value was provided for property \"nullableArrayOfOneFloats\"")
    if (nullableArrayOfOneFloats.isDefined) require(nullableArrayOfOneFloats.get ne null, "Null value was provided for property \"nullableArrayOfOneFloats\"")
    new NullableArrayOfOneFloats_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneFloats = nullableArrayOfOneFloats)
  }

}