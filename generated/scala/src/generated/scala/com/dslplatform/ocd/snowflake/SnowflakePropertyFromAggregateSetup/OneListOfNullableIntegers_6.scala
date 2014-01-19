package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableIntegers_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableIntegers: IndexedSeq[Option[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableIntegers_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableIntegers_6("+ URI +")"

   def copy(oneListOfNullableIntegers: IndexedSeq[Option[Int]] = this._oneListOfNullableIntegers): OneListOfNullableIntegers_6 = {

  require(oneListOfNullableIntegers ne null, "Null value was provided for property \"oneListOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableIntegers)
    new OneListOfNullableIntegers_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableIntegers = oneListOfNullableIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableIntegers_6): this.type = {
    this._URI = result._URI
    this._oneListOfNullableIntegers = result._oneListOfNullableIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableIntegers_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIntegers")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableIntegers = {
    _oneListOfNullableIntegers
  }

  def oneListOfNullableIntegers_= (value: IndexedSeq[Option[Int]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneListOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIntegers") oneListOfNullableIntegers: IndexedSeq[Option[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableIntegers = if (oneListOfNullableIntegers == null) IndexedSeq.empty else oneListOfNullableIntegers)

}

object OneListOfNullableIntegers_6 extends AggregateRootCompanion[OneListOfNullableIntegers_6]{

  def apply(
    oneListOfNullableIntegers: IndexedSeq[Option[Int]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableIntegers)
    require(oneListOfNullableIntegers ne null, "Null value was provided for property \"oneListOfNullableIntegers\"")
    new OneListOfNullableIntegers_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableIntegers = oneListOfNullableIntegers)
  }

}
