package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableDates_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableDates_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableDates_6("+ URI +")"

   def copy(oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]] = this._oneSetOfNullableDates): OneSetOfNullableDates_6 = {

  require(oneSetOfNullableDates ne null, "Null value was provided for property \"oneSetOfNullableDates\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDates)
    new OneSetOfNullableDates_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableDates = oneSetOfNullableDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableDates_6): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableDates = result._oneSetOfNullableDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableDates_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDates")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableDates = {
    _oneSetOfNullableDates
  }

  def oneSetOfNullableDates_= (value: Set[Option[org.joda.time.LocalDate]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDates") oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableDates = if (oneSetOfNullableDates == null) Set.empty else oneSetOfNullableDates)

}

object OneSetOfNullableDates_6 extends AggregateRootCompanion[OneSetOfNullableDates_6]{

  def apply(
    oneSetOfNullableDates: Set[Option[org.joda.time.LocalDate]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableDates)
    require(oneSetOfNullableDates ne null, "Null value was provided for property \"oneSetOfNullableDates\"")
    new OneSetOfNullableDates_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableDates = oneSetOfNullableDates)
  }

}
