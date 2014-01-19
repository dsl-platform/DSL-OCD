package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableDecimals_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableDecimals_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableDecimals_5("+ URI +")"

   def copy(nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]] = this._nullableListOfNullableDecimals): NullableListOfNullableDecimals_5 = {

  require(nullableListOfNullableDecimals ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
  if(nullableListOfNullableDecimals.isDefined) require(nullableListOfNullableDecimals.get ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDecimals)
    new NullableListOfNullableDecimals_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableDecimals = nullableListOfNullableDecimals)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDecimals_5): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableDecimals = result._nullableListOfNullableDecimals
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDecimals_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDecimals")
  def nullableListOfNullableDecimals = {
    _nullableListOfNullableDecimals
  }

  def nullableListOfNullableDecimals_= (value: Option[IndexedSeq[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableDecimals = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDecimals") nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableDecimals = nullableListOfNullableDecimals)

}

object NullableListOfNullableDecimals_5 extends AggregateRootCompanion[NullableListOfNullableDecimals_5]{

  def apply(
    nullableListOfNullableDecimals: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDecimals)
    require(nullableListOfNullableDecimals ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
    if (nullableListOfNullableDecimals.isDefined) require(nullableListOfNullableDecimals.get ne null, "Null value was provided for property \"nullableListOfNullableDecimals\"")
    new NullableListOfNullableDecimals_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableDecimals = nullableListOfNullableDecimals)
  }

}
