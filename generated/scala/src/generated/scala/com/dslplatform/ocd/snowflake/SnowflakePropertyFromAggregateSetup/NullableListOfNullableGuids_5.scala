package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableGuids_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableGuids_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableGuids_5("+ URI +")"

   def copy(nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]] = this._nullableListOfNullableGuids): NullableListOfNullableGuids_5 = {

  require(nullableListOfNullableGuids ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
  if(nullableListOfNullableGuids.isDefined) require(nullableListOfNullableGuids.get ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableGuids)
    new NullableListOfNullableGuids_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableGuids = nullableListOfNullableGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableGuids_5): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableGuids = result._nullableListOfNullableGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableGuids_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableGuids")
  def nullableListOfNullableGuids = {
    _nullableListOfNullableGuids
  }

  def nullableListOfNullableGuids_= (value: Option[IndexedSeq[Option[java.util.UUID]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableGuids") nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableGuids = nullableListOfNullableGuids)

}

object NullableListOfNullableGuids_5 extends AggregateRootCompanion[NullableListOfNullableGuids_5]{

  def apply(
    nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableGuids)
    require(nullableListOfNullableGuids ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
    if (nullableListOfNullableGuids.isDefined) require(nullableListOfNullableGuids.get ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
    new NullableListOfNullableGuids_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableGuids = nullableListOfNullableGuids)
  }

}
