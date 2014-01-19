package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableTexts_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableTexts: Option[IndexedSeq[Option[String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableTexts_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableTexts_5("+ URI +")"

   def copy(nullableListOfNullableTexts: Option[IndexedSeq[Option[String]]] = this._nullableListOfNullableTexts): NullableListOfNullableTexts_5 = {

  require(nullableListOfNullableTexts ne null, "Null value was provided for property \"nullableListOfNullableTexts\"")
  if(nullableListOfNullableTexts.isDefined) require(nullableListOfNullableTexts.get ne null, "Null value was provided for property \"nullableListOfNullableTexts\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableTexts)
    new NullableListOfNullableTexts_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableTexts = nullableListOfNullableTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableTexts_5): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableTexts = result._nullableListOfNullableTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableTexts_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTexts")
  def nullableListOfNullableTexts = {
    _nullableListOfNullableTexts
  }

  def nullableListOfNullableTexts_= (value: Option[IndexedSeq[Option[String]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTexts") nullableListOfNullableTexts: Option[IndexedSeq[Option[String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableTexts = nullableListOfNullableTexts)

}

object NullableListOfNullableTexts_5 extends AggregateRootCompanion[NullableListOfNullableTexts_5]{

  def apply(
    nullableListOfNullableTexts: Option[IndexedSeq[Option[String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableTexts)
    require(nullableListOfNullableTexts ne null, "Null value was provided for property \"nullableListOfNullableTexts\"")
    if (nullableListOfNullableTexts.isDefined) require(nullableListOfNullableTexts.get ne null, "Null value was provided for property \"nullableListOfNullableTexts\"")
    new NullableListOfNullableTexts_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableTexts = nullableListOfNullableTexts)
  }

}
