package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneStrings_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneStrings: Option[Set[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneStrings_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneStrings_5("+ URI +")"

   def copy(nullableSetOfOneStrings: Option[Set[String]] = this._nullableSetOfOneStrings): NullableSetOfOneStrings_5 = {

  require(nullableSetOfOneStrings ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
  if(nullableSetOfOneStrings.isDefined) require(nullableSetOfOneStrings.get ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStrings)
    new NullableSetOfOneStrings_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneStrings = nullableSetOfOneStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneStrings_5): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneStrings = result._nullableSetOfOneStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneStrings_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStrings")
  def nullableSetOfOneStrings = {
    _nullableSetOfOneStrings
  }

  def nullableSetOfOneStrings_= (value: Option[Set[String]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStrings") nullableSetOfOneStrings: Option[Set[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneStrings = nullableSetOfOneStrings)

}

object NullableSetOfOneStrings_5 extends AggregateRootCompanion[NullableSetOfOneStrings_5]{

  def apply(
    nullableSetOfOneStrings: Option[Set[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStrings)
    require(nullableSetOfOneStrings ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
    if (nullableSetOfOneStrings.isDefined) require(nullableSetOfOneStrings.get ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
    new NullableSetOfOneStrings_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneStrings = nullableSetOfOneStrings)
  }

}
