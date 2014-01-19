package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableDoubles_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableDoubles: IndexedSeq[Option[Double]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableDoubles_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableDoubles_6("+ URI +")"

   def copy(oneListOfNullableDoubles: IndexedSeq[Option[Double]] = this._oneListOfNullableDoubles): OneListOfNullableDoubles_6 = {

  require(oneListOfNullableDoubles ne null, "Null value was provided for property \"oneListOfNullableDoubles\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableDoubles)
    new OneListOfNullableDoubles_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableDoubles = oneListOfNullableDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDoubles_6): this.type = {
    this._URI = result._URI
    this._oneListOfNullableDoubles = result._oneListOfNullableDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDoubles_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableDoubles = {
    _oneListOfNullableDoubles
  }

  def oneListOfNullableDoubles_= (value: IndexedSeq[Option[Double]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneListOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDoubles") oneListOfNullableDoubles: IndexedSeq[Option[Double]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableDoubles = if (oneListOfNullableDoubles == null) IndexedSeq.empty else oneListOfNullableDoubles)

}

object OneListOfNullableDoubles_6 extends AggregateRootCompanion[OneListOfNullableDoubles_6]{

  def apply(
    oneListOfNullableDoubles: IndexedSeq[Option[Double]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableDoubles)
    require(oneListOfNullableDoubles ne null, "Null value was provided for property \"oneListOfNullableDoubles\"")
    new OneListOfNullableDoubles_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableDoubles = oneListOfNullableDoubles)
  }

}
