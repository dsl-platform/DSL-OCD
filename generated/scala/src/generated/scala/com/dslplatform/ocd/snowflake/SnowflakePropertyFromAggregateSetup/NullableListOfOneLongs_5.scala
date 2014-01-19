package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneLongs_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneLongs: Option[IndexedSeq[Long]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneLongs_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneLongs_5("+ URI +")"

   def copy(nullableListOfOneLongs: Option[IndexedSeq[Long]] = this._nullableListOfOneLongs): NullableListOfOneLongs_5 = {

  require(nullableListOfOneLongs ne null, "Null value was provided for property \"nullableListOfOneLongs\"")
  if(nullableListOfOneLongs.isDefined) require(nullableListOfOneLongs.get ne null, "Null value was provided for property \"nullableListOfOneLongs\"")
    new NullableListOfOneLongs_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneLongs = nullableListOfOneLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneLongs_5): this.type = {
    this._URI = result._URI
    this._nullableListOfOneLongs = result._nullableListOfOneLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneLongs_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLongs")
  def nullableListOfOneLongs = {
    _nullableListOfOneLongs
  }

  def nullableListOfOneLongs_= (value: Option[IndexedSeq[Long]]) {
    _nullableListOfOneLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLongs") nullableListOfOneLongs: Option[IndexedSeq[Long]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneLongs = nullableListOfOneLongs)

}

object NullableListOfOneLongs_5 extends AggregateRootCompanion[NullableListOfOneLongs_5]{

  def apply(
    nullableListOfOneLongs: Option[IndexedSeq[Long]] = None
  ) = {
    require(nullableListOfOneLongs ne null, "Null value was provided for property \"nullableListOfOneLongs\"")
    if (nullableListOfOneLongs.isDefined) require(nullableListOfOneLongs.get ne null, "Null value was provided for property \"nullableListOfOneLongs\"")
    new NullableListOfOneLongs_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneLongs = nullableListOfOneLongs)
  }

}
