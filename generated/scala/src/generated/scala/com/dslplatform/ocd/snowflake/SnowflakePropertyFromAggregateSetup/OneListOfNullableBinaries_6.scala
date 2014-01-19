package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableBinaries_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableBinaries_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableBinaries_6("+ URI +")"

   def copy(oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]] = this._oneListOfNullableBinaries): OneListOfNullableBinaries_6 = {

  require(oneListOfNullableBinaries ne null, "Null value was provided for property \"oneListOfNullableBinaries\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableBinaries)
    new OneListOfNullableBinaries_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableBinaries = oneListOfNullableBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableBinaries_6): this.type = {
    this._URI = result._URI
    this._oneListOfNullableBinaries = result._oneListOfNullableBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableBinaries_6](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableBinaries = {
    _oneListOfNullableBinaries
  }

  def oneListOfNullableBinaries_= (value: IndexedSeq[Option[Array[Byte]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableBinaries") oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableBinaries = if (oneListOfNullableBinaries == null) IndexedSeq.empty else oneListOfNullableBinaries)

}

object OneListOfNullableBinaries_6 extends AggregateRootCompanion[OneListOfNullableBinaries_6]{

  def apply(
    oneListOfNullableBinaries: IndexedSeq[Option[Array[Byte]]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableBinaries)
    require(oneListOfNullableBinaries ne null, "Null value was provided for property \"oneListOfNullableBinaries\"")
    new OneListOfNullableBinaries_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableBinaries = oneListOfNullableBinaries)
  }

}
