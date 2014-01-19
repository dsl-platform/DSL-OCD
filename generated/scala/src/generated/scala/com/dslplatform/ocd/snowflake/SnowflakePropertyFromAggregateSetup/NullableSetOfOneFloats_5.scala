package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneFloats_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneFloats: Option[Set[Float]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneFloats_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneFloats_5("+ URI +")"

   def copy(nullableSetOfOneFloats: Option[Set[Float]] = this._nullableSetOfOneFloats): NullableSetOfOneFloats_5 = {

  require(nullableSetOfOneFloats ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
  if(nullableSetOfOneFloats.isDefined) require(nullableSetOfOneFloats.get ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    new NullableSetOfOneFloats_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneFloats = nullableSetOfOneFloats)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneFloats_5): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneFloats = result._nullableSetOfOneFloats
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneFloats_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneFloats")
  def nullableSetOfOneFloats = {
    _nullableSetOfOneFloats
  }

  def nullableSetOfOneFloats_= (value: Option[Set[Float]]) {
    _nullableSetOfOneFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneFloats") nullableSetOfOneFloats: Option[Set[Float]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneFloats = nullableSetOfOneFloats)

}

object NullableSetOfOneFloats_5 extends AggregateRootCompanion[NullableSetOfOneFloats_5]{

  def apply(
    nullableSetOfOneFloats: Option[Set[Float]] = None
  ) = {
    require(nullableSetOfOneFloats ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    if (nullableSetOfOneFloats.isDefined) require(nullableSetOfOneFloats.get ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    new NullableSetOfOneFloats_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneFloats = nullableSetOfOneFloats)
  }

}
