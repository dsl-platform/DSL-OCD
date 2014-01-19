package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableDoubles_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableDoubles_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableDoubles_5("+ URI +")"

   def copy(nullableArrayOfNullableDoubles: Option[Array[Option[Double]]] = this._nullableArrayOfNullableDoubles): NullableArrayOfNullableDoubles_5 = {

  require(nullableArrayOfNullableDoubles ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
  if(nullableArrayOfNullableDoubles.isDefined) require(nullableArrayOfNullableDoubles.get ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableDoubles)
    new NullableArrayOfNullableDoubles_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableDoubles = nullableArrayOfNullableDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDoubles_5): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableDoubles = result._nullableArrayOfNullableDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDoubles_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDoubles")
  def nullableArrayOfNullableDoubles = {
    _nullableArrayOfNullableDoubles
  }

  def nullableArrayOfNullableDoubles_= (value: Option[Array[Option[Double]]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _nullableArrayOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDoubles") nullableArrayOfNullableDoubles: Option[Array[Option[Double]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableDoubles = nullableArrayOfNullableDoubles)

}

object NullableArrayOfNullableDoubles_5 extends AggregateRootCompanion[NullableArrayOfNullableDoubles_5]{

  def apply(
    nullableArrayOfNullableDoubles: Option[Array[Option[Double]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableDoubles)
    require(nullableArrayOfNullableDoubles ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
    if (nullableArrayOfNullableDoubles.isDefined) require(nullableArrayOfNullableDoubles.get ne null, "Null value was provided for property \"nullableArrayOfNullableDoubles\"")
    new NullableArrayOfNullableDoubles_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableDoubles = nullableArrayOfNullableDoubles)
  }

}
