package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableTimestamps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableTimestamps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableTimestamps_3("+ URI +")"

   def copy(oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]] = this._oneSetOfNullableTimestamps): OneSetOfNullableTimestamps_3 = {

  require(oneSetOfNullableTimestamps ne null, "Null value was provided for property \"oneSetOfNullableTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTimestamps)
    new OneSetOfNullableTimestamps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableTimestamps = oneSetOfNullableTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableTimestamps_3): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableTimestamps = result._oneSetOfNullableTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableTimestamps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableTimestamps = {
    _oneSetOfNullableTimestamps
  }

  def oneSetOfNullableTimestamps_= (value: Set[Option[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTimestamps") oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableTimestamps = if (oneSetOfNullableTimestamps == null) Set.empty else oneSetOfNullableTimestamps)

}

object OneSetOfNullableTimestamps_3 extends AggregateRootCompanion[OneSetOfNullableTimestamps_3]{

  def apply(
    oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTimestamps)
    require(oneSetOfNullableTimestamps ne null, "Null value was provided for property \"oneSetOfNullableTimestamps\"")
    new OneSetOfNullableTimestamps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableTimestamps = oneSetOfNullableTimestamps)
  }

}
