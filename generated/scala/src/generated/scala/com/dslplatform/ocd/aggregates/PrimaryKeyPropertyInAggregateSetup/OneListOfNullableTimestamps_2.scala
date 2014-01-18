package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableTimestamps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableTimestamps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableTimestamps_2("+ URI +")"

   def copy(oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]] = this._oneListOfNullableTimestamps): OneListOfNullableTimestamps_2 = {

  require(oneListOfNullableTimestamps ne null, "Null value was provided for property \"oneListOfNullableTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTimestamps)
    new OneListOfNullableTimestamps_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableTimestamps = oneListOfNullableTimestamps)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableTimestamps_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableTimestamps = result._oneListOfNullableTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableTimestamps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfNullableTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableTimestamps = {
    _oneListOfNullableTimestamps
  }

  def oneListOfNullableTimestamps_= (value: IndexedSeq[Option[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTimestamps") oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableTimestamps = if (oneListOfNullableTimestamps == null) IndexedSeq.empty else oneListOfNullableTimestamps)

}

object OneListOfNullableTimestamps_2 extends AggregateRootCompanion[OneListOfNullableTimestamps_2]{

  def apply(
    oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTimestamps)
    require(oneListOfNullableTimestamps ne null, "Null value was provided for property \"oneListOfNullableTimestamps\"")
    new OneListOfNullableTimestamps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableTimestamps = oneListOfNullableTimestamps)
  }

}
